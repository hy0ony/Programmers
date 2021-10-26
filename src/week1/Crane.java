package week1;

import java.util.ArrayList;

public class Crane {
	public static void main(String[] args) {

		int[][] board = 
			{ {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };

		int[] moves = {1,5,3,5,1,2,1,4};
		int[] inBoard;

		// 바구니 배열
		ArrayList<Integer> basket = new ArrayList<Integer>();

		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {

				inBoard = board[j];

				if(inBoard[moves[i]-1] != 0) {

					basket.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		
		System.out.println("basket[] : " + basket);

	}
}