package c04reference;

import java.util.Scanner;

public class C12Main {

	public static void main(String[] args) {
		// 1. 학생수 지정, 2. 학생이름입력 3. 출력 4. 종료
		int[] scores = null;
		while(true) {
			showMenu();
			int choice = readInt("번호 선택");
			if(choice == 1) {
				int member =studentNumber();
				scores = new int[member];
			}else if(choice == 2) {
				studentName();
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				break;
			}
		}
		System.out.println("저장을 완료했습니다.");

	}
	public static void showMenu() {
		System.out.println("1. 학생수 지정, 2. 학생이름입력 3. 출력 4. 종료");
	}
	public static int readInt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int menu = sc.nextInt();
		return menu;
	}
	public static int studentNumber() {
		int cnt = readInt("학생수를 입력하세요.");
		System.out.println("");
		
		return cnt;
	}
	public static void studentName (int[] ary) {
		for(int i=0; i<ary.length;i++) {
			System.out.printf("%d의 학생이름 : %s",i,ary[i] );
		}
	}

}
