package javastudy100;

import java.util.Scanner;

public class Ex19_선생님이하신거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�: ");
		int i = scan.nextInt();
		
		System.out.println(i);
		System.out.println( (char)i );
		
		// 유니코드 문자를 16진수로 표현
		String str = scan.next();
		char c = str.charAt(0);
		// "가"
		System.out.printf( "\\u%04x", (int)c );
	}

}
