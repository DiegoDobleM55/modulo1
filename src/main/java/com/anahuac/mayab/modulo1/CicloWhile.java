package com.anahuac.mayab.modulo1;

public class CicloWhile {

	public static void main(String[] args) {
		//vamos a sumar los primeros n números enteros
		int n = 100;
		int suma = 0;
		int contador = 1;
		while (contador <= n) {
			suma = suma + contador;
			contador = contador + 1;
		}
		System.out.println("La suma es:" + suma);

	}

}
