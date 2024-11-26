package com.anahuac.mayab.modulo1.sesion3_2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class TestPerro {

	private static final String[] String = null;

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Diego Martínez", "Luna" ,"Beagle no puro", "Peuqeño", 13.5, 1);
		Perro perro3 = new Perro("Alex Paz", "Moka", "Desconocida", 1);
		Perro perro4 = new Perro();
		Perro perro5 = new Perro();
		
		
		
		System.out.println("El perro_1 se llama " + perro1.getNombre());	
		System.out.println("El perro_2 se llama " + perro2.getNombre());	
		System.out.println("El perro_3 se llama " + perro3.getNombre());
		
		perro1.setNombre("Black");
		
		System.out.println("El perro_1 se llama " + perro1.getNombre());
		
		System.out.println("El perro_2 ladra ");
		perro2.ladrar();
		
		
		
		//Arreglo perros
		Perro[] misPerros = new Perro[10];
		
		String[] nombres = {"Black", "Luna", "Moka", "Happy", "Dixie", "Sam", "Thor", "Nala", "Solobina", "Becka"};
		String[]  nombreDuenios = {"Diego", "Mariana", "Alex", "Adrian", "Ulises", "Alexander", "Segos", "Kari", "Sofi", "Gabriel"};
		
		//Vamos a interar sobre el arreglo y llamar al metodo que seta el nombre del perro
		
		for(int i = 0; i < 10; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
		}
			
		 for(int i = 0; i < 10; i++) {
			 misPerros[i].ladrar();
		}
		 
		 Random randomGenerador = new java.util.Random();
		 
		 for (int i = 0; i < 10; i++) {
			 int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
			 misPerros[i].setNombreDuenio(nombreDuenios[numeroAleateorio]);
			 misPerros[i].ladrar();          
		 }
		 
		 System.out.println("----Ahora usando un ArrayList");
		 //Vamos a usar un arrayList
		 ArrayList<Perro> listaPerros = new ArrayList<Perro>();

			for(int i = 0; i < 10; i++) {
				Perro perroTemporal = new Perro();
				perroTemporal.setNombre(nombres[i]);
				
				 int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
				 
				 perroTemporal.setNombreDuenio(nombreDuenios[numeroAleateorio]);
				 
				//Ya que estan setedos los valores, ahora guardo en la lista
				 
				listaPerros.add(perroTemporal);
			}
			for(int i = 0; i < 10; i++) {
				listaPerros.get(i).ladrar();
			}
			
			//Busqueda de un perro
			
			for (int i= 0; i< listaPerros.size(); i++) {
				String nombre = listaPerros.get(i).getNombre();
				if (nombre  == "Dixie") {
					listaPerros.get(i).setNombre("Nuevo nombre del perro");
					
					//break sirve para romper el ciclo 
					
					break;
				}
			}
			
			System.out.println("------ Después de cambiar el nombre");
			for(int i = 0; i < 10; i++) {
				listaPerros.get(i).ladrar();
		 
		}
			System.out.println("------ For each -----");
			for (Perro perro : listaPerros) {
				perro.ladrar();
			}
			
			System.out.println("------ Usando hashMap -----");
			HashMap<Integer, Perro> mapPerros = new HashMap<>();
			
			for(int i = 0; i < 10; i++) {
				Perro perroTemporal = new Perro();
				
				perroTemporal.setNombre(nombres[i]);
				
				int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
				 
				perroTemporal.setNombreDuenio(nombreDuenios[numeroAleateorio]);
				
				 
				mapPerros.put(i, perroTemporal);
			
			}	
			System.out.println("------ Usando hashMap con keyset -----");
			
			for (Integer i: mapPerros.keySet()) {
				mapPerros.get(i).ladrar();
			}
			
			System.out.println("------ Usando hashMap con entryset -----");
			
			for (Entry<Integer, Perro> entry : mapPerros.entrySet()) {
				entry.getValue().ladrar();
			}
			
			System.out.println("------ Usando hashMap con values -----");
			
			for(Perro p : mapPerros.values()) {
				p.ladrar();
			}

		}

	}


