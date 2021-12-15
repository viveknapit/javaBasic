package ConditionalStatement;

public class nestedifelse {

	public static void main(String[] args) {
		
//		int a =94, b =80 , c = 44;
//		int result = 0;
//		
//		if ( a>b) {
//			if(a>c) {
//				result = a;
//			}else {
//				result = c;
//			}
//		}else {
//			if (b>c) {
//				result = b;
//			}else {
//				result = c;
//			}
//		}
//		
//		System.out.println(" largest of the three number is " + result);
//		
		
		// in ternory operators
		
		int a = 40, b = 84, c = 49;
		int result = 0;
		
		result = a > b ? a>c ? a : c : b>c ? b : c;
		System.out.println(" the largest of the three number is " + result);

	}

}
