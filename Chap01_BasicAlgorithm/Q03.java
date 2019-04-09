package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b<a) min = b;
		if(c<b) min = c;
		if(d<c) min = d;
		return min;
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("최솟값은 "+min4(a,b,c,d));
	}

}
