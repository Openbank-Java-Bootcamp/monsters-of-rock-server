package com.ironhack.monstersofrockserver.service.impl;

import com.ironhack.monstersofrockserver.model.Band;
import com.ironhack.monstersofrockserver.repository.BandRepository;
import com.ironhack.monstersofrockserver.service.interfaces.BandServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class BandService implements BandServiceInterface {

    @Autowired
    private BandRepository bandRepository;

    public Band findById(Long id) {
        return bandRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Band not found"));
    }

    public void saveBand(Band band) {
        if (band.getId() != null) {
            Optional<Band> optionalBand = bandRepository.findById(band.getId());
            if (optionalBand.isPresent())
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Band with id " + band.getId() + " already exist");
        }
        bandRepository.save(band);
    }

    public void update(Long id, Band band) {
        Band bandFromDB = bandRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Band is not found"));
        band.setId(bandFromDB.getId());
        bandRepository.save(band);
    }

    public void deleteBand(Long id) {
        Band bandFromDB = bandRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Band not found"));
        bandRepository.deleteById(id);
    }
}
