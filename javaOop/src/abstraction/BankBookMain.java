package abstraction;

import java.util.Scanner;

public class BankBookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accontNo = (int) ((Math.random()*999999)+111110);
		// 6�ڸ� ������ ���� ���� �߻�
		
		// valueOf() �� �ڹ�API �� �ִ� java.lang.String Ŭ������
		// �޼ҵ�� �������� ���ڿ��� �ٲ��ִ� ������ �Ѵ�.
		String strAccountNo = String.valueOf(accontNo);
		System.out.println("������ �̸� : ");
		String name = scanner.nextLine();
		System.out.println("��й�ȣ : ");
		String pass = scanner.nextLine();
		System.out.println("���ݾ� : ");
		int inputMoney = scanner.nextInt();
		/*
		 * ��ü(�ν��Ͻ�)�� ������ �� ���� ~~~ ���� �ؾ� �� ��.
		 * ��ü�� �����ϴ� Ŭ������ �������̽��� ������ ���� �ƴ϶��
		 * �׷��� ������ Ÿ������ ����ص� �ǳ�,
		 * �������̽��� ������ Ŭ�������
		 * �������̽� Ÿ�� + �ν��Ͻ� = new Ŭ����������() ��
		 * ��ü�� �����Ѵ�. �ڡڡڡڡ�
		 */
		Account hong = new BankBook(strAccountNo, name, pass, inputMoney);
		System.out.println(hong.toString());
		System.out.println("�Աݾ� : ");
		int depositMoney = scanner.nextInt();
		hong.deposit(depositMoney); // �Ķ���͸� ������
		System.out.println(hong.toString());
		System.out.println("��ݾ� : ");
		int withdrawMoney = scanner.nextInt();
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
	}
}
