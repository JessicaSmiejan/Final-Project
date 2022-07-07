/**
 * 
 */
package com.gardenApps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gardenApps.model.PlantList;

/**
 * @author anili
 *
 */
public interface PlantListRepository  extends 
      JpaRepository<PlantList, Integer>{
    
}
