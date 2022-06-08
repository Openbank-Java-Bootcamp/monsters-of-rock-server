package com.ironhack.monstersofrockclient.service.interfaces;

import com.ironhack.monstersofrockclient.model.Band;

public interface BandServiceInterface {

   Band findById(Long id);
   void saveBand(Band band);
   void update (Long id, Band band);
   void deleteBand(Long id);

}
