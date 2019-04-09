package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q07 {
	public static int sum(int num) {
		int sum = 0;
		int i = 0;
		while (i <= num) {
			sum += i;
			i++;	
		}
		return sum;
	}

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("1부터 " +num+"까지의 합은 = "+sum(num));

	}
}
