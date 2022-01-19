package com.projet.pfe.Controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.apache.commons.io.input.DemuxInputStream;
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

import com.projet.pfe.Service.demandeCarteService;
import com.projet.pfe.model.demandeCarte;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class demandeCarteController {
	@Autowired
    private demandeCarteService service;
	
	@Autowired  ServletContext context;
@GetMapping("/demandecollectes")
    public List<demandeCarte> list() {
             return service.getAll();
            		 
   }
 	 
 @GetMapping("/demandecollectes/{id}")
 public ResponseEntity<demandeCarte> post(@PathVariable long id) {
        Optional<demandeCarte> agen = service.findById(id);
        return agen.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                              .build());
    }
    
 @PostMapping("/demandecollectes")
    public long save(@RequestBody demandeCarte demandeCarte) {
        return service.save(demandeCarte);
    }
	   @PutMapping("/demandecollectes/{id}")
	   public void update(@PathVariable long id , @RequestBody demandeCarte demandeCarte ) {
	   Optional<demandeCarte> post=service.findById(id);
	   if(post.isPresent()) {
		   service.update(id, demandeCarte);
	   }
	   
	   }
	   @DeleteMapping("/demandecollectes/{id}")
	    public void delete (@PathVariable long id ) {
		   service.delete(id);
	   }
	   
	   @PutMapping("/demandecollectes/5/{id}")
	    public void updateaccepter(@PathVariable Long id, @RequestBody demandeCarte demandecompte) {
		   System.out.println("aaaa");
	        Optional<demandeCarte> post = service.findById(id);
	        if (post.isPresent()) {
	        	service.updateaccepter(id, demandecompte);
	        } else {
	        	service.save(demandecompte);
	        }
	    }
}
 
 

