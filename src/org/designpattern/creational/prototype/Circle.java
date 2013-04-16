package org.designpattern.creational.prototype;

public class Circle implements Shape,Cloneable {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("it's a circle!");
	}

	@Override
	public Shape cloneShape() {
		// TODO Auto-generated method stub
		try{
			return (Circle) this.clone();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
