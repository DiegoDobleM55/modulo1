package com.anahuac.mayab.modulo1;

public class MayorOMenor {

	public static void main(String[] args) {
		// Calcular el mayor de 2 números (resolución de Alejandro)
				int num1;
				int num2;
				
				num1 = 10;
				num2 = 81;
				
				if (num1 > num2) {
					System.out.println("El número..." +  num1  + "...es el mayor");
					} else if (num1 < num2) {
						System.out.println ("El número..." +  num2  + "...es el mayor");
					} else {
						System.out.println("Los números son iguales");
					}
						
						//Resolución Maestra
						
						if (num1 > num2) {
							System.out.println("El mayor es..." +  num1);
							} 
						else {
							if (num1 == num2) {
								System.out.println ("Son iguales" + num1);
							} 
							else {
								System.out.println("El mayor es..." +  num2);
							}
						}
					}
	}
	
	

