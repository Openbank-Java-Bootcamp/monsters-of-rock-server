package com.ironhack.monstersofrockclient.controller;

import com.ironhack.monstersofrockclient.model.Festival;
import com.ironhack.monstersofrockclient.repository.FestivalRepository;
import com.ironhack.monstersofrockclient.service.interfaces.FestivalServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FestivalController {

    @Autowired
    private FestivalRepository festivalRepository;

    @Autowired
    private FestivalServiceInterface festivalServiceInterface;

   @GetMapping("/festivals/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Festival getFestivalById(@PathVariable(name = "id")Long festivalId){
       return festivalServiceInterface.findById(festivalId);
   }

    @GetMapping("/festivals")
    @ResponseStatus(HttpStatus.OK)
    public List<Festival> getAllFestivals(){
           return festivalRepository.findAll();
    }

    @PostMapping("/festivals")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addFestival(@RequestBody Festival festival){
       festivalServiceInterface.saveFestival(festival);
    }

    @PutMapping("/festivals/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFestival(@PathVariable(name= "id")Long festivalId, @RequestBody Festival festival){
       festivalServiceInterface.update(festivalId, festival);
    }

    @DeleteMapping("/festivals/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFestival(@PathVariable(name = "id")Long festivalId){
       festivalServiceInterface.deleteFestival(festivalId);
    }
}
