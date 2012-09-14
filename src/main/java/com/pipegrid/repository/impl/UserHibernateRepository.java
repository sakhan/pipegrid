package com.pipegrid.repository.impl;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.pipegrid.model.Company;
import com.pipegrid.model.RoleLkup;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;
import com.pipegrid.repository.UserRepository;

@Repository("userRepository")
public class UserHibernateRepository implements UserRepository
{
    @Autowired
    private SessionFactory _factory;

    @Override
    public User getUser(Long id)
    {
        return (User)_factory.getCurrentSession().get(User.class, id);
    }

    @Override
    public User loadUser(Long id)
    {
        return (User)_factory.getCurrentSession().load(User.class, id);
    }
    
    @Override
    public void saveUser(User user)
    {
        Assert.notNull(user);
        if(user.getId() == null)
        {
            user.setCreateDate(new Date());
        }
        _factory.getCurrentSession().saveOrUpdate(user);
    }
    
    @Override
    public void saveUser(User user, Role role)
    {
        Assert.notNull(user);
        Assert.notNull(role);
        RoleLkup roleLkup = (RoleLkup)_factory.getCurrentSession().load(RoleLkup.class, role.getCode());
        user.setRoleLkup(roleLkup);
        saveUser(user);
    }
        
    @Override
    public RoleLkup loadRole(Role role)
    {
        return (RoleLkup)_factory.getCurrentSession().load(RoleLkup.class, role.getCode());
    }
    
    @Override
    public Company loadCompany(Long id)
    {
        return (Company)_factory.getCurrentSession().load(Company.class, id);
    }

}
