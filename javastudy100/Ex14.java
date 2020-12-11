package javastudy100;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요: ");
		int hour = scanner.nextInt();
		System.out.print("분을 입력하세요: ");
		int min = scanner.nextInt();
		
		System.out.println("현재 시간 " + hour + ":" + min);
		
	}

}
