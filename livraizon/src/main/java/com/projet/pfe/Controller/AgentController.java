package com.projet.pfe.Controller;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

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

import com.projet.pfe.model.Agent;

import com.projet.pfe.Dto.ListAgent;



import com.projet.pfe.Service.AgentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AgentController{
	@Autowired
    private AgentService agetService;
	
	@Autowired  ServletContext context;
@GetMapping("/agents")
    public List<ListAgent> list() {
             return agetService.getAll();
            		 
   }
 	 
 @GetMapping("/agents/{id}")
 public ResponseEntity<Agent> post(@PathVariable long id) {
        Optional<Agent> agen = agetService.findById(id);
        return agen.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                              .build());
    }
    
 @PostMapping("/agents")
    public long save(@RequestBody Agent Agent) {
        return agetService.save(Agent);
    }
	   @PutMapping("/agents/{id}")
	   public void update(@PathVariable long id , @RequestBody Agent Agent ) {
	   Optional<Agent> post=agetService. findAllById(id);
	   if(post.isPresent()) {
		   agetService.update(id, Agent);
	   }
	   
	   }
	   @DeleteMapping("/agents/{id}")
	   public void delete(@PathVariable long id) {
		   agetService.delete(id);
	   }
}
 
 