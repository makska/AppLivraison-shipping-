package com.projet.pfe.repository;

import java.util.List;
import java.util.Optional;
import com.projet.pfe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String name);

	List<User> findAllByEmail(String email);

	
	
	


}
