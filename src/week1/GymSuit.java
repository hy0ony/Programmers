package week1;

import java.util.HashSet;

public class GymSuit {
	public static void main(String[] args) {

		int n = 7;
		int[] lost = {1, 2, 3, 4, 7};
		int[] reserve = {1, 3, 4, 5};

		// ü������ ������ �� �ִ� ��� �迭
		HashSet<Integer> set = new HashSet<Integer>();

		for(int i=0; i<reserve.length; i++) {
			for(int j=0; j<lost.length; j++) {

				if(reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
					System.out.println("������ �����ֱ� -> reserve[i] : " + reserve[i] + " (i:" + i + ") / lost[j] : " + lost[j] +" (j:" + j + ")");
					set.add(reserve[i]);

				}else if(reserve[i] == lost[j]) {
					System.out.println("���� ����� -> reserve[i] : " + reserve[i] + "(i:" + i + ") / lost[j] : " + lost[j] +" (j:" + j + ")");
					set.add(reserve[i]);

				}else if((reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j])
						&& (reserve[i] == lost[j])) {

					set.remove(reserve[i]);
				}
			}
		}

		int su = set.size();
		System.out.println(set);

		int answer = n - lost.length + su; 

		if(answer >= n) {
			System.out.println(n);
		}else {
			System.out.println(answer);
		}
 	}
}