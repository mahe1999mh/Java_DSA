package Map;
import java.util.*;

public class Mapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("21:00", "indigo");
		tm.put("23:00", "Air india");
		tm.put("04:00", "goair");
		tm.put("16:00", "vistara");
		
		Set<String >keys = tm.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
		
		//printing values using for each
		Collection<String> values = tm.values();
		for(String val : values) {
			System.out.print(val+" values ");
		}
		
		//printing key useing for each and keySet
		Set<String> key = tm.keySet();
		for(String k :key) {
			System.out.print(k+" key ");
		}
		
	
		
//		System.out.println(tm.headMap("16:00"));
//		System.out.println(tm.keySet()+" keyset");
//		System.out.println(tm.descendingKeySet()+" descendingKeySet");
		
	}

}
