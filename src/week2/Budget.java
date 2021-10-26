package week2;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		
		// 부서별로 신청한 금액 합계
		int sum = 0;
		
		// 최대 부서 개수
		int result = 0;
		
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			
			sum += d[i];
			result++;
			
			if(sum > budget) {
				sum -= d[i];
				result--;
				break;
			}
		}
		
		System.out.println(result);
	}

}
