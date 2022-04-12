package co.edu.loop;

public class ForExample2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		
		System.out.println();
		
		int num = 0;
		for(int i = 1; i <= 9; i+=2) {
			num = num + i;
			System.out.println(num);
		}
	}

}
