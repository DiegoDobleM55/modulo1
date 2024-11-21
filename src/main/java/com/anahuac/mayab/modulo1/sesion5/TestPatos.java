package com.anahuac.mayab.modulo1.sesion5;

import java.util.ArrayList;

public class TestPatos {

	public static void main(String[] args) { 
		
		PatoHule pato1 = new PatoHule("huele","amarillo");  
		
		PatoMallard pato2 = new PatoMallard("mallard","negro");  
		
		PatoSenuelo pato3 = new PatoSenuelo("Señuelo","blanco"); 
		/*
		System.out.println("Nombre" + pato1.getNombre());
		pato1.quack();

		System.out.println("Nombre" + pato2.getNombre());
		pato2.quack();

		System.out.println("Nombre" + pato3.getNombre());
		pato3.quack();
		*/
		ArrayList<Pato> listaPatos = new ArrayList<Pato>();
		listaPatos.add(pato1);
		listaPatos.add(pato2);
		listaPatos.add(pato3);
		
		
		SimuladorPatos simulador = new SimuladorPatos();
		simulador.simuladorAcciones(listaPatos);
		
		}
	}

