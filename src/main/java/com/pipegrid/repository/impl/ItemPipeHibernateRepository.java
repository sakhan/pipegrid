package com.pipegrid.repository.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pipegrid.model.ItemPipe;
import com.pipegrid.repository.ItemPipeRepository;


@Repository("itemPipeRepository")
public class ItemPipeHibernateRepository implements ItemPipeRepository
{
    @Autowired
    private SessionFactory _factory;
    
    @Override
    public ItemPipe getItemPipe(Long pipeId)
    {
        return (ItemPipe) _factory.getCurrentSession().get(ItemPipe.class, pipeId);
    }
    
    @Override
    public void saveItemPipe(ItemPipe pipe)
    {
        _factory.getCurrentSession().saveOrUpdate(pipe);
    }
    
}
