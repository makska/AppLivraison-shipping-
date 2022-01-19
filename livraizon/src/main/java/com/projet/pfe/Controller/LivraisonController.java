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

import com.projet.pfe.Dto.DetailsLivraison;
import com.projet.pfe.Dto.ListLivraison;
import com.projet.pfe.Service.LivraisonService;
import com.projet.pfe.model.Livraison;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

@RequestMapping("/api")
public class LivraisonController {
	@Autowired
	private LivraisonService livraisonService;
	@GetMapping("/livraisons")
    public List<ListLivraison> list() {
	 System.out.println("Get all Depots...");
             return livraisonService.getAll();
   }
 

 
 	 
 @GetMapping("/livraisons/{id}")
 public ResponseEntity<Livraison> post(@PathVariable long id) {
	  Optional<Livraison> cat = livraisonService.findById(id);
        return cat.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                      .build());
    }

  
 
 @GetMapping("/livraisons/All")
 public List<DetailsLivraison> listLivraison() {
	 System.out.println("Get all tarifs...");
          return livraisonService.listLivraison();
 }
 @PostMapping("/livraisons")
    public void save(@RequestBody  Livraison Livraison) {
	 System.out.println(Livraison);
	 livraisonService.save(Livraison);
    }
 
 
 
 
 /*@PutMapping("/livraisons/{id}")
    public void update(@PathVariable long id, @RequestBody Livraison Livraison) {
        Optional< Livraison> cat =livraisonService.findById(id);
        if (cat.isPresent()) {
        	 livraisonService.update(id, Livraison);
        } 
    }*/

  @DeleteMapping("/livraisons/{id}")
    public void delete(@PathVariable long id) {
	  livraisonService.delete(id);
    }
}

	

