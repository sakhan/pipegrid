package com.pipegrid.repository;

import com.pipegrid.model.RoleLkup;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;

public interface UserRepository
{
    public void saveUser(User user);
    
    public void saveUser(User user, Role role);
    
    public void getUser(Long id);
    
    public RoleLkup loadRole(Role role);

}
