package edu.giisco.SoaML.metamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Response {
	
	public Integer id;
	public String name;
	public Type type;
	
	public Response(String name, Type type) {
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

	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String ret;
		if(!name.equalsIgnoreCase(""))
			if(type!=null)
				ret= "Response: " + name + "\n\t\t" + "Type: " + type.toString();
			else ret="Response: " + name + "\n\t\t" + "Type: null ";
		else
			ret="Response: null";
		return ret;
	}
	
	
}
