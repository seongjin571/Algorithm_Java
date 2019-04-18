package Chap02_BasicDataStructure;

public class P09 {
	public static void main(String []args) {
		int count=0;
		for(int n = 2; n < 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				count++;
				if(n%i==0) {
					break;
				}
			}
			if(n == i)
				System.out.println(n);
		}
		System.out.println(count);
	}

}
