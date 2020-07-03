
import java.util.*; 
class Node  
{ 
    int data; 
    Node next; 
    Node(int d) 
    {data = d; 
     next = null;} 
} 

public class Solution8 {
	
	public ListNode mergeTwoLists(ListNode P, ListNode Q) {
		if(P==null && Q==null) {
			return null;
		}
		if(P==null) {
			return Q;}
		if(Q==null) {
			return P;}
		
		ListNode sorting =null;
		ListNode newHead = null;
		if(P.val <= Q.val) {
            sorting = Q;
            P = (ListNode) sorting.next;
        } else {
            sorting = Q;
            Q = (ListNode) sorting.next;
            
        }
		newHead = sorting;
		}
		
			
	while(P != null && Q != null) {
        if(P.val <= Q.val) {
            sorting.next = P;
            sorting = P;
            P = sorting.next;
        } else {
            sorting.next = Q;
            sorting = Q;
            Q = sorting.next;
        }
    }
    
    //if l1 reaches null then attach it to l2
    //if l2 reaches null then attach it to l1
    if(l1 == null) {
        sorting.next = Q;
    }
    
    if(l2 == null) {
        sorting.next = P;
    }
    
    return newHead;
    
    
} 

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
