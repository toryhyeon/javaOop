package inhebitance;

/*
 * @ Date	: 20150622
 * @ Author	: �ֽ���
 * @ Story	: 
 */

public class Car {
	/*
	 * static �� Car.CAR �� ȣ�� �����ϰ� �� Ŭ���������� ����� Ű����
	 * final �� "�ڵ���" �� �ٲ� �� ������ �ϴ� ��� Ű����
	 */
	public static final String CAR = "�ڵ���";
	private String companyName; // �����⶧���� �� �Ҵ��� ���� ����
	
	public Car() {} // �Ķ���Ͱ� ���� �����ڴ� �̷��� �Ϻη� ������ �ʾƵ�
	// Ķ���� ���ο� �ִ� ������ �ڵ� �����ȴ�.
	// ���� ��ó�� ������ �δ� ���� �ϳ������� ��(?) �̴�.

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
