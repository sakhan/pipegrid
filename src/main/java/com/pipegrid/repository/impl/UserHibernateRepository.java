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
    public void updateUser(User user)
    {
        Assert.notNull(user);
        _factory.getCurrentSession().update(user);
    }
    
    @Override
    public void updateUser(User user, Role role)
    {
        setRoleOnUser(user, role);
        updateUser(user);
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

    @Override
    public void saveCompany(Company company)
    {
        Assert.notNull(company);
        if(company.getId() == null)
        {
            company.setCreateDate(new Date());
        }
        _factory.getCurrentSession().saveOrUpdate(company);
    }
    
    /***** Service type methods ***************/
    
    public void registerUserNewCompany(User user, Company company, Role role)
    {
        Assert.notNull(company);
        Assert.isTrue(company.getUsers().isEmpty());
        
        // this should always be true in this method
        if(user.getId() == null)
        {
            user.setCreateDate(new Date());
        }
        
        setRoleOnUser(user, role);
        company.addUser(user);
        saveCompany(company);
    }
    
    public void registerUserExistingCompany(User user, Long companyId, Role role)
    {
        // TODO
    }
    
    /**** private methods *****/
    private void setRoleOnUser(User user, Role role)
    {
        Assert.notNull(user);
        Assert.notNull(role);
        RoleLkup roleLkup = (RoleLkup)_factory.getCurrentSession().load(RoleLkup.class, role.getCode());
        user.setRoleLkup(roleLkup);
    }
    
    
}
