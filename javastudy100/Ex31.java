package javastudy100;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 40) {
			System.out.println("C");
		} else if (score >= 0) {
			System.out.println("D");
		}

	}

}
