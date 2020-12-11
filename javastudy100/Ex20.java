package javastudy100;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		int sum = x + y + z;
		int avg = sum / 3;
		
		System.out.println("Че: " + sum);
		System.out.println("ЦђБе: " + (float) avg);
		
	}

}
