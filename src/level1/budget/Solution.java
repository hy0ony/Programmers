package level1.budget;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		
		// �μ����� ��û�� �ݾ� �հ�
		int sum = 0;
		
		// �ִ� �μ� ����
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
