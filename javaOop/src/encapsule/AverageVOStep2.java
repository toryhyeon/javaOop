package encapsule;

public class AverageVOStep2 {
	/*
	 * Ŭ���� �ٷ� �ؿ� (�������� �ʵ�) �����
	 * ������ �ν��Ͻ� ������ �ϸ�
	 * �� �ν��Ͻ� ������ �ʱ�ȭ�� �ص� �ǰ�
	 * ���ص� �Ǵµ�... �������� ����ϱ�
	 * ������ ��κ� �ʱ�ȭ�� ���� �ʴ´�.
	 * �׸��� ���� �ʾƵ� ������ ������
	 * �߻����� �ʴ´�.
	 */
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	/* �հ踦 ���ϴ� ����� main() ���� �����ͼ� �����. */
	public int calcTot(int kor, int eng){
		// �̶� tot �� �������� �̴�. ������  �ʱ�ȭ ���� �Է��ؾ���
		// �ּ� ����Ű : CTRL + SHIFT + /
		/*int tot = 0;
		tot = kor + eng;
		return tot;*/
		return kor + eng;
	}
	
	/* ����� ���ϴ� ����� main() ���� �����ͼ� �����. */
	public double calcAvg(int tot){
		return tot / 2;
	}
}
