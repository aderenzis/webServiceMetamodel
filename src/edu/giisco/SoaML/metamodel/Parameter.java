package edu.giisco.SoaML.metamodel;

public class Parameter {
	
	public Integer id;
	public String name;
	public Type type;
	
	public Parameter() {
		
	}
	
	public Parameter(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		String ret= "Parameter: " + name + type.toString(); 
	//"Type: " +type.getName();
		return ret;
	}
	
	
	
}
