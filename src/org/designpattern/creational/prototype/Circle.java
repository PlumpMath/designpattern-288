package org.designpattern.creational.prototype;

public class Circle extends Shape {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("this is a circle!");
	}

    @Override
    public Shape copyShape() throws CloneNotSupportedException {
        Circle circle = (Circle)super.clone();
        return circle;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
