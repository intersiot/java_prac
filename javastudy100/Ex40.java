package javastudy100;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		
		float f = scan.nextFloat();
		
		if (f >= 50 && f <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}

	}

}
