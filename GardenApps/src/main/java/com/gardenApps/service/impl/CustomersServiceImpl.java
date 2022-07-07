package com.gardenApps.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gardenApps.exception.ResourceNotFoundException;
import com.gardenApps.model.Customers;
import com.gardenApps.repository.CustomersRepository;
import com.gardenApps.service.CustomersService;
@Service
public class CustomersServiceImpl implements CustomersService{
  private CustomersRepository customersRepository;

  @Autowired
  public CustomersServiceImpl (CustomersRepository customersRepository) {
    super();
    
  }
  
  @Override
  public Customers saveCustomers(Customers customers) {
      return customersRepository.save(customers);
  }
  @Override
  public List<Customers>getCustomers(){
      return customersRepository.findAll();
}

  @Override
  public Customers getCustomersById(int IdCustomers) {
      return customersRepository.findById(IdCustomers).orElseThrow(()
          -> new ResourceNotFoundException("Customers","IdCustomers", IdCustomers));
  }

  @Override
  public Customers updateCustomers(Customers customers, int IdCustomers) {
      Customers existingCustomers = customersRepository.findById(IdCustomers).orElseThrow(()
          -> new ResourceNotFoundException("Customers", "IdCustomers", IdCustomers));
      existingCustomers.setUserName(customers.getUserName());
      existingCustomers.setEmail(customers.getEmail());
      existingCustomers.setFirstName(customers.getFirstName());
      existingCustomers.setLastName(customers.getLastName());
      existingCustomers.setZipcode(customers.getZipcode());
    return existingCustomers;
  }

  @Override
  public void deleteCustomers(int IdCustomers) {
   Customers existingCustomers = customersRepository.findById(IdCustomers).orElseThrow(()
       -> new ResourceNotFoundException("Customers", "IdCustomers", IdCustomers));
  }
  }
