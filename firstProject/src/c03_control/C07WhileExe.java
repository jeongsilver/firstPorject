package c03_control;

public class C07WhileExe {

	public static void main(String[] args) {
		// while 구문을 1~10까지 출력
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("--끝1--");
		
		// while 구문을 2,4,6,8,10을 출력
		
		int en=2;
		while(en<=10) {
			System.out.println(en);
			en+=2;
		}
		System.out.println("--끝2--");
		
		
		//while 구문을 1,3,5,7,9 출력
		 i=1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("--끝3--");
		
		//while 구문 1~10 합
		i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		System.out.println("--끝4--");

	}

}
