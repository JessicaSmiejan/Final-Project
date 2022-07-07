/**
 * 
 */
package com.gardenApps.service;

import java.util.List;
import com.gardenApps.model.Customers;

/**
 * @author anili
 *
 */
public interface CustomersService {
  Customers saveCustomers(Customers customers);
  List<Customers> getCustomers();
  Customers getCustomersById(int IdCustomers);
  Customers updateCustomers(Customers customers, int IdCustomers);
  void deleteCustomers(int IdCustomers);
  
}
