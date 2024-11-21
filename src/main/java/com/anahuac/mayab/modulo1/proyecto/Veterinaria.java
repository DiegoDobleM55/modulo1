package com.anahuac.mayab.modulo1.proyecto;

public class Veterinaria {
	private String nombre;
	//private ArrayList<Carti>
	

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
			
			servicio = new ServicioEstetico(tipo,250,"15-nov-2024","encargadoEstetica");
			
			}
		else if (tipo.startsWith("vacuna") || tipo == "consulta") {
			
			servicio = new ServicioMedico(tipo,700,"15-nov-2024","veterinario");
			
		}
		else {
			throw new Exception("No existe ese servicio");
			
		}
		
	
		return servicio;
	
	}
	
}
	
	/*public void agregarPacientes(CartillaPerro cartilla) {
		listaPacientes.add(cartilla);
		
	}
	
	public void in
} */
