package com.ironhack.monstersofrockclient.repository;

import com.ironhack.monstersofrockclient.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
