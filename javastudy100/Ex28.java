package javastudy100;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�� ��: ");
		int a = scan.nextInt();
		System.out.print("b�� ��: ");
		int b = scan.nextInt();
		System.out.print("c�� ��: ");
		int c = scan.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a);
		}
		if (b % 2 == 0) {
			System.out.println(b);
		}
		if (c % 2 == 0) {
			System.out.println(c);
		}

	}

}
