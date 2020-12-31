package mapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
	HashMap<Ű, ���>
		Ű, ���
		put(Ű,���)
		get(Ű)

 */
public class HashMapTest3_1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		//		   id	   pw
		map.put("�̼���", "100");
		map.put("������", "120");
		map.put("������", "130");
		map.put("�ڹ���", "140");
		System.out.println(map);

		//�α��� ó��
		//1. Ű�� ���̵� 
		//2. �Է��� ���̵� map�� �ִ��� �˻�
		//2-1. ���̵� ������ �ٽ� �Է�
		//2-2. ���̵� ������ 3
		//3. ��й�ȣ�� map�� �ִ� value�� ������ �˻�
		//4. �α��� �Ǿ����ϴ�.
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("id : "); String id = sc.nextLine().trim(); 
			System.out.print("pw : "); String pw = sc.nextLine().trim();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					break;
				}
			}
			System.out.println("�ٽ��Է�");
		}
	}

}
