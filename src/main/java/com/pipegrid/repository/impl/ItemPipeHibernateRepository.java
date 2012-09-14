package com.pipegrid.repository.impl;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.pipegrid.model.ItemPipe;
import com.pipegrid.repository.ItemPipeRepository;


@Repository("itemPipeRepository")
public class ItemPipeHibernateRepository implements ItemPipeRepository
{
    @Autowired
    private SessionFactory _factory;
    
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
    public void saveItemPipe(ItemPipe pipe)
    {
        Assert.notNull(pipe);
        Assert.notNull(pipe.getItem());
        Date currentDate = new Date();
        if(pipe.getId() == null)
        {
            pipe.getItem().setCreateDate(currentDate);
        }
        pipe.getItem().setUpdateDate(currentDate);
        _factory.getCurrentSession().saveOrUpdate(pipe);
    }
    
}
