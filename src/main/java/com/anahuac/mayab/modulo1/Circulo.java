package com.anahuac.mayab.modulo1;
import java.lang.Math;

public class Circulo {
	
	public static double calcularArea(double radio) {
		
        double area = Math.pow(radio, 2) * Math.PI;
        
        return area;
        
	}

	public static void main(String[] args) {
		
		//Codigo para sacar el area y superficie de un circulo.
	    	
		//double circunferencia = Math.PI * diametro;    
		//double diametro = 2 * radio;
	        double radio = 10;
	        
	     
	        
	        //System.out.println("El area es: " + area);
	        //System.out.println("El superficie es: " + circunferencia);
	        System.out.println("El area es: " + calcularArea(5));
	        System.out.println("El area es: " + calcularArea(radio));
	        System.out.println("El area es: " + calcularArea(15));
	        System.out.println("El area es: " + calcularArea(20));
		
		

	}

}
