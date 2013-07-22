package org.designpattern.creational.simplefactory;

public class Main {
	public static void main(String[] args){
		NokiaPhone nokia = (NokiaPhone) new PhoneFactory().producePhone("nokia");
		nokia.ring();
	}
}
