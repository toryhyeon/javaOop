package lang;

import java.util.StringTokenizer;


public class StringTokenizerDemo {
	public static void main(String[] args) {
		/*
		 * ���ڿ��� �����µ� �־ �����ڰ� �������� �ʰ�
		 * ������
		 */
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreTokens()) {
			String token = (String) tok.nextElement();
			System.out.print("\t" + token);
		}
	}
}