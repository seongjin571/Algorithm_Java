package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q10 {
	static int minus(int a, int b) {
		return b - a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		int b;
//		do {
//			System.out.print("b의 값 : ");
//			b = scan.nextInt();
//			if (b <= a) {
//				System.out.println("a보다 큰 값을 입력하세요!");
//			} else
//				System.out.println("두 수의 차이는 : " + minus(a, b));
//		} while (b <= a);
		
		while(true) {
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			if(b > a) 
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		System.out.println("두 수의 차이는 : " + minus(a, b));

	}

}
