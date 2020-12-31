package homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class User extends Root{
	private String nickname;
	private int score;
	
	public User(String nickname, int score) {
		this.nickname = nickname;
		this.score = score;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return nickname+ "\t" + score;
	}
	
}
class Control {
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<>();
	List<User> list = new ArrayList<>();
	Random rand = new Random();
	HashSet<Integer> rand_list = new HashSet<Integer>();
	Comparator<User> comparator = new Comparator<User>() {
		@Override
		public int compare(User u1, User u2) {
			return u2.getScore() - u1.getScore();
		}
	};
	
	protected void list_init() {
		map.put("apple", "���");
		map.put("rabbit", "�䳢");
		map.put("carrot", "���");
		map.put("computer", "��ǻ��");
		map.put("dog", "��");
		map.put("singleton", "�̱���");
		map.put("pencil", "����");
		map.put("human", "���");
		map.put("monkey", "������");
		map.put("map", "����");
		
	}

	protected void dummy_data() {
		list.add(new User("��浿", 50));
		list.add(new User("��", 40));
		list.add(new User("�浿", 30));
		list.add(new User("��", 20));
		list.add(new User("��", 10));
		list.add(new User("��", 9));
		list.add(new User("����", 8));
	}
	
}
class Root extends Control{
	private String root_pw;
	private static Root root;
	private static final int KEY_CODE = 3;
	int score = 0, cnt=0;
	
	public static Root getInstance() {
		if (root == null) {
			root = new Root();
		}
		return root;
	}
	
	private boolean Access_AdminPage() {
		String tmp = "";
		boolean grant = false;
		System.out.println("��й�ȣ �Է�");
		tmp = this.sc.next();
		if (tmp.equals(this.decrypt(this.root_pw))) {
			grant = true;
		} else {
			grant = false;
		}
		return grant;
	}
	
	private String encrypt(String pw) {
		String[] ar = {""};
		String enc_pw = "";
		for (int i = 0; i < pw.length(); ++i) {
			enc_pw = enc_pw + Integer.toHexString(pw.charAt(i) * KEY_CODE) + "tr";
		}//16���� ��ȯ
		ar = enc_pw.split("t"); enc_pw = "";
		for (int i = 0; i < ar.length; ++i) {
			enc_pw = enc_pw + ar[i];
		}
		return enc_pw;
	}
	
	private String decrypt(String enc_pw) {
		String dec_pw = "";
		String[] ar = enc_pw.split("r");
		for (int i = 0; i < ar.length; ++i) {
			dec_pw = dec_pw + (char) (Integer.parseInt(ar[i], 16) / KEY_CODE);
		}

		return dec_pw;
	}
	
	public void menu() {
		boolean cnt = true;
		int choice = 0;
		System.out.println("���ܾ� ���� v1.0");
		System.out.println("������ �������� �ʱ� ��й�ȣ�� �������ּ���");
		this.root_pw = this.encrypt(this.sc.next());
		list_init();

		while (cnt) {
			System.out.println("1. ������\n2. �÷��̾�\n3. ����");
			choice = sc.nextInt();
			switch (choice) {
				case 1 :
					if (this.Access_AdminPage()) {
						this.admin_menu();
					} else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					break;
				case 2 : player_menu(); break;
				case 3 : cnt = false;
			}
		}
	}
	
	private void ch_rootPw() {
		String tmp = "";
		System.out.println("���� �����Ǿ��ִ� ��й�ȣ�� �����մϴ�. ���� ��й�ȣ�� �Է����ּ���");
		if (this.sc.next().equals(this.decrypt(this.root_pw))) {
			System.out.println("���ο� ��й�ȣ�� �����մϴ� ������ ��й�ȣ�� �Է����ּ���");
			tmp = this.sc.next();
			System.out.println("��й�ȣ Ȯ��");
			if (tmp.equals(this.sc.next())) {
				this.root_pw = this.encrypt(tmp);
				System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
		} else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}

	}

