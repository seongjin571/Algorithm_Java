package Chap01_BasicAlgorithm;

public class Q12_Q13 {
	public static void main(String[]args) {
		System.out.println("곱셈");
		System.out.println("   | 1  2  3  4  5  6  7  8  9 ");
		System.out.println("---+---------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(" "+i+" |");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("덧셈");
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
}
