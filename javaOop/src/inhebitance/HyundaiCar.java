package inhebitance;

/*
 * @ Date	: 20150622
 * @ Author	: �ֽ���
 * @ Story	: Car ������ ���� ����� �ǹ�
 * 		- Ű���� extends �� ����ϸ�
 * 		- �� Ŭ���� ���̿� �θ� �ڽİ��谡 �����ϴ�.
 * 		- ��Ӱ��谡 �����Ǹ� �ڽ� ũ������
 * 		- �θ�Ŭ������ ��� �ν��Ͻ������� �޼ҵ带 ��밡���ϰ� �ȴ�.
 * 		- �ٸ� �θ�Ŭ������ �ν��Ͻ� ������ private �̸�
 * 		- getter / setter �� ����ϴµ� �� �� �θ��� �޼ҵ��
 * 		- super ��� Ű���带 ���� �����´�.
 */

public class HyundaiCar extends Car{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
