// controll flow statment 2.switch case

package ConditionalStatement;

import java.util.Scanner;
public class AssignmentOfSwitchCase {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charector");
		
		char q1;
		q1 = sc.next().charAt(0);
		
		switch(q1) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("its a vowel");
			break;
			default:
				System.out.println("Its is consonent");
		}

	}

}
