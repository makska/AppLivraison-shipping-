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

import com.projet.pfe.Service.LenvoiService;

import com.projet.pfe.model.Lenvoi;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LenvoiController {
	@Autowired
    private LenvoiService lenvoiserv;
 @GetMapping("/lenvois")
    public List<Lenvoi> list() {
	 System.out.println("Get all ldepots...");
             return  lenvoiserv.getAll();
   }
 	 
 @GetMapping("/lenvois/{id}")
 public ResponseEntity<Lenvoi> post(@PathVariable long id) {
        Optional<Lenvoi> lev=  lenvoiserv.findById(id);
        return lev.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                        .build());
    }
    
 @PostMapping("/lenvois")
    public long save(@RequestBody Lenvoi lenvoi) {
	 
        return  lenvoiserv.save(lenvoi);
    }

 @PutMapping("/lenvois/{id}")
    public void update(@PathVariable long id, @RequestBody Lenvoi lenvoi) {
        Optional<Lenvoi> cat = lenvoiserv.findById(id);
        if (cat.isPresent()) {
        	lenvoiserv.update(id, lenvoi);
        } else {
        	lenvoiserv.save(lenvoi);
        }
    }

  @DeleteMapping("/lenvois/{id}")
    public void delete(@PathVariable long id) {
	  lenvoiserv.delete(id);
    }
     

}
