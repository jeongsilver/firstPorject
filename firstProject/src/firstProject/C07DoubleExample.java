package firstProject;

public class C07DoubleExample {

	public static void main(String[] args) {
		// double(8byte), float(4byte)
		System.out.println(Double.MAX_VALUE);
		double d1 = 3.1;
		double d2= 6.9;
		
		float f1 = 3.2f;
		
		
		double r1 =d1+d2;
		System.out.println(r1);
		
		d1 = d2 =2.3;
		boolean isSame = d1 ==d2;
		System.out.println(isSame);
		
		String s1 = "Hello";
		String s2 = new String ("Hello");
		
//		isSame = s1 == s2;
		isSame = s1.equals(s2);
		System.out.println(isSame);
				

	}

}