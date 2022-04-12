package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random()
		int randomVal =(int) (Math.random() * 100) + 1; // 반환값이 double 0 <= 값 < 1
		System.out.println(randomVal);
		
		// 생성된 값이 1부터 50까지.
		// 생성된 값이 51부터 60까지.
		// 생성된 값이 61부터 70까지.
		// 71 ~ 80, 81 ~ 90, 91 ~ 100
		
		if(1 <=randomVal && randomVal <=50) {
			System.out.println(randomVal + "생성된 값은 1 ~ 50까지 범위 값.");
		} else if (51 <=randomVal && randomVal <=60) {
			System.out.println(randomVal + "생성된 값은 61 ~ 60까지 범위 값.");
		} else if (61 <=randomVal && randomVal <=70) {
			System.out.println(randomVal + "생성된 값은 61 ~ 70까지 범위 값.");
		} else if (71 <=randomVal && randomVal <=80) {
			System.out.println(randomVal + "생성된 값은 71 ~ 80까지 범위 값.");
		} else if (81 <=randomVal && randomVal <=90) {
			System.out.println(randomVal + "생성된 값은 81 ~ 90까지 범위 값.");
		} else {
			System.out.println(randomVal + "생성된 91이상 범위 값.");
		}
		
		
		
		
	}

}
