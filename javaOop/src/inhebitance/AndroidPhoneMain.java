package inhebitance;

import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		
		AndroidPhone android = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ȭ�� ���� �Է� : ");
		String name = scanner.next();
		
		System.out.println("���� �޽��� �Է� : ");
		String msg = scanner.next();
		
		android.setData(name, msg);
		
		System.out.println(android.getData());
	}
}
