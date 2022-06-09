package com.ironhack.monstersofrockserver.service.interfaces;


import com.ironhack.monstersofrockserver.model.Role;

public interface RoleServiceInterface {
    Role saveRole(Role role);

    void addRoleToUser(String email, String roleName);
}
