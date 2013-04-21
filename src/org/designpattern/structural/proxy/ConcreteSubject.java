package org.designpattern.structural.proxy;

public class ConcreteSubject extends Subject{

	@Override
	public void request() {
		System.out.println("ConcreteSubject request!");
	}
}
