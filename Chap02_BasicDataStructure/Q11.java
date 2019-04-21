package Chap02_BasicDataStructure;

class YMD {
	int y;
	int m;
	int d;
	private int[][] monthDays = { 
			{ 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 }, 
	};

	private int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public String after(int n) {
		int month = monthDays[isLeap(y)][m-1];
		d += n;
		if(d + n > month) {
		while(d >= monthDays[isLeap(y)][m-1]) {
			d = d - monthDays[isLeap(y)][m-1];
			m++;
			if(m == 13) {
				y++;
				m = 1;
			}
		}
		}
		return n+"일 뒤면 '"+ y + "년 " + m + "월 " + d + "일' 입니다.";

	}

	public String before(int n) {
		
		d = d - n;
		if(d <= 0) {
			while(d <= 0) {
				if(m == 0) {
					m = 12;
					y--;
				}
				d += monthDays[isLeap(y)][m-1];
				m--;
			}
		}
		
		return n+"일 전이면 '"+ y + "년 " + m + "월 " + d + "일' 입니다.";
	}

}

public class Q11 { 

	public static void main(String[] args) {
		YMD ymd = new YMD(2019,4,21);
		YMD ymd2 = new YMD(2019,4,21);
		YMD ymd3 = new YMD(2019,4,21);
		YMD ymd4 = new YMD(2019,4,21);
		
		System.out.println(ymd.after(365));
		System.out.println(ymd2.after(3));
		System.out.println(ymd3.before(365));
		System.out.println(ymd4.before(60));

	}

}
