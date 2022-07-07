/**
 * 
 */
package com.gardenApps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gardenApps.model.Plant;

/**
 * @author anili
 *
 */
@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer>{
    
}
