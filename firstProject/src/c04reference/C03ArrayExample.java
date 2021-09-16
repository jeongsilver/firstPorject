package c04reference;

public class C03ArrayExample {

	public static void main(String[] args) {
		// 학생 30명
//		int s1 ~ s30;
//		int student []=new int[30];
//		int num = 10, String str;
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("--------");
		
		
		intAry[0]=6;
		intAry[1]=7;
		intAry[2]=7;
		intAry[3]=10;
		intAry[4]=50;
		for(int i=0; i<5;i++) {
			System.out.println(intAry[i]);
		}
		
		
		byte[] byteAry = {1,2,3};
		for(int i=0; i<3; i++) {
			System.out.println("byte:"+byteAry[i]);
		}
		
		String[] strAry = {"Hello", "World","Nice"};
		strAry = new String[] {"Hong","Kim","Park"};
		for(int i=0; i<3; i++) {
			System.out.println("String배열:"+strAry[i]);
		}
		
		double[] dblAry;
		dblAry = new double[] {1,2,3.5,5};
		
		System.out.println("=====float배열=====");
		float[] fltAry = new float[5];
		for(int i=0;i<fltAry.length;i++) {
			System.out.println(fltAry[i]);
		}
		

	}

}
