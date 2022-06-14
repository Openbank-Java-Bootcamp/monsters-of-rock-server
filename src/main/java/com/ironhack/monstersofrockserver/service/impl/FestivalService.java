package com.ironhack.monstersofrockserver.service.impl;

import com.ironhack.monstersofrockserver.model.Festival;
import com.ironhack.monstersofrockserver.repository.BandRepository;
import com.ironhack.monstersofrockserver.repository.FestivalRepository;
import com.ironhack.monstersofrockserver.service.interfaces.FestivalServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class FestivalService implements FestivalServiceInterface {

    @Autowired
    private FestivalRepository festivalRepository;


    public Festival findById(Long id){
        return festivalRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Festival Not Found"));
    }
    public void saveFestival(Festival festival){
        if(festival.getId() !=null){
            Optional<Festival> festivalFromDb = festivalRepository.findById(festival.getId());
            if(festivalFromDb.isPresent())
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY,"Festival with id "+ festival.getId()+" already exist");
        }
        festivalRepository.save(festival);
    }

    public void update (Long id, Festival festival){
        Festival festivalFromDb = festivalRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Festival is not found"));
        festival.setId(festivalFromDb.getId());
        festivalRepository.save(festival);
    }

    public void deleteFestival(Long id){
        Festival festivalFromDb = festivalRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Festival is not found"));
        festivalRepository.deleteById(id);
    }
}
