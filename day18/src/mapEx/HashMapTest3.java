package mapEx;

import java.util.HashMap;
import java.util.Scanner;

/*
	HashMap<Ű, ���>
		Ű, ���
		put(Ű,���)
		get(Ű)
		
 */
public class HashMapTest3 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		//		   id	   pw
		map.put("�̼���", "100");
		map.put("������", "120");
		map.put("������", "130");
		map.put("�ڹ���", "140");
		System.out.println(map);
		//�������� pw�� 133���� �����ϰ��� �մϴ�.
		map.put("������", "133");
		System.out.println(map);
		
		//id, pw�Է¹޾Ƽ� put���� ���ϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : "); String id = sc.nextLine().trim(); 
		System.out.print("pw : "); String pw = sc.nextLine().trim();
		map.put(id, pw);
		System.out.println(map);
		
	}

}
