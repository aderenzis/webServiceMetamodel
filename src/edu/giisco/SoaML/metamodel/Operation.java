package edu.giisco.SoaML.metamodel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;


public class Operation {
	
	private Integer id;
	private String name;
	private Input input;
	private Output output;
	private ArrayList <Fault> faults;
	
	public Operation() {
		faults= new ArrayList<Fault>();
	}
	
	public Operation(String name, Input input, Output output, ArrayList<Fault> faults, Response response) {
		super();
		this.name = name;
		this.input = input;
		this.output = output;
		this.faults = faults;
	}

	@JsonIgnore
	public String getWholeSignature(){
		String retorno= "Nombre operacion: "+this.name+"-"+ "\n";
		if(input!=null)
			retorno= retorno+ "Input: "+  "-" + input.getName()+ "-";
		else
			retorno=retorno+ "Input: null -";
		if (output!=null)
			retorno=retorno+ "Output: "+ output.getName()+ "-" ;
		else
			retorno=retorno+ "Output: null -" ;
//		String faultsString="";
//		for(Fault fault: faults){
//			faultsString= faultsString+ fault.getName()+":"+ fault.getType().getName()+" ; ";
//		}
//		retorno= retorno+ "Faults: ( "+faultsString+ " )";
		return retorno;
	}

	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}

	public ArrayList<Fault> getFaults() {
		return faults;
	}

	public void setFaults(ArrayList<Fault> faults) {
		this.faults = faults;
	}

	public String toString() {
		return "Operation OpName=" + name + "\n\t\tInput=" + (input != null ?input.toString():"null") + "\n\t\tOutput=" + (output != null ?output.toString():"null");
	}
	
}
