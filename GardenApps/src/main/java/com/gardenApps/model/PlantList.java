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
import lombok.Data;

/**
 * @author anili
 *
 */

@Data
@Entity
@Table( name="plantlist")
public class PlantList {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  
  private int listId;
  @Column(value= "idGarden")
  private int idGarden;
  @Column(value= "plantId")
  private int plantId;
}
