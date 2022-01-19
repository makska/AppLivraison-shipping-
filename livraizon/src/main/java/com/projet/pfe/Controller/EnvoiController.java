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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.pfe.Dto.DetailsEnvoi;
import com.projet.pfe.Dto.ListEnvoi;
import com.projet.pfe.Service.EnvoiService;
import com.projet.pfe.model.Envoi;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

@RequestMapping("/api")
public class EnvoiController {
	
	@Autowired
	private EnvoiService envoiService;
	@GetMapping("/envois")
    public List<ListEnvoi> list() {
	 System.out.println("Get all Envois...");
             return envoiService.getAll();
    }
 

 
 	 
 @GetMapping("/envois/{id}")
 public ResponseEntity<Envoi> post(@PathVariable long id) {
	  Optional<Envoi> cat = envoiService.findById(id);
        return cat.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                      .build());
    }

  

 @GetMapping("/envois/All")
 public List<DetailsEnvoi> listEnvoi() {
	 System.out.println("Get all envois...");
          return envoiService.listEnvoi();
 }
 @PostMapping("/envois")
    public void save(@RequestBody  Envoi Envoi) {
	 System.out.println(Envoi);
	 envoiService.save(Envoi);
    }
 
 
 
 
 /*@PutMapping("/livraisons/{id}")
    public void update(@PathVariable long id, @RequestBody Livraison Livraison) {
        Optional< Livraison> cat =livraisonService.findById(id);
        if (cat.isPresent()) {
        	 livraisonService.update(id, Livraison);
        } 
    }*/

  @DeleteMapping("/envois/{id}")
    public void delete(@PathVariable long id) {
	  envoiService.delete(id);
    }
}

	

