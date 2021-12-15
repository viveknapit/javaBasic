package ConditionalStatement;

import java.util.Scanner;

public class ifConditionalStatement {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		int age = sc.nextInt();
		
		if (age >= 18) {
		
		System.out.println( " you can vote now");
		
		}
	}

}