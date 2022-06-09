package com.ironhack.monstersofrockserver.repository;


import com.ironhack.monstersofrockserver.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
