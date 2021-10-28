package level1.crane;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {

		int[][] board = 
			{ {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };

		int[] moves = {1,5,3,5,1,2,1,4};
		int[] inBoard;
		
		int answer = 0;

		// 인형들을 담을 바구니
		ArrayList<Integer> basket = new ArrayList<Integer>();

		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {

				inBoard = board[j];

				if(inBoard[moves[i]-1] != 0) {

					basket.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					answer= answer +2;
					break;
				}
			}
		}
		
		System.out.println("basket[] : " + basket);
		System.out.println(answer);

	}
}
