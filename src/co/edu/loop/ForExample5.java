package co.edu.loop;

public class ForExample5 {

	public static void main(String[] args) {
		// 숫자 100의 약수 출력.
		for(int i=1; i<=100; i++) {
			if(100 % i == 0) {
				System.out.println("100의 약수 값 : " + i);
			}
		}
		
	}

}
