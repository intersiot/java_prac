package javastudy100;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.printf("%2.1f", (float)(x * y) / 2 );		
	}

}
