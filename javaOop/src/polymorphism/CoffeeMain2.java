package polymorphism;

import java.util.Scanner;

/*
 * @ Date	: 20150619
 * @ Author : �ֽ���
 * @ Story	: Ŀ�� ��üŬ������ ���� ������
 * 			�ڡڡ� �����ε��� ���� �غ��� ����Ŭ����
 * 			�����ε� = ������(polymorghism)
 */

public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		
		System.out.println(vendingMachine.getMsg());
		System.out.println("�Ǹ��ڴ� Ŀ�� ���� ������ ������ �ּ��� ");
		
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
	}
}
