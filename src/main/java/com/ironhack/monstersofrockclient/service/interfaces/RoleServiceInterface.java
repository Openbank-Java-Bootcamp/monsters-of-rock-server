package com.ironhack.monstersofrockclient.service.interfaces;


import com.ironhack.monstersofrockclient.model.Role;

public interface RoleServiceInterface {
    Role saveRole(Role role);

    void addRoleToUser(String email, String roleName);
}
