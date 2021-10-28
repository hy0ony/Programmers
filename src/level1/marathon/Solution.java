package level1.marathon; 

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		ArrayList<String> pList = new ArrayList<String>();

		for(String p : participant) {
			pList.add(p);
		}

		for(String c : completion) {
			if(pList.contains(c)) {
				pList.remove(c);
			}
		}

		String answer = pList.get(0).toString();

		System.out.println(answer);
	}
}