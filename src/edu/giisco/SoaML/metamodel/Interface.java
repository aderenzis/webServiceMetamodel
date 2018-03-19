package edu.giisco.SoaML.metamodel;

import java.util.ArrayList;

public class Interface {
	
	public Integer id;
	public String name;
	public  ArrayList<Operation> operations;
	
	public Interface() {
	}
	
	public Interface(String name, ArrayList<Operation> operations) {
		this.name = name;
		this.operations = operations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Operation> getOperations() {
		return operations;
	}
	public void setOperations(ArrayList<Operation> operations) {
		this.operations = operations;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void addOperation(Operation op) {
		if(operations==null)
			operations= new ArrayList<Operation>();
		operations.add(op);
	}

	@Override
	public String toString() {
		String ret=this.name;
		for(Operation op:operations){
			ret= ret + "\n\t" + op.toString(); 
		}
		return ret;
	}
}
