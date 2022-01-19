package com.projet.pfe.Controller;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.pfe.model.Destination;

import com.projet.pfe.Service.DestinationService;


@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/api")
public class DestinationController {
	@Autowired
    private DestinationService destinatService;
	@GetMapping("/destinations/7")
	public int getCode() {
	System.out.println("Get Numbers ...");
	int x= destinatService.nbre();
	System.out.println(x);
	if(x==0) {
	return 0;	
	}
	else {
		return destinatService.max();
	}
	}
 
 @GetMapping("/destinations")
    public List<Destination> list() {
	 System.out.println("Get all Destinations...");
             return destinatService.getAll();
   }
 @GetMapping("/destinations/{id}")
 public ResponseEntity<Destination> post(@PathVariable long id) {
        Optional<Destination> des = destinatService.findById(id);
        return des.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                           .build());
    }
 @PutMapping("/destinations/{id}")
 public void update(@PathVariable long id , @RequestBody Destination destination) {
     Optional<Destination> des = destinatService.findById(id);
     if (des.isPresent()) {
    	 destinatService.update(id, destination);
     }
 }  
 @DeleteMapping("/destinations/{id}")
 public void delete(@PathVariable long id) {
	 destinatService.delete(id);
 }
@PostMapping("/destinations")
 public long save(@RequestBody Destination destination) {
	 
     return destinatService.save(destination);
}
  

}
