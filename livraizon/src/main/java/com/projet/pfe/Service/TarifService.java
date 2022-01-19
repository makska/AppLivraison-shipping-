package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.pfe.repository.TarifRepository;
import com.projet.pfe.repository.LtarifRepository;
import com.projet.pfe.Dto.ListTarif;
import com.projet.pfe.model.Ltarif;
import com.projet.pfe.model.Tarif;
import javax.transaction.Transactional;
import javax.validation.Valid;
@Service
@Transactional
public class TarifService {
	@Autowired TarifRepository repository;
	@Autowired LtarifRepository Lrepository;
	
	public List<ListTarif> getAll() {
		System.out.println("Get all Tarif 11111...");
    	return repository.listTarif();	    	
    }
  
  public Optional<Tarif> findByCode(String code) {
        return repository.findByCode(code);
    }

  
	public Optional<Tarif> findById(Long id) {
		// TODO Auto-generated method stub
		 return repository.findById(id);
	}
	public Iterable<Tarif> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	   public void  save(@Valid @RequestBody Tarif Tarif) {
		   System.out.println("save ltarif");
		   List<Ltarif> ltarifs = Tarif.getLtarifs();
		   System.out.println(Tarif);
		   for (Ltarif ltarif : ltarifs) {
		    	 ltarif.setCode(Tarif.getCode());
  	           System.out.println(" save data ligne");
	          	Lrepository.save(ltarif);
		       }	
		   repository.save(Tarif);
	    }
		public int max() {
			return repository.max();
		}
		
		public int nbre() {
			return repository.nbre();
		}
	  

	   public void update(long id, Tarif tarif) {
		   Optional<Tarif> tar = repository.findById(id);
	        if (tar.isPresent()) {
	           Tarif tari = tar.get();
	            
	            tari.setCode(tarif.getCode());
	            
	            repository.save(tari);
	        } 
	    }	
		
	
	public List<Tarif> findAllByCode(String code) {
		// TODO Auto-generated method stub
		return  repository.findAllByCode(code);
	}
	
	public void delete(long id) {
		// TODO Auto-generated method stub
		 Optional<Tarif> tar = repository.findById(id);
	        tar.ifPresent(repository::delete);
	    }
	public List<Tarif> findByTypecourrier(String code) {
        return repository.findAllByTypecourrier(code);
    }
  public List<Tarif> findByCodedes(String code) {
        return repository.findAllByCodedes(code);
    }
  public int nbreTarif(String codec,String typec) {
		return repository.nbrTarif(codec,typec);
	}
  public double mtarif(double p, String tc, String cd) {
		 return repository.mtarif(p,tc,cd);
	 }
  public int countTarif(double p, String tc, String cd) {
		// TODO Auto-generated method stub
		return repository.countTarif(p,tc,cd);
	}



	}
	
