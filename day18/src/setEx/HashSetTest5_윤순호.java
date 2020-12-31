package setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest5_����ȣ {
			//�ζ� �����
			//1~45����, 6���� �����͸� ����մϴ�.
			//�� ��, ������ ������ � �־����� ����� ���ϴ�.
			//������� 6�� ä�������� ����� ���ϴ�.
			//2. ���� 6�� ���
			//2-1. ���� �������� ����
	public static void main(String[] args) {

		int cnt = 0;	//Ƚ�� 
		Set <Integer> lotto = new HashSet<Integer>();	//�ζ� ��ȣ ����
		ArrayList<Integer> list = new ArrayList<Integer>();	//��ġ�� ���� ����
		
		//�ζ� ��ȣ�� 6�̹Ƿ�, 6�� �ݺ�����,
		//lotto��ȣ�� ��ĥ�� i--�ϸ� list�� ��ġ�� ���� ����
		for(int i = 0;i < 6; i++) {
			int rand =(int)(Math.random()*45)+1;
			if(lotto.add(rand)) {
				cnt++;
			}else {
				i--;
				cnt++;
				list.add(rand);
			}//end if
		}//end for(i)
		System.out.println("lotto ��ȣ : "+lotto);
		System.out.println("�� Ƚ�� : "+cnt+"��");
		if(cnt == 6) {
			System.out.println("��ġ�� ������ �����ϴ�.");
		}else {
			System.out.println("�ߺ� ����");
			for(int i = 0;i<45;i++) {
				int count = 0;													//�ݺ������ count�ʱ�ȭ
				for(int j = 0;j<list.size();j++) {
					if(i == list.get(j))  count++;								//�������̸� count 1����
				}//end for(j)
				if(count >= 1) System.out.println(i+" : "+ count + "��");		//count�� 1�̻��� ���� ���
			}//end for(i);
		}//end if
		System.out.print("�������� ���� : ");
		ArrayList tmp = new ArrayList(lotto);
		Collections.sort(tmp);
		System.out.println(tmp);
	}
}
