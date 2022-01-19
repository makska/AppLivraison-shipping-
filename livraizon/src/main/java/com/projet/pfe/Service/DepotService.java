package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.projet.pfe.Dto.DetailsDepot;
import com.projet.pfe.Dto.ListDepot;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.model.Depot;
import com.projet.pfe.model.Ldepot;
import com.projet.pfe.repository.CposteRepository;
import com.projet.pfe.repository.DepotRepository;
import com.projet.pfe.repository.LdepotRepository;

@Service
@Transactional
public class DepotService {
	@Autowired DepotRepository depotrepo;
	@Autowired LdepotRepository ldepotrepo;
	@Autowired CposteRepository  crepository;
	public List<ListDepot> getAll() {
		System.out.println("Get all Depots 11111...");
    	return depotrepo.listDepot();	    	
    }
	  
	    
	   public void  save(@Valid @RequestBody Depot Depot) {
		   System.out.println("save ldepot");
		   List<Ldepot> ldepots = Depot.getLdepots();
		   System.out.println(Depot);
		   for (Ldepot ldepot : ldepots) {
		    	 System.out.println(Depot.getNumero());
	            ldepot.setNumero(Depot.getNumero());
	           
	           
	           System.out.println(" save data ligne");
	           ldepotrepo.save(ldepot);
		       }
		   Optional<Cposte> CompteurInfo = crepository.findByAnnee(Depot.getAnnee());
	     	if (CompteurInfo.isPresent()) {
		    	Cposte compteur = CompteurInfo.get();
		           compteur.setNumdepot(compteur.getNumdepot()+1);
		         compteur =   crepository.save(compteur);
	     	}
	     	 
	     	
		   	
		   depotrepo.save(Depot);
	    }
	    public void update(long id, Depot depot) {
	    	  System.out.println("Depottttt");
	        Optional<Depot> depo = depotrepo.findById(id);
	        if (depo.isPresent()) {
	           Depot dep =depo.get();
	            dep.setTel(depot.getTel());
	            dep.setNumero(depot.getNumero());
	            dep.setDestinataire(depot.getDestinataire());
		         dep.setAdresse(depot.getAdresse());
		         dep.setArticle(depot.getArticle());
		         dep.setCodeClient(depot.getCodeClient());
		         dep.setTotal(depot.getTotal());
		        depotrepo.save(dep);
		     // ldepotrepo.deleligne(depot.getNumero());
	        }
	    }
	  
	
	 

	    public void delete(long id) {
	        Optional<Depot> dep = depotrepo.findById(id);
	       dep.ifPresent(depotrepo::delete);
	    }
		public Optional<Depot> findById(long id) {
			// TODO Auto-generated method stub
			return depotrepo.findById(id);
		}
		/*public List<Depot> findAllById(long id) {
			// TODO Auto-generated method stub
			return depotrepo.findAllById(id);
		}
		public List<ListDepot> listDepotClient(int code) {
			// TODO Auto-generated method stub
			return depotrepo.listDepotClient(code);
		}



		public List<ListDepot> listDepotDestination(int code) {
			// TODO Auto-generated method stub
			return depotrepo.listDepotDestination(code);
		}


		public List<DetailsDepot> listCourrier(String code) {
			// TODO Auto-generated method stub
			return depotrepo.listcourrier(code);
		}

*/
		public List<DetailsDepot> listDepot() {
			// TODO Auto-generated method stub
			return depotrepo.listdepot();
		}

		
		
		


		public List<Depot> findByCodeClient(String code ) {
			// TODO Auto-generated method stub
			return depotrepo.findByCodeClient(code);
		}


		public List<Ldepot> findLdepotByNumero(int numero) {
			// TODO Auto-generated method stub
			return ldepotrepo.findLdepotByNumero(numero);
		}
}
