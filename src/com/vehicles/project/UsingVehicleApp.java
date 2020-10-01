package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsingVehicleApp {

	public static void main(String[] args) throws Exception {
		
		
		// PEDIMOS EL TIPO DE COCHE A CREAR
		Scanner tipo = new Scanner(System.in);
		System.out.println("Que vehículo quieres crear: 0- Coche   1 - Moto");
		int tipo_vehiculo = tipo.nextInt();
		

		// Pedimos matr, marca y color
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce matricula: ");
		String matricula=entrada1.nextLine();

		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce marca: ");
		String marca=entrada2.nextLine();
		
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Introduce color: ");
		String color=entrada3.nextLine();
		
		
		
		// creamos coche o bici en función de lo que ha marcado el usuario
		Car coche = null;
		Bike moto = null;
		
		if(tipo_vehiculo == 0) {	
			coche = new Car (matricula, marca, color);
			System.out.println("¡COCHE CREADO! ");

		}
		else{
			moto = new Bike (matricula, marca, color);
			System.out.println("¡MOTO CREADA! ");

		}
		
		
		//pedimos marcas y diametros de ruedas y creamos ruedas
		
		//TRASERAS		
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Introduce marca rueda(s) trasera(s): ");
		String marca_rueda_tras=entrada4.nextLine();
		
		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Introduce diametro rueda(s) trasera(s): ");
		double diametro_rueda_tras=entrada5.nextDouble();
		
		// creamos la rueda trasera
		Wheel rueda_tras = new Wheel(marca_rueda_tras, diametro_rueda_tras);
		
		
		
		
		//DELANTERAS
		Scanner entrada6 = new Scanner(System.in);
		System.out.println("Introduce marca rueda(s) delantera(s): ");
		String marca_rueda_del=entrada6.nextLine();
		
		Scanner entrada7 = new Scanner(System.in);
		System.out.println("Introduce diametro rueda(s) delantera(s): ");
		double diametro_rueda_del=entrada7.nextDouble();
		
		// creamos la rueda delantera
		Wheel rueda_del = new Wheel(marca_rueda_del, diametro_rueda_del);
		
		
		
		//AÑADIMOS RUEDAS	
		// si es coche creamos la lista de ruedas traseras y delanteras y añadimos la misma rueda dos veces a cada lista. 
		// Luego añadimos las ruedas al coche e imprimimos su info
		
		List<Wheel> ruedas_traseras = new ArrayList<>();
		List<Wheel> ruedas_delanteras = new ArrayList<>();
		
		if(tipo_vehiculo == 0) {	
			
			ruedas_traseras.add(rueda_tras);
			ruedas_delanteras.add(rueda_del);
			
			ruedas_traseras.add(rueda_tras);
			ruedas_delanteras.add(rueda_del);
			
			coche.addWheels(ruedas_delanteras, ruedas_traseras);
	
			System.out.println(coche.getDescription());
			System.out.println(coche.getInfoWheels());

		}
		// si es moto añadimos las ruedas directamente a la moto e imprimimos su info
		else{
			
			ruedas_traseras.add(rueda_tras);
			ruedas_delanteras.add(rueda_del);

			
			moto.addWheels(ruedas_delanteras, ruedas_traseras);

			System.out.println(moto.getDescription());
			System.out.println(moto.getInfoWheels());

		}

	
		
		
	}

}
