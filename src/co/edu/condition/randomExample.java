package co.edu.condition;

import java.util.Scanner;

public class randomExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("눈 갯수를 맞추세요.");
		int pic = scanner.nextInt();
		int randomVal =(int) (Math.random() * 6) + 1 ;
		System.out.println(randomVal);
		
		
		if(randomVal == pic) {
			System.out.println("맞췄습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		scanner.close();
	}

}
