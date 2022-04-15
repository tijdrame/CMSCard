package com.boa.web.service;

import java.util.List;

import com.boa.web.domain.AppUser;
import com.boa.web.domain.Role;


public interface UserService {
    
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
