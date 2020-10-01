package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	
	//CONSTRUCTOR
	public Wheel(String brand, double diameter) throws Exception {
		
		if (diameter < 0.4 || diameter > 4) {
			throw new Exception("Diametro incorrecto (debe ser superior a 0.4 e inferior a 4): ");
		}
		
		
		this.brand = brand;
		this.diameter = diameter;
	}
	
	
	
	//GETTERS
	public String getBrand() {
		return brand;
	}
	
	public double getDiameter() {
		return diameter;
	}
}
