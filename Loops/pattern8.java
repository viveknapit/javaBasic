package Loops;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}System.out.println();
			
		}
		for(int i=1; i<=n; i++) {
		for(int h=1; h<=n-i; h++) {
			System.out.print("* ");
		}System.out.println();
		}
	}

}