	private void admin_menu() {
		int tmp = 0;
		String eng = "", kor="";
		while (tmp !=5) {
			System.out.println("=====������ �������� �����ϼ̽��ϴ�=====");
			System.out.println("1. ���� �߰�\n2. ���� ����\n3. ���� ����\n4. ��й�ȣ �ٲٱ�\n5. ����");
			try {
				tmp = this.sc.nextInt();
				if (tmp >= 5 || tmp <= 0) {
					throw new MyException("�޴��� �´� ��ȣ�� �Է����ּ���");
				}
				switch (tmp) {
					case 1 :
						System.out.println("���ܾ �Է��ϼ���"); eng = sc.next();
						System.out.println("�ѱ۸� �Է��ϼ���"); kor = sc.next();
						this.map.put(eng, kor);
						break;
					case 2 : System.out.println(map);break;
					case 3 : System.out.println("������ ���ܾ �Է��ϼ���"); map.remove(sc.next()); break;
					case 4 : ch_rootPw(); break;
				}
			} catch (Exception var3) {
				System.out.println(var3.getMessage());
			}
		}
	}
	
	private void player_menu() {
		int tmp=0;
		while(tmp !=4) {
			System.out.println("1. ����\n2. 1~5�� ��������\n3. �� ��������\n4. ����");
			tmp = sc.nextInt();
			switch(tmp) {
			case 1: game_start(); break;
			case 2: show_rank(); break;
			case 3: show_my_rank(); break;
			//case 4: tmp =4;
			}
		}
	}
	
	private void show_rank() {
		int i =0;
		System.out.println("����\t�г���\t����");
		for (User user : list) {
			++i;
			System.out.println(i+"��\t"+user.getNickname()+"\t"+user.getScore());
			if(i==5) {
				return;
			}
		}
	}
	
	private void show_my_rank() {
		int i=0;
		String nick = "";
		System.out.println("�г����� �Է��ϼ���!"); nick = sc.next(); 
		System.out.println("����\t�г���\t����");
		for (User user : list) {
			++i;
			if(user.getNickname().equals(nick)) {
				System.out.println(i+"\t"+user); return;
			}
		}
	}
	
	private boolean chk_rand(Set<Integer> randd, int ran) {
		//�ߺ��� Ʈ��
		if(randd.add(ran)) {
			return false;			
		}else {
			return true;
		}
	}

	@SuppressWarnings("unused")
	private void game_start() {
		int [] ar = {0}; //�Լ����� �����ϸ� �迭�� �� ���� �Ұ���.
		Set<Integer> randd = new HashSet<>();
		Set<Entry<String, String>> set = map.entrySet();
		//System.out.println(set);
		//System.out.println(map.size());
		Iterator<Entry<String, String>> iter = set.iterator();
		int ran=0;
		while(cnt!=5) {
			boolean cnt1 = true;
			iter = set.iterator();
			while(cnt1==true) {
				ran = rand.nextInt(map.size());
				if(chk_rand(randd, ran)) { //chk�޼��尡 false�� ��ȯ�Ҷ����� �ݺ��Ѵ�.
					iter = set.iterator(); 
				}else {
					for (int i = 0; i < ran; i++) {
						iter.next();
					}
					cnt1 = false; 
				}
			}
			//System.out.println(ran);
			Entry<String, String> tmp = iter.next();
			System.out.println("�ش� �ܾ �ѱ۷� �ٲٸ�? "+tmp.getKey());
			String temp = sc.next();
			if(tmp.getValue().equals(temp)) {
				System.out.println("����! ������ 10��"); score +=10;
			}else {
				System.out.println("����");
			}
			System.out.println("���� ���� : "+score+"�� �Դϴ�."); cnt++;
			//iter = set.iterator();
		}
		System.out.println("�����մϴ�!");
		System.out.println("���� : "+score+"�� �Դϴ�.");
		
		System.out.println("����� �̸��� �Է�");
		list.add(new User(sc.next(), score));
		Collections.sort(list, comparator);
		show_rank();
	}
	
}

@SuppressWarnings("serial")
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class HashMapQuiz_������ {
	public static void main(String[] args) {
		Root.getInstance().menu();
		
	}
}