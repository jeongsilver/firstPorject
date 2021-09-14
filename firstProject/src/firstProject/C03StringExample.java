package firstProject;

import java.util.Scanner;

public class C03StringExample {

	public static void main(String[] args) {
		int age=20;
		String name = "홍길동";
		
//		자동형변환(promotion)
		long myAge = age;
		
//		강제형변환(casting)
		age = (int)myAge;
		
		System.out.println(name + "의 나이는 "+ myAge);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("몇살입니까?");
		int jeongAge = sc.nextInt();
		System.out.printf("정은의 나이는 %d입니다",jeongAge);

	}

}
