package javastudy100;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		System.out.print("일을 입력하세요: ");
		int day = scanner.nextInt();
		
		System.out.printf("%02d", year);
		System.out.print(".");
		System.out.printf("%02d", month);
		System.out.print(".");
		System.out.printf("%02d", day);

	}

}
