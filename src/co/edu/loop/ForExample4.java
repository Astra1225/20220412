package co.edu.loop;

public class ForExample4 {

	public static void main(String[] args) {
		// 1 ~ 100 반복
		// 최초로 1000보다 큰 값중 최소값 구하기.
		
		int sum = 0;
		int cnt = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum >= 1000) {
				cnt = i;
				break;
			}
		}
		System.out.println("1000보다 큰 최소합계 : " + sum + ", 순번 : " + cnt);
		
		// 1 ~ 10번을 반복.
		//num = num * 1;
		int num = 1;
		for(int i=1; i<=10; i++) {
			num = num * i;
			System.out.println("1 ~ 10까지 곱한 결과 : " + num);
		}
	}

}
