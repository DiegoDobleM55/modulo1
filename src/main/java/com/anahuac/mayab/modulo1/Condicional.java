package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
		
		int edad = 18;
		boolean ine = true;
		
		if (edad >=18) {
			System.out.println("Eres mayor de edad");
			if (ine == true) {
				System.out.println("Ya puedes votar");
			}
			else {
				System.out.println("acude a tu modulo");
			}
		}
		else {
			System.out.println("No eres mayor de edad");
		}
		
	}
	

	
}
