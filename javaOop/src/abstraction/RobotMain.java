package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * ���������� : ���ڷ��̼� ����
		 * ���ڷ��̼� ����( ����ũ ���� �� ���鿡�ٰ� ���(��ũ��) ��� ����)
		 */
		BasicBot myBot = new BasicBot(); // 1. ��Ʋ�� �غ�
		GunBot myGun = new GunBot(myBot);
		ShieldBot myShield = new ShieldBot(myBot);
		
		myGun.status();
		myGun.chargeEnergy(50);
		myGun.status();
		myGun.shield(30);
		myGun.run();
		myGun.status();
		
		myShield.status();
		myShield.chargeEnergy(50);
		myShield.status();
		myShield.shield(30);
		myShield.status();
		myShield.run();
		myShield.status();
	}
}
