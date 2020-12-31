package scanEx;

import java.util.EnumSet;

public class Practice {

	public static void main(String[] args) {
		System.out.println("=== �츮 �������� �ִ� ������ �� ===");
		EnumSet<BIRD> birds = EnumSet.allOf(BIRD.class);
		for(BIRD bird : birds) {
			System.out.printf("%s, %d ����\n",bird.getName(),bird.getCount());
		}
	}
}
enum BIRD {
	SPARROW("����",33), PARROT("�޹���",27), EAGLE("������",2), FALCON("��",8);
	
	private final String name;	//�̸�
	private final int count;	//������
	private BIRD(String name, int count) {
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
}