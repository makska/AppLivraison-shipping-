package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.pfe.repository.AgentRepository;
import com.projet.pfe.repository.ParametreRepository;
import com.projet.pfe.repository.UserRepository;
import com.projet.pfe.Dto.ListAgent;
import com.projet.pfe.model.Agent;
import com.projet.pfe.model.Destination;
import com.projet.pfe.model.Parametre;
import com.projet.pfe.model.User;
import javax.transaction.Transactional;

@Service
@Transactional
public class AgentService {
	@Autowired
	AgentRepository repository;
	@Autowired
	ParametreRepository paramRepository;
	@Autowired
	UserRepository userRepository;
 
	public List<ListAgent> getAll() {
		
    	return repository.listAgent();
    }
	public Optional<Agent> findById(long id){
		return repository.findById(id);
		}
	
	
	
    
    
    public long save(Agent agent) {
    	long id =1; 
		Optional<Parametre> ParamInfo = paramRepository.findById(id);
		if (ParamInfo.isPresent()) {
			Parametre param = ParamInfo.get();
			param.setNuma(param.getNuma()+1);
			param = paramRepository.save(param);
			
		}
		
		User user = new User();
		/*user.setUsername(agent.getMat());*/
		user.setMat(agent.getMat());
		user.setUsername(agent.getEmail());
		user.setEmail(agent.getEmail());
		
		user.setPassword(agent.getPwd());
		user.setRole("Agent");
		user.setActive(true);
		userRepository.save(user);
		
        
        return repository.save(agent)
        		.getId();
    }
    public void update(long id, Agent agent) {
        Optional<Agent> agen = repository.findAllById(id);
        if (agen.isPresent()) {
        	Agent age = agen.get();
            age.setNom(agent.getNom());
            age.setMat(agent.getMat());
          
            age.setCgrade(agent.getCgrade());
            age.setCagence(agent.getCagence());
            age.setEmail(agent.getEmail());
            age.setPwd(agent.getPwd());
            repository.save(age);
        }
    }
  

    public List<Agent> findByCgrade(String code) {
        return repository.findAllByCgrade(code);
    }
    public List<Agent> findByCagence(String code) {
        return repository.findAllByCagence(code);
    }

  
    public void delete(long id) {
        Optional<Agent> age = repository.findAllById(id);
        age.ifPresent(repository::delete);
    }

	
	public Optional<Agent> findAllById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	
	

}
