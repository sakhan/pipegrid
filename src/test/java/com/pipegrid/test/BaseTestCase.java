package com.pipegrid.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

/**
 * Serves as base class for all Spring/Hibernate JUnit test cases. Provides convenient
 * methods to get current Hibernate session, flush session etc.
 * 
 * @author sheraz.khan
 */
public abstract class BaseTestCase extends AbstractTransactionalDataSourceSpringContextTests
{
    protected SessionFactory    hibernateSessionFactory;
    
    public BaseTestCase()
    {
        super();

        // switch on field level injection
        setPopulateProtectedVariables(true);
    }
    
    // specifies the Spring configuration to load for this test fixture
    protected String[] getConfigLocations() 
    {
        return new String[] { "classpath:test-services-context.xml" };
    }
    
    protected Session getCurrentSession()
    {
        return SessionFactoryUtils.getSession(hibernateSessionFactory, false);
    }
    
    /*
     * Use this for the purpose of by-passing hibernate first-level cache and forcing
     * Hibernate to execute SQL statements instead of loading from session.
     */
    protected Session getNewSession()
    {
        return SessionFactoryUtils.getNewSession(hibernateSessionFactory);
    }
    
    protected void flushCurrentSession()
    {
        getCurrentSession().flush();
    }

    protected void commitTransaction()
    {
        setComplete(); 
    }
    
    protected void assertInsert(String tableName, CrudCallBack callback)
    {
        assertInsert(new String[] {tableName}, callback);
    }
    
    /*
     * Asserts if count in given table increases by ONLY "1". Note multiple inserts in same table
     * will result in failure of test case.
     */
    protected void assertInsert(String[] tableNames, CrudCallBack callback)
    {
        int[] beforeCounts = new int[tableNames.length];
        for(int i=0; i < tableNames.length; i++)
        {
            beforeCounts[i] = countRowsInTable(tableNames[i]);
        }
        callback.doCrud();
        for(int i=0; i < tableNames.length; i++)
        {
            assertEquals("insert not successful for " + tableNames[i], 
                    beforeCounts[i]+1, countRowsInTable(tableNames[i]));
        }
    }

    protected void assertDelete(String tableName, CrudCallBack callback)
    {
        assertDelete(new String[] {tableName}, callback);
    }
    
    /*
     * Asserts if count in given table decreases by ONLY "1". Note multiple deletes in same table
     * will result in failure of test case.
     */
    protected void assertDelete(String[] tableNames, CrudCallBack callback)
    {
        int[] beforeCounts = new int[tableNames.length];
        for(int i=0; i < tableNames.length; i++)
        {
            beforeCounts[i] = countRowsInTable(tableNames[i]);
        }
        callback.doCrud();
        flushCurrentSession();
        for(int i=0; i < tableNames.length; i++)
        {
            assertEquals("delete not successful for " + tableNames[i], 
                    beforeCounts[i]-1, countRowsInTable(tableNames[i]));
        }
    }
    
    protected static abstract class CrudCallBack
    {
        protected abstract void doCrud();
    }


}
