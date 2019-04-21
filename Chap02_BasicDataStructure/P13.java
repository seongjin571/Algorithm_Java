package Chap02_BasicDataStructure;

import java.util.Scanner;

public class P13 {
	static int[][] monthDays = { 
			{31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31},	
			{31, 29, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31},	  
	};
	
	static int isLeap(int year) {
		return (year%4 == 0 && year%100 != 0 || year%400 == 0) ? 1 : 0;
	}
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 년도인가요");
		int year = scan.nextInt();
		System.out.print("몇 월인가요");
		int month = scan.nextInt();
		System.out.print("며칠 인가요");
		int day = scan.nextInt();
		int allDays = 365;
		
		int countedDay = day;
		int isLeap = isLeap(year);
		
		for(int i = 1; i < month; i++) {
			countedDay += monthDays[0][i-1];
		}
		
		System.out.println("경과일은 " + countedDay);
		System.out.println("남은일은" + (allDays-countedDay));
	}
}
