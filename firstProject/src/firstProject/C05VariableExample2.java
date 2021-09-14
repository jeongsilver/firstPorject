package firstProject;

import java.util.Scanner;

public class C05VariableExample2 {

	public static void main(String[] args) {
//		이름, 나이, 참/거짓
		int age =25;

		
		Scanner sc = new Scanner (System.in);
//		age <= 나이  25세 이상입니다
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("몇살입니까?");
		int myAge = sc.nextInt();
		if(age<=myAge) {
			System.out.println(name+"님은 25세 이상입니다");
		}
		else{
			System.out.println(name+"님은 25세 이하입니다.");
		}
	
//		변수 설정
		String myName="이정은";
		int age1=25;
		if(age<=age1) {
			System.out.println(myName+"님은 25세 이상입니다");
		}
		else{
			System.out.println(myName+"님은 25세 이하입니다.");
		}
		
	}

}
