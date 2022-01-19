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
import com.projet.pfe.model.Depot;
import com.projet.pfe.model.Ldepot;
import com.projet.pfe.Dto.DetailsDepot;
import com.projet.pfe.Dto.ListDepot;
import com.projet.pfe.Service.DepotService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

@RequestMapping("/api")
public class DepotController {
	@Autowired
	private DepotService depotService;
	@GetMapping("/depots")
    public List<ListDepot> list() {
	 System.out.println("Get all Depots...");
             return depotService.getAll();
   }
 

 
 	 
 @GetMapping("/depots/{id}")
 public ResponseEntity<Depot> post(@PathVariable long id) {
	  Optional<Depot> cat = depotService.findById(id);
        return cat.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound()
                                      .build());
    }
 @GetMapping("/depots/7/{numero}")
 public List<Ldepot> findLdepotByNumero(@PathVariable int numero) {
	 System.out.println("Get all tarifs...");
          return depotService.findLdepotByNumero(numero);
      
 }
 @GetMapping("/depots/10/{code}")
 public List<Depot>findByCodeClient(@PathVariable String code) {
	 System.out.println("Get all tarifs...");
          return depotService.findByCodeClient(code);
      
 }
 
 /*@GetMapping("/depots/7/{numero}")
 public List<Lepot> listDepotClient(@PathVariable int code) {
	 System.out.println("Get all tarifs...");
          return depotService.listDepotClient(code);
      
 }
 
 */
 
 @GetMapping("/depots/All")
 public List<DetailsDepot> listDepot() {
	 System.out.println("Get all tarifs...");
          return depotService.listDepot();
      
 }
 /*
 @GetMapping("/depots/b/{code}")
 public List<DetailsDepot> listCourrier(@PathVariable String code) {
	 System.out.println("Get all tarifs...");
          return depotService.listCourrier(code);
      
 }

@GetMapping("/depots/d/{code}")
 public List<ListDepot> listDepotDestination(@PathVariable int code) {
	 System.out.println("Get all tarifs...");
          return depotService.listDepotDestination(code);
      
 }
   */ 
 @PostMapping("/depots")
    public void save(@RequestBody Depot Depot) {
	 System.out.println(Depot);
         depotService.save(Depot);
    }
 
 
 
 
 @PutMapping("/depots/{id}")
    public void update(@PathVariable long id, @RequestBody Depot Depot) {
        Optional<Depot> cat =   depotService.findById(id);
        if (cat.isPresent()) {
        	  depotService.update(id,Depot);
        } 
    }

  @DeleteMapping("/depots/{id}")
    public void delete(@PathVariable long id) {
	  depotService.delete(id);
    }
}

