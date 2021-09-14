package firstProject;

public class C04BooleanExample {

	public static void main(String[] args) {
		boolean isOk = true;
//		isOk = false;
		isOk = 5 > 10;
		
		boolean isTeenager=false;
		
		if(isOk) {
			isTeenager = true;
		}
		
		if(isTeenager) {
			System.out.println("청소년입니다.");
		}
		
		System.out.println("end of prog");
	}

}
