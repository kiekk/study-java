package genericEx;

import java.util.ArrayList;

/*
 	���ʸ�
	�÷���Ŭ����<���ʸ�> ��ü = �ν��Ͻ�();
	ArrayList<String> list = new ArrayList<String>();
	
	�÷��� ��ü�� ���� ��, ���� ����ؼ� �̸� add() �� ���� Ÿ���� 
	������ �� �ֽ��ϴ�.
 */
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		int num = 1234;
		list.add("�ȳ�");
		list.add("�ڹ���");
		list.add("ȫ�浿");
//		list.add(num+"");				//�� �����ʹ� add��ų �� �����ϴ�. Ÿ���� �ٸ��Ƿ�
		list.add(String.valueOf(num));	//����� ����ȯ
		list.add("�ȳ�");
	}

}
