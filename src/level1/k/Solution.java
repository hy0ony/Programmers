package level1.k;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		// commands ���� �迭
		int[] in_commands;
		
		// �迭�� �ڸ���, ������ �迭
		int[] copy;
		
		// ������ �迭�� ?��° ��
		int r;
		
		// r���� ���� �迭 --> ����
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			in_commands = commands[i];
			
			if(in_commands[0] == in_commands[1]) {
				r = array[in_commands[0]-1];
				
			}else {
				copy = Arrays.copyOfRange(array, in_commands[0]-1, in_commands[1]);
				Arrays.sort(copy);
				
				r = copy[in_commands[2]-1];
			}
			
			answer[i] = r;
			
			System.out.print(answer[i]);
		}
	}
}
