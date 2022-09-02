package Crudop.layer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationLayer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int   ID ;
	private String Name ;
	private String Year ;
	
	public OperationLayer()
	{
		
	}
	
	public OperationLayer(Integer Id ,String Name , String Year)
	{
		this.ID =ID ;
		this.Name =Name;
		this.Year= Year; 
		
	}
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	
	
	
	
	
	
	
}
