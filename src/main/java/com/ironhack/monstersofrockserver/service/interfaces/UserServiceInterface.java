package com.ironhack.monstersofrockserver.service.interfaces;

import com.ironhack.monstersofrockserver.model.User;

import java.util.List;

public interface UserServiceInterface {
    User saveUser (User userSignupDTO);

    List<User> getUsers();
}
