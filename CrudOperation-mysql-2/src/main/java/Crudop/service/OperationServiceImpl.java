package Crudop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Crudop.layer.OperationLayer;
import Crudop.repository.OperationDao;
@Service
public class OperationServiceImpl  implements OperationService
{    @Autowired
	private OperationDao Repository ;
   
	 public OperationLayer  AddUser(OperationLayer layer)
	 {
		 return  Repository.save(layer);
		 
	 }
	 
	  public  List<OperationLayer>GettUsers( )
	  {
		  return(List<OperationLayer>)Repository.findAll() ;
		  
	  }
	 
	  
	// GETBYId NOt WOrking 
	   public Optional<OperationLayer> GetUserById(Integer ID )
	   {
		  return  Repository.findById(ID) ;		   
	   }
	  
	    public void  DeleteUserById( )
	   {
		     Repository.deleteAll();
		   
	   }
	   
	   
	  
	
}
