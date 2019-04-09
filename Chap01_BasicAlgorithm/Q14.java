package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q14 {
	static void square(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	public static void main(String[]args) {
		System.out.println("사각형을 출력합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("단수 : ");
		int num = scan.nextInt();
		square(num);
	}

}
