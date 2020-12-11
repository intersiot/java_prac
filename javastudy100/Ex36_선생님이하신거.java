package javastudy100;

import java.util.Scanner;

public class Ex36_선생님이하신거 {

	public static void main(String[] args) {
		// 주사위 2개 던졌을 때 경우의 수
		// 예)	n: 2, m: 3
		// 		n: 1, m: 1
		//		n: 1, m: 2
		//		n: 1, m: 3
		//		n: 2, m: 1
		//		n: 2, m: 2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n값은:");
		int n = scan.nextInt();
		System.out.println("m값은:");
		int m = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + "," + j);
			}
		}
	}

}
