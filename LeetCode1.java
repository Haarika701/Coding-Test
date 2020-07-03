
public class LeetCode1 {
	public static int duplicateArray(int arr[],int num) {
		if (num==0 || num==1)
			return num;
		
    // To store index of next unique element 
    int j = 0; 
   
    // Doing same as done in Method 1 
    // Just maintaining another updated index i.e. j 
    for (int i = 0; i < num-1; i++) 
        if (arr[i] != arr[i+1]) 
            arr[j++] = arr[i]; 
   
    arr[j++] = arr[num-1]; 
   
    return j; 
} 
  
public static void main (String[] args)  
{ 
    int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
    int num = arr.length; 
      
    num = duplicateArray(arr, num); 

    // Print updated array 
    for (int i=0; i<num; i++) 
       System.out.print(arr[i]+" "); 
} }