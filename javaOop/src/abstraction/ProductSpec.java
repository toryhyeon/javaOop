package abstraction;

public class ProductSpec implements Product{
	private String company;	// ������
	private String name; // ��ǰ��
	private String serialNo; // �Ϸù�ȣ
	
	public void setInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	@Override
	public void getInfo() {
		System.out.println("������ : " + this.company);
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("�Ϸù�ȣ : " + this.serialNo);
		
	}
	
}
/*
 * ��Ŭ���� ����Ű ����� ���� ��� (�⺻ ����Ű�ܿ� �߰� ��Ű��)
 * �޴��� > window > preference > general > key > copy line �Է� > CTRL + J
 * delete line �Է� > CTRL + D
 * line start �Է� > CTRL + B,  CTRL + E 
 */