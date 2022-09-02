package Crudop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Crudop.layer.OperationLayer;
@Repository
public interface OperationDao extends CrudRepository<OperationLayer,Integer> 
{

}
