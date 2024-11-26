package arreglos;

public class Ejercicio2Arreglo {

	public static void main(String[] args)
	{
		//crear 3 arreglos con palabras
		
		String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functiona"};
		
		String[] wordListTwo = {"loosely couple", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented"};
		
		String[] wordListThree = {"Diego", "David", "Donatelo", "Damian", "Dario", "Daniel", "Dante", "Dionisio"};
		
		//Obtener el tamaño de cada arreglo
		int oneLenght = wordListOne.length;
		
		int twoLenght = wordListTwo.length;
		
		int threeLenght = wordListThree.length;
		
		
		//Generar 3 numeros aleatorios
		java.util.Random randomGenerator = new java.util.Random();
		
		int rand1 = randomGenerator.nextInt(oneLenght);
		int rand2 = randomGenerator.nextInt(twoLenght);
		int rand3 = randomGenerator.nextInt(threeLenght);
		
		//crear una fase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//Imprimir la frase
		System.out.println("What we need is a " + phrase);
		
		
	}
	
	
}
