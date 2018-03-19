package edu.giisco.SoaML.metamodel;

public class Fault {
	
	public Integer id;
	public String name;
	public Type type;
	
	public Fault() {
		
	}
	
	public Fault(String name, Type type) {
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

	@Override
	public String toString() {
		
		String ret= "\tFault: " + name + "\n\t\t\t" + "Type: " +type.toString();
		return ret;
	}
}
