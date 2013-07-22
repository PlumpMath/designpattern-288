package org.designpattern.creational.prototype;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        try{
            Shape circle = new Circle();
            circle.info();
            Circle circleCp = (Circle) circle.copyShape();
            circleCp.info();
        }catch(CloneNotSupportedException ex){
            System.out.println("not support this clone!");
        }

	}
}
