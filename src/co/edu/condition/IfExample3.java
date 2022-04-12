package co.edu.condition;

public class IfExample3 {

	public static void main(String[] args) {
		// 중첩 구문.
		// 90점이상 A, 80점이상 B, 70점이상 C, 나머지 F
		
		int score = 95;
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println(score +" A+학점");
			} else {
				System.out.println(score +" A학점");				
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println(score +" B+학점");
			} else {
				System.out.println(score +" B학점");				
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println(score +" C+학점");
			} else {
				System.out.println(score +" C학점");				
			}
		} else {
			System.out.println(score +" F학점");
		}
	}

}
