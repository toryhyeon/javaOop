package inhebitance;

public class AndroidPhone extends Iphone{
	
	public static final String BRAND = "�ȵ���̵�";
	private String data;
	
	// ����Ʈ �����ڸ� ������
		
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" +
				super.getCall() + "\t" +
				data + " : īī���� ����";
	}

	@Override
	public String getData() {
		return data;
	}
}
