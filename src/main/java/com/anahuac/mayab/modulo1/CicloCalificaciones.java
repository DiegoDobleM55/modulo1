package com.anahuac.mayab.modulo1;

import java.util.Scanner;

public class CicloCalificaciones {

	public static void main(String[] args) {
		// Vamos a pedir al usuario las calificaciones para calcular un promedio
		double sumaCalificaciones = 0;
		double calificacion = 0;
		double promedio = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribir una calificación (-1 para salir)");
		
		calificacion = sc.nextDouble();
		
		while (calificacion != -1) {
			sumaCalificaciones = sumaCalificaciones + calificacion;
			contador++;
			System.out.println("Escribir una calificación (-1 para salir)");
			calificacion = sc.nextDouble();
			}
		promedio = sumaCalificaciones / contador;
		System.out.println("El promedio del alumno es..." + promedio);

	}

}