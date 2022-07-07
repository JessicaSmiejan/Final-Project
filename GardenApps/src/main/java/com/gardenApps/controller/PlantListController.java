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
import com.gardenApps.model.PlantList;
import com.gardenApps.service.PlantListService;
import lombok.Data;

/**
 * @author anili
 *
 */

  @Data
  @RestController
  @RequestMapping("/gardenapp/plantlist")
  public class PlantListController {
    private PlantListService plantListService;
   
    public PlantListController( PlantListService plantListService) {
      super();
      this. plantListService=  plantListService;
      
    }
    
    @PostMapping()
      public ResponseEntity<PlantList>savePlantList (@RequestBody PlantList plantList){
        return new ResponseEntity<PlantList>(plantListService.savePlantList(plantList), HttpStatus.CREATED);
      }
     @GetMapping
      public List<PlantList>getAllPlantList(){
         return plantListService.getPlantList();
         
     }
     @GetMapping("{listId}")
     public ResponseEntity<PlantList> getPlantListById(@PathVariable("listId") int listId){
         return new ResponseEntity<PlantList>(plantListService.getPlantListById(listId), HttpStatus.OK);
     }
     
     @PutMapping("{listId}")
     public ResponseEntity<PlantList> updatePlantList(@PathVariable("listId") int listId, @RequestBody PlantList plantList){
       return new ResponseEntity<PlantList>(plantListService.updatePlantList(plantList, listId), HttpStatus.OK);
     }
     @DeleteMapping("{listId}")
     public ResponseEntity<String> deletePlantList(@PathVariable("listId") int listId){
       plantListService.deletePlantList(listId);
         return new ResponseEntity<String>("List has been removed!", HttpStatus.OK);
   }
  }

