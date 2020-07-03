import java.util.HashMap;
import java.util.Map.Entry;

public class Soltuion13a {
	
	public static void characterCount(String inputString) {
		HashMap<Character,Integer>character = new HashMap<Character,Integer>();
		char[]strArray= inputString.toCharArray();
		for(char c: strArray) {
			if(character.containsKey(c)) {
				character.put(c, character.get(c)+1);
					
				}
			else {
				character.put(c, 1);
			}
			for (Entry<Character, Integer> entry : character.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); } }
	        
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	        String str = "haarika"; 
	        characterCount(str); 
	    } 
	} 