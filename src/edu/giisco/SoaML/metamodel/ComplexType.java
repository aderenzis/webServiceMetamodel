package edu.giisco.SoaML.metamodel;


import java.util.ArrayList;

public class ComplexType extends Type {

public ArrayList<Attribute> attributes;

	public ComplexType() {
		
	}
	
	public ComplexType(String name, ArrayList<Attribute> attributes) {
		super(name);
		this.attributes = attributes;
	}
	
	public ArrayList<Attribute> getElements() {
		return attributes;
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(Attribute a)
	{
		if(attributes==null)
			attributes=new ArrayList<Attribute>();
		attributes.add(a);
	}

	@Override
	public String toString() {
		
		String ret= "\n\t\t\t\tComplexType: " + name;
		
		for(Attribute a: attributes){
			ret= ret + "\n\t\t\t\t\tAttribute: " + a.getName() + " " + a.getType().toString();
		}
		
		return ret;
	}
	
	public Integer getAttributesNumber()
	{
		return attributes.size(); 
	}

	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}
	
	@Override
	public boolean isComplexType()	{
		return true;
	}

}
