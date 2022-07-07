/**
 * 
 */
package com.gardenApps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gardenApps.model.Garden;


/**
 * @author anili
 *
 */
public interface GardenRepository extends
      JpaRepository<Garden, Integer>{
}

