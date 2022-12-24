package com.Bridgelabz;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static int fact(int num){
		if(num!=0)
		{
			return num*fact(num-1);
		}
		return 1;
	}
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a no to find factorial: ");
	   int num=sc.nextInt();
	   
	   System.out.println(fact(num));
	   
}
}
