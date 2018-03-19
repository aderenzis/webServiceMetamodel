package edu.giisco.SoaML.metamodel;

import java.util.ArrayList;

public class Output {
private String name;
private ArrayList <Parameter> parameters;

public Output() {
	super();
}

public Output(String name) {
	super();
	this.name = name;
	parameters= new ArrayList<Parameter>();
}

public Output(String name, ArrayList<Parameter> parameters) {
	super();
	this.name = name;
	this.parameters = parameters;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Parameter> getParameters() {
	return parameters;
}
public void setParameters(ArrayList<Parameter> parameters) {
	this.parameters = parameters;
} 

public void addParameter(Parameter param){
	parameters.add(param);
}

public void removeParameter(Parameter param){
	parameters.remove(param);
}
public String toString() {
	String ret=this.name;
	for (Parameter parameter: parameters)
		ret= ret+"\n\t\t\t"+ parameter.toString();
	return ret;
}
}
