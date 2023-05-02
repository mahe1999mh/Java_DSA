package StringPrograming;
import java.util.*;
public class HashMapExample2 {

	
	public static void main(String[] args) {
		
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	hm.put("amma", 27);
	hm.put("bob", 81);
	hm.put("elle", 27);
	hm.put("otto", 54);
	hm.put("arora", 72);
	
	System.out.println(hm.values());
	System.out.println(hm.size());
	
	for(Object a : hm.entrySet()){
		System.out.println(a);
		}
	

    for(Object b : hm.values()) {
    	System.out.println(b);
    }

		
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap  
    
//		   map.put(1,"Mango");  //Put elements in Map  
//		   map.put(2,"Apple");    
//		   map.put(3,"Banana");   
//		   map.put(4,"Grapes"); 
//		   System.out.println(map);  
//		   
           		   
//		   map.clear();
//         System.out.println(map);
		   
//		   map.replace(2, "Apple", "Banana");
//		   System.out.println(map);
		    
//		   map.replace(4, "skdsd");  
//		   System.out.println(map);
		   
		   
//		   for(Object a : map.keySet()) {
//			   System.out.println(a);
//		   }
		   
//		   for(Object a : map.entrySet()) {
//			   System.out.println(a);
//		   }
		   
//		   System.out.println(map.remove(2));

//		   System.out.println(map.size());
//		   System.out.println(map.hashCode());
		     
		
		   
	}
}


