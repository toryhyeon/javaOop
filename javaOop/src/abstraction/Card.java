package abstraction;

public class Card {
	static final int WIDTH = 150; // ī���� ����
	static final int HEIGHT = 300; // ī���� ����
	/*
	 * ���� Ʈ������ 4���� ���̰� �ִµ�
	 * �� ���ӿ����� ��Ʈ���̸� ������ �÷��� �ϰڴ�.
	 */
	public static final String KIND = "��Ʈ";
	private int num;
	
	// ������ ����Ű : CTRL + SPACE
	public Card() {
		this.num = (int) ((Math.random() * 13) + 1);
		/*
		 * Math Ŭ������ ���а� ���õ� Ŭ����
		 * Math.random() �޼ҵ�� ���������� ���� ���ڸ�
		 * �߻���Ű�� ���� * 13�� ����Ʈ ��, + 1�� start ��
		 */
	}
	
	public int getNum() {
		return num;
	}
	
}
