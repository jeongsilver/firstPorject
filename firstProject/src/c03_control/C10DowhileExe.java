package c03_control;

public class C10DowhileExe {

	public static void main(String[] args) {
//		// 1부터 10까지 출력
//		int i=0;
//		do {
//			i++;
//			System.out.println(i);
//			if(i==10) {
//				break;
//			}
//		}while(true);
//		System.out.println("끝1");
//		
//		i=0;
//		do {
//			i++;
//			if(i%2==0) {
//				System.out.println(i);
//				continue;
//			}
//			
//		}while(i<=10);
//		System.out.println("끝2");
//		
//	
//		int sum=0;
//		i=0;
//		do {
//			i++;
//			if(i%2==1) {
//				sum+=i;
//				continue;
//			}
//		}while(i<=10);
//		System.out.println(sum);
//		System.out.println("끝3");
//		
//		i=0;
//		sum=0;
//		do {
//			if(i>=10) {
//				break;
//			}
//			if(i % 2 ==0) {
//				i++;
//				continue;
//			}
//			sum+=i++;
//		}while(true);
//		System.out.println("sum:"+sum);
		
		
		//임의의 값을 1~10
		//sum 값이 100 보다 큰 수가 되었을 때
		//그 때의 sum 값을 출력.. 몇번 실행을 했는지 보여주기
		
		int sum=0;
		int i=0;
		boolean run = false;
		int random = (int)(Math.random()*10)+1;
		do {
		for(;;i++) {
				sum+=random;
				if(sum>=100) {
					sum+=random;
					break;
						}
		}
			
		}while(run);
		System.out.printf("%d번째 랜덤 합: %d",i,sum);
		
		
//		do {
//			sum+=random;
//			continue;
//		}while(sum>=100);
//		System.out.printf("%d번째 랜덤 합: %d",i,sum);
		
		
		
		
	}

}
