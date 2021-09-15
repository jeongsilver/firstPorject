package c03_control;

public class C03ConditionExe {

	public static void main(String[] args) {
//		// 두 정수 60 70
//		// 두 수를 합한 결과 100점 넘어서면 합격, 불합격
//
//		int num1 = 60;
//		int num2 = 70;
//
//		int sum = num1 + num2;
//
//		if (sum > 100) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		System.out.println("1번 끝");
//
//		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수
//
//		int mul = num1 * num2;
//		if (mul % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//		System.out.println("2번 끝");
//
//		int a = 12;
//		if (a % 3 == 0 && a % 2 == 0) {
//			System.out.println("2와 3의 배수입니다");
//		} else if (a % 3 == 0) {
//			System.out.println("3의 배수입니다");
//		} else if (a % 2 == 0) {
//			System.out.println("2의 배수입니다");
//		}
//		System.out.println("3번 끝");
//		System.out.println("---주사위를 굴려보자!---");
//
//		int randomValue = (int) (Math.random() * 6) + 1;
//		switch (randomValue) {
//		case 1:
//			System.out.println(randomValue+"번이 나왔습니다");
//			break;
//		case 2:
//			System.out.println(randomValue+"번이 나왔습니다");
//			break;
//		case 3:
//			System.out.println(randomValue+"번이 나왔습니다");
//			break;
//		case 4:
//			System.out.println(randomValue+"번이 나왔습니다");
//			break;
//		case 5:
//			System.out.println(randomValue+"번이 나왔습니다");
//			break;
//		default:
//			System.out.println("6번이 나왔습니다");
//			break;
//		}
//		System.out.println("4번 끝");

		int randomScore = (int) (Math.random() * 100);
		
		System.out.println(randomScore+"점");
		if (randomScore >= 90) {
			System.out.println("A입니다!");
		} else if (randomScore > 80) {
			System.out.println("B입니다!");
		} else if (randomScore > 70) {
			System.out.println("C입니다!");
		} else if (randomScore > 60) {
			System.out.println("D입니다!");
		} else {
			System.out.println("F입니다! 재수강하세요.");
		}
		System.out.println("5번 끝");
		

		randomScore /= 10;
		System.out.println(randomScore+"점");
		switch (randomScore) {
		case 9:
			System.out.println("A학점입니다");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		default:
			System.out.println("재수강하세요.");
			break;
		}
		
		System.out.println("6번 끝");

	}

}
