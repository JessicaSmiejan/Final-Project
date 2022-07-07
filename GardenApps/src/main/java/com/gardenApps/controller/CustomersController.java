package com.gardenApps.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gardenApps.model.Customers;
import com.gardenApps.service.CustomersService;
import lombok.Data;


  @Data
  @RestController
  @RequestMapping("/gardenapp/customers")
  public class CustomersController {

    private CustomersService customersService;
   
    public CustomersController(CustomersService customersService) {
      super();
      this.customersService= customersService;
      
    }
    
    @PostMapping()
      public ResponseEntity<Customers>saveCustomers (@RequestBody Customers Customers){
        return new ResponseEntity<Customers>(customersService.saveCustomers(Customers), HttpStatus.CREATED);
      }
     @GetMapping
      public List<Customers>getAllCustomers(){
         return customersService.getCustomers();
         
     }
     @GetMapping("{IdCustomers}")
     public ResponseEntity<Customers> getCustomersById(@PathVariable("IdCustomers") int IdCustomers){
         return new ResponseEntity<Customers>(customersService.getCustomersById(IdCustomers), HttpStatus.OK);
     }
     
     @PutMapping("{IdCustomers}")
     public ResponseEntity<Customers> updateCustomers(@PathVariable("IdCustomers") int IdCustomers, @RequestBody Customers customers){
       return new ResponseEntity<Customers>(customersService.updateCustomers(customers,IdCustomers), HttpStatus.OK);
     }
     @DeleteMapping("{IdCustomers}")
     public ResponseEntity<String> deleteAlbums(@PathVariable("IdCustomers") int IdCustomers){
       customersService.deleteCustomers(IdCustomers);
         return new ResponseEntity<String>("Customer has been  deleted!", HttpStatus.OK);
   }
  }

