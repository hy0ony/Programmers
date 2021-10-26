package week1;

import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {

		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		// 0의 개수
		int zero = 0;

		// 최소 중복 개수
		int min = 0;

		// 중복 없는 전체 배열
		HashSet<Integer> set = new HashSet<Integer>();

		int size = set.size();

		for(int i=0; i<6; i++) {

			if(lottos[i] != 0) {
				set.add(lottos[i]);
			}else if(lottos[i] == 0) {
				zero++;
			}

			set.add(win_nums[i]);
		}

		// 겹치는 개수
		int s2 = 12 - set.size() - zero;

		System.out.println("겹치는 개수 : " + s2);

		if(zero == 6) {
			min = 0;
		}else {
			min = s2;
		}

		System.out.println("0의 개수 : " + zero);
		System.out.println("최소 : " + min );
		System.out.println("최대 : " + (min+zero) );

		int rank = 0;
		int rank2 = 0;

		if(min<=1) {
			rank = 6;
		}else {
			rank = 7 - min;
		}

		if(min+zero<=1) {
			rank2 = 6;
		}else {
			rank2 = 7 - (min+zero);
		}
		
		int[] answer = {rank2, rank};

		for(int i : answer) {
			System.out.print(i + " / ");
		}		
	}
}