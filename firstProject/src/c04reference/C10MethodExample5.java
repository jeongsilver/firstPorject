package c04reference;

public class C10MethodExample5 {

	public static void main(String[] args) {
		int[] scores = {88,67,92,73,58};
		
		// 최소값을 구하는 코드
		int minVal = getMinValue(scores);
		System.out.println("최소값:"+minVal);
		System.out.println("끝1");
		

	}

	
	public static int getMinValue(int[] ary) {
		//최대값 구하기
		int maxVal = 0;
		boolean isTrue = false;
		
		for(int i=0; i<ary.length;i++) {
			isTrue = maxVal < ary[i];
			if(isTrue) {
				maxVal=ary[i];
			}
		   }
		
		int minVal =maxVal;
		for(int i=0; i<ary.length;i++) {
			isTrue = minVal>ary[i];
			if(isTrue) {
				minVal=ary[i];
				
			}
		}
		return minVal;
	}

}
