package c04reference;

public class C07MethodExample2 {

	public static void main(String[] args) {
		sum(1,100);
		int a= 50, b=99;
		sum(a,b);
		multi(3,3);
		multi(a,b);
		getArea(8.7);
		
		int res = getMax(a,b);
		System.out.println("큰 수는 :"+res);
		
		System.out.println("결과는 : "+divide(3,5));

	}

	//두 정수를 입력받아서 두수의 합을 출력
	public static void sum(int n1, int n2) {
		int sum = n1 +n2;
		System.out.println("두수의 합: "+sum);
		
	}
	
	// 두 정수를 입력 받아 두 수의 곱을 console에 보여주기
	
	public static void multi(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println("두수의 곱: "+multi);
	}
	
	
	//정사각형 너비를 계산해주는 메소드
	public static void getArea (double side) {
		double sum = side * side;
		System.out.println("정사각형의 너비: "+sum);
	}
	
	//두 수 중에 큰 값을 반환해주는 메소드
	public static int getMax(int num1, int num2) {
		int result = (num1>=num2) ? num1 : num2;
		return result;
		
	}
	
	// 두 수를 입력 받아서 첫번째 / 두번째 나눈 결과
	public static double divide(double a, double b) {
//		double result = a /b;
		return (double) a/b;
	}
}
   