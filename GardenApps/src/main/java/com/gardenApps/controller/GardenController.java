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
import com.gardenApps.model.Garden;
import com.gardenApps.service.GardenService;
import lombok.Data;

/**
 * @author anili
 *
 */
@Data
@RestController
@RequestMapping("/gardenapp/garden")
public class GardenController{

  private GardenService gardenService;
 
  public GardenController(GardenService gardenService) {
    super();
    this.gardenService=gardenService;
    
  }
  
  @PostMapping()
    public ResponseEntity<Garden>saveGarden (@RequestBody Garden garden){
      return new ResponseEntity<Garden>(gardenService.saveGarden(garden), HttpStatus.CREATED);
    }
   @GetMapping
    public List<Garden>getAllGarden(){
       return gardenService.getGarden();
       
   }
   @GetMapping("{idGarden}")
   public ResponseEntity<Garden> getGardenById(@PathVariable("idGarden") int idGarden){
       return new ResponseEntity<Garden>(gardenService.getGardenById(idGarden), HttpStatus.OK);
   }
   
   @PutMapping("{idGarden}")
   public ResponseEntity<Garden> updateGarden(@PathVariable("idGarden") int idGarden, @RequestBody Garden garden){
     return new ResponseEntity<Garden>(gardenService.updateGarden(garden, idGarden), HttpStatus.OK);
   }
   @DeleteMapping("{idGarden}")
   public ResponseEntity<String> deleteGarden(@PathVariable("idGarden") int idGarden){
     gardenService.deleteGarden(idGarden);
       return new ResponseEntity<String>("The garden has been destroyed!", HttpStatus.OK);
 }
}
