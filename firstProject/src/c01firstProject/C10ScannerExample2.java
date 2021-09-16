package c01firstProject;

import java.util.Scanner;

public class C10ScannerExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num+num2;
		System.out.printf("%d + %d = %d",num,num2,result);

	}

}
