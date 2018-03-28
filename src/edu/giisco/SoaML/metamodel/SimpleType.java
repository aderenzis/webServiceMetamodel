package edu.giisco.SoaML.metamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleType extends Type {

	public static final int STRING=0;
	public static final int INTEGER=1;
	public static final int BOOLEAN=2;
	public static final int LONG=3;
	public static final int SHORT=4;
	public static final int DECIMAL=5;
	public static final int FLOAT=6;
	public static final int DOUBLE=7;
	public static final int BYTE=8;
	public static final int DATE_TIME=9;
	public static final int DATE=10;
	public static final int BASE64_BINARY=11;
	public static final int HEX_BINARY=12;
	public static final int BASE64=13;
	public static final int ANY_TYPE=14;
	
	//para que machee con las variables XML
	public static final int NORMALIZEDSTRING=15;
	public static final int ANY_URI=16;
	
	public int tipo;

	public SimpleType(int tipo){
		String name="";
		
		switch(tipo){
		case ANY_URI:
			name="anyUri";
			break;
		case NORMALIZEDSTRING:
			name="normalizedString";
			break;
		case STRING:
			name="string";
			break;
		case INTEGER:
			name="integer";
			break;
		case BOOLEAN:
			name="boolean";
			break;
		case LONG:
			name="long";
			break;
		case SHORT:
			name="short";
			break;
		case DECIMAL:
			name="decimal";
			break;
		case FLOAT:
			name="float";
			break;
		case DOUBLE:
			name="double";
			break;
		case BYTE:
			name="byte";
			break;
		case DATE_TIME:
			name="date_time";
			break;
		case DATE:
			name="date";
			break;
		case BASE64_BINARY:
			name="base64_binary";
			break;
		case HEX_BINARY:
			name="hex_binary";
			break;
		case BASE64:
			name="base64";
			break;
		case ANY_TYPE:
			name="any_type";
			break;
		}
		
		this.tipo=tipo;
		
		this.name=name;
	}
	@JsonCreator
	public SimpleType(@JsonProperty("name") String name) {
		name= name.trim();
		if(name.equalsIgnoreCase("normalizedstring"))
			tipo=SimpleType.NORMALIZEDSTRING;
		else if(name.equalsIgnoreCase("string"))
			tipo=SimpleType.STRING;
		else if(name.equalsIgnoreCase("integer"))
			tipo=SimpleType.INTEGER;
		else if(name.equalsIgnoreCase("int"))
			tipo=SimpleType.INTEGER;
		else if(name.equalsIgnoreCase("boolean"))
			tipo=SimpleType.BOOLEAN;
		else if(name.equalsIgnoreCase("long"))
			tipo=SimpleType.LONG;
		else if(name.equalsIgnoreCase("short"))
			tipo=SimpleType.SHORT;
		else if(name.equalsIgnoreCase("decimal"))
			tipo=SimpleType.DECIMAL;
		else if(name.equalsIgnoreCase("float"))
			tipo=SimpleType.FLOAT;
		else if(name.equalsIgnoreCase("double"))
			tipo=SimpleType.DOUBLE;
		else if(name.equalsIgnoreCase("byte"))
			tipo=SimpleType.BYTE;
		else if(name.equalsIgnoreCase("date_time"))
			tipo=SimpleType.DATE_TIME;
		else if(name.equalsIgnoreCase("date"))
			tipo=SimpleType.DATE;
		else if(name.equalsIgnoreCase("base64_binary"))
			tipo=SimpleType.BASE64_BINARY;
		else if(name.equalsIgnoreCase("hex_binary"))
			tipo=SimpleType.HEX_BINARY;
		else if(name.equalsIgnoreCase("base64"))
			tipo=SimpleType.BASE64;
		//xml
		else if(name.equalsIgnoreCase("any"))
			tipo=SimpleType.ANY_TYPE;
		else if(name.equalsIgnoreCase("any_type"))
			tipo=SimpleType.ANY_TYPE;
		else if(name.equalsIgnoreCase("anyuri"))
			tipo=SimpleType.ANY_URI;
		this.name=name;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleType other = (SimpleType) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\t SimpleType: "+name;
	}
	
	public static boolean  isSimpleType(String string)
	{
		string= string.trim();
		return 
		string.equalsIgnoreCase("normalizedstring")||
		string.equalsIgnoreCase("string")||
		string.equalsIgnoreCase("integer")||
		string.equalsIgnoreCase("int")||
		string.equalsIgnoreCase("boolean")||
		string.equalsIgnoreCase("long")||
		string.equalsIgnoreCase("short")||
		string.equalsIgnoreCase("decimal")||
		string.equalsIgnoreCase("float")||
		string.equalsIgnoreCase("double")||
		string.equalsIgnoreCase("byte")||
		string.equalsIgnoreCase("date_time")||
		string.equalsIgnoreCase("date")||
		string.equalsIgnoreCase("base64_binary")||
		string.equalsIgnoreCase("hey_binary")||
		string.equalsIgnoreCase("base64")||
		string.equalsIgnoreCase("any_type")||
		string.equalsIgnoreCase("anyuri")||
		string.equalsIgnoreCase("any");
	}
	
	@Override
	public boolean isSimpleType()
	{
		return true;
	}
	
}
