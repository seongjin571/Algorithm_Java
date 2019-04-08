package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > a)
			max = b;
		if (c > b)
			max = c;
		if (d > c)
			max = d;
		return max;
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("최댓값은 "+max4(a,b,c,d));
	}
}
