package c03_control;

public class C11ForTimesExample {

	public static void main(String[] args) {
//		int row = 4;
//		for(int i=1;i<=9;i++) {
//		System.out.printf("%d * %d = %d\n",row,i,row*i);
//		}
		
		for(int j=2;j<=9;j++) {
			int row = j;
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",row,i,row*i);
			}
		}
	}

}
