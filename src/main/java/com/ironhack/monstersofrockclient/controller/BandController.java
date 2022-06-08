package com.ironhack.monstersofrockclient.controller;


import com.ironhack.monstersofrockclient.model.Band;
import com.ironhack.monstersofrockclient.repository.BandRepository;
import com.ironhack.monstersofrockclient.service.interfaces.BandServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BandController {

    @Autowired
    private BandRepository bandRepository;

    @Autowired
    private BandServiceInterface bandServiceInterface;

    @GetMapping("/bands/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Band getBandById(@PathVariable(name = "id") Long bandId){
        return bandServiceInterface.findById(bandId);
    }

    @GetMapping("/bands")
    @ResponseStatus(HttpStatus.OK)
    public List<Band> getAllBands(){
        return bandRepository.findAll();
    }

    @PostMapping("/bands")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addBand(@RequestBody @Valid Band band){
        bandServiceInterface.saveBand(band);
    }

    @PutMapping("/bands/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBand(@PathVariable(name = "id") Long bandId, @RequestBody @Valid Band band){
        bandServiceInterface.update(bandId,band);
    }

    @DeleteMapping("/bands/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBand(@PathVariable(name = "id") Long bandId){
        bandServiceInterface.deleteBand(bandId);
    }
}
