package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q15 {
	static void triangle1(int n) {
		System.out.println("왼쪽 아래 ");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void triangle2(int n) {
		System.out.println("왼쪽 위 ");
		for(int i = n; i > 0; i-- ) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void triangle3(int n) {
		System.out.println("오른쪽 아래 ");
		for(int i = 1; i <= n; i++) {
			for(int z = 0; z < n-i; z++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void triangle4(int n) {
		System.out.println("오른쪽 위 ");
		for(int i = n; i > 0; i--) {
			for(int z = 0; z < n-i; z++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void main(String []args) {
		System.out.print("몇 단?? >>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		triangle1(num);
		triangle2(num);
		triangle3(num);
		triangle4(num);
		
	}
}
