package firstProject;

public class C08StringExample2 {

	public static void main(String[] args) {
		String name = "영희";
		int age =10;
		
		//이름은 영회, 나이는 10
		System.out.println("이름 :"+name +" , 나이:" + age);
		System.out.printf("이름 : %s , 나이 : %d \n",name,age);

		byte b1 = -90;
		byte b2 = 10;
		int result = b1 +b2 ;
		System.out.println(b1+"+"+b2+"="+result);
		System.out.printf("%d+%d=%d \n",b1,b2,result);
		
		boolean isLarger = result>0;
		if(isLarger) {
			System.out.println("양수입니다");
		}
		else {
			System.out.println("음수입니다");
		}
		
		// 2200000000 , 120, 16
		
		long num = 2200000000L;
		int num2 =78;
		int num3 = 8;
		
		double avg = (double) num2 / num3;
		System.out.printf("%d을 %d로 나눈 결과:%10.2f",num2,num3,avg);
  
	}

}
