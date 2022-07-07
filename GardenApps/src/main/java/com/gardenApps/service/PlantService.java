/**
 * 
 */
package com.gardenApps.service;

import java.util.List;
import com.gardenApps.model.Plant;

/**
 * @author anili
 *
 */
public interface PlantService {
  Plant savePlant(Plant plant);
  List<Plant> getPlant();
  Plant getPlantById(int plantId);
  Plant updatePlant(Plant plant, int plantId);
  void deletePlant(int plantId);
  
}
