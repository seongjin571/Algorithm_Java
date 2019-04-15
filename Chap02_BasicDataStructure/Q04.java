package Chap02_BasicDataStructure;

import java.util.Scanner;

public class Q04 {
	static boolean equlas(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		int arrayLength = a.length;
		for (int i = 0; i < arrayLength; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[i];
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = { 1, 2, 3, 4, 6 };

		System.out.println("두 배열은" + (equlas(a, b) ? "같습니다." : "다릅니다."));
		System.out.println("두 배열은" + (equlas(a, c) ? "같습니다." : "다릅니다."));

		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 요솟수는 ：");
		int numa = stdIn.nextInt(); // 요솟수
		int[] d = new int[numa]; // 요솟수 numa인 배열
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("b의 요솟수는 ：");
		int numb = stdIn.nextInt(); // 요솟수
		int[] e = new int[numb]; // 요솟수 numb인 배열
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		copy(d, e); // 배열 b의 모든 요소를 배열 a에 역순으로 복사

		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
