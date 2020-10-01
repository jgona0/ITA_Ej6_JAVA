package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	
	//CONSTRUCTOR
	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	
	//METODO ABSTRACTO A IMPLEMENTAR
	@Override
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	
	
	// METODO PARA AÑADIR DOS RUEDAS
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("Se deben crear dos ruerdas");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("La rueda derecha e izquierda no son iguales");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}

