package javastudy100;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		// 만능휴지통 문제
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		int i = scan.nextInt();
		System.out.println(i);
		int j = i / 10;
		System.out.println(j);
		int h = j % 10;
		System.out.println(h);
		int result = ((h * 10) * 2);
		System.out.println(result);
	}

}
