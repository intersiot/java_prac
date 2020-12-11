package javastudy100;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		char input = scan.next().charAt(1);

		switch (input) {
			case 'A':
				System.out.println("Best!!!");
				break;
			case 'B':
				System.out.println("Good!!");
				break;
			case 'C':
				System.out.println("Run!");
				break;
			case 'D':
				System.out.println("Slowly~");
				break;
			default:
				System.out.println("What?");
		}
	}

}
