package javastudy100;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean str = scan.nextBoolean();
		
		if (str == true) {
			System.out.println(false);
		} else if (str != true) {
			System.out.println(true);
		}
	}

}
