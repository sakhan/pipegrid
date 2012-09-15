package com.pipegrid.repository.impl;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.pipegrid.model.ItemPipe;
import com.pipegrid.repository.ItemPipeRepository;
import com.pipegrid.repository.UserRepository;


@Repository("itemPipeRepository")
public class ItemPipeHibernateRepository implements ItemPipeRepository
{
    @Autowired
    private SessionFactory _factory;
    
    @Autowired
    private UserRepository _userRepository;
    
    @Override
    public ItemPipe loadItemPipe(Long pipeId)
    {
        return (ItemPipe) _factory.getCurrentSession().load(ItemPipe.class, pipeId);
    }
    
    @Override
    public ItemPipe getItemPipe(Long pipeId)
    {
        return (ItemPipe) _factory.getCurrentSession().get(ItemPipe.class, pipeId);
    }
    
    @Override
    public void createItemPipe(ItemPipe pipe, Long userId, Long companyId)
    {
        Assert.notNull(pipe);
        Assert.notNull(userId);
        Assert.notNull(companyId);
        pipe.getItem().setUserByCreateUserId(_userRepository.loadUser(userId));
        pipe.getItem().setCompany(_userRepository.loadCompany(companyId));
        if(pipe.getId() == null)
        {
            pipe.getItem().setCreateDate(new Date());
        }
        _factory.getCurrentSession().saveOrUpdate(pipe);
    }
    
    @Override
    public void updateItemPipe(ItemPipe pipe, Long userId)
    {
        Assert.notNull(pipe);
        Assert.notNull(pipe.getId());
        pipe.getItem().setUpdateDate(new Date());
        pipe.getItem().setUserByUpdateUserId(_userRepository.loadUser(userId));
        _factory.getCurrentSession().saveOrUpdate(pipe);
    }
    
}
