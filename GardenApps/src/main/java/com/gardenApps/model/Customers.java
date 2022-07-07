package com.gardenApps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


  @Data
  @Entity
  @Table( name="customers")
  public class Customers {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCustomers;
  @Column(value= "UserName")
    private String UserName;
  @Column(value="email")
    private String email;
  @Column(value= "firstName")
    private String firstName;
  @Column(value= "lastName")
    private String lastName;
  @Column(value= "zipCode")
    private int zipcode;

  @JsonIgnore
  public int getidCustomers () {
    return  idCustomers;
    }
  }