package Chap03_Search;

public class Q03 {
	static int searchIndex(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i = 0; i < n; i ++) {
			if(a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
		
	}
	public static void main(String []args) {
		int[] a = {1,9,2,9,4,6,7,9};
		int[] idx = new int[8];
		int returnValue = searchIndex(a, a.length, 9, idx);
		for(int i = 0; i < returnValue; i++) {
			System.out.println(idx[i]);
		}
		System.out.print(returnValue);
	}
	

}
