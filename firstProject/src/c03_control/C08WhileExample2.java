package c03_control;

import java.util.Scanner;

public class C08WhileExample2 {

	public static void main(String[] args) {
		String name = "홍길동";
		String age = "20";
		String phone = "010-0101-2345";
		
		//사용자의 sacnner 사용
		// 1 => 이름, 2=> 나이, 3=> 연락처, 4=> 반복문 종료
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.새우버거   2.게살버거   3.치즈버거   4.불고기버거");
			int menu=scn.nextInt();
			if(menu==1) {
				System.out.println(menu+"새우버거 선택");
			}else if(menu==2) {
				System.out.println(menu+"게살버거 선택");
			}else if(menu==3) {
				System.out.println(menu+"치즈버거 선택");
			}else if(menu==4) {
				System.out.println(menu+"불고기버거 선택");
				break;
			}
		}
		System.out.println("끝");
	}

}
