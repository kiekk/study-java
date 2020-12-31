package homeWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class HashMapQuiz_03{
	static Scanner sc = new Scanner(System.in);
	private String mun;
	private String dap;
	//getter setter
	public String getMun() {return mun;}
	public void setMun(String mun) {this.mun = mun;}
	public String getDap() {return dap;}
	public void setDap(String dap) {this.dap = dap;}
	public HashMapQuiz_03() {}
	public HashMapQuiz_03(String mun, String dap) {
		this.mun = mun;
		this.dap = dap;
	}
	//���� �޴�
	void mainMenu(){
		int select = -1;
		List<Player> list = new ArrayList<>();
		//���� �ʱⰪ
		String[] mun = {"apple","rabbit","computer","���","��ǻ��","�����","������","dog","cat"};
		String[] dap = {"���","�䳢","��ǻ��","carrot","computer","cat","dog","������","�����"};
		HashMap<Integer,HashMapQuiz_03> str = new HashMap<>();	//Ű,����,�� ����
		//�ݺ��� �̿�, Ű,����,�� ����
		for(int i = 0;i < 9;i++) {
			HashMapQuiz_03 quiz = new HashMapQuiz_03(mun[i],dap[i]);
			str.put(i, quiz);
		}//end for(i)
		//player 4�� �ʱⰪ
		list.add(new Player("aaa"));
		list.add(new Player("bbb"));
		list.add(new Player("ccc"));
		list.add(new Player("ddd"));
		//������
		Player admin = new Player("admin","1234");
		while(select != 0) {
			System.out.println("----QUIZ GAME----");
			System.out.println("1.������ �α���\n2.������ �α���\n3.ID ����\n0.�����ϱ�");
			select = sc.nextInt();
			switch(select){
			case 1: new PlayerClass().startPlay(list, str);break;
			case 2: new AdminClass().adminPage(admin, str);break;
			case 3: createPlayer(list);break;
			}//end switch
		}//end while
		System.out.println("���α׷��� �����մϴ�.");
	}//end mainMenu()
	//�÷��̾� �߰�
	private void createPlayer(List<Player> list) {
		String id = "";
		System.out.println("���̵� �Է����ּ��� : "); id = sc.next();
		for(Player a : list) {
			if(a.getId().equals(id)) {
				System.out.println("�̹� �����ϴ� ID�Դϴ�.\n�ٽ� �Է����ּ���.");
				return;
			}//end if
		}//end for
		list.add(new Player(id));
		System.out.println("ID�� �����߽��ϴ�.");
	}//end createPlayer
	//�÷��̾� Ŭ����
	private class PlayerClass {
		//Player Login
		private Player playerLogin(List<Player> list) {
			String input = "";
			Player tmp = null;
			System.out.print("���̵� �Է����ּ��� : "); input = sc.next();
			for(int i = 0;i<list.size();i++) {
				if(list.get(i).getId().equals(input)) {
					tmp = list.get(i);
					return tmp;
				}//end if
			}//end for(i)
			return tmp;
		}//end playerLogin
		//Player startMenu
		void startPlay(List<Player> list, Map<Integer,HashMapQuiz_03> str) {
			int select = -1;
			Player tmp = playerLogin(list);
			if(tmp != null) {
				System.out.println("�α��� ����");
				System.out.println(tmp.getId()+"���� �α��� �ϼ̽��ϴ�.");
			}else {
				System.out.println("�α��ο� �����߽��ϴ�.");
				System.out.println("ID�� Ȯ�����ּ���.");
				return;
			}//end if
			while(select != 0) {
				System.out.println("----�޴� ����----");
				System.out.println("1.���� Ǯ��\n2.��� �÷��̾� ���� Ȯ��\n3.���� ����\n0.�α� �ƿ�");
				select = sc.nextInt();
				switch(select) {
				case 1: playQuizGame(tmp, str); break;
				case 2: checkAllScore(list); break;
//				case 3: showRank(); break;
				}//end switch
			}//end while
		}//end startPlay
		//���� Ǯ��
		private void playQuizGame(Player tmp, Map <Integer,HashMapQuiz_03> str) {
			String ans = "";
			int totalScore = 0,plusScore = 10, cnt = 0;
			Set<Integer> set = new HashSet<>();				//���� ����
			for(int i = 0;i< 5;i++) {
				int rand = (int)(Math.random()*str.size());
				if(set.add(rand)) {
					System.out.println((i+1)+"�� ����  : "+str.get(rand).mun);	
					System.out.print("���� �Է��� �ּ���(�ѱ�->����,����->�ѱ�) : "); ans = sc.next();
					if(str.get(rand).getDap().equalsIgnoreCase(ans)) {
						System.out.println("�����Դϴ�."+plusScore+"�� ȹ���ϼ̽��ϴ�.");
						totalScore += plusScore;
						cnt++;
					}else {
						System.out.println("Ʋ�Ƚ��ϴ�. ������ : "+str.get(rand).getDap()+"�Դϴ�.");
					}//end if
				}else {
					i--;
				}//end if
			}//end for(i)
			tmp.setScore(totalScore);
			System.out.println("��� : ��  5 ���� �� "+cnt+"������ ���߼̽��ϴ�.");
			System.out.println("�� ���� : "+tmp.getScore()+"�� �Դϴ�.");
		}//end playQuizGame
		//��� �÷��̾� ���� Ȯ��
		private void checkAllScore(List<Player> list) {
			int i = 0;
			for(Player a : list) {
				System.out.println((++i)+"�� Player");
				a.printPlayerInfo();
				System.out.println("----------");
			}//end for
		}//end checkAllScore
	}//end PlayerClass
	//������ Ŭ����
	private class AdminClass {
		//������ �α���
		private Player adminLogin(Player admin) {
			String id = "",pw = "";
			Player tmp = null;
			System.out.print("���̵� �Է����ּ��� : "); id = sc.next();
			System.out.print("��й�ȣ�� �Է����ּ��� : "); pw = sc.next();
			if(admin.getId().equals(id)) {
				if(admin.getPw().equals(pw)) {
					tmp = admin;
					return tmp;
				}//end if
			}//end if
			return tmp;
		}//end adminLogin
		//������ ������
		void adminPage(Player admin,Map<Integer,HashMapQuiz_03> str) {
			int select = -1;
			Player tmp = adminLogin(admin);
			if(tmp != null) {
				System.out.println("������ ���� �α����߽��ϴ�.");
			}else {
				System.out.println("ID, PW�� Ȯ�����ּ���.");
				return;
			}//end if
			while(select != 0) {
				System.out.println("----�޴� ����----");
				System.out.println("1.���� �߰�\n2.���� ����\n3.��ϵ� ���� Ȯ��\n0.�ڷ� ����");
				select = sc.nextInt();
				switch(select) {
				case 1: addQuiz(str);break;
				case 2: delQuiz(str);break;
				case 3: checkQuiz(str);break;
				}//end switch
			}//end while
		}//end adminPage
		//���� �߰�
		private void addQuiz(Map<Integer,HashMapQuiz_03> str) {
			String mun = "";
			String dap = "";
			System.out.println("----���� �߰�----");
			System.out.print("������ �Է����ּ��� : "); mun = sc.next();
			System.out.print("���� �Է����ּ��� : "); dap = sc.next();
			str.put(str.size(), new HashMapQuiz_03(mun,dap));
			System.out.println("���� : "+mun+"\t�� : "+dap+"�� �߰��մϴ�.");
		}//end addQuiz
		//���� ����
		private void delQuiz(Map<Integer,HashMapQuiz_03> str) {
			int delNum = 0;
			checkQuiz(str);
			System.out.print("�� �� ������ �����Ͻðڽ��ϱ�? "); delNum = sc.nextInt();
			System.out.println("���� : \""+str.get(delNum-1).getMun()+"\" �� �����մϴ�.");
			str.remove(delNum-1);
//			for(int i = delNum; i<str.size();i++) {
//				str.put(i-1, str.get(i));
//				if(i == (str.size()-1)) {
//					str.remove(i);
//				}//end if
//			}//end for(i)
		}//end delQuiz
		//��ϵ� ���� Ȯ��
		private void checkQuiz(Map<Integer,HashMapQuiz_03> str) {
			int i = 0;
			Set<Entry<Integer,HashMapQuiz_03>> set = str.entrySet();
			Iterator<Entry<Integer,HashMapQuiz_03>> itr = set.iterator();
			while(itr.hasNext()) {
				Entry<Integer, HashMapQuiz_03> tmp = itr.next();
				System.out.println((++i)+"�� ���� : "+str.get(tmp).getMun() + "   ->    " +str.get(tmp).getDap());
			}
//			for(int i = 0;i<str.size();i++) {
//				System.out.println((i+1)+"�� ���� : "+str.get(i).getMun()+"   ->   �� : "+str.get(i).getDap());
//			}//end for(i)
		}//end checkQuiz
	}//end AdminClass
}//end class QuizGame3