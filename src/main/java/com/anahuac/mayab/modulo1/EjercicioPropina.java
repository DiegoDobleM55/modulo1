package com.anahuac.mayab.modulo1;

public class EjercicioPropina {

	public static void main(String[] args) {
		//Calcular propina 
		double cuenta = 90;
		double propina = 10;
		//cuenta = 90;
		
		if (cuenta > 100)
			propina = cuenta * .10;
		System.out.println("La propina es de..." + propina);

	}

}
