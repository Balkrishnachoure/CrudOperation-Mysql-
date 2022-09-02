package Crudop.controller;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import Crudop.layer.OperationLayer;
import Crudop.service.OperationService;

@RequestMapping("/Operation")
@RestController
public class OperationController {
            
         @Autowired 
          private OperationService service  ;
         
         @PostMapping("/AddDepartment")
         public OperationLayer  AddUserr( @RequestBody OperationLayer layer)
    	 {
    		 return  service.AddUser(layer);
    		 
    	 }
         
         @GetMapping("/GetOperation")
         public  List<OperationLayer>GettUserss( )
   	  {
   		  return(List<OperationLayer>)service.GettUsers( );
   			   	
   		  
   	  }
         @GetMapping("/GetUserByID/{ID}")
         public Optional<OperationLayer> GetUserByIdd( @PathVariable  Integer ID )
  	   {
  		  return service.GetUserById(ID) ;		   
  	   }
         
         @DeleteMapping("/Delete")
         public void  DeleteUserByIdd( )
  	   {
        	 service.DeleteUserById() ;        	   
  		   
  	   }
	
	
}
