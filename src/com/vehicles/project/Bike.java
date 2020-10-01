package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	
	// CONSTRUCTOR
	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	
	//METODO ABSTRACTO A IMPLEMENTAR
	@Override
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		
		Wheel frontWheel = frontWheels.get(0);
		Wheel backWheel = backWheels.get(0);
		
		wheels.add(frontWheel);
		wheels.add(backWheel);
	}

}
