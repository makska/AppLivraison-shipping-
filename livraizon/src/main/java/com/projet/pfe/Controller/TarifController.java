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
import com.projet.pfe.model.Tarif;
import com.projet.pfe.Dto.ListTarif;
import com.projet.pfe.Service.TarifService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TarifController {
	@Autowired TarifService tarifService;
	 @GetMapping("/tarifs/7")
	 public  int getCode() {
		 System.out.println("Get Numbers...");
		 int  x = tarifService.nbre();
		 System.out.println(x);
		 if (x == 0)
		 {
			 return 0;
		 }
		 else
		 {
			 return tarifService.max();
		 }
	    
	 }
	 @GetMapping("/tarifs/{p}/{tc}/{cd}")
	 public   double mtarif(@PathVariable double p,@PathVariable String tc,@PathVariable String cd) {
		 System.out.println(p);
		 System.out.println(tc);
		 System.out.println(cd);
		 int x = tarifService.countTarif(p,tc,cd);
		 System.out.println(x);
		 if (x == 0) 
		 return 0;
		 else
		 {
				 
		double  y =tarifService.mtarif(p,tc,cd);
		 System.out.println(y);
			 return y;
		 }
		
	 }

	 @GetMapping("/tarifs/{codec}/{typec}")
	 public  int getNbrTarift(@PathVariable String codec,@PathVariable String typec) {
		 System.out.println("Get Numbers...");
		 int  x =tarifService.nbreTarif(codec, typec);
			 return x;
		
	 }
	 
	 
	 @GetMapping("/tarifs")
	    public List<ListTarif> list() {
		 System.out.println("Get all tarifs...");
	             return tarifService.getAll();
	   }
	 

	 @GetMapping("/tarifs/{code}")
	    public List<Tarif> listTarif(@PathVariable String code) {
		 System.out.println("Get all tarifs...");
	             return tarifService.findAllByCode(code);
	   }
	 	 
	 @GetMapping("/tarifs/{id}")
	 public ResponseEntity<Tarif> post(@PathVariable long id) {
	        Optional<Tarif> cat = tarifService.findById(id);
	        return cat.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound()
                                            .build());
	    }
	    
	 @PostMapping("/tarifs")
	    public void save(@RequestBody Tarif tarif) {
		 System.out.println(tarif);
	         tarifService.save(tarif);
	    }
	 @PutMapping("/tarifs/{id}")
	    public void update(@PathVariable long id, @RequestBody Tarif tarif) {
	        Optional<Tarif> cat =   tarifService.findById(id);
	        if (cat.isPresent()) {
	        	  tarifService.update(id,tarif);
	        } 
	    }

	  @DeleteMapping("/tarifs/{id}")
	    public void delete(@PathVariable long id) {
		  tarifService.delete(id);
	    }

}
