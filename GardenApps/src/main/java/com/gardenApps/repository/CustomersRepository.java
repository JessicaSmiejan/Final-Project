package com.gardenApps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.gardenApps.model.Customers;

@Service
public interface CustomersRepository extends  JpaRepository<Customers, Integer>{
  
}
