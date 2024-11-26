package com.anahuac.mayab.modulo1.sesion3_2;

import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
	
	//Atributos
	
	/*/vacunas
	nombrePerro
	raza
	nombreDuenio
	id de la cartilla
	peso 
	tamanio*/ 
	
	private Perro datosPerro; //Utilizamos los datos que hicimos de la clase Perro
	private String idCartilla;
	HashMap<String, ArrayList<String>> vacunas; /*Como identificador colocamos el nombre de la vacuna y como value una lista de fechas*/
	
	//Constructores
	public CartillaPerro() {
		
	}
	
	public CartillaPerro(Perro datosPerro, String idCartilla) {
		super();
		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
	}
	
	
	//Getters y setters
	public Perro getDatosPerro() {
		return datosPerro;
	}
	
	public void setDatosPerro(Perro datosPerro) {
		this.datosPerro = datosPerro;
	}
	public String getIdCartilla() {
		return idCartilla;
	}
	public void setIdCartilla(String idCartilla) {
		this.idCartilla = idCartilla;
	}
	public HashMap<String, ArrayList<String>> getVacunas() {
		return vacunas;
	}
	public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
		this.vacunas = vacunas;
	}
	

	//Actualizar vacunas
	
	public void actualizar(String nombreVacuna, String fechaAplicacion) {
		//Checar si la vacuna esta en la cartilla 
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		else {
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
		
	}
	

}
