package javastudy100;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		int year = scanner.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int month = scanner.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int day = scanner.nextInt();
		
		System.out.printf("%02d", year);
		System.out.print(".");
		System.out.printf("%02d", month);
		System.out.print(".");
		System.out.printf("%02d", day);

	}

}
