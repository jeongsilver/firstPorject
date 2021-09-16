package c04reference;

public class C05EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[] { "Lee", "Hong", "Park", "Choi", "Kim" };
		System.out.println(strAry.length);

		strAry[1] = "LEE";

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("LEE"))
				System.out.println(strAry[i]);
		}

		// Enhanced for
		for (String name : strAry) {
			System.out.println(name);
		}

		int[] scores = { 50, 70, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);

		// 학생 3명 4.2, 3.5, 2.8
		// 합계를 담을 수 있도록 변수
		double[] students = { 4.2, 3.9, 2.1 };
		double sum1 = 0;
		for (double score : students) {
			sum1 += score;
		}
		System.out.println( sum1);
		
		
		System.out.println(sum1 / students.length);

	}

}
