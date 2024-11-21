package com.anahuac.mayab.modulo1.sesion5;

public class PatoHule extends Pato{
	
	public PatoHule(String nombre, String color) {
		super(nombre, color);
		
	}
	
	public void comer() {
		System.out.println("soy un pato de hule y no puedo comer");
	}
	public void volar() {
		System.out.println("soy un pato de hule y no puedo volar");
	}
	public void quack() {
		System.out.println("soy un pato de hule y no puedo quick");
	}

}
