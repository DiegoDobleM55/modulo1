package com.anahuac.mayab.modulo1.proyecto;

public class TesteVeterinaria {
	
public static void main (String[] args) {
		
		//Perro(String raza, String tamanio, double peso, String nombre, String nombreDuenio, int edad)
		
		Perro perro = new Perro("labrador", "mediano", 22.5, "Black", "Diego", 8);
		
		
		CartillaPerro cartilla = new CartillaPerro(perro,"123");
		
		
		Veterinaria vet = new Veterinaria ("mi veterinaria");
		
		vet.agregarPacientes(cartilla);		
		
		
		try {
			
		Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16.nov-2024");
			servicio.realizar(perro.getNombre()); 
		
		Servicio servicio2 = vet.crearServicio("vacuna sextuple", perro.getNombre(), "16.nov-2024");
			servicio2.setCartilla(cartilla);
			servicio2.realizar(perro.getNombre());
			
			
			cartilla.imprimirCartilla();
			
			
		}  catch (Exception e) {
		System.out.println("ese sericio no lo ofrecemos");
		e.printStackTrace();
		
		}
		
		vet.imprimirExpedientes();
		
		
		
		
		
		//2da Info 
		Perro perro2 = new Perro("beagle", "chico", 12.75, "Luna", "Diego", 1);
		
		CartillaPerro cartilla2 = new CartillaPerro(perro2,"321");
		
		
		vet.agregarPacientes(cartilla2);
		

		try {
	
			Servicio servicio = vet.crearServicio2("baño", perro2.getNombre(), "16.nov-2024");
			servicio.realizar(perro2.getNombre()); 
	
			Servicio servicio2 = vet.crearServicio2("vacuna Quintuple", perro2.getNombre(), "16.nov-2024");
			servicio2.setCartilla(cartilla2);
			servicio2.realizar(perro2.getNombre());
		
		
			cartilla2.imprimirCartilla();
		
		
		}  catch (Exception e) {
			System.out.println("ese sericio no lo ofrecemos");
			e.printStackTrace();
	
		}
	
		//Imprimir expedientes
		
		vet.imprimirExpedientes();
}

}


