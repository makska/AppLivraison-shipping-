package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.projet.pfe.Dto.ListCollecte;
import com.projet.pfe.model.Collecte;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.model.Lcollecte;
import com.projet.pfe.repository.CollecteRepository;
import com.projet.pfe.repository.CposteRepository;
import com.projet.pfe.repository.DepotRepository;
import com.projet.pfe.repository.LcollecteRepository;
import com.projet.pfe.model.Depot;

@Service
@Transactional
public class CollecteService {
	@Autowired CollecteRepository colrepo;
	@Autowired LcollecteRepository lcolrepo;
	@Autowired CposteRepository  crepository;
	@Autowired DepotRepository depotrepo;
	public List<ListCollecte> getAll() {
		System.out.println("Get all collecte 11111...");
    	return colrepo.listcollecte();	    	
    } 
	 public void  save(@Valid @RequestBody Collecte Collecte) {
		   System.out.println("save lcollecte");
		   List<Lcollecte> lcollectes = Collecte.getLcollectes();
		   System.out.println(Collecte);
		   for (Lcollecte lcollecte : lcollectes) {
	            lcollecte.setNumero(Collecte.getNumero());
	           System.out.println(" save data ligne");
	           lcolrepo.save(lcollecte);
		       }	
		   Optional<Cposte> CompteurInfo = crepository.findByAnnee(Collecte.getAnnee());
	     	if (CompteurInfo.isPresent()) {
		    	Cposte compteur = CompteurInfo.get();
		           compteur.setNumcollecte(compteur.getNumcollecte()+1);
		         compteur =   crepository.save(compteur);
	     	}

	     	/* 	Depot depot = new Depot();
	     	depot.setAnnee(Collecte.getAnnee());
			depot.setAdresse(Collecte.getAdresse());
			depot.setArticle(Collecte.getArticle());
			depot.setAssurance(Collecte.getAssurance());
			depot.setCodeBarre(Collecte.getCodeBarre());
			depot.setCodeClient(Collecte.getCodeClient());
			depot.setCodeDestination(Collecte.getCodeDestination());
			depot.setDateDepot(Collecte.getDateCollecte());
			depot.setDestinataire(Collecte.getDestinataire());
			depot.setEmailClient(Collecte.getEmailClient());
			depot.setEmailDestinataire(Collecte.getEmailDestinataire());
			depot.setEtat(Collecte.getEtat());
			//depot.setLdepots(Collecte.getLcollectes());
			depot.setMontant(Collecte.getMontant());
			depot.setMontantAssurance(Collecte.getMontantAssurance());
			depot.setNumero(Collecte.getNumero());
			depot.setPu(Collecte.getPu());
			depot.setTel(Collecte.getTel());
			depot.setTotal(Collecte.getTotal());
			depot.setValeurEstime(Collecte.getValeurEstime());
			//depot.setLdepots(Collecte.getLcollectes());
			depotrepo.save(depot);*/
		   colrepo.save(Collecte);
	  
	 }
	 public void update(long id,Collecte collecte) {
	        Optional<Collecte> col =  colrepo.findById(id);
	        if (col.isPresent()) {
	        	Collecte co =col.get();
	          co.setTel(collecte.getTel());
	           co.setDestinataire(collecte.getDestinataire());
	            co.setNumero(collecte.getNumero());
	            co.setAnnee(collecte.getAnnee());
	            colrepo.save(co);
	        }
	    }

	    public void delete(long id) {
	        Optional<Collecte> col = colrepo.findById(id);
	      col.ifPresent(colrepo::delete);
	    }
		public Optional<Collecte> findById(long id) {
			// TODO Auto-generated method stub
			return colrepo.findById(id);
		}


		public List<ListCollecte> listCollecteClient(int code) {
			// TODO Auto-generated method stub
			return colrepo.listCollecteClient(code);
		}



		public List<ListCollecte> listCollecteDestination(int code) {
			// TODO Auto-generated method stub
			return colrepo.listCollecteDestination(code);
		}


}
