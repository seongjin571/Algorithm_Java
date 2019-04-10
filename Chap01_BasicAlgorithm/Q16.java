package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q16 {
	static void spria(int n) {
		for(int i = 1; i <= n; i++) {
			int space = n-i;
			for(int j = 0; j < space; j++)
				System.out.print(" ");
			for(int z = 0; z < (i*2)-1; z++)
				System.out.print("*");
			System.out.println("");
		}	
	}
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단? >>");
		int num = scan.nextInt();
		spria(num);
	}

}
