package co.edu.loop;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// 1 ~ 10 합.
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum +=i;
			System.out.println(sum);
			i++;
		}
		System.out.println("sum = " + sum);
		
		Scanner scanner = new Scanner(System.in);
		boolean isTrue = true;
		sum = 0;
		while(isTrue) {
			System.out.println("숫자를 입력하세요. 종료 : -1");
			int temp = scanner.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력값의 합은 : " + sum);
		scanner.close();
	}

}
