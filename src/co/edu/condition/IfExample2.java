package co.edu.condition;

public class IfExample2 {

	public static void main(String[] args) {
		int num = 18;
		// 2의 배수인지 3의 배수인지 2와3의 공통배수인지.
		
		if(num % 2 == 0 && num % 3 ==0) {
			System.out.println("2와 3의 공통배수입니다.");
		} else if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("아무것도 해당하지 않습니다.");
		}
		
	}

}
