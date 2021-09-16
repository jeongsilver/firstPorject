package c01firstProject;

import java.util.Scanner;

public class C11ScannerExample3 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		// 영어점수입력:
		// 수학점수입력:
		// 이름입력:
		// 홍길동님의 영어, 수학점수의 합은, 평균은 ? 입니다
		
		
		
		System.out.print("영어점수입력:");
		int eng = sc.nextInt();
		System.out.print("수학점수입력:");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		
		int score[] = {eng,math};
		
		int sum = eng+math;
		double avg = (double) sum/score.length;
		System.out.printf("%s님의 영어, 수학 점수의 합은 %d , 평균인 %f 입니다. \n",name,sum,avg);
		
		if(sum>=120) {
			System.out.println(name+"님은 합격입니다.");
		}
		else {
			System.out.println(name+"님은 불합격입니다.");
		}
	}

}
