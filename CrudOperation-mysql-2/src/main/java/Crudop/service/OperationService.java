package Crudop.service;



import java.util.List;
import java.util.Optional;

import Crudop.layer.OperationLayer;

public interface OperationService {

	  OperationLayer AddUser(OperationLayer layer ) ;   
	   
	  List<OperationLayer>GettUsers(   );
	  
	  Optional<OperationLayer> GetUserById(Integer ID );
	  
	  void  DeleteUserById();
	  
	
}




