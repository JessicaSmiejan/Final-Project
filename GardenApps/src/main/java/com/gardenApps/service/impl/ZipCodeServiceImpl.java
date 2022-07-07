/**
 * 
 */
package com.gardenApps.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.gardenApps.model.ZipCode;
import com.gardenApps.repository.ZipCodeRepository;
import com.gardenApps.service.ZipCodeService;

/**
 * @author anili
 *
 */
@Service
public class ZipCodeServiceImpl implements ZipCodeService{
  private ZipCodeRepository zipCodeServiceRepository;

  @Override
  public ZipCode saveZipCode(ZipCode zipCode) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<ZipCode> getZipCode() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ZipCode getZipCodeById(int zipcode) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ZipCode updatePlantList(ZipCode zipCode, int zipcode2) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteZipCode(int zipcode) {
    // TODO Auto-generated method stub
    
  }

  /**
   * @return the zipCodeServiceRepository
   */
  public ZipCodeRepository getZipCodeServiceRepository() {
    return zipCodeServiceRepository;
  }

  /**
   * @param zipCodeServiceRepository the zipCodeServiceRepository to set
   */
  public void setZipCodeServiceRepository(ZipCodeRepository zipCodeServiceRepository) {
    this.zipCodeServiceRepository = zipCodeServiceRepository;
  }

}