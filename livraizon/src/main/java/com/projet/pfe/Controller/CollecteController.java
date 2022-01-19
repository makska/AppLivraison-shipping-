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
import com.projet.pfe.Dto.ListCollecte;
import com.projet.pfe.model.Collecte;
import com.projet.pfe.Service.CollecteService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CollecteController {
	@Autowired CollecteService colService;
	
	 
	 
	 
	 @GetMapping("/collectes")
	    public List<ListCollecte> list() {
		 System.out.println("Get all collecte...");
	             return colService.getAll();
	   }
	 

	
	 	 
	 @GetMapping("/collectes/{id}")
	 public ResponseEntity<Collecte> post(@PathVariable long id) {
		  Optional<Collecte> cat = colService.findById(id);
	        return cat.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound()
                                       .build());
	    }
	 @GetMapping("/collectes/c/{code}")
	 public List<ListCollecte> listCollecteClient(@PathVariable int code) {
		 System.out.println("Get all collectes...");
	          return colService.listCollecteClient(code);
	      
	 }

	@GetMapping("/collectes/d/{code}")
	 public List<ListCollecte> listCollecteDestination(@PathVariable int code) {
		 System.out.println("Get all collectes...");
	          return colService.listCollecteDestination(code);
	      
	 }
	    
	 @PostMapping("/collectes")
	    public void save(@RequestBody Collecte Collecte) {
		 System.out.println(Collecte);
		   colService.save(Collecte);
	    }
	
	 @PutMapping("/collectes/{id}")
	    public void update(@PathVariable long id, @RequestBody Collecte Collecte) {
	        Optional<Collecte> cat =   colService.findById(id);
	        if (cat.isPresent()) {
	        	  colService.update(id,Collecte);
	        } 
	    }
	  @DeleteMapping("/collectes/{id}")
	    public void delete(@PathVariable long id) {
		  colService.delete(id);
	    }
	     

}
