package foreachEx;
/*
 	���� for��(foreach��) - �÷��ǿ����� ��� �����մϴ�.
 	for(A : B){		B�� �÷���(�迭, List, Set, Map)... ������ ����
 					A�� �÷��ǿ��� ��� �ϳ��� ������ �� �����ؾ��� �ӽ� ����
 					
 	}
 */
public class ForEachTest {

	public static void main(String[] args) {
		int []ar = {10,20,30};
		for (int a : ar) {
			System.out.println(a);
		}
		String []arName = {"�̼���","�ڹ���","ȫ�浿"};
		for (String a : arName) {
			System.out.println(a);
		}
	}

}
