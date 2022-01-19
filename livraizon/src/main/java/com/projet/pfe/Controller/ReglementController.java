package com.projet.pfe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.pfe.Service.ReglementService;
import com.projet.pfe.domaine.Message;
import com.projet.pfe.model.Reglement;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReglementController {
	@Autowired
	ReglementService reglserv;
	@GetMapping("/reglements")
    public List<Reglement> list() {
             return reglserv.getAll();
   }
	@PostMapping("/reglements")
    public Message save(@RequestBody Reglement regle) {
        return reglserv.save(regle);
    }

}