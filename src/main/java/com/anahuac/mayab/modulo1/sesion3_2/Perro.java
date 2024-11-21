package com.anahuac.mayab.modulo1.sesion3_2;

public class Perro {  
	//Variables de instancia o atributos
	private String nombreDuenio;
	private String nombre;
	private String raza;
	private String tamanio;
	private double peso;
	private int edad;
	
	
	public Perro() {
		
	}
	
	
	public Perro(String nombreDuenio, String nombre, String raza, String tamanio, double peso, int edad) {
		super();
		this.nombreDuenio = nombreDuenio;
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.peso = peso;
		this.edad = edad;
	}
	
	public Perro(String nombreDuenio, String nombre, String raza, int edad) {
		super();
		this.nombreDuenio = nombreDuenio;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	

	public Perro(String nombreDuenio, String nombre, String raza, double peso) {
		super();
		this.nombreDuenio = nombreDuenio;
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		
	}
	
	public String getNombreDuenio() {
		return nombreDuenio;
	}
	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	//Métodos / ¿Que hace? 
	
	public void ladrar() {
		System.out.println("Me llamo... " + this.nombre + " mi dueño es " + this.nombreDuenio + " y estoy ladrando guau guau ");
	}

}
