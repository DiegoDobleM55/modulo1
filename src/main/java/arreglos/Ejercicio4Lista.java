package arreglos;

import java.util.ArrayList;
import java.util.Arrays;

// Caractyeristicas del ArrayList - Son dinamicos, el tamaño puede crecer o disminuir segun queramos, tenemos que definir el tipod e dato en el diamante <> .

public class Ejercicio4Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i = 1; i<=10; i++) {
			System.out.println("pos=" + (i-1) + "valor=" + i);
			
		//agregar elementos
			num.add(i);
			
		}
		
		//Acceder a los elementos de un arraylist
		
		System.out.println("Elemento 0 en la lista: " + num.get(0));
		
		num.add(100);
		 //Para saber el tamaño de la lista usamos "num.size()" 
		System.out.println("Ultimo elemento en la lista: " + num.get(num.size()-1));
		
		//eliminar elementos 
	 	num.remove(0);
	 	
	 	System.out.println("Elemento 0 en la lista: " + num.get(0));
	 	
	 	//Modificar elementos de la lista - instertando en una posición especifica
	 	num.add(2, 1000); 
	 	System.out.println("-------Insertando-----");
		System.out.println("Elemento 2 en la lista: " + num.get(2));
		

		for(int i = 1; i<=10; i++) {
			System.out.println("pos = " + (i) + "valor=" + num.get(i));
			
		}
		//modificar elemento de la lista - remplazando en una posición espedifica
		num.set(0, 2000); 
	 	System.out.println("-------Reemplazando-----");
	 	for(int i = 0; i<num.size(); i++) {
		System.out.println("pos = " + (i) + " valor= " + num.get(i));
	 	}

	 	//Insertar más de un elemento
		//int[] masNumeros = {10, 20, 30, 40, 50, 60};
		num.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
	 	
		System.out.println("-------Agregando una lista-----");
		for(int i = 0; i<num.size(); i++) {
			
			System.out.println("pos = " + (i) + " valor= " + num.get(i));
		 	}
	}
	
	
	 
	
}
