package com.ironhack.monstersofrockclient.repository;

import com.ironhack.monstersofrockclient.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band,Long> {
}
