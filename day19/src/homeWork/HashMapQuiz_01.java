package homeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 	�ܾ� ���߱� 1
 	����    ����
 	���� -> �ѱ�
 	�ѱ� -> ����
 ex)apple -> ���
   rabbit -> �䳢
    ��� -> carrot
   ��ǻ�� -> computer
 */
public class HashMapQuiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mun = {"apple","rabbit","computer","���","��ǻ��","�����","������","dog","cat"};
		String[] dap = {"���","�䳢","��ǻ��","carrot","computer","cat","dog","������","�����"};
		HashMap<String,String> quiz = new HashMap<>();
		int i = 1,totalScore = 0,plusScore = 10, cnt = 0;
		String ans = "";
		for(int j = 0;j<mun.length;j++) {
			quiz.put(mun[j], dap[j]);
		}
		Set<Entry<String,String>> set = quiz.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> tmp = itr.next();
			System.out.println(i+"�� ����  : "+tmp.getKey());
			System.out.print("������ �Է��� �ּ��� : ");ans = sc.next();
			if(tmp.getValue().equals(ans)) {
				System.out.println("�����Դϴ�."+plusScore+"�� ȹ���ϼ̽��ϴ�.");
				totalScore += plusScore;
				cnt++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ : "+tmp.getValue()+"�Դϴ�.");
			}
			i++;
		}
		System.out.println("��� : �� "+quiz.size()+"���� �� "+cnt+"������ ���߼̽��ϴ�.");
		System.out.println("�� ���� : "+totalScore+"�� �Դϴ�.");
	}
}
