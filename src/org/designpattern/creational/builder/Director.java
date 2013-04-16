package org.designpattern.creational.builder;

public class Director {
	public Vehicle contructVehicle(VehicleBuilder vb){
		vb.buildFrame();
		vb.buildEngine();
		vb.buildWheels();
		vb.buildDoors();
		return vb.buildVehicle();
	}
}
