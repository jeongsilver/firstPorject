package c03_control;

public class C02ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "B";
		
		switch(inputValue) {
		case "A":
			System.out.println("참잘했습니다!");
			break;
		case "B":
			System.out.println("잘했습니다");
		case "C":
			System.out.println("보통입니다");
		case "D":
			System.out.println("노력하세요");
		default:
			System.out.println("실망입니다");
		}
		
		switch(inputValue) {
		case "A" :
		case "B" :
		case "C" :
			System.out.println("A입니다");
 		}

	}

}
