import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution14 {

	public static void main(String[] args) {
		System.out.print("Enter string to analyse:");
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
         String[] words= input.split(" ");
		// TODO Auto-generated method stub 
         Map<String,String>wordMap = new HashMap<String,String>();
         Map<String,String>printMap= new HashMap<String,String>();
           for( int i =0;i<words.length;i++){
			
        		 String word;
				if(wordMap.get(word)!=null) {
        			 if(printMap.get(word)==null) { // first check if it is printed already!
                         System.out.println("Duplicated/Repeated word:"+word);
                         printMap.put(word, words); 
                     }
                 }else {
                     wordMap.put(word, words);
                 }
        		 }
        	 }
         }
         

	


