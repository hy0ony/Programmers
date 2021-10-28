package level1.subacksu;

public class Solution {
	public static void main(String[] args) {

		int n = 4;
		String str = "";

		for( int i=0; i<n; i++) {
			if(i%2 == 0) {
				str += "수";
			}else {
				str += "박";
			}
		}

		System.out.println(str);
	}
}