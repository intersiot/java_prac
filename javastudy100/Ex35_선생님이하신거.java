package javastudy100;

import java.util.Scanner;

public class Ex35_선생님이하신거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n값은:");
		int n = scan.nextInt();
		
		// 어떤 합을 구하라는 요건이 나오면 sum을 항상 만들어줘야 함.
		int sum = 0; // 합이 저장되는 변수.
		for (int i = 0; i <= n; i++) { // 초기화; 조건; 증감;
			if (i % 2 == 0) { // 짝수일 때만,
				sum = sum + i;
				// sum = sum + 1(더할 값)
			}
		}
		System.out.println("n까지의 짝수의 합:" + sum);
	}

}
