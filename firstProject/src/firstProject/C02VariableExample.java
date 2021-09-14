package firstProject;

// byte < short < int < long < float <double

public class C02VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // 변수 <--> 상수
		number1 = 20;
		number1 = 30;
		System.out.println("결과: "+number1);
		
		
//		int number1 = 90; -> 메인 메소드 안에 두번 같은 변수 선언x
		int number3 = 90;
		int result; //변수선언
		final int number2=20;
//		number2=30; 이건 상수이기 때문에 에러발생
		
		
		result=number1+number2;
		double result1=number3 / 20.0;
		System.out.println("결과값: "+result);
		System.out.println("결과값: "+result1);
		
		
		
		
	}
}
