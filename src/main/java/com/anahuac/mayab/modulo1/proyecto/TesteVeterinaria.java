package com.anahuac.mayab.modulo1.proyecto;

public class TesteVeterinaria {
	
	public static void main (String[] args) {
		Perro perro = new Perro("unica", "Firulais", "Pary");
		
		CartillaPerro cartilla = new CartillaPerro(perro,"123");
		
		Veterinaria vet = new Veterinaria ("mi veterinaria");
		
		try {
			
		Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16.nov-2024");
			servicio.realizar(perro.getNombre());
		
		Servicio servicio2 = vet.crearServicio("vacuna", perro.getNombre(), "16.nov-2024");
		
			servicio2.setCartilla(cartilla);
			servicio2.realizar(perro.getNombre());
			
			cartilla.imprimirCartilla();
			
			
			
			
	}  catch (Exception e) {
		System.out.println("ese sericio no lo ofrecemos");
		e.printStackTrace();
		
		}
		
	}

}
