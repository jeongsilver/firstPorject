package firstProject;

import java.util.Scanner;

public class C12ScannerExample4 {

	public static void main(String[] args) {
		// "100" VS 100
		
		int num1 = 100;
		String num2 = "100";
		Byte.parseByte(num2);
		int num2Int = Integer.parseInt(num2); //string -> num
//		System.out.println(num2Int);
		
		String num3 ="12.25";
		double num3Double = Double.parseDouble(num3);
		
		int result = num1 + num2Int;
		
		Scanner scn = new Scanner (System.in);
		System.out.println("이름:");
		String name = scn.nextLine();
		System.out.println("나이:");
		String age = scn.nextLine();
		if(age.equals("")) {
			age="0";
		}
		int ageInt = Integer.parseInt(age);
		System.out.println("연락처:");
//		scn.nextLine(); 
		String phone = scn.nextLine();
		System.out.println("");
		
		System.out.printf("%s님의 나이는 %d세\t연락처는\t%s입니다.\n",name,ageInt,phone);

	}

}
