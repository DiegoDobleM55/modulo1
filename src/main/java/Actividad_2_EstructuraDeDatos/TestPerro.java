package Actividad_2_EstructuraDeDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class TestPerro {

	private static final String[] String = null;

	public static void main(String[] args) {
		
		Perro[] misPerros = new Perro[5];
		
		String[] nombres = {"Black", "Luna", "Moka", "Sam", "Solobina"};
		String[]  nombreDuenios = {"Diego", "Mariana", "Alex", "Ulises", "Adrian"};
		

		 for(int i = 0; i < 5; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
		 }
			
		 Random randomGenerador = new java.util.Random();
		 
		 for (int i = 0; i < 5; i++) {
			 int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
			 misPerros[i].setNombreDuenio(nombreDuenios[numeroAleateorio]);
			 misPerros[i].ladrar();          
		 } 
		 
		 System.out.println(" ");
		 
		 System.out.println("----Usando un ArrayList");
		 
	
		 ArrayList<Perro> listaPerros = new ArrayList<Perro>();

			for(int i = 0; i < 5; i++) {
				Perro perro = new Perro();
				perro.setNombre(nombres[i]);
				
				 int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
				 
				 perro.setNombreDuenio(nombreDuenios[numeroAleateorio]);
				 
				
				 
				listaPerros.add(perro);
			}
			for(int i = 0; i < 5; i++) {
				listaPerros.get(i).ladrar();
			}
			
			System.out.println(" ");
			System.out.println("------ Usando HashMap -----");
			
			HashMap<Integer, Perro> mapPerros = new HashMap<>();
			
			for(int i = 0; i < 5; i++) {
				Perro perro = new Perro();
				
				perro.setNombre(nombres[i]);
				
				int numeroAleateorio =  randomGenerador.nextInt(nombres.length);
				 
				perro.setNombreDuenio(nombreDuenios[numeroAleateorio]);
				
				 
				mapPerros.put(i, perro);
			
			}	
			System.out.println(" ");
			System.out.println("------ Usando hashMap con keyset -----");
			
			for (Integer i: mapPerros.keySet()) {
				mapPerros.get(i).ladrar();
			}
			
			System.out.println(" ");
			System.out.println("------ Usando hashMap con entryset -----");
			
			for (Entry<Integer, Perro> entry : mapPerros.entrySet()) {
				entry.getValue().ladrar();
			}
			
			System.out.println(" ");
			System.out.println("------ Usando hashMap con values -----");
			
			for(Perro p : mapPerros.values()) {
				p.ladrar();
			}

		}

	}


