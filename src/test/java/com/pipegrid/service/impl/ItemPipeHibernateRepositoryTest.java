package com.pipegrid.service.impl;

import java.math.BigDecimal;

import com.pipegrid.model.Item;
import com.pipegrid.model.ItemPipe;
import com.pipegrid.repository.ItemPipeRepository;
import com.pipegrid.test.BaseTestCase;

public class ItemPipeHibernateRepositoryTest extends BaseTestCase
{
    protected ItemPipeRepository itemPipeRepository;
    //protected UserRepository     userRepository;
    
    private Long _userId = new Long(10);
    private Long _companyId = new Long(5);
    
    public void testCreateItemPipe()
    {
        Item item = new Item(null, null, "GD", true);
        final ItemPipe pipe = new ItemPipe(item, 'P', new BigDecimal(2.34));
        assertInsert(new String[] {"item", "item_pipe"}, new CrudCallBack() {
            @Override
            protected void doCrud()
            {
                itemPipeRepository.createItemPipe(pipe, _userId, _companyId);
            }
        });
        commitTransaction();
        assertNotNull(item.getId());
        assertNotNull(pipe.getId());
    }

}
