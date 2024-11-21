package arreglos;

public class Ejercicio1Arreglos {
	
	public static void main(String[] args) {
		
		int [] numbers = {10, 20, 30, 40, 50, 60};
		
		System.out.println("Element at index 0: "+numbers[0]);
		System.out.println("Element at index 2: "+numbers[2]);
		System.out.println("Element at index 4: "+numbers[4]);
		
		int sum=0;
		
		// int i=0 - Inicialización de variable
		
		// i<numbers.length - Condición; funciona para checar que la variable inicializada sea menor a el número maximo de veces que se va a ejecutar el ciclo
		//mientras que i sea menos que 5 (que es en este caso el numero de variables que tenemos) el ciclo seguira repitiendose
	
		
		// El .length es una propiedad que tiene el array (arreglo "int []") que me dice el tamaño del arreglo, o sea cuantos elementos esta almacenando. 
		
		// i++ - incremento de variable
		
		for (int i=0;i<numbers.length;i++) {
			sum+=numbers[i]; //sum = sum + numbers[i]
			
		}
		
		System.out.println("La suma de los números es "+sum);
		
		
		String [] names = {"Diego", "Mariana", "Ulises", "Freddy", "Liz", "Alexander"};
		
		System.out.println("El nombre es... "+names[0]);
		System.out.println("El nombre es... "+names[3]);
		System.out.println("El nombre es... "+names[5]);
	}

}
