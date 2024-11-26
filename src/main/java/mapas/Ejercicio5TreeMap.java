package mapas;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Ejercicio5TreeMap {

	public static void main(String[] args) {
		
		//Creating an empty TreeMap
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		//Inserting custom elements in the Map
		//Using put() method
		
		map.put("uvas", 10);
		map.put("manzana", 15);
		map.put("platanos", 45);
		map.put("papaya", 30);
		map.put("aguacate", 60);
		
		//Interating over Map using for each loop
		for (Entry<String, Integer> e : map.entrySet())
			
			System.out.println(e.getKey() + " " + e.getValue());
		
		

	}

}
