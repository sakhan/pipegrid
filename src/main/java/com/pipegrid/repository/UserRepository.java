package com.pipegrid.repository;

import com.pipegrid.model.Company;
import com.pipegrid.model.RoleLkup;
import com.pipegrid.model.RoleLkup.Role;
import com.pipegrid.model.User;

public interface UserRepository
{
    public void updateUser(User user);
    
    public void updateUser(User user, Role role);
    
    public User getUser(Long id);
    
    public User loadUser(Long id);
    
    public RoleLkup loadRole(Role role);

    public Company loadCompany(Long id);
    
    public void saveCompany(Company company);
    
    // Service methods
    
    public void registerUserNewCompany(User user, Company company, Role role);
    
    public void registerUserExistingCompany(User user, Long companyId, Role role);
    
}
