package javastudy100;

import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		// c < a + b = 삼각형 성립
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a입력:");
		int a = scan.nextInt();
		System.out.println("b입력:");
		int b = scan.nextInt();
		System.out.println("c입력:");
		int c = scan.nextInt();
		
		if (c < ( a+b )) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
