package com.ironhack.monstersofrockserver.repository;

import com.ironhack.monstersofrockserver.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band,Long> {
}
