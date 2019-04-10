package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q17 {
	static void npria(int n) {
		for(int i = 1; i <= n; i++) {
			int space = n-i;
			for(int j = 0; j < space; j++)
				System.out.print(" ");
			for(int z = 0; z < (i*2)-1; z++)
				System.out.print(i%10);
			System.out.println("");
		}	
	}
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단? >>");
		int num = scan.nextInt();
		npria(num);
	}

}
