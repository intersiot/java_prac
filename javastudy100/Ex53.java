package javastudy100;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		// 최대값 찾기
		Scanner scan = new Scanner(System.in);
		System.out.println("입력:");
		int a = scan.nextInt();
		System.out.println("입력:");
		int b = scan.nextInt();
		double[] num = new double[4];
		double max = 0.0;
		
		num[0] = a + b;
		num[1] = a - b;
		num[2] = a * b;
		num[3] = a / b;
		
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.print("최대값" + (int)max);
	}

}
