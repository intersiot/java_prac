package javastudy100;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");		
		
		while (true) {
			
			int num = scan.nextInt();
			
			if (num > 0) {
				System.out.println(num);
			} else if (num == 0) {
				System.out.println(num);
				return;
			}
			
		}

	}

}
