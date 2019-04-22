package Chap03_Search;

import java.util.Scanner;

public class Q10_extra {
	static int search(int[] array, int num) {
		int pl = 0;
		int pr = array.length - 1;
		for (pl = 0; pl < pr; pl++) {
			int pc = (pl + pr) / 2;
			if (num > array[pc]) {
				pl = pc + 1;
				
			} else if (num < array[pc]) {
				pr = pc - 1;
				
			} else {
				return pc;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇자리??");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.print(0 + "번째 요소 입력 >> ");
		array[0] = scan.nextInt();
		for (int i = 1; i < length; i++) {

			while (true) {
				System.out.print(i + "번째 요소 입력 >> ");
				array[i] = scan.nextInt();
				if (array[i] >= array[i - 1])
					break;
				else {
					System.out.println("더 크거나 같은 수를 입력하세요.");
				}
			}

		}
		int result = search(array, 20);
		if (result == -1) {
			System.out.println("없다");
		} else {
			System.out.println("찾는 값은 "+result+"에 있음.");
		}
	}

}
