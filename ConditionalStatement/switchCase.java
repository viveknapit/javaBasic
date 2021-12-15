package ConditionalStatement;

public class switchCase {

	public static void main(String[] args) {
		int dayOfWeek= 5;
	switch (dayOfWeek) {
	case 1:
		System.out.println("I am on leave");
	break;
	
	case 2:
		System.out.println(" I am on office");
		break;
	case 3:
	System.out.println(" I am playing football");
	break;
	case 4:
		System.out.println("I am watching movie");
		break;
	case 5:
		System.out.println("I am in class.");
		break;
	case 6:
		System.out.println("I am in online class.");
		break;
	case 7:
		System.out.println("I am in home.");
		
		default:
			System.out.println("I don't know what day it is");
	
	}
		

	}

}
