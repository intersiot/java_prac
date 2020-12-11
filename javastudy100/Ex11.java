package javastudy100;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력: ");
		String strX = scanner.nextLine();
		System.out.print("입력: ");
		String strY = scanner.nextLine();
		
		System.out.println(strY + " " + strX);
		
		String strVar = JOptionPane.showInputDialog("입력: "); // HELLO
		String strVar2 = JOptionPane.showInputDialog("입력: "); // JAVA

		System.out.println(strVar2 + " " + strVar);
		
	}

}
