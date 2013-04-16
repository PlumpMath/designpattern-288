package org.designpattern.creational.prototype;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.info();
		Circle circleCp = (Circle) circle.cloneShape();
		circleCp.info();
	}
}
