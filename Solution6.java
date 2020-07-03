import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution6 {
	public static String longestSubstring(String s) {
		Map<Character,Integer>map= new HashMap<>();
		String n=" ";
		for (int i = 0, j = 0; j < s.length(); j++) {
			char curChar= s.charAt(j);
			if (map.containsKey(curChar)) {
	            i = Math.max(map.get(curChar)+1, i);
	        }
	        if (n.length() < j - i + 1) {
	            n = s.substring(i, j + 1);
	        }
	        map.put(curChar, j);
	    }
	    return n;
	}
		public static void main(String arga[]) {
			String m= "CODINGISAWESOME";
		   String s= m.trim();
		    
			m= longestSubstring(s);
			System.out.println(m);
		   
			
		}
		
	}


