package k20230411;

import java.util.Arrays;

public class BubbleSoftEarlyStopTest {

	public static void main(String[] args) {
		
		int[] data = { 8, 3, 4, 9, 1 };
		for (int i = 0; i < data.length - 1; i++) { 
//			a
			
			
			for (int j = 0; j < data.length - 1 - i; j++) { 
				if (data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
//					b
					
					
				}
//				System.out.println(Arrays.toString(data));
			} // 회전종료
//			c
//			if() {
//				
//			}
			
			System.out.println(i + 1 + "회전 결과:" + Arrays.toString(data));
		} // 정렬종료
		
	}

}
