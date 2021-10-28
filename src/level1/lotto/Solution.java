package level1.lotto;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {

		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		// 0�� ����
		int zero = 0;

		// �ּ� �ߺ� ����
		int min = 0;

		// �ߺ� ���� ��ü �迭
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

		// ��ġ�� ����
		int s2 = 12 - set.size() - zero;

		System.out.println("��ġ�� ���� : " + s2);

		if(zero == 6) {
			min = 0;
		}else {
			min = s2;
		}

		System.out.println("0�� ���� : " + zero);
		System.out.println("�ּ� : " + min );
		System.out.println("�ִ� : " + (min+zero) );

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