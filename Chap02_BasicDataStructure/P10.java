package Chap02_BasicDataStructure;

public class P10 {
	public static void main(String[]args) {
		int count = 0;
		int ptr = 0;
		int i;
		int[] array = new int[500];
		array[ptr++] = 2;
		for(int n = 3; n < 1000; n += 2) {
			for(i = 1; i < ptr; i++){
				count++;
				if(n%array[i]==0)
					break;
			}
			if(ptr == i) 
				array[ptr++] = n; 
		}
		for(i = 0; i < ptr; i++) {
			System.out.println(array[i]);
		}
		System.out.println(count);
	}

}
