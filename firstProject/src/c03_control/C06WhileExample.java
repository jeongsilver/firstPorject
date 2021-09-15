package c03_control;

public class C06WhileExample {

	public static void main(String[] args) {
		int i=1;
		while (i<=10) {
			System.out.printf("i의 값은 %d\n",i);
			i++;
		}
		System.out.println("끝");
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			cnt = (int) (Math.random()*10)+1;
			System.out.println(cnt);
			if (cnt == 8) {
//				run = false;
				break;
			}
		}
		System.out.println("끝");
	}

}
