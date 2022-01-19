package com.projet.pfe.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.pfe.Service.CarteService;
import com.projet.pfe.model.Carte;
import com.projet.pfe.model.Categorie;
import com.projet.pfe.model.Client;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CarteController {
	@Autowired
	CarteService cartservice;
	
	 @GetMapping("/cartes")
	    public List<Carte> list() {
		 System.out.println("Get all Cartes...");
	             return cartservice.getAll();
	   }
	 	 
	 @GetMapping("/cartes/{numCarte}")
	 public ResponseEntity<Carte> post(@PathVariable String numCarte) {
		 System.out.println("verif carte");
		 System.out.println(numCarte);
	        Optional<Carte> cat = cartservice.findByNumCarte(numCarte);
	        return cat.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound()
                                               .build());
	    }

	 @PostMapping("/cartes")
	    public long save(@RequestBody Carte carte) {
		 System.out.println(carte);
		 System.out.println("Save all Cartes...");
	        return cartservice.save(carte);
	    

}






}
