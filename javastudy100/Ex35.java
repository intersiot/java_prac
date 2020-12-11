package javastudy100;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력:");
		int num = scan.nextInt();
		
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
