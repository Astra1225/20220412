package co.edu.loop;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int randomVal = (int)(Math.random()*6)+1;
		boolean run = true;

		while(run){
		System.out.println("주사위 면의 갯수는 몇일까요?");
		int Value = scn.nextInt();
		
		if(Value == randomVal) {
			System.out.println("정답입니다.");
			System.out.println("종료합니다.");
			run = false;
		} else {
			System.out.println("정답이 아닙니다.");
		}
	}//end of while
		
	}

}
