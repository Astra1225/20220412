package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {
//		int sum = 0;
		
//		for(int i=1; i<=5; i++) {
//			sum = sum + 3;
//			// i=1,sum=3;
//			// i=2, sun=6;
//			// i=3, sum=9;
//			// i=4, sum=12;
//			// i=5, sun=15;
//		}
//		
//		System.out.println("sum => " + sum);
		int num = 4;
		for(int i=1; i<=9; i++) {
			System.out.println("4 X " + i + " = " + (num * i));
		}
		
		System.out.println();
		
		for(int i=9; i>=1; i--) {
			System.out.println("3 X "+ i + " = " + (3 * i));
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}
	}

}
