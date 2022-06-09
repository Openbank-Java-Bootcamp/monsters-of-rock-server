package com.ironhack.monstersofrockserver.repository;

import com.ironhack.monstersofrockserver.model.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivalRepository extends JpaRepository<Festival,Long> {
}
