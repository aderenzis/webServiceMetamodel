package edu.giisco.SoaML.metamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ArrayType.class, name = "ArrayType"),
        @JsonSubTypes.Type(value = SimpleType.class, name = "SimpleType"),
        @JsonSubTypes.Type(value = ComplexType.class, name = "ComplexType")
})
public abstract class Type {
	
	public Integer id;
	
	public Type(){
		
	}
	
	public String name;

	public Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//es igual si tiene el mismo id
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@JsonIgnore
	public boolean isArray ()	{
		return false;
	}

	@JsonIgnore
	public Integer getAttributesNumber()	{
		return 1; 
	}

	@JsonIgnore
	public ArrayList<Attribute> getElements()	{
		return null;
	}

	@JsonIgnore
	public boolean isSimpleType()	{
		return false;
	}

	@JsonIgnore
	public boolean isComplexType()	{
		return false;
	}
}
