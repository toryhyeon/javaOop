package abstraction;

public abstract class CardGameRule {
	private String result; // ī�� ����� ������

	// ������ ����
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public abstract void play(Card card1, Card card2);
	// �޼ҵ忡 abstract �� ���̸�
	// Ŭ�������� abstract �� �ؾ�� �ϸ�
	// �� Ŭ������ �߻�Ŭ������� �Ѵ�.
	// �׸��� abstract �� ���� �޼ҵ带 �߻�޼ҵ��� �ϳ�.
	// �߻�޼ҵ�� �ٵ� ����.
}
