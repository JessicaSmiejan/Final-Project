/**
 * 
 */
package com.gardenApps.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gardenApps.exception.ResourceNotFoundException;
import com.gardenApps.model.Garden;
import com.gardenApps.repository.GardenRepository;
import com.gardenApps.service.GardenService;

/**
 * @author anili
 *
 */
@Service
public class GardenServiceImpl implements GardenService {
  private GardenRepository gardenRepository;
  

@Autowired
  public GardenServiceImpl(GardenRepository gardenRepository) {
  super();
  
  }


@Override
public Garden saveGarden(Garden garden) {
  return gardenRepository.save(garden);
}
@Override
public List<Garden> getGarden() {
   return gardenRepository.findAll();
}
@Override
public Garden getGardenById(int IdGarden) {
   return gardenRepository.findById(IdGarden).orElseThrow(() 
         -> new ResourceNotFoundException
         ("Garden", "IdGarden",IdGarden));
}
@Override
public Garden updateGarden(Garden garden, int IdGarden) {
  Garden existingGarden= gardenRepository.findById(IdGarden).orElseThrow(() 
      -> new ResourceNotFoundException
      ("Garden", "IdGarden",IdGarden));
  existingGarden.setGardenName(garden.getGardenName());
  existingGarden.setIdCustomers(garden.getIdCustomers());
  existingGarden.setHrdZone(garden.getHrdZone());
  gardenRepository.save(existingGarden);
    return existingGarden;
}
@Override
public void deleteGarden(int IdGarden) {
  Garden existingGarden = gardenRepository.findById(IdGarden).orElseThrow(() 
      -> new ResourceNotFoundException
      ("Garden", "IdGarden",IdGarden));
  gardenRepository.deleteById(IdGarden);
  
 }
}