package Chap03_Search;

import java.util.Scanner;

public class Q01 {
	static int scan(int[]array, int num) {
		array[array.length-1] = num;
		int result = 0;
		int length = array.length;
		for(int i = 0; i < length; i++) {
			if(array[i] == num) {
				result = i;
				break;
			}
		}
		return result;
	}
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		for(int i = 0; i < 5; i++) {
			System.out.print("array["+i+"] >> ");
			array[i] = scan.nextInt();
		}
		int result = scan(array , 10);
		if(result == array.length-1) {
			System.out.println("없다.");
		}
		else {
			System.out.println("찾는 값은 "+result+"에 있음.");
		}
		
	}
}
