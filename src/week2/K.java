package week2;

import java.util.Arrays;

public class K {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		// commands 안쪽 배열
		int[] in_commands;
		
		// 배열을 자르고, 정렬한 배열
		int[] copy;
		
		// 정렬한 배열의 ?번째 값
		int r;
		
		// r값을 담은 배열 --> 정답
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
