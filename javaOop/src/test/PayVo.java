package test;

public class PayVo {
	/*
	 * �ʵ忡 ����� �ν��Ͻ� ������ �ݵ��
	 * ���������ڵ� �� private ���� �����Ͽ�
	 * ����ȭ�� ������ �Ѵ�.
	 * �׷��� ������ getter, setter �� �� ������ ����.
	 */
	private String name; // �����̸�
	private int salary; // �޿�
	/*
	 * ������ ���ѹα� �����̶�� ������ �˾ƾ� �� ����.
	 * ���� �����Ǿ�� �ϴ� �ʵ尪��.
	 * �̷� ���� ������ �Ǿ�� �ϹǷ� ����� ó���ϸ�
	 * static �̶�� Ŭ�������� Ű���带 �ٿ��� �������ش�.
	 * �׸��� �������� ������ ���α׷��ֿ����� �̷� ������
	 * ���� �빮�ڷ� ǥ���ؼ� ������ �ش�.
	 * setter, getter �� ����� �ȵȴ�. �ֳ��ϸ� �������̱� �����̴�.
	 */
	public static final double TAX = 0.1; // ���� 10%�� ������
	private int income; // �Ǳ޿� = �޿� - ����(�޿� * ����)
	
	// getter setter ����Ű : ALT + SHIFT + S
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int salary) {
		this.income = (int) (salary - (salary * TAX));
	}
	
	
}
