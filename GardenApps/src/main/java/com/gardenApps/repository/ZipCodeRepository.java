/**
 * 
 */
package com.gardenApps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gardenApps.model.ZipCode;

/**
 * @author anili
 *
 */
public interface ZipCodeRepository extends
      JpaRepository<ZipCode, Integer>{
  
}
