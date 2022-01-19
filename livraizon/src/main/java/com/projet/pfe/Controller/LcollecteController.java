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
import com.projet.pfe.model.Lcollecte;
import com.projet.pfe.Service.LcollecteService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LcollecteController {
	@Autowired
    private LcollecteService lcolserv;
 @GetMapping("/lcollectes")
    public List<Lcollecte> list() {
	 System.out.println("Get all Lcollectes...");
             return  lcolserv.getAll();
   }
 	 
 @GetMapping("/lcollectes/{id}")
 public ResponseEntity<Lcollecte> post(@PathVariable long id) {
        Optional<Lcollecte> dep=  lcolserv.findById(id);
        return dep.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                        .build());
    }
    
 @PostMapping("/lcollectes")
 public void save(@RequestBody Lcollecte Lcollecte) {
	 
          lcolserv.save(Lcollecte);
    }

 @PutMapping("/lcollectes/{id}")
    public void update(@PathVariable long id, @RequestBody Lcollecte Lcollecte) {
        Optional<Lcollecte> cat = lcolserv.findById(id);
        if (cat.isPresent()) {
        	 lcolserv.update(id, Lcollecte);
        } else {
        	 lcolserv.save(Lcollecte);
        }
    }

  @DeleteMapping("/lcollectes/{id}")
    public void delete(@PathVariable long id) {
	  lcolserv.delete(id);
    }
     

}
