package Chap01_BasicAlgorithm;

public class Q2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<a) min = b;
		if(c<b) min = c;
		return min;
	}
	public static void main(String[]args) {
		System.out.print(min3(2,24,-3));
	}

}
