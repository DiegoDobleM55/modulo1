package com.anahuac.mayab.modulo1.sesion3_2;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Diego Martínez", "Luna" ,"Beagle no puro", "Peuqeño", 13.5, 1);
		Perro perro3 = new Perro("Alex Paz", "Moka", "Desconocida", 1);
		Perro perro4 = new Perro();
		Perro perro5 = new Perro();
		
		
		
		System.out.println("El perro_1 se llama " + perro1.getNombre());	
		System.out.println("El perro_2 se llama " + perro2.getNombre());	
		System.out.println("El perro_3 se llama " + perro3.getNombre());
		
		perro1.setNombre("Black");
		
		System.out.println("El perro_1 se llama " + perro1.getNombre());
		
		System.out.println("El perro_2 ladra ");
		perro2.ladrar();



	}

}
