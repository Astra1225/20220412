package co.edu;

public class OperatorExample3 {
	public static void main(String[] args) {
		// 비교연산자, 논리연산자
//		int num1 = 10;
//		int num2 = 20;
//		
//		if(num1 == num2) {
//			System.out.println("두수는 같습니다.");
//		}
//		if(num1 >= num2) {
//			System.out.println("두수는 같지 않습니다.");
//		}
//		if(num1 >= num2) {
//			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
//		}
		
		int num3 = 10;
		int num4 = 20;
		
		if((++num3 % 2 ==0) && (num4++ % 2 == 0)) {
			System.out.println("두수는 짝수입니다.");
		} else {
			System.out.println("두수가 홀수입니다.");
		}
		System.out.println(num3 + ", " + num4);
		
		if((++num3 % 2 ==0) || (num4++ % 2 == 0)) {
			System.out.println("두수중 하나 짝수입니다.");
		} else {
			System.out.println("두수중 하나 홀수입니다.");
		}
		System.out.println(num3 + ", " + num4);
		
		System.out.println("end of prog");
	}

}
