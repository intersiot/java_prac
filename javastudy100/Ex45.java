package javastudy100;

import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		// 이차방정식의 해 구하기
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		double x1, x2;
		double d;
		
		System.out.println("a입력: ");
		a = scan.nextInt();
		System.out.println("b입력: ");
		b = scan.nextInt();
		System.out.println("c입력: ");
		c = scan.nextInt();
		
		d = b * b - 4 * a * c;
		
		if (d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2.0 * a);
			x2 = (-b - Math.sqrt(d)) / (2.0 * a);
			
			System.out.println("결과: " + x1 + "," + x2);
			System.out.println("결과: " + (x1 - x2));
		} else if (d == 0) {
			x1 = -b / (2.0 * a);
			System.out.println("결과: " + x1);
			System.out.println("결과: (" + x1 + ", 0.0)" );
		} else {
			x1 = (-b / (2.0 * a));
			System.out.println("결과: " + x1);
			System.out.println("결과: (" + x1 + ", " + (a * x1 * x1 + b * x1 + c) + ")");
		}
	}
}
