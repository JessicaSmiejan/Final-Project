/**
 * 
 */
package com.gardenApps.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gardenApps.exception.ResourceNotFoundException;
import com.gardenApps.model.Plant;
import com.gardenApps.model.PlantList;
import com.gardenApps.repository.PlantListRepository;
import com.gardenApps.service.PlantListService;

/**
 * @author anili
 *
 */
@Service
public class PlantListServiceImpl implements PlantListService{
  private PlantListRepository plantListRepository;
  
  @Autowired
  public PlantListServiceImpl(PlantListRepository plantListRepository) {
    super();
    
  }
  @Override
  public PlantList savePlantList(PlantList plantList) {
       return plantListRepository.save(plantList);
  }

  @Override
  public List<PlantList> getPlantList() {
       return plantListRepository.findAll();
  }

  @Override
  public PlantList getPlantListById(int listId) {
    return plantListRepository.findById(listId).orElseThrow(()
        -> new ResourceNotFoundException("Plant List", "listId", listId));
  }

  @Override
  public PlantList updatePlantList(PlantList plantList, int listId)  {
    PlantList existingPlantList= plantListRepository.findById(listId).orElseThrow(() 
        -> new ResourceNotFoundException("plant List", "listId", listId));
    existingPlantList.setIdGarden(plantList.getIdGarden());
    existingPlantList.setPlantId(plantList.getPlantId());
    return null;
  }

  @Override
  public void deletePlantList(int listId) {
  PlantList existingPlantList= plantListRepository.findById(listId).orElseThrow(()
      ->new  ResourceNotFoundException("plant List", "listId",listId));
  plantListRepository.deleteById(listId);
  
    
  }

}
