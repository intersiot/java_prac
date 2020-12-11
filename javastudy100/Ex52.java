package javastudy100;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		// 영어 서순 표현하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		
		int i = scan.nextInt();
		
		if (i % 10 == 1) {
			System.out.println(i + "st");
		} else if (i % 10 == 2) {
			System.out.println(i + "nd");
		} else if (i % 10 == 3) {
			System.out.println(i + "rd");
		} else {
			System.out.println(i + "th");
		}
		
		
	}

}
