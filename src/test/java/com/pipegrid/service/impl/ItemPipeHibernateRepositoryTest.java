package com.pipegrid.service.impl;

import com.pipegrid.model.ItemPipe;
import com.pipegrid.repository.impl.ItemPipeHibernateRepository;
import com.pipegrid.test.BaseTestCase;

public class ItemPipeHibernateRepositoryTest extends BaseTestCase
{
    ItemPipeHibernateRepository itemPipeRepository;
    
    public void testCreateItemPipe()
    {
        ItemPipe pipe = new ItemPipe();
        itemPipeRepository.saveItemPipe(pipe);
    }

}
