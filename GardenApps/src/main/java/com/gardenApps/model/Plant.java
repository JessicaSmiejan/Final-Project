/**
 * 
 */
package com.gardenApps.model;


import javax.persistence.Entity;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author anili
 *
 */

@Data
@Entity
@Table( name="plant")
public class Plant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int plantIdPK;
@Column(value= "plantName")
  private String plantName;
@Column(value= "plantType")
  private PlantType  plantType;
@Column(value= "hrdZone")
  private int hrdZone;
  
  @JsonIgnore
  public int plantId() {
    return plantId();
        }
  
  }
