package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 * ����
		 * 
		 * === ȫ�浿�� 6�� �޿����� ===
		 * ���� : 300����
		 * ���� : 30����
		 * �Ǳ޿� : 270����
		 * === �������� 6�� �޿����� ===
		 * ���� : 400����
		 * ���� : 40����
		 * �Ǳ޿� : 360����
		 */
		
		PayVo hong = new PayVo(); // Ŭ������ ���� hong �̶�� ��ü ��������
		PayVo kang = new PayVo();
		Scanner scanner = new Scanner(System.in);
		
		
		/* �̸� �� �޿� �Է� */
		System.out.println("�̸��� �Է��ϼ���(ȫ�浿)");
		hong.setName(scanner.next());
		System.out.println(hong.getName() + "�� ������ �Է��ϼ���");
		hong.setSalary(scanner.nextInt());
		
		System.out.println("�̸��� �Է��ϼ���(������)");
		kang.setName(scanner.next());
		System.out.println(kang.getName() + "�� ������ �Է��ϼ���");
		kang.setSalary(scanner.nextInt());
		
		
		/* �Ǳ޿� ��� */
		hong.setIncome(hong.getSalary());
		kang.setIncome(kang.getSalary());
		
		
		/* ��� */
		System.out.println("=== " + hong.getName() + "�� 6�� �޿����� ===");
		System.out.println("���� : " + hong.getSalary() + "����");
		/*
		 * �ν��Ͻ�(��) ���� : �ν��Ͻ�(hong, kang) �� getter �� setter �� ȣ���ϴ� �ʵ尪
		 * Ŭ����(��) ���� : Ŭ������ ���� ȣ���ϴ� �ʵ尪
		 */
		System.out.println("���� : " + (int) (hong.getSalary() * PayVo.TAX) + "����");
		System.out.println("�Ǳ޿� : " + hong.getIncome() + "����");
		
		System.out.println("=== " + kang.getName() + "�� 6�� �޿����� ===");
		System.out.println("���� : " + kang.getSalary() + "����");
		System.out.println("���� : " + (int) (kang.getSalary() * PayVo.TAX) + "����");
		System.out.println("�Ǳ޿� : " + kang.getIncome() + "����");
		
		
		
	}
}
