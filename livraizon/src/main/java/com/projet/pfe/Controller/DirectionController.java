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


import com.projet.pfe.model.Direction;

import com.projet.pfe.Service.DirectionService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DirectionController {
	@Autowired
	private DirectionService directionService ;
	
	@GetMapping("/directions/7")
	public int getCode() {
	System.out.println("Get Numbers ...");
	int x= directionService.nbre();
	System.out.println(x);
	if(x==0) {
	return 0;	
	}
	else {
		return directionService.max();
	}
	}
	
	
	
	@GetMapping("/directions")
    public List<Direction> list() {
             return directionService.getAll();
   }
 	 
 @GetMapping("/directions/{id}")
 public ResponseEntity<Direction> post(@PathVariable long id) {
        Optional<Direction> dire = directionService.findById(id);
        return dire.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                              .build());
    }
    
 @PostMapping("/directions")
    public long save(@RequestBody Direction Direction) {
        return directionService.save(Direction);
    }
	   @PutMapping("/directions/{id}")
	   public void update(@PathVariable long id , @RequestBody Direction Direction ) {
	   Optional<Direction> post=directionService.findById(id);
	   if(post.isPresent()) {
		   directionService.update(id, Direction);
	   }
	   
	   }
	   @DeleteMapping("/directions/{id}")
	    public void delete (@PathVariable long id ) {
		   directionService.delete(id);
	   }
	      
	

}
