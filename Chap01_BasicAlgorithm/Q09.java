package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q09 {
	static int sumIntervalValue(int start, int last) {
		int sum = 0;
		for(int i =start; i<=last; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int last = scan.nextInt();
		
		System.out.println(sumIntervalValue(start,last));
	}

}
