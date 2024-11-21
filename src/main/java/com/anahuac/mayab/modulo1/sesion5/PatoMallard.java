package com.anahuac.mayab.modulo1.sesion5;

public class PatoMallard extends Pato{
	
	public PatoMallard (String nombre, String color) {
		super(nombre, color);
		
	}

	
	public void quack() {
		System.out.println("Soy un pato mallard my hago quack");
	}


	public void comer() {
		System.out.println("Soy un pato mallard y me gusta comer");
		
	}
}

