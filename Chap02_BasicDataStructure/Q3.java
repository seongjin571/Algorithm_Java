package Chap02_BasicDataStructure;

public class Q3 {
	static int sum(int[] num) {
		int numLength = num.length;
		int sum = 0;
		for(int i = 0; i < numLength; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	public static void main(String []args) {
		int[] num = {5,10,73,2,-5,42};
		System.out.println(sum(num));
	}

}
