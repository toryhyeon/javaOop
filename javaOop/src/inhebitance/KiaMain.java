package inhebitance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("���");
		k5.setCarName("K5");
		System.out.println(
				k5.getCompanyName() + "\t" +
				k5.getCarName() + "\t" +
				Car.CAR
				// ���� ����� ���â�� �ߴ� ������
				// ���������� ũ�� ������ �ƴ�����(���α׷��� �ߴܵ� ������ �ƴ�����)
				// �׷��ٰ� �չ����� �ڵ� ��ĵ� �ƴϴ� ����� ������� �ڵ��ߴٶ�� �ǹ�
				// �ڹٰ����ڶ�� �̷� �������� �����ؾ� �մϴ�.
				// �� ��Ȳ�̶�� CAR �� Ŭ������������ �ν��Ͻ� ������ �ƴϱ⶧����
				// �ν��Ͻ��� ȣ������ ���� (K5...) Ŭ������ ȣ���ض�(Car.CAR) ��� ���̴�.
				);
	}
}
