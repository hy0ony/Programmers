package week1;

public class SuBakSu {
	public static void main(String[] args) {

		int n = 4;
		String str = "";

		for( int i=0; i<n; i++) {
			if(i%2 == 0) {
				str += "��";
			}else {
				str += "��";
			}
		}

		System.out.println(str);
	}
}