package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		// ��ĳ�� ȣ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���.");
		int dan = scanner.nextInt(); // 0��� ��ĳ�� �Է°� �Ҵ�
		
		if(dan > 1){
			
			for (int i = 1; i < 10; i++){
				// ������ ��� �ϼ� �ٶ��ϴ�.
				System.out.println(dan + " * " + i + " = " + dan * i); // "" �� �ѷ��θ� ������� ���ͷ��� �ȴ�.
			}
			
		} else {
			System.out.println("1 �̻��� �������� �Է��ϼ���");
		}
	}
}
