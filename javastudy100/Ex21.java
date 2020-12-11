package javastudy100;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("b의 값을 입력하세요: ");
		int b = scan.nextInt();
		
		if (a >= 0) {
			if (b <= 10) {
				b = (int) Math.pow(2, b);
			}
			System.out.println("결과: " + (a * b));
		}

	}

}
