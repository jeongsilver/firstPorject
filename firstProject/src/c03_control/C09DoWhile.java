package c03_control;

public class C09DoWhile {

	public static void main(String[] args) {
		//Do..While
		
		boolean run = false;
		
//		while(run) {
//			System.out.println("실행문1");
//		}
//		
//		do {
//			System.out.println("실행문2");
//		} while(run);

		
		int cnt =0;
		do {
			System.out.println(cnt);
			cnt++;
			if(cnt >=0) {
				break;
			}
		}while(true);
		System.out.println("끝");
	}

}
