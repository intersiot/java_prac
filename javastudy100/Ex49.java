package javastudy100;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시간 입력: ");
		int hour = scan.nextInt(); // 시간입력
		System.out.println("분 입력: ");
		int minute = scan.nextInt(); // 분 입력
		
		if (minute >= 0 && hour <= 59) {
			minute = minute - 30;
			if (minute < 0) {
				hour--;
				minute = 60 + minute;
			}
		}
		
		System.out.printf("%02d", hour);
		System.out.print(":");
		System.out.printf("%02d", minute);
	}

}
