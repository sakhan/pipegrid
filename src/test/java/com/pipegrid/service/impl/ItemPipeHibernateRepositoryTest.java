package com.pipegrid.service.impl;

import com.pipegrid.model.Item;
import com.pipegrid.model.ItemPipe;
import com.pipegrid.model.User;
import com.pipegrid.repository.impl.ItemPipeHibernateRepository;
import com.pipegrid.repository.impl.UserHibernateRepository;
import com.pipegrid.test.BaseTestCase;

public class ItemPipeHibernateRepositoryTest extends BaseTestCase
{
    ItemPipeHibernateRepository itemPipeRepository;
    UserHibernateRepository     userRepository;
    
    private Long _userId = new Long(2);
    
    public void testCreateItemPipe()
    {
        Item item = new Item(null, loadUser(), "code", true);
        ItemPipe pipe = new ItemPipe();
        itemPipeRepository.saveItemPipe(pipe);
    }
    
    private User loadUser()
    {
        return userRepository.loadUser(_userId);
    }

}
