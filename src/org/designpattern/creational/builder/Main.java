package org.designpattern.creational.builder;

public class Main {
	public static void main(String[]args){
		CarBuilder builder = new CarBuilder();
		Director director = new Director();
		Car car = (Car) director.contructVehicle(builder);
		car.run();
	}
}
