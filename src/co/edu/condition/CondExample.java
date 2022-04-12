package co.edu.condition;

import java.util.Scanner;

public class CondExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 임의 값 : Math.random()
		// 51 ~ 100 까지의 임의 값.
		int randomVal =(int) (Math.random() * 50) + 51;
		System.out.println(randomVal);
		randomVal /= 10; // randomVal = randomVal / 10;
		
		switch(randomVal) {
		case 10:
		case 9: System.out.println(randomVal +" A학점"); break;
		case 8: System.out.println(randomVal +" B학점"); break;
		case 7: System.out.println(randomVal +" C학점"); break;
		case 6: System.out.println(randomVal +" D학점"); break;
		default:
			System.out.println("F학점");
			
		
		}
		
		//월을 입력받아 해당 월의 일수를 보여주는 프로그램을 작성하시오 
		//- 1, 3, 5, 7, 8, 10, 12월 : 31일까지 
		//- 4, 6, 9, 11 월 : 30일까지 
		//- 2 월 : 28일까지
		System.out.println("월을 입력하세요.");
		int month = scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 까지 있음");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지 있음");
			break;
		case 2:
			System.out.println("28일 까지 있음");
			break;
		default:
			break;
			
			
		}
		
		
		
		
	}

}
