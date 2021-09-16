package c01firstProject;

import java.util.Scanner;

public class LeeJeongEun {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.printf("안녕하세요, %s 님, 나이를 입력해주세요. \n",name);
		String age = sc.nextLine();
		if(age.equals("")) {
			age="0";
		}
		int ageInt = Integer.parseInt(age);
		System.out.println(name+"님의 키를 입력해주세요.");
		int height = sc.nextInt();
		System.out.println(name+"님의 몸무게를 입력해주세요.");
		int weight = sc.nextInt();
		
		double bmi = (double) height/weight*weight;
		
		if(bmi>18.5) {
			System.out.println("저체중입니다.");
		}
		else {
			System.out.println("정상입니다.");
		}
		
		
		

	}

}
