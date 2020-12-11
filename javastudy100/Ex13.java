package javastudy100;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요: ");
		
		float f = scanner.nextFloat();
		System.out.printf("%.3f", f);
		
//		System.out.println("실수를 입력하세요: ");
		double d = scanner.nextDouble();
//		System.out.printf("%.2f", d);

	}

}
