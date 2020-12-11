package javastudy100;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		int ball = scan.nextInt();
		
		if ( (ball >= 30 && ball <= 40) || (ball >= 60 && ball <= 70 ) ) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}

	}

}
