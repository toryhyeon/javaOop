package abstraction;

public class OrangeImpl implements FruitInterface{
	// ������ �޼ҵ�
	@Override
	public void display(String str) {
		System.out.println(str + " ������ �Դϴ�.");
		
	}
	/*
	 * ����ü�̽��� ���ǵ� �߻�Ŭ������ �ƴ�
	 * ������ Ŭ�������� �߰��� �޼ҵ带 �� �������.
	 */
	public int getCount(){
		return 100;
	}
}
