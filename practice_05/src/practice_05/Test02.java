package practice_05;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public int solution(int page, int[] broken){
		//������ ��ư �迭
		int[] button = {1,2,3,4,5,6,7,8,9,0};
		//������ �ϴ� Ƚ��
		int count = 0;
		//�������� 100�̶�� �ƹ��͵� ������ �ʾƵ� �˴ϴ�.
		if(page == 100) return count;
		String str_page = page + "";
		//���峪�� ���� ��ư�� ���� �迭
		List<Integer> unbroken_button = new ArrayList<Integer>();
		for(int i=0;i<button.length;i++) {
			for(int j=0;j<broken.length;j++) {
				if(!(button[i] == broken[j])) unbroken_button.add(button[i]);
			}
		}
		//������ page ��ȣ�� ���� �� �ִ� ��ư�� �ִٸ� �ش� ��ư�� ������, �׷��� �ʴٸ�
		//������ �ִ� ��ư �� �������ϴ� ��ȣ�� �ּҰ��� ��ư�� ã�� �Է��մϴ�.
		//ex) ���峭 ��ư 5, ���峭 ��ư���� �ּҰ��� 3,6�� ã�Ƽ� �Է��մϴ�.(abs�� �̿��� ���밪���� ã���ϴ�)
		for(int i=0;i<str_page.length();i++) {
			for(int j=0;j<broken.length;j++) {
				int number = Integer.parseInt(str_page.charAt(i)+"");
				if(number == broken[j]) {
					
				}
				count++;
			}
		}
		
        return count;
    }
	
	public static void main(String[] args) {
		Test02 test = new Test02();
		int page = 5457;
		int[] broken = {6,7,8};
		int result = test.solution(page, broken);
	}
}
