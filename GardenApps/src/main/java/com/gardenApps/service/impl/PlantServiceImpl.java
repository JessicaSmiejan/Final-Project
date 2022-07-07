/**
 * 
 */
package com.gardenApps.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gardenApps.exception.ResourceNotFoundException;
import com.gardenApps.model.Plant;
import com.gardenApps.repository.PlantRepository;
import com.gardenApps.service.PlantService;

/**
 * @author anili
 *
 */
@Service
public  class PlantServiceImpl implements PlantService{
  private PlantRepository plantRepository;
  
  @Autowired
  public PlantServiceImpl (PlantRepository plantRepository) {
    super();
  }
  @Override
  public Plant savePlant(Plant plant) {
    return plantRepository.save(plant);
  }
  @Override
  public List<Plant> getPlant() {
        return plantRepository.findAll();
  }
  @Override
  public Plant getPlantById(int plantId) {
    return plantRepository.findById(plantId).orElseThrow(() 
        -> new ResourceNotFoundException("Plant", "plantId", plantId));
  }
  @Override
  public Plant updatePlant(Plant plant, int plantId) {
    Plant existingPlant= plantRepository.findById(plantId).orElseThrow(() 
        -> new ResourceNotFoundException("plant", "plantId", plantId));
    existingPlant.setPlantName(plant.getPlantName());
    existingPlant.setPlantType(plant.getPlantType());
    existingPlant.setHrdZone(plant.getHrdZone());
    
    plantRepository.save(existingPlant);
    return existingPlant;
  }
  @Override
  public void deletePlant(int plantId) {
    Plant existingPlant = plantRepository.findById(plantId).orElseThrow(() 
        -> new ResourceNotFoundException("plant", "plantId",plantId));
    plantRepository.deleteById(plantId);
    
  }

 
  
  }
  

