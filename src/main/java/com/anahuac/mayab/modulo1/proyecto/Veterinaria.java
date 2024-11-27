package com.anahuac.mayab.modulo1.proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Veterinaria {
	private String nombre;
	private ArrayList<CartillaPerro> listaPacientes = new ArrayList <>();
	private ArrayList<CartillaPerro2> listaPacientes2 = new ArrayList <>();


	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception {
		
		Servicio servicio = null;
		
		if(tipo == "baño" || tipo == "corte") {
			
			servicio = new ServicioEstetico(tipo,250, fecha,"encargadoEstetica");
			
			}
		else if (tipo.startsWith("vacuna") || tipo == "consulta") {
			
			servicio = new ServicioMedico(tipo,700, fecha,"veterinario");
			
		}
		else {
			throw new Exception("No existe ese servicio");
		}
		return servicio;
		
			
		}
	
	//Servicio perro 2
	
	public Servicio crearServicio2(String tipo, String nombre, String fecha) throws Exception {
		
		Servicio servicio2 = null;
		
		if(tipo == "baño" || tipo == "corte") {
			
			servicio2 = new ServicioEstetico(tipo,250, fecha,"encargadoEstetica");
			
			}
		else if (tipo.startsWith("vacuna") || tipo == "consulta") {
			
			servicio2 = new ServicioMedico(tipo,700, fecha,"veterinario");
			
		}
		else {
			throw new Exception("No existe ese servicio");
			
		}
	

	return servicio2;

}
	
	
	public void agregarPacientes(CartillaPerro cartilla) {
		listaPacientes.add(cartilla);
	}
	
	public void agregarPacientes2(CartillaPerro2 cartilla2) {
		listaPacientes2.add(cartilla2);
	}
	
	
	
	public void imprimirExpedientes() {
		for(CartillaPerro c: listaPacientes) {
			try {
				c.imprimirExpediente();
			} catch (Exception e) {
				System.out.println("No puede creal el expediente");
				e.printStackTrace();
			}
		}
	}
	
			
	public void imprimirExpedientes2() {
				for(CartillaPerro2 c: listaPacientes2) {
					try {
						c.imprimirExpediente2();
					} catch (Exception e) {
						System.out.println("No puede creal el expediente");
						e.printStackTrace();
					}
				}
		}
}

