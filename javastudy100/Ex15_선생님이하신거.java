package javastudy100;

import java.util.Scanner;

public class Ex15_선생님이하신거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년 입력: ");
		int year = scan.nextInt();
		System.out.println("월 입력: ");
		int month = scan.nextInt();
		System.out.println("일 입력: ");
		int day = scan.nextInt();
		
		String outStr = String.format("%04d.%02d.%02d", year, month, day);
		System.out.println("결과: " + outStr);
		
		// ���˹��� ����
		// %d : ��������
		// %f : �Ǽ�
		// %s : ���ڿ�
		// %c : ���� �ϳ�
		// %e : �������� - ������ (ex. 1000 -> 1.0e+3), ���� ������ Ŭ �� ǥ��
		// %x : 16����
		// %o : 8����
		// %% : %(Ư������ %)���� ǥ��
		
		// ���˹��� �ȿ��� �ڸ��� ǥ��
		float f = 12.345f;
		
		// ��°��: 12.345000
		System.out.printf("%f \n", f); // \n : �ٹٲ� ����
		
		// ��°��: 12.345
		// �Ҽ��� ������ �ڸ����� �����ϰ� �ʹٸ�: %.n
		System.out.printf("%.3f \n", f);
		
		// ��°��: ___12.345 ����ٴ� ����
		// %9.3f���� 9�� ��ü�ڸ�����.
		System.out.printf("%9.3f \n", f);
		
		// ��°��: 00012.345
		// ��ü�ڸ��� �տ� 0�� �־��ָ� ������ 0���� �ٲ��ش�.
		System.out.printf("%09.3f \n", f);
		
		// ��°��: 12.34
		System.out.printf("%.2f \n", f);
		
		// ��°��: 12.34___
		// - ���� ����, 8 ��ü�ڸ���
		System.out.printf("%-8.2f___", f);
	}

}
