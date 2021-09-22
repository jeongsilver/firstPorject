package c04reference;

import java.util.Scanner;

public class LeeJeongEun {

	public static void main(String[] args) {
		// 1. 학생수 지정, 2. 학생이름입력 3. 출력 4. 종료

		String[] teachers = null;
		System.out.println("================예담학교 선생님================");
		while (true) {
			showMenu();
			// 번호 선택하면 if조건으로 넘어가는 메서드
			int choice = readInt("번호를 선택하세요");
			// if문
			// 1. 학생수 지정
			// 2. 학생이름
			// 3. 전체 리스트
			// 4. 종료
			if (choice == 1) {
				int size = createTeacher();
				teachers = new String[size];
			} else if (choice == 2) {
				teacherName(teachers);
			} else if (choice == 3) {
				showList(teachers);
			} else if (choice == 4) {
				break;
			}

		}
		System.out.println("==========================================");

	}

	public static void showMenu() {
		System.out.println("1.선생님 인원수, 2.선생님 이름, 3.선생님 리스트, 4.종료");
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

	public static String readString(String msg) {
		Scanner sn = new Scanner(System.in);
		System.out.println(msg);
		String name = sn.nextLine();
		return name;
	}

	public static int createTeacher() {
		int cnt = readInt("선생님 수를 입력하세요.");
		System.out.println("");

		return cnt;
	}

	public static void teacherName(String[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readString("선생님 이름을 입력해주세요");
		}

	}

	public static void showList(String[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d. %s 선생님\n", i + 1, ary[i]);
		}

	}

}
