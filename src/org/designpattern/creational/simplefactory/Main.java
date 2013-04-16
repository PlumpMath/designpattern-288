package org.designpattern.creational.simplefactory;

public class Main {
	public static void main(String[] args){
		PhoneFactory factory = new PhoneFactory();
		NokiaPhone nokia = (NokiaPhone) factory.producePhone("nokia");
		nokia.ring();
	}
}
