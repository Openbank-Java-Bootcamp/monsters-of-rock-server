package com.ironhack.monstersofrockserver.repository;

import com.ironhack.monstersofrockserver.model.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRepository extends JpaRepository<Festival,Long> {

    Festival findByName(String name);
}
