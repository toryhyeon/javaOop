package inhebitance;

public class HyundaiCarMain {
	public static void main(String[] args) {
		HyundaiCar sonata = new HyundaiCar();
		sonata.setCompanyName("����");
		sonata.setBrand("�ҳ�Ÿ");
		System.out.println(
				sonata.getCompanyName() + "\t" +
				sonata.getBrand() + "\t" +
				Car.CAR
				);
	}
}
