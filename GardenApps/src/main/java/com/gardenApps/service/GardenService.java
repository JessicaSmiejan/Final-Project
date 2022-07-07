/**
 * 
 */
package com.gardenApps.service;

import java.util.List;
import com.gardenApps.model.Garden;

/**
 * @author anili
 *
 */
public interface GardenService {
  
  Garden saveGarden(Garden garden);
      List<Garden> getGarden();
      Garden getGardenById(int IdGarden);
      Garden updateGarden(Garden garden, int IdGarden);
      void deleteGarden(int IdGarden);
  }

