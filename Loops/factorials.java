package Loops;

import java.util.Scanner;

public class factorials {
	    
	    public static void main(String[] args) {
	    	   Scanner sc = new Scanner(System.in);
	    	   
	    	   System.out.println("Enter your number which you want to calculate.");
	    	   
	    	   int n = sc.nextInt();
	    	   
	    	   int factorial = 1;
	    	   
	    	   int result = 1;
	    	   
	    	   for (int i=1; i<=n; i=i+1) {
	    		   
	    		   result =result *i;
	    		  
	    	   }
	    	   System.out.println("Factorial of that number is  " +  result);
	    }

}
