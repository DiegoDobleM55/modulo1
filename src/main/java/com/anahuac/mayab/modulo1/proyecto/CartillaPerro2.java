package com.anahuac.mayab.modulo1.proyecto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro2 {
	//Atributos
	private Perro datosPerro2;
	private String idCartilla2;
	HashMap<String, ArrayList<String>> vacunas = new HashMap<>();
	
	//constructores
	public CartillaPerro2() {		
	}
	
	public CartillaPerro2(Perro datosPerro2, String idCartilla2) {

		this.datosPerro2 = datosPerro2;
		this.idCartilla2 = idCartilla2;
	} 
	
	//getters y setters
	public Perro getDatosPerro2() {
		return datosPerro2;
	}
	
	public void setDatosPerro2(Perro datosPerro2) {
		this.datosPerro2 = datosPerro2;
	}
	public String getIdCartilla2() {
		return idCartilla2;
	}
	public void setIdCartilla2(String idCartilla2) {
		this.idCartilla2 = idCartilla2;
	}
	public HashMap<String, ArrayList<String>> getVacunas() {
		return vacunas;
	}
	public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
		this.vacunas = vacunas;
	}
		
	public void actualizar(String nombreVacuna, String fechaAplicacion) {
		
		//Checar si la vacuna existe en la cartilla
		
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		else { //NO existe
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
	}
			
			public void imprimirCartilla2() {
				System.out.println("---- Datos Perro -----");
				System.out.println(datosPerro2.toString());
				System.out.println("------------");
				for(String vacuna : vacunas.keySet()) {
					System.out.println("Vacuna : " + vacuna);
					ArrayList<String> fechas = vacunas.get(vacuna);
					for(String fecha : fechas) {
						System.out.println("Fecha : " + fecha);
					}
					System.out.println("------------");
				}
			}
			
			public void imprimirExpediente2() throws IOException {
				String nombreArchivo = datosPerro2.getNombre()+".txt";
				FileWriter archivo;
				
					archivo = new FileWriter(nombreArchivo);
					PrintWriter pw = new PrintWriter(archivo);
					
					pw.println("---- Datos Perro -----");
					pw.println(datosPerro2.toString());
					pw.println("------------");
					for(String vacuna : vacunas.keySet()) {
						pw.println("Vacuna : " + vacuna);
						ArrayList<String> fechas = vacunas.get(vacuna);
						for(String fecha : fechas) {
							pw.println("Fecha : " + fecha );
						}
						pw.println("------------");
					}
			pw.close();
        
	}
	
	
}