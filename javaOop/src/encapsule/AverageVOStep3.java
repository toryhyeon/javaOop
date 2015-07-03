package encapsule;

/*
 * @ Date	: 20150618
 * @ Author : �ֽ���
 * @ Story	: ����ȭ�� ���� ����.
 * 		����ȭ�� ���忡 �ִ� �����Ͱ��� �ƹ��� �������� ���ϰ��ϰ�
 * 		getter �� setter �� ���� ����(�۹̼�)�� ȹ���� ��ü��
 * 		�����Ϳ� �����ϵ��� �ϴ� �����̴�.
 */
/*
 * ���������� private
 * - ���ȼ��� ����. ������Ʈ�� �������� �����
 * - ���۳�Ʈ�� ������ �ּ�ȭ�Ͽ� �������� ������ ������
 * - ������ ����
 */

public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot; // �ʵ忡 �ִ� �ν��Ͻ� ����
	private double avg;
	/*
	 * �żҵ���� �����ϴ� ������ ���� �ִ� �ʵ念����
	 * �����ؼ� �ʿ��� ����� �ϵ��� �� ���� ������,
	 * ���ȿ� ����� ���� ������ �߻��߽��ϴ�.
	 * ���� ���̳ĸ�... �ʵ忡 �ִ� ������ ������ �����ؼ�
	 * �б�� ����(�����ͼ���)�� �����ؼ��� �ȵ˴ϴ�.
	 * readOnly ��� ����� �����е��� ���� ��� �����
	 * �� ���� �ֵ�, ���� �� ���̶�� ������ �� �� ���� ���Դϴ�.
	 * ���������� ȣũ�� ���������� ��ũ�� �����Ͽ� �ٲ� �� �ִ� ����
	 * step2 �� �������̾����ϴ�.
	 * ���� ����� �ٽ� �и��Ͽ� �б�� ���� ������� �����ϴ�.
	 * �̶� �б⸦ get~() ��� �ϰ� ���⸦ set~() ��� �մϴ�. ===> !!!! ���� �߿� : ����ȭ(ĸ��ȭ) �Դϴ�.
	 * ��Ŭ���������� �ʵ尪�� ���� �޼ҵ� �̸� �ִ� ���� �ڵ�ȭ �߽��ϴ�.
	 * getter(�б���)�� setter(������)�� �޼ҵ带 �ڵ����� ������ �ݴϴ�.
	 * ����Ű�� ALT + SHIFT + s ����
	 * generate getter and setter �� �����Ͻø� �˴ϴ�.
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
		/*
		 * �ڵ����� ��Ŭ������ ���ؼ� �޼ҵ��
		 * ����Ÿ��, �Ķ���͸� ������Ű�� ��
		 * ������ �ʿ信 ���� �ణ����
		 * �����ϴ� �̼������� ���� �ڵ��� �ϼ��Ͻø� �˴ϴ�.
		 */
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int tot) {
		this.avg = tot / 2;
	}
	
	
}
