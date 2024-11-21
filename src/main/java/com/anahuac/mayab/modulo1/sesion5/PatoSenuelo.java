package com.anahuac.mayab.modulo1.sesion5;

public class PatoSenuelo extends Pato{
	
	public PatoSenuelo(String nombre, String color) {
		super(nombre, color);
		
	}
	
	public void comer() {
		System.out.println("soy un pato señuelo y no me dan de comer");
	}
	public void volar() {
		System.out.println("soy un pato señuelo y ya no puedo volar");
	}
	public void quack() {
		System.out.println("soy un pato señuelo y hago quack");
	}

}
