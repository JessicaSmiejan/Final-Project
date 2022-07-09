/**
 * 
 */
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
import com.gardenApps.model.Plant;
import com.gardenApps.service.PlantService;
import lombok.Data;

/**
 * @author anili
 *
 */
@RestController
@RequestMapping("/gardenapp/plant")
public class PlantController {
  @Autowired
  private PlantService plantService;
 
  
  public PlantController(PlantService plantService) {
    super();
    this.plantService= plantService;
    
  }
  
  @PostMapping()
    public ResponseEntity<Plant>savePlant (@RequestBody Plant plant){
      return new ResponseEntity<Plant>(plantService.savePlant(plant), HttpStatus.CREATED);
    }
   @GetMapping
    public List<Plant>getAllPlant(){
       return plantService.getPlant();
       
   }
   @GetMapping("{plantId}")
   public ResponseEntity<Plant> getPlantById(@PathVariable("plantId") int plantId){
       return new ResponseEntity<Plant>(plantService.getPlantById(plantId), HttpStatus.OK);
   }
   
   @PutMapping("{plantId}")
   public ResponseEntity<Plant> updatePlant(@PathVariable("plantId") int plantId, @RequestBody Plant plant){
     return new ResponseEntity<Plant>(plantService.updatePlant(plant, plantId), HttpStatus.OK);
   }
   @DeleteMapping("{plantId}")
   public ResponseEntity<String> deleteAlbums(@PathVariable("plantId") int plantId){
       plantService.deletePlant(plantId);
       return new ResponseEntity<String>("plant is gone!", HttpStatus.OK);
 }
}
