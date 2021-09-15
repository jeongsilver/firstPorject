package c03_control;

import java.util.Scanner;

public class LeeJeongEun {

	public static void main(String[] args) {
		// if for(while) break, continue
		Scanner sc = new Scanner (System.in);
		System.out.println("Random Game!");
		System.out.println("숫자를 입력해주세요");
		int user = sc.nextInt();
		int random = (int)(Math.random()*50)+1;
		do {
			for(int i=1;i<=10;i++) {
			if(user>random) {
				System.out.println("입력하신 숫자가 random 숫자보다 큽니다."+random);
				System.out.println("다시 입력하시겠습니까?");
				user=sc.nextInt();
				
			
			if(user<random) {
				System.out.println("입력하신 숫자가  random 숫자보다 작습니다."+random);
				System.out.println("다시 입력하시겠습니까?");
				sc.nextInt();
				continue;
			}
			}
			}
		}while(user==random);
		System.out.printf("축하합니다 맞히셨습니다! user:%d ,random:%d ",user,random);
			

	}

}
