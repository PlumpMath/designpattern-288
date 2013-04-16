package org.designpattern.creational.factorymethod;

public class Main {
	public static void main(String[]args){
		IPhoneFactory EricssonFactory = new EricssonFactory();
		EricssonPhone ericsson = (EricssonPhone) EricssonFactory.producePhone();
		ericsson.ring();
	}
}
