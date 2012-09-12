package com.pipegrid.service.impl;

import java.util.Date;

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
        assertInsert("User", new CrudCallBack() {
            @Override
            protected void doCrud()
            {
                userRepository.saveUser(user, Role.ADMIN);
            }
        });
        //commitTransaction();
        assertNotNull(user.getId());
    }
    
    

}
