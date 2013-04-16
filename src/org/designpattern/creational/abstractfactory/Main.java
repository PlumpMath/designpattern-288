package org.designpattern.creational.abstractfactory;

public class Main {
	public static void main(String[]args){
		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactoy();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteDog.eat();
	}
}	
