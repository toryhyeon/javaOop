package part1.array;

public class ForLoopAssign {
	public static void main(String[] args) {
		/*
		 * 1���� 10������ ��.
		 */
		int[] intArr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++){
			/*
			 * �Ʒ� �κ� 0 ��� ���� �־��
			 * for �� �ε��� ���� Ȱ���� ���� ���� ���� �� �ֳ���?
			 */
			intArr[i] = i + 1; // ���� ������ �ּ�ȭ �Ϸ��� ����� ��ȯ
			sum += intArr[i];
		}
		System.out.println(sum);
	}
}
