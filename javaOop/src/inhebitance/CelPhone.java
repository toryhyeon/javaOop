package inhebitance;

public class CelPhone extends Phone {
	private boolean portable; // �޴뼺�� �ִ��� ������ ����
	private String move; // �޴뼺�� �ִٸ� ������ �ٴ� �� �ִ�.
	
	// ����Ʈ �����ڸ� ������ �ʰڴ�.
	
	// ALT + SHIFT + S �� �ϴ� ���� getter / setter ȣ��
	
	/*
	 * �ʵ忡 �ִ� �ν��Ͻ������� Ÿ���� boolean �� ���
	 * get... set... �� �ƴ϶�
	 * is... set... ���� �ڵ� �����ȴ�.
	 * �̰��� ������ boolean Ÿ���� ��츸 �ش�ȴ�.
	 */
	
	public boolean isPortable() {
		return portable;
	}
	
	public void setPortable(boolean portable) {
		if (portable) { // portable �϶��� true, !portable �϶��� false
			this.setMove("���� ������ �ٴ� �� �ֽ�");
		} else {
			this.setMove("���� ������ �ٴ� �� ����");
		}
	}
	
	public String getMove() {
		return move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	
}
