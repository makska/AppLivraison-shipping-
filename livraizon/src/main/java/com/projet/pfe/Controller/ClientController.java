package com.projet.pfe.Controller;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.projet.pfe.model.Client;
import com.projet.pfe.model.User;
import com.projet.pfe.repository.UserRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projet.pfe.Service.ClientService;
//import com.projet.pfe.Service.ParametreService;
import com.projet.pfe.Service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientController {
	@Autowired
	private ClientService cltService;
	 @Autowired  ServletContext context;
	 @Autowired
		UserService userService;
		
	//private ParametreService parService ;
	
	/*@GetMapping("/clients/7")
	public int getCode() {
	System.out.println("Get Numbers ...");
	int x= cltService.nbre();
	System.out.println(x);
	if(x==0) {
	return 0;	
	}
	else {
		return cltService.max();
	}
	}*/
	@GetMapping("/clients")
    public List<Client> list() {
             return cltService.getAll();
   }
	
	@GetMapping("/clients/{id}")
	 public ResponseEntity<Client> post(@PathVariable long id) {
	        Optional<Client> clt = cltService.findById(id);
	        return clt.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound()
	                                              .build());
	    }
	
	    
	@GetMapping(path="/ImgClients/{id}")
	 public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
		 Client Client   =cltService.findById(id).get();
		 return Files.readAllBytes(Paths.get(context.getRealPath("/ImgClients/")+Client.getFileName()));
	 }
	 @PostMapping("/clients")
	 public long createUser (@RequestParam("file") MultipartFile file,
			 @RequestParam("client") String client) throws JsonParseException , JsonMappingException , Exception
	 {
		
		Client cl = new ObjectMapper().readValue(client, Client.class);
		addUserImage(file);
	    String filename = file.getOriginalFilename();
	    String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	    cl.setFileName(newFileName);
	    return cltService.save(cl);
	 }
	
	 private void addUserImage(MultipartFile file) {
	    	boolean isExit = new File(context.getRealPath("/ImgClients/")).exists();
		    if (!isExit)
		    {
		    	new File (context.getRealPath("/ImgClients/")).mkdir();
		    	System.out.println("mk dir Imagess.............");
		    }
		    String filename = file.getOriginalFilename();
		    String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
		    File serverFile = new File (context.getRealPath("/ImgClients/"+File.separator+newFileName));
		    try
		    {
		    
		    	 FileUtils.writeByteArrayToFile(serverFile,file.getBytes());
		    	 
		    }catch(Exception e) {
		    	 System.out.println("Failed to Add Image User !!");
		    }
		    
	    	
	    }
	 @PutMapping("/clients/{id}")
	    public void update(@PathVariable long id,@RequestParam("file") MultipartFile file,
				 @RequestParam("client") String client) throws JsonParseException , JsonMappingException , Exception {
	     Client cl = new ObjectMapper().readValue(client, Client.class);
	        	deleteUserImage(cl);
	        	 String filename = file.getOriginalFilename();
	     	    String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	     	    cl.setFileName(newFileName);
	     	   cltService.update(id, cl);
	           
	            addUserImage(file);
	       
	    }
	 private void deleteUserImage(Client client)
	    {
	    	System.out.println( " Delete User Image");
	         try { 
	        	 File file = new File (context.getRealPath("/ImgClients/"+client.getFileName()));
	             System.out.println(client.getFileName());
	              if(file.delete()) { 
	                System.out.println(file.getName() + " is deleted!");
	             } else {
	                System.out.println("Delete operation is failed.");
	                }
	          }
	            catch(Exception e)
	            {
	                System.out.println("Failed to Delete image !!");
	            }
	    }
	 @DeleteMapping("/clients/{id}")
	    public void delete(@PathVariable Long id) {
		 cltService.delete(id);
	    }
	 
}