package javastudy100;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(a < b ? (a < c ? a : c) : (b < c ? b : c));
	}

}
