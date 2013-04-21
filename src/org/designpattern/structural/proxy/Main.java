package org.designpattern.structural.proxy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub = new ConcreteSubject();
		Proxy proxy = new Proxy(sub);
		proxy.request();
	}

}
