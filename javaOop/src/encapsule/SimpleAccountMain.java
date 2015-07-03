package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		/*
		 * ��ü������� ���� ��ɿ� ���� ����� ���ȭ�� ��Ų ��
		 * ���뼺�� ���̱� ���� ���� ����Դϴ�.
		 * ������ ������¸� �𵨷� �� �����Դϴ�.
		 * Ŭ���� �ΰ��� �����ϼ���
		 * 1. SimpleAccountVo.java
		 * 2. SimpleAccountMain.java
		 * 
		 * 2�� Ŭ������ �ִ� �޼ҵ�� ������ �����ϴ�.
		 * plublic String name(String name){
		 * 		return name;
		 * }
		 * plublic int jango(int money){
		 * 		int jango = money + 100;
		 * 		return jango;
		 * }
		 */
		// ��ĳ�ʷ� �̸�(name) �� �Աݾ�(money)�� �Է¹޽��ϴ�.
		// ��ĳ�ʿ� System.out.println() �� �ݵ�� main() �� �־�� �մϴ�.
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		Scanner scanner = new Scanner(System.in);
		/*
		 * Scanner �� Ŭ����, scanner �� �ν��Ͻ�(��ü) ��� �θ��ϴ�.
		 */
		System.out.println("�̸��� �Է��ϼ���");
		String inputName = scanner.next(); // ���ڿ��� �Է¹��� ���� next() �����
		System.out.println("�Աݾ��� �Է��ϼ���");
		int inputMoney = scanner.nextInt(); // ���ڰ��� �Է¹��� ���� nextInt() �����
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(inputMoney);
		
		System.out.println(name + "�� " + inputMoney + "���� �ԱݵǾ����ϴ�. " + "�ܰ�� "+jango+"���� �Դϴ�.");
	}
}
