package c01firstProject;

public class C06CharExample {

	public static void main(String[] args) {
		// int, String, boolean, char
		// byte(1byte) < chat, short (2byte) < int <long
		
		char myFirstCharType =97;
		System.out.println(myFirstCharType);
		
		
		byte b1 = 10; //1byte(8bit) || 
//		 0 0 0 0 0 0 0 0 0 => 1byte
//		 2^1 2^2 2^3 ... 2^8 => 256가지 (-128 ~ 127)

		b1 = 127;
		b1++; // b1 = b1+1; -> 제일 큰값에 1을 더 하면 제일 작은 값으로 감
		System.out.println(b1);
		
		short s1 =0; // -128 + 0
		System.out.println(Short.MAX_VALUE);
		//short -32767 ~ 32767
//		short result =(short) (b1 +s1); //short + short
		int result = (b1+s1);
		
		
		System.out.println(Integer.MAX_VALUE);
		
		long fakeLong = 2147483648L;
	}

}
