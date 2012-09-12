package com.pipegrid.repository;

import com.pipegrid.model.ItemPipe;

public interface ItemPipeRepository
{

    public void saveItemPipe(ItemPipe pipe);
    
    public ItemPipe getItemPipe(Long pipeId);
    
    
}
