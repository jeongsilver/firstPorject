package c03_control;

public class C01ConditionExample {

	public static void main(String[] args) {
		int score = 50;
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		}
		System.out.println("끝.");
	
	
	// 90점 이상 A, 80 이상 B, 70이상 C, 60점 이상 D, 그 외 F
	
	if(score >=90){
		System.out.println("A학점");
	} else if(score >=80) {
		System.out.println("B학점");
	} else if (score>=70) {
		System.out.println("C학점");
	} else if (score>=60) {
		System.out.println("D학점");
	} else {
		System.out.println("F학점");
	}
}
}
