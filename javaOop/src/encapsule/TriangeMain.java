package encapsule;

/*
 * @ Date	: 20150619
 * @ Author : �ֽ���
 * @ Story	: �ﰢ���� ������ ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class TriangeMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���̸� �Է� : ");
		double garo = scanner.nextDouble();
		System.out.println("���� ���̸� �Է� : ");
		double sero = scanner.nextDouble();
		
		/*
		 * double Ÿ���� �Ķ���� �� int Ÿ���� ����
		 * �Ҵ��ص� �ƹ� ������ �߻����� �ʴ� ����
		 * �ڹٳ��������� ���� Ÿ���� ū Ÿ�Կ� ���� �����ϱ�
		 * �����̴�. �ٸ� ���� �ս��� ���� �� ����.
		 */
		TriangleVO triangle = new TriangleVO(garo, sero);
		
		System.out.println("���� : " + triangle.getArea());
		
	}
}
