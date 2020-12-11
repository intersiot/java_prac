package javastudy100;

import java.util.Scanner;

public class Ex13_선생님이하신거 {

	public static void main(String[] args) {
		// �Ǽ�(float) �� ���� �Է¹޾�
		// �Ҽ��� ���� 3°�ڸ����� �ݿø��Ͽ�
		// 2°�ڸ����� ���
		Scanner scan = new Scanner(System.in);
		// Scanner���� �Է¹޴� ����
		// String: nextLine()
		// Int: nextInt()
		// Float: nextFloat()
		
		// scan.nextLine(): ���ڿ� �Է�
		// scan.next(): ���ڿ� �Է�(�ٹٲ� �ȵ�), ���ӵ� �Է½� ����
		System.out.println("�Ǽ��Է�: ");
		float f = scan.nextFloat();
		// �ݿø�: 5�� �������� 0, 1, 2, 3, 4 ����.
		// 		   5�����Ͽ� �̻��̸� 5, 6, 7, 8, 9 ���ڸ����� �ø�.
		// 12.344f => 12.34f
		// 12.345f => 12.35f
		// 12.346f => 12.35f
		System.out.println("f��: " + f);
		
		// � �Ǽ� + 0.005f => �Ҽ��� 3°�ڸ��� ����.
		f = f + 0.005f;
		System.out.println("f��: " + f);
		
		// ������ �Ϸ���, (int)����ȯ �ϸ� �Ҽ����� �����.
		// (int)12.345f => 12
		float k = (int) (f * 100.0) / (float)100.0f;
		System.out.println("f��: " + f);	
	}

}
