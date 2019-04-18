package Chap02_BasicDataStructure;

public class Q02 {
	static void reverse(int[] num) {
		int numLength = num.length;
		for(int i = 0;  i < numLength/2; i++) {
			swap(num,i,numLength-i-1);
		}
	}
	
	static void swap(int[] num , int c1, int c2) {
		int numLength = num.length;
		for(int i = 0; i < numLength; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("");
		System.out.println("a["+c1+"]과(와) a["+c2+"]를 변경합니다.");
		int bridge = num[c1];
		num[c1] = num[c2];
		num[c2] = bridge;
	}
	
	public static void main(String[]args) {
		int[] num = {5,10,73,2,-5,42};
		reverse(num);
		int numLength = num.length;
		for(int i = 0;  i < numLength; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n역순 정렬 완료");
	}
	
}
