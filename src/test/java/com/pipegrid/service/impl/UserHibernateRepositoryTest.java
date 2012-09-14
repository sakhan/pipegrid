package com.pipegrid.service.impl;

import java.util.Date;

import com.pipegrid.model.Company;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;
import com.pipegrid.repository.UserRepository;
import com.pipegrid.test.BaseTestCase;

public class UserHibernateRepositoryTest extends BaseTestCase
{
    protected UserRepository userRepository;
    
    public void testCreateUser()
    {
        final User user = new User("skhan" + (new Date()).toString(), "password", "Sheraz", "Khan");
        Company company = new Company(null, null, "LiteSpeed", new Date());
        user.setCompany(company);
        assertInsert("User", new CrudCallBack() {
            @Override
            protected void doCrud()
            {
                userRepository.saveUser(user, Role.ADMIN);
            }
        });
//        commitTransaction();
        assertNotNull(user.getId());
        assertNotNull(user.getCompany().getId());
    }
    
    public void testGetUser()
    {
        Long userId = new Long(2);
        User user = userRepository.getUser(userId);
        assertNotNull(user);
        assertNotNull(user.getUsername());
        assertEquals(userId, user.getId()); 
    }
    
    

}
