package Loops;

public class tableFrom1to20 {
	public static void main(String[] args) {
		
		for(int j=1; j<=20; j++) {
			
		
		int tableof=j;
		for(int i=1; i<=10; i++) {
		int result=i*tableof;
			System.out.print(result +"  ");
		}
		System.out.println();
		}
	}

}
