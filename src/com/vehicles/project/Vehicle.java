package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	private int nums_matr;
	private int letras_matr;
	
	
	//CONSTRUCTOR
	public Vehicle(String plate, String brand, String color) throws Exception {
	
		nums_matr = 0;
		letras_matr = 0;		
		
		for (int i=0; i<plate.length(); i++) {
			char caracter = plate.charAt(i);
			
			if(Character.isDigit(caracter)) {
				nums_matr++;
			}
			else {
				letras_matr++;
			}	
		}
		
		if (!(nums_matr == 4 && (letras_matr == 2 || letras_matr == 3))){
			
			throw new Exception("Matricula incorrecta, debe tener 4 números y 2 o 3 letras: ");
		}
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	
	// METODO ABSTRACTO PARA IMPLEMENTAR
	public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;

	
	// METODO PARA OBTENER LA INFORMACION DEL VEHICULO
	public String getDescription() {
		
		return "Vehiculo matricula " +plate+ ", marca:" +brand+ ", color:" +color;
	}

	
	// METODO PARA OBTENER LA INFORMACION DE LAS RUEDAS
	public String getInfoWheels() {
		
		int num_ruedas = wheels.size();
		String info="";
		
		for (int i = 0; i < wheels.size(); i++) {
			
			info += wheels.get(i).getBrand() + ", "+ wheels.get(i).getDiameter() +"\n";

		}
		
		return " RUEDAS: \n" +info ;
	}
}


