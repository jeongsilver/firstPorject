package c04reference;

public class C08MethodExample3 {

	public static void main(String[] args) {
		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		double avg = 0;
		for (int num : intAry) {
			sum += num;
		}
		sum = sumArray(intAry);
		System.out.println("intAry의 합:" + sum);
//		System.out.println("평군: "+avg);
		avg = avgArray(intAry);
		System.out.println("intAry의 평균:"+avg);

		sum=0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("합:"+sum);
		avg = avgArray(intAry2);
		System.out.println("intAry2의 평균:"+avg);
		
		

	}

	// 배열을 매개변수
	public static int sumArray(int[] intAry) {
		int sum=0;
		for(int num : intAry) {
			sum += num;
		}
		return sum;
	}
	
	
	// 배열을 매개변수 -> 평균 avgArray()
	
	public static double avgArray(int[] intAry) {
//		double sum=0;
//		for(double num:intAry) {
//			sum+=num;
//		}
		int sum = sumArray(intAry);
		double avg = (double)sum/intAry.length;
		return avg;
	}
	

}
