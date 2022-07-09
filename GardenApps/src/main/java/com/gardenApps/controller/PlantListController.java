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

@RestController
  @RequestMapping("/gardenapp/zipcode")
  public class ZipCodeController {

    @Autowired
    private ZipCodeService zipCodeService;
   

    public ZipCodeController(ZipCodeService zipCodeService) {
      super();
      this.zipCodeService= zipCodeService;
      
    }
    
    @PostMapping()
      public ResponseEntity<ZipCode>saveZipCode (@RequestBody ZipCode zipCode){
        return new ResponseEntity<ZipCode>(zipCodeService.saveZipCode(zipCode), HttpStatus.CREATED);
      }
     @GetMapping
      public List<ZipCode>getAllZipCode(){
         return zipCodeService.getZipCode();
         
     }
    
        @DeleteMapping("{zipCode}")
     public ResponseEntity<String> deleteAlbums(@PathVariable("zipCode") int zipCode){
          zipCodeService.deleteZipCode(zipCode);
         return new ResponseEntity<String>("Zip Code was  removed!", HttpStatus.OK);
   }
  }

