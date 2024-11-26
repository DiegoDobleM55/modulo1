package mapas;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Ejercicio6LinkedMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		//Inserting pair entries in above Map
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
