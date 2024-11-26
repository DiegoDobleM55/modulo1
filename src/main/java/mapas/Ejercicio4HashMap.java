package mapas;

import java.util.HashMap;
import java.util.Map;


public class Ejercicio4HashMap {

	public static void main(String[] args) {
		// creating a HashMap object
		HashMap<String, Integer> students = new HashMap<>(); 
		
		//Adding key-value pairs (student name and age) to the HashMap
		students.put("Alice", 20);
		students.put("Bob", 24);
		students.put("Diego", 27);
		students.put("David", 27);
		students.put("Gabriel", 27);
		students.put("Rodrigo", 27);
		
		//Retrieving a value by its key
		Integer aliceAge = students.get("Alice");
		System.out.println("Alice´s age: " + aliceAge);
		
		//Checking if key is present in the HashMap
		boolean containsKey = students.containsKey("David");
		System.out.println("Is David in the HashMap? " + containsKey);
		
		System.out.println("Size before remove Bob " + students.size());
		//Removing a key-value pair by its key
		students.remove("Bob");
		System.out.println("Size after remove Bob " + students.size());
		
		//Iterating over the HashMap using a for-each loop and entrySet
		System.out.println("Interating over the HashMap ");
		
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(name + ": " + age);
		}
		
		System.out.println("----Integrating over the HashMap : KEYSET------");
		//Interar Usando las llaves
		for (String llave : students.keySet()) {
			System.out.println(llave);
			System.out.println("Edad: " + students.get(llave));
			
		}
		
		System.out.println("----Encontrar elementos con 27------");
		//Interar Usando las llaves
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			if (age == 27)
				System.out.println(name + ": " + age);
		}
		
		
		

	}

}