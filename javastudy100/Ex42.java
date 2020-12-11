package javastudy100;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		
		int ball = scan.nextInt();
		// 50~70, 6의 배수 - win
		if ((ball >= 50 && ball <= 70) || (ball % 6 == 0)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
