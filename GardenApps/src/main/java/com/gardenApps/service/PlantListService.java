/**
 * 
 */
package com.gardenApps.service;

import java.util.List;
import com.gardenApps.model.PlantList;

/**
 * @author anili
 *
 */
public interface PlantListService {
  
  PlantList savePlantList( PlantList  plantList);
        List< PlantList> getPlantList();
        PlantList getPlantListById(int listId);
        PlantList updatePlantList( PlantList  plantList, int listId);
        void deletePlantList(int listId);
    }

