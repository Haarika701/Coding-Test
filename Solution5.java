
public class Solution5 {
	public static int removeDuplicates(int[] nums,int n) {
		if(nums==null||nums.length==0) {
			
		int[] temp= new int [n];
		 int i;
		int j;
		if (nums[i] != nums[i+1]) 
             temp[j++] = nums[i]; 
		 temp[j++] = nums[n-1];    
		 for ( i=0; i<j; i++) 
	            nums[i] = temp[i]; 
	       
	        return j; 
		}
		return n;  } 
	/*	if(nums==null||nums.length==0) {
			return 0;
		}
		int i=0;
		for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }            
        }
        
        return i + 1; }*/
		
		
		
	
public static void main(String args[]) {
	{ 
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 
          
        n = removeDuplicates(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
} 
} 

