package javastudy100;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.printf("%d %d\n", i, j);
			}
		}
	}

}
