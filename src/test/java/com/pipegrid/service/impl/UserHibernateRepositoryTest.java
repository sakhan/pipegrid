package com.pipegrid.service.impl;

import java.util.Date;

import com.pipegrid.model.Company;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;
import com.pipegrid.repository.UserRepository;
import com.pipegrid.test.BaseTestCase;

public class UserHibernateRepositoryTest extends BaseTestCase
{
    private Long _userId = new Long(10);
    
    protected UserRepository userRepository;
    
    public void testRegisterUserWithNewCompany()
    {
        final User user = new User("skhan" + (new Date()).toString(), "password", "Sheraz", "Khan");
        final Company company = new Company(null, null, "LiteSpeed");
        assertInsert(new String[] {"User", "Company"}, new CrudCallBack() {
            @Override
            protected void doCrud()
            {
                userRepository.registerUserNewCompany(user, company, Role.ADMIN);
            }
        });
        //commitTransaction();
        assertNotNull(user.getId());
        assertNotNull(user.getCompany().getId());
    }
    
    public void testGetUser()
    {
        User user = userRepository.getUser(_userId);
        assertNotNull("user is null",user);
        assertNotNull(user.getUsername());
        assertEquals(_userId, user.getId());
        assertNotNull("company is null",user.getCompany());
    }
    
    

}
