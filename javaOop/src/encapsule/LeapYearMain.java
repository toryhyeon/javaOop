package encapsule;

/*
 * @ Date	: 20150616
 * @ Author : �ֽ���
 * @ Story	: main() �� �ܼ�â�� �Է°� ����� ����� ����Ѵ�.
 * 			  ���� Scanner �� main() �� ���ӵǾ�� �Ѵ�.
 */
import java.util.Scanner;

public class LeapYearMain {
	
	
	public static void main(String[] args) {
		
		LeapYearVO leapYearMain = new LeapYearVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �ƴ����� �Ǻ��� �⵵�� �Է�");
		int year = scanner.nextInt();
		
		/* Scanner �� Ŭ���� �̸�
		 * scanner �� �ν��Ͻ� ���� �̸� ==> ��ü��
		 * new �� ������ Ű����
		 * Scanner() �� ������
		 * System.in �� �Ķ����(�Ű�����)
		*/
		
		/*
		 * Ŭ���� �̸��� �ݵ�� ������ ����ִ� Ŭ���� �̸��� ��ġ�ؾ� �ϰ�,
		 * ��ü(�ν��Ͻ� ����)�� Ŭ���� �̸��� ������ ��� �ȴ�.
		 * �ٸ�, �޼ҵ带 ȣ���� ��� ����� �ν��Ͻ� ��������� ��ġ�ؾ� �Ѵ�.
		 */
		
		String msg = leapYearMain.getLeapYear(year); // �Ķ���ͷ� ���� �����Ѵ�.
		System.out.println(msg);
	}
}
