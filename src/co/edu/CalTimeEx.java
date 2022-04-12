package co.edu;

import java.util.Scanner;

public class CalTimeEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = scanner.nextInt();
		// 시, 분, 초 => 5000초 = 5000/(60*60) = 시
		// 5000%(3600) => 1400/60 = 분
		// x초
		
		int hours, minutes, secs;
		
		hours = time/3600;
		time = time%60;
		minutes = time%60;
		secs = time;
//		System.out.println(hours + "시" + minutes + "분" + secs + "초");
		System.out.printf("%2d시 %2d분 %2d초", hours, minutes, secs );
		
		scanner.close();
	}

}
