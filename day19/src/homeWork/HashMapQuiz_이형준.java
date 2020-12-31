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
		map.put("apple", "사과");
		map.put("rabbit", "토끼");
		map.put("carrot", "당근");
		map.put("computer", "컴퓨터");
		map.put("dog", "개");
		map.put("singleton", "싱글턴");
		map.put("pencil", "연필");
		map.put("human", "사람");
		map.put("monkey", "원숭이");
		map.put("map", "지도");
		
	}

	protected void dummy_data() {
		list.add(new User("고길동", 50));
		list.add(new User("고동", 40));
		list.add(new User("길동", 30));
		list.add(new User("고", 20));
		list.add(new User("동", 10));
		list.add(new User("길", 9));
		list.add(new User("고길길", 8));
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
		System.out.println("비밀번호 입력");
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
		}//16진법 변환
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
		System.out.println("영단어 퀴즈 v1.0");
		System.out.println("관리자 페이지의 초기 비밀번호를 설정해주세요");
		this.root_pw = this.encrypt(this.sc.next());
		list_init();

		while (cnt) {
			System.out.println("1. 관리자\n2. 플레이어\n3. 종료");
			choice = sc.nextInt();
			switch (choice) {
				case 1 :
					if (this.Access_AdminPage()) {
						this.admin_menu();
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
					break;
				case 2 : player_menu(); break;
				case 3 : cnt = false;
			}
		}
	}
	
	private void ch_rootPw() {
		String tmp = "";
		System.out.println("현재 설정되어있는 비밀번호를 변경합니다. 현재 비밀번호를 입력해주세요");
		if (this.sc.next().equals(this.decrypt(this.root_pw))) {
			System.out.println("새로운 비밀번호를 설정합니다 변경할 비밀번호를 입력해주세요");
			tmp = this.sc.next();
			System.out.println("비밀번호 확인");
			if (tmp.equals(this.sc.next())) {
				this.root_pw = this.encrypt(tmp);
				System.out.println("비밀번호가 변경되었습니다.");
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
		} else {
			System.out.println("비밀번호가 틀립니다.");
		}

	}

	private void admin_menu() {
		int tmp = 0;
		String eng = "", kor="";
		while (tmp !=5) {
			System.out.println("=====관리자 권한으로 접속하셨습니다=====");
			System.out.println("1. 문제 추가\n2. 문제 보기\n3. 문제 삭제\n4. 비밀번호 바꾸기\n5. 이전");
			try {
				tmp = this.sc.nextInt();
				if (tmp >= 5 || tmp <= 0) {
					throw new MyException("메뉴에 맞는 번호를 입력해주세요");
				}
				switch (tmp) {
					case 1 :
						System.out.println("영단어를 입력하세요"); eng = sc.next();
						System.out.println("한글를 입력하세요"); kor = sc.next();
						this.map.put(eng, kor);
						break;
					case 2 : System.out.println(map);break;
					case 3 : System.out.println("삭제할 영단어를 입력하세요"); map.remove(sc.next()); break;
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
			System.out.println("1. 시작\n2. 1~5등 순위보기\n3. 내 순위보기\n4. 종료");
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
		System.out.println("순위\t닉네임\t점수");
		for (User user : list) {
			++i;
			System.out.println(i+"위\t"+user.getNickname()+"\t"+user.getScore());
			if(i==5) {
				return;
			}
		}
	}
	
	private void show_my_rank() {
		int i=0;
		String nick = "";
		System.out.println("닉네임을 입력하세요!"); nick = sc.next(); 
		System.out.println("순위\t닉네임\t점수");
		for (User user : list) {
			++i;
			if(user.getNickname().equals(nick)) {
				System.out.println(i+"\t"+user); return;
			}
		}
	}
	
	private boolean chk_rand(Set<Integer> randd, int ran) {
		//중복시 트루
		if(randd.add(ran)) {
			return false;			
		}else {
			return true;
		}
	}

	@SuppressWarnings("unused")
	private void game_start() {
		int [] ar = {0}; //함수에서 선언하면 배열의 값 유지 불가능.
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
				if(chk_rand(randd, ran)) { //chk메서드가 false를 반환할때까지 반복한다.
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
			System.out.println("해당 단어를 한글로 바꾸면? "+tmp.getKey());
			String temp = sc.next();
			if(tmp.getValue().equals(temp)) {
				System.out.println("정답! 점수에 10점"); score +=10;
			}else {
				System.out.println("오답");
			}
			System.out.println("현재 점수 : "+score+"점 입니다."); cnt++;
			//iter = set.iterator();
		}
		System.out.println("종료합니다!");
		System.out.println("총점 : "+score+"점 입니다.");
		
		System.out.println("당신의 이름을 입력");
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

public class HashMapQuiz_이형준 {
	public static void main(String[] args) {
		Root.getInstance().menu();
		
	}
}