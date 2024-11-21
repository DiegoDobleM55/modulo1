package com.anahuac.mayab.modulo1.sesion3;

public class TestCartilla {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro("labrador", "Black", 8, "Diego");
		
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar(" rabia ", "05-julio-2023");
		cartilla.actualizar(" rabia ", "15-julio-2024");
		cartilla.actualizar(" Moquillo ", "10-julio-2024");
		cartilla.actualizar(" Quintuple ", "15-julio-2024");
		
		cartilla.imprimirCartilla();
		
		cartilla.imprimirExpediente();
		
		cartilla.imprimirExpedienteFalla();
		
	}

}
