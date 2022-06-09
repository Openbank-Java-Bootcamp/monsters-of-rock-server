package com.ironhack.monstersofrockserver.repository;

import com.ironhack.monstersofrockserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
