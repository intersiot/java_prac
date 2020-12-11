package javastudy100;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		String str = scan.nextLine();
		
		switch (str) {
		case "모":
			System.out.println("0 0 0 0");
			break;
		case "윷":
			System.out.println("1 1 1 1");
			break;
		case "걸":
			System.out.println("0 1 1 1");
			break;
		case "개":
			System.out.println("0 0 1 1");
			break;
		case "도":
			System.out.println("0 0 0 1");
			break;
		}
	}
}
