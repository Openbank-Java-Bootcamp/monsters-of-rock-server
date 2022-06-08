package com.ironhack.monstersofrockclient.service.interfaces;

import com.ironhack.monstersofrockclient.model.Festival;

public interface FestivalServiceInterface {
    Festival findById(Long id);
    void saveFestival(Festival festival);
    void update(Long id, Festival festival);
    void deleteFestival(Long id);
}
