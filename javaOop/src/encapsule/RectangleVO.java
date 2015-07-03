package encapsule;

public class RectangleVO {
	
	// ������ Ÿ���� ���� ����� �ݺ��Ǵ� Ÿ���� ��������
	private int width, height, area;
	
	// ������ �ڵ��ϼ� ����Ű
	// �Ѵ��մϴ�. �ʵ� ���� ���� ���� CTRL + space
	
	public RectangleVO() {
		// �̰��� ����Ʈ �����ڶ�� �ϸ� �Ķ���Ͱ� ���� ���� Ư¡
		// �̰��� ������ �ʴ´� �ϴ���, ���������δ�
		// �ϼ��Ǿ� �ִ�. ���� ��� ���� �ϼ̴� PayVO ����
		// ���������δ� �Ķ���� ���� �����ڰ� ������� �ִ�.
		// ���� �̰��� ȣ��(call)�� ������ �����ڸ� ������ ����
		// ����Ϸ��� �ϴµ�, �̰��� ������ �����ε��̶�� �Ѵ�.
		// �����ε��� ���� �ϴ� ������
		this(0,0);
	}

	public RectangleVO(int width, int height) {
		this.area = width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int width, int height) {
		this.area = width * height;
	}
	
	
	
}
