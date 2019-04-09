package Chap01_BasicAlgorithm;

import java.util.Scanner;

public class Q11 {
	static int numSize(int num) {
//		int check = 1;
		int size = 0;
//		while(true) {
//			if((num/check)>=1) {
//				check = check*10;
//				size += 1;
//			}
//			else break;
//		}
//		return size;
		while(num>0) {
			num = num/10;
			size++;
		}
		return size;
	}
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num+"은 "+numSize(num)+"자리 수입니다.");
	}
}
