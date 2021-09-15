package c03_control;

public class C04ForExample {

	public static void main(String[] args) {
		int cnt=0;
		for(int i=1; i<=4; i++) {
			cnt+=1;
			System.out.printf("i:%d\n, cnt: %d\n",i,cnt);			
		}
		
		System.out.println("===다시===");
		int tempValue =0;
		for(int i = 1; i<=5; i++) {
//			int tempValue=0;
			tempValue += (int)(Math.random()*10)+1;
			System.out.printf("%d번째 값:%d\n",i,tempValue);
		}
		System.out.println("반복문끝");

	}

}
