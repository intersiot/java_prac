package javastudy100;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		int num = scan.nextInt();
		
		switch (num) {
			
			case 1:
			case 2:
			case 12:
				System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Fall");
				break;
			
		}

	}

}
