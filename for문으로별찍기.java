
public class for�����κ���� {

	public static void main(String[] args) {
		
		int i;	// ��
		int j;	// ��
		
		// �簢�� ���
		for ( i = 1; i <= 3; i++ ) { // 5��ŭ�� �� ����
			for ( j = 1; j <= 3; j++ ) { // �ٸ��� 5��ŭ �ݺ�����
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		System.out.println();
		
		// ���� ���� ���ﰢ�� ���
		for ( i = 1; i <= 3; i++ ) { // 5��ŭ�� �� ����
			for ( j = 1; j <= i; j++ ) { // ��(i)�� ������ŭ (ù��° ���̸�1, �ι�° ���̸�2 ...) �ݺ�
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		System.out.println();
		
		// ���� ���� �� ���ﰢ�� ���
		for ( i = 1; i <= 3; i++ ) { // 5��ŭ�� �� ����
			for ( j = 3; j >= i; j-- ) { // ��(i)�� ������ŭ �ݺ��ϴµ� �ݴ�� �Ǿߵ�.
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		System.out.println();
		
		// ������ ���� ���ﰢ�� ���
		for ( i = 1; i <= 3; i++ ) {
			for ( j = 3; j > 0; j-- ) {
				if ( j > i ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
