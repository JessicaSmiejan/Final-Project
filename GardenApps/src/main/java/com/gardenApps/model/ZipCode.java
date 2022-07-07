/**
 * 
 */
package com.gardenApps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author anili
 *
 */

  @Data
  @Entity
  @Table( name="zipcode")
  public class ZipCode {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int zipcode;
  
  @Column(value= "State")
    private String State;
  
  @Column(value= "county")
  private String county;
  
  @Column(value= "hrdZone")
  private String hrdZone;

  @JsonIgnore
  public int getzipcode () {
    return  getzipcode();
    }
  }
