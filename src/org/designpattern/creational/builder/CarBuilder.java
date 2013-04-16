package org.designpattern.creational.builder;

public class CarBuilder implements VehicleBuilder {
	private Vehicle car;
	public CarBuilder(){
		car = new Car();
	}
	
	@Override
	public void buildFrame() {
		// TODO Auto-generated method stub
		car.setFrame("frame");
		System.out.println("build car's frame!");
	}

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		car.setEngine("engine");
		System.out.println("build car's engine!");
	}

	@Override
	public void buildWheels() {
		// TODO Auto-generated method stub
		car.setWheels("wheels");
		System.out.println("build car's wheels!");
	}

	@Override
	public void buildDoors() {
		// TODO Auto-generated method stub
		car.setDoors("doors");
		System.out.println("build car's doors!");
	}

	@Override
	public Vehicle buildVehicle() {
		// TODO Auto-generated method stub
		return car;
	}

}
