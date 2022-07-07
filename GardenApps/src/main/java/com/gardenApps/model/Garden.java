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
@Table( name="garden")
public class Garden {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  
  private int idGarden;
  @Column(value= "gardenName")
  private String gardenName;
  @Column(value= "idCustomers")
  private int idCustomers;
  @Column(value= "hrdZone")
  private  int hrdZone;
  
  @JsonIgnore
  public int idGarden() {
    return idGarden;
        }
  
}
