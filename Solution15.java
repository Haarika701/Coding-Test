import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class Solution15 {
	public static void main(String args[]) {
		Map<String,Integer>wordMap= buildMap("C:/temp/words.txt");
		List<Entry<String,Integer>>list= sortByValueInDecreasingOrder(wordMap);
		System.out.println("The list of repeated and count words are");
		for(Map.Entry<String, Integer>entry:list);
		Entry<String, Integer> entry;
		if(entry.getValue()>1) {
			
			System.out.println(entry.getKey() + " => " + entry.getValue());
			} 
		} 
	

			
	

	private static List<Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> wordMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Map<String, Integer> buildMap(String filename) {
		// TODO Auto-generated method stub
		Map<String,Integer>wordMap=new HashMap<>();
		try(FileInputStream fis= new FileInputStream(filename);
				DataInputStream dis= new DataInputStream(fis);
				BufferedInputStream bfs= new BufferedInputStream(dis);
			Pattern pattern = pattern.compile(filename);
				String line = null;
				while ((line = br.readLine()) != null)
				{ // do this if case sensitivity is not required i.e. Java = java line = line.toLowerCase(); 
					String[] words = pattern.split(line); 
					for (String word : words) 
					{ if (wordMap.containsKey(word)) 
					{ wordMap.put(word, (wordMap.get(word) + 1)); } 
					else { wordMap.put(word, 1);
					} 
					} 
					}
	}
					
						catch(IOException ioex) {
							{
					            ioex.printStackTrace();
					        
					 
						}
					
				
			
		
			return wordMap;
	}


