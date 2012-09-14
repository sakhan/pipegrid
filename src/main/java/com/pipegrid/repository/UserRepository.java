package com.pipegrid.repository;

import com.pipegrid.model.Company;
import com.pipegrid.model.RoleLkup;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;

public interface UserRepository
{
    public void saveUser(User user);
    
    public void saveUser(User user, Role role);
    
    public User getUser(Long id);
    
    public User loadUser(Long id);
    
    public RoleLkup loadRole(Role role);

    public Company loadCompany(Long id);
    
}
