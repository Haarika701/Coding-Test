package com.birorad.codingtest;


import java.util.ArrayList;
import java.util.Scanner;

public class Multiple_Prime {
	
	public ArrayList<Integer> sendPrimeList(int N){
		int num=2,x = 1,i=0,j=0;
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(i=1;i<=N;) {
			for( j=2;j<=num/2;j++) {
				if(num%j==0) {
					x=0;
					
				    }
				}
			   if(x!=0) {
				  al.add(num);
				   i++;
				   
				   
			}
			   x=1;
			   num++;
		}
		
		return al;
	}

	public void printPrimes(int N) {
		long startTime = System.currentTimeMillis();
		int i=0,j=0;
		//Scanner s= new Scanner(System.in);
		//N = Integer.parseInt(s.nextLine());
		System.out.println("N=" +N);
		
		
		if(N<=0) {
			System.out.println("Enter a valid number:");
		}
		
		
		ArrayList<Integer> al= null;
		
		al = sendPrimeList(N);
		 
		
		System.out.println(al); 
		 System.out.println("Multiplcation Table of Prime Numbers:");
		for(i=0;i<al.size();i++) {
			System.out.print(al.get(i)+ " ");
		
		for(j=0;j<al.size();j++) {
			
		
		System.out.print(" " +al.get(i)  * al.get(j));
		
		}	
		System.out.println();
	}
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	
	}
}
