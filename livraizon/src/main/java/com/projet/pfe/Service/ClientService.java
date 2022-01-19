package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.projet.pfe.model.Client;
import com.projet.pfe.model.Parametre;
import com.projet.pfe.model.User;
import com.projet.pfe.repository.ClientRepository;
import com.projet.pfe.repository.ParametreRepository;
import com.projet.pfe.repository.UserRepository;

@Service
@Transactional

public class ClientService {
	@Autowired
	ClientRepository repository;
	@Autowired
	ParametreRepository paramRepository;
	@Autowired
	UserRepository userRepository;
	
	public List<Client> getAll(){
		return repository.findAll(Sort.by("libelle").ascending());
		
	}
	public Optional<Client> findById(long id){
		return repository.findById(id);
		}
	 public long save(Client Client) {
		  long id = 1;
			 Optional<Parametre> ParamInfo = paramRepository.findById(id);
		 	    if (ParamInfo.isPresent()) {
			    	Parametre param = ParamInfo.get();
			           param.setNumc(param.getNumc()+1);
			           param = paramRepository.save(param);
			    }
	    	 
		  User user1=new User();
	   
		  user1.setUsername(Client.getEmail());

		  user1.setEmail(Client.getEmail());
		  user1.setPassword(Client.getPwd());
		  user1.setCode(Client.getCode());
		  user1.setNom(Client.getLibelle());
		  user1.setFileName(Client.getFileName());
		  user1.setRole("Client");
		  userRepository.save(user1);
		        return repository.save(Client)
	                             .getId();
	        
	    }
	 
	public void update(long  id,Client client) {
		 Optional<Client> clte= repository.findById(id);
		 if (clte.isPresent()) {
			 Client clt=clte.get();
			 clt.setLibelle(client.getLibelle());
			 clt.setAdresse(client.getAdresse());
			 clt.setEmail(client.getEmail());
			 clt.setLogin(client.getLogin());
			 clt.setPwd(client.getPwd());
			 clt.setTel(client.getTel());
			 clt.setCode(client.getCode());
			  clt.setFileName(clt.getFileName());
			 repository.save(clt);
			 
		 }
		 
		}
	public List<Client> findByLibelle(String libelle){
		return repository.findAllByLibelleContaining(libelle);
		 
	 }
	 
	    
	    public List<Client> findByEmail(String email) {
	        return repository.findAllByEmail(email);
	    }
	public void delete(long id) {
		 Optional<Client> clt = repository.findById(id);
	        clt.ifPresent(repository::delete);
		// TODO Auto-generated method stub
		
	}
	
}
	
	
