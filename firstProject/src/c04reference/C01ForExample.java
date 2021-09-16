package c04reference;

public class C01ForExample {

	public static void main(String[] args) {
		//
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1");

		// 1~10짝수만 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("끝2");

		// 1~10 중 홀수만 합산
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("홀수 합:" + sum);
		System.out.println("끝3");

		
		// 1~10 sum의 값이 20을 넘어서는 그때의 횟수
		sum = 0;
		int cnt=0;
//		int i=0;
//		for (;i<=10;i++)
		for (int i=1; i<=10;i++) {
			sum+=i;
			if(sum>=20) {
				// i 값을 반환
				cnt =i;
				break;
			}
		}
		System.out.println("횟수:"+cnt);
	}

}
