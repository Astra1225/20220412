package co.edu.loop;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		int randomVal = (int)(Math.random()*3)+1;
		
		Scanner scn = new Scanner(System.in);
		int Value = 0;
		boolean run = true;

//가위(1) 바위(2) 보(3)
		while(run) {
			System.out.print("가위(1), 바위(2) 보(3) :");
			Value = scn.nextInt();

		if((Value == 1) && (randomVal == 3)) {
			System.out.println("You Win");	
			run = false; //정답인 경우 멈춤
		} else if((Value == 2) && (randomVal == 1)) {
			System.out.println("You Win");
			run = false; //정답인 경우 멈춤
		} else if((Value == 2) && (randomVal == 2)) {
			System.out.println("You Win");
			run = false;  //정답인 경우 멈춤
			
		}else if((Value <= 1) || (Value > 3)) {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}else {
			System.out.println("You lose");
			
		}
		}//end of while
	}
}