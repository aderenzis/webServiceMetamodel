package edu.giisco.SoaML.metamodel;

public class Consumer {
private String name;
private Interface consumerInterface;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Interface getProviderInterface() {
	return consumerInterface;
}
public void setProviderInterface(Interface providerInterface) {
	this.consumerInterface = providerInterface;
}
}
