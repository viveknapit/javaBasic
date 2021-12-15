package ConditionalStatement;

public class ratting {
	
	public static void main(String [] args) {
		
		int ratting = 5;
		
		switch (ratting) {
		case 1:
		case 2:
			System.out.println("bad");
			break;
		case 3:
			System.out.println("Awarage");
			break;
		case 4:
		case 5:
			System.out.println("Good");
			default:
				System.out.println("Invalid Ratting");
		} 
	}

}
