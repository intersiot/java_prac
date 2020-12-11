package javastudy100;

import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		// 비만도 측정
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("정상");
		}
		if (bmi > 10 && bmi <= 20) {
			System.out.println("과체중");
		}
		if (bmi > 20) {
			System.out.println("비만");
		}

	}

}
