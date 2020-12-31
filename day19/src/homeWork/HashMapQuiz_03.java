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
	//메인 메뉴
	void mainMenu(){
		int select = -1;
		List<Player> list = new ArrayList<>();
		//문제 초기값
		String[] mun = {"apple","rabbit","computer","당근","컴퓨터","고양이","강아지","dog","cat"};
		String[] dap = {"사과","토끼","컴퓨터","carrot","computer","cat","dog","강아지","고양이"};
		HashMap<Integer,HashMapQuiz_03> str = new HashMap<>();	//키,문제,답 저장
		//반복문 이용, 키,문제,답 저장
		for(int i = 0;i < 9;i++) {
			HashMapQuiz_03 quiz = new HashMapQuiz_03(mun[i],dap[i]);
			str.put(i, quiz);
		}//end for(i)
		//player 4명 초기값
		list.add(new Player("aaa"));
		list.add(new Player("bbb"));
		list.add(new Player("ccc"));
		list.add(new Player("ddd"));
		//관리자
		Player admin = new Player("admin","1234");
		while(select != 0) {
			System.out.println("----QUIZ GAME----");
			System.out.println("1.도전자 로그인\n2.관리자 로그인\n3.ID 생성\n0.종료하기");
			select = sc.nextInt();
			switch(select){
			case 1: new PlayerClass().startPlay(list, str);break;
			case 2: new AdminClass().adminPage(admin, str);break;
			case 3: createPlayer(list);break;
			}//end switch
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}//end mainMenu()
	//플레이어 추가
	private void createPlayer(List<Player> list) {
		String id = "";
		System.out.println("아이디를 입력해주세요 : "); id = sc.next();
		for(Player a : list) {
			if(a.getId().equals(id)) {
				System.out.println("이미 존재하는 ID입니다.\n다시 입력해주세요.");
				return;
			}//end if
		}//end for
		list.add(new Player(id));
		System.out.println("ID를 생성했습니다.");
	}//end createPlayer
	//플레이어 클래스
	private class PlayerClass {
		//Player Login
		private Player playerLogin(List<Player> list) {
			String input = "";
			Player tmp = null;
			System.out.print("아이디를 입력해주세요 : "); input = sc.next();
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
				System.out.println("로그인 성공");
				System.out.println(tmp.getId()+"님이 로그인 하셨습니다.");
			}else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("ID를 확인해주세요.");
				return;
			}//end if
			while(select != 0) {
				System.out.println("----메뉴 선택----");
				System.out.println("1.문제 풀기\n2.모든 플레이어 점수 확인\n3.순위 보기\n0.로그 아웃");
				select = sc.nextInt();
				switch(select) {
				case 1: playQuizGame(tmp, str); break;
				case 2: checkAllScore(list); break;
//				case 3: showRank(); break;
				}//end switch
			}//end while
		}//end startPlay
		//문제 풀기
		private void playQuizGame(Player tmp, Map <Integer,HashMapQuiz_03> str) {
			String ans = "";
			int totalScore = 0,plusScore = 10, cnt = 0;
			Set<Integer> set = new HashSet<>();				//난수 저장
			for(int i = 0;i< 5;i++) {
				int rand = (int)(Math.random()*str.size());
				if(set.add(rand)) {
					System.out.println((i+1)+"번 문제  : "+str.get(rand).mun);	
					System.out.print("답을 입력해 주세요(한글->영어,영어->한글) : "); ans = sc.next();
					if(str.get(rand).getDap().equalsIgnoreCase(ans)) {
						System.out.println("정답입니다."+plusScore+"점 획득하셨습니다.");
						totalScore += plusScore;
						cnt++;
					}else {
						System.out.println("틀렸습니다. 정답은 : "+str.get(rand).getDap()+"입니다.");
					}//end if
				}else {
					i--;
				}//end if
			}//end for(i)
			tmp.setScore(totalScore);
			System.out.println("결과 : 총  5 문제 중 "+cnt+"문제를 맞추셨습니다.");
			System.out.println("총 점수 : "+tmp.getScore()+"점 입니다.");
		}//end playQuizGame
		//모든 플레이어 점수 확인
		private void checkAllScore(List<Player> list) {
			int i = 0;
			for(Player a : list) {
				System.out.println((++i)+"번 Player");
				a.printPlayerInfo();
				System.out.println("----------");
			}//end for
		}//end checkAllScore
	}//end PlayerClass
	//관리자 클래스
	private class AdminClass {
		//관리자 로그인
		private Player adminLogin(Player admin) {
			String id = "",pw = "";
			Player tmp = null;
			System.out.print("아이디를 입력해주세요 : "); id = sc.next();
			System.out.print("비밀번호를 입력해주세요 : "); pw = sc.next();
			if(admin.getId().equals(id)) {
				if(admin.getPw().equals(pw)) {
					tmp = admin;
					return tmp;
				}//end if
			}//end if
			return tmp;
		}//end adminLogin
		//관리자 페이지
		void adminPage(Player admin,Map<Integer,HashMapQuiz_03> str) {
			int select = -1;
			Player tmp = adminLogin(admin);
			if(tmp != null) {
				System.out.println("관리자 모드로 로그인했습니다.");
			}else {
				System.out.println("ID, PW를 확인해주세요.");
				return;
			}//end if
			while(select != 0) {
				System.out.println("----메뉴 선택----");
				System.out.println("1.문제 추가\n2.문제 삭제\n3.등록된 문제 확인\n0.뒤로 가기");
				select = sc.nextInt();
				switch(select) {
				case 1: addQuiz(str);break;
				case 2: delQuiz(str);break;
				case 3: checkQuiz(str);break;
				}//end switch
			}//end while
		}//end adminPage
		//문제 추가
		private void addQuiz(Map<Integer,HashMapQuiz_03> str) {
			String mun = "";
			String dap = "";
			System.out.println("----문제 추가----");
			System.out.print("문제를 입력해주세요 : "); mun = sc.next();
			System.out.print("답을 입력해주세요 : "); dap = sc.next();
			str.put(str.size(), new HashMapQuiz_03(mun,dap));
			System.out.println("문제 : "+mun+"\t답 : "+dap+"을 추가합니다.");
		}//end addQuiz
		//문제 삭제
		private void delQuiz(Map<Integer,HashMapQuiz_03> str) {
			int delNum = 0;
			checkQuiz(str);
			System.out.print("몇 번 문제를 삭제하시겠습니까? "); delNum = sc.nextInt();
			System.out.println("문제 : \""+str.get(delNum-1).getMun()+"\" 를 삭제합니다.");
			str.remove(delNum-1);
//			for(int i = delNum; i<str.size();i++) {
//				str.put(i-1, str.get(i));
//				if(i == (str.size()-1)) {
//					str.remove(i);
//				}//end if
//			}//end for(i)
		}//end delQuiz
		//등록된 문제 확인
		private void checkQuiz(Map<Integer,HashMapQuiz_03> str) {
			int i = 0;
			Set<Entry<Integer,HashMapQuiz_03>> set = str.entrySet();
			Iterator<Entry<Integer,HashMapQuiz_03>> itr = set.iterator();
			while(itr.hasNext()) {
				Entry<Integer, HashMapQuiz_03> tmp = itr.next();
				System.out.println((++i)+"번 문제 : "+str.get(tmp).getMun() + "   ->    " +str.get(tmp).getDap());
			}
//			for(int i = 0;i<str.size();i++) {
//				System.out.println((i+1)+"번 문제 : "+str.get(i).getMun()+"   ->   답 : "+str.get(i).getDap());
//			}//end for(i)
		}//end checkQuiz
	}//end AdminClass
}//end class QuizGame3