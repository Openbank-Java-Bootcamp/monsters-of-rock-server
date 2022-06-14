package com.ironhack.monstersofrockserver.service.interfaces;

import com.ironhack.monstersofrockserver.model.Festival;

public interface FestivalServiceInterface {
    Festival findById(Long id);
    //void saveFestival(FestivalDTO festivalDTO);
    void saveFestival(Festival festival);
    void update(Long id, Festival festival);
    void deleteFestival(Long id);
}
