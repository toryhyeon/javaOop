package encapsule;

import java.util.Scanner;

/*
 * @ Date	: 20150618
 * @ Author : �ֽ���
 * @ Story	: �簢���� ������ ���ϴ� ���α׷�
 */

public class RectangleMain1 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();
		
		System.out.println("���α��̸� �Է��ϼ���");
		rectangle.setWidth(scanner.nextInt());
		System.out.println("���α��̸� �Է��ϼ���");
		// ������ ��������(���ú���)�� �������� �ʴ� ������
		// �ν��Ͻ��� ���� �ν��Ͻ������� �̿��ϱ� �����̴�.
		rectangle.setHeight(scanner.nextInt());
		rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("�簢���� ���� : " + rectangle.getArea());
		
	}
}
