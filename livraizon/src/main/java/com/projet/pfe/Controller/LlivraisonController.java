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

import com.projet.pfe.Service.LdepotService;
import com.projet.pfe.Service.LlivraisonService;
import com.projet.pfe.model.Ldepot;
import com.projet.pfe.model.Llivraison;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LlivraisonController {
	@Autowired
    private LlivraisonService llivraisonserv;
 @GetMapping("/llivraisons")
    public List<Llivraison> list() {
	 System.out.println("Get all ldepots...");
             return  llivraisonserv.getAll();
   }
 	 
 @GetMapping("/llivraisons/{id}")
 public ResponseEntity<Llivraison> post(@PathVariable long id) {
        Optional<Llivraison> lvr=  llivraisonserv.findById(id);
        return lvr.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                        .build());
    }
    
 @PostMapping("/llivraisons")
    public long save(@RequestBody Llivraison llivraison) {
	 
        return  llivraisonserv.save(llivraison);
    }

 @PutMapping("/llivraisons/{id}")
    public void update(@PathVariable long id, @RequestBody Llivraison llivraison) {
        Optional<Llivraison> cat = llivraisonserv.findById(id);
        if (cat.isPresent()) {
        	llivraisonserv.update(id, llivraison);
        } else {
        	llivraisonserv.save(llivraison);
        }
    }

  @DeleteMapping("/llivraisons/{id}")
    public void delete(@PathVariable long id) {
	  llivraisonserv.delete(id);
    }
     
}
