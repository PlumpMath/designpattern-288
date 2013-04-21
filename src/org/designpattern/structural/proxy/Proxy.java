package org.designpattern.structural.proxy;

public class Proxy {
	private Subject subject;
	
	public Proxy(Subject subject){
		this.subject = subject;
	}
	public void request(){
		System.out.println("Proxy request:");
		subject.request();
	}
}
