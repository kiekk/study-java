package homeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
/*
 	����, ���� QuizGame�̶�� Ŭ���� ���� �ν��Ͻ������� ����
 	Map�� value�� QuizGameŬ������ ����
 	Map�� key�� for���� �̿��ؼ� �ڵ����� �Ҵ�
 	������ �����ϴµ�, �ݺ����� �̿���  str�� �����ŭ ����
 	������ ��µǴ� �������� �ߺ��Ǹ� �ȵǱ⿡ Set�÷��ǿ� ������ �����Ͽ� �ߺ��ȵǰ� ��
 */
class QuizGame {
	private String mun;
	private String dap;
	public QuizGame(String mun, String dap) {
		this.mun = mun;
		this.dap = dap;
	}
	public QuizGame() {}
	//���� ����
	void playQuiz() {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int totalScore = 0,plusScore = 10, cnt = 0;
		String[] mun = {"apple","rabbit","computer","���","��ǻ��","�����","������","dog","cat"};
		String[] dap = {"���","�䳢","��ǻ��","carrot","computer","cat","dog","������","�����"};
		Map<Integer,QuizGame> str = new HashMap<>();	//Ű,����,�� ����
		Set<Integer> set = new HashSet<>();				//���� ����
		//�ݺ��� �̿�, Ű,����,�� ����
		for(int i = 0;i<mun.length;i++) {
			QuizGame quiz = new QuizGame(mun[i],dap[i]);
			str.put(i, quiz);
		}
		for(int i = 0;i<str.size();i++) {
			int rand = (int)(Math.random()*str.size());
			if(set.add(rand)) {
				System.out.println((i+1)+"�� ����  : "+str.get(rand).mun);	
				System.out.print("���� �Է��� �ּ���(�ѱ�->����,����->�ѱ�) : "); ans = sc.next();
				if(str.get(rand).dap.equals(ans)) {
					System.out.println("�����Դϴ�."+plusScore+"�� ȹ���ϼ̽��ϴ�.");
					totalScore += plusScore;
					cnt++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�. ������ : "+str.get(rand).dap+"�Դϴ�.");
				}
			}else {
				i--;
			}
		}
		System.out.println("��� : �� "+str.size()+"���� �� "+cnt+"������ ���߼̽��ϴ�.");
		System.out.println("�� ���� : "+totalScore+"�� �Դϴ�.");
	}
}
public class HashMapQuiz_02 {
	public static void main(String[] args) {
		new QuizGame().playQuiz();
	}

}
