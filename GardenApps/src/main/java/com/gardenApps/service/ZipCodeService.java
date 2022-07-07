/**
 * 
 */
package com.gardenApps.service;

import java.util.List;
import com.gardenApps.model.ZipCode;

/**
 * @author anili
 *
 */
public interface ZipCodeService {
      
  ZipCode saveZipCode( ZipCode  zipCode);
          List< ZipCode> getZipCode();
          ZipCode getZipCodeById(int zipcode);
          ZipCode updatePlantList( ZipCode zipCode, int zipcode);
          void deleteZipCode(int zipcode);
}
