package edu.giisco.SoaML.metamodel;

import java.util.ArrayList;

public class ArrayType extends Type {

	public Type contentType;

	public ArrayType(Type contentType){
		this.contentType=contentType;
	}
	
	public ArrayType(){
	}

	public Type getContentType() {
		return contentType;
	}

	public void setContentType(Type contentType) {
		this.contentType = contentType;
	}

	public boolean isArray()
	{
		return true;
	}
	//se permite un solo tipo de dato en el arreglo
	public Integer getAttributesNumber()
	{
		return contentType.getAttributesNumber(); 
	}
	@Override
	public ArrayList<Attribute> getElements()	{
		return contentType.getElements();
	}
	@Override
	public String toString()
	{
		String ret= "\n\t\t\t\tArrayType name: " + name;
		ret= ret+ "\n\t\t\t\t\t"+ contentType.toString();
		return ret;
	}
	
}
