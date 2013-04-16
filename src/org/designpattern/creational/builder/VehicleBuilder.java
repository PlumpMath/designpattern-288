package org.designpattern.creational.builder;

public interface VehicleBuilder {
	public void buildFrame();
	public void buildEngine();
	public void buildWheels();
	public void buildDoors();
	public Vehicle buildVehicle();
}
