package com.pipegrid.repository;

import com.pipegrid.model.ItemPipe;

public interface ItemPipeRepository
{
    public void createItemPipe(ItemPipe pipe, Long userId, Long companyId);
    
    public void updateItemPipe(ItemPipe pipe, Long userId);
    
    public ItemPipe getItemPipe(Long pipeId);
    
    public ItemPipe loadItemPipe(Long pipeId);
    
}
