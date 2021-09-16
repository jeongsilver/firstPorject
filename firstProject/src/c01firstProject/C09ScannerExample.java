package c01firstProject;
// firstProject.ScannerExample
import java.util.Scanner;

public class C09ScannerExample {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner (System.in);
		System.out.print("이름을 입력하세요");
		String name = scn.nextLine();
		System.out.print("안녕하세요, "+name+"님, 몇살입니까?");
		int age =scn.nextInt();
		scn.nextLine(); //nextInt -> nextLine 쓸 때 꼭꼭 중간에 nextLine 쓰기!!
		System.out.print(name+"님, 키는 몇인가요?");
		String height = scn.nextLine();
		
		System.out.println("정보를 불러오고 있습니다..");
		System.out.printf("%s님의 나이는 %d , 키는 %s 입니다.",name,age,height);
		
		
		
	}

}
