package c03_control;

public class C05forexe {

	public static void main(String[] args) {
		// 1~10 출력
		int a = 0;
		for (int i = 0; i <= 10; i++) {
			a += 1;
			System.out.println(a);
		}
		System.out.println("--끝1--");

		// 1~10 중에서 2,4,6~
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("--끝2--");

		// 1~10 중에서 1,3,5~
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("--끝3--");

		// 1~10까지 합을 구하기
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("--끝4--");

	}

}
