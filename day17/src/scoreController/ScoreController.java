package scoreController;

import java.util.ArrayList;
import java.util.Scanner;
import score.StdScore;
import user.User;

public class ScoreController {
	static Scanner sc = new Scanner(System.in);
	ArrayList<StdScore> list = new ArrayList<StdScore>();
	//init(메인메뉴)
	public void init() {
		int select = -1;
		list.add(new StdScore("홍길동","abcd","1234",50,78,92));
		list.add(new StdScore("강감찬","gang","5678",66,76,83));
		list.add(new StdScore("박문수","munsu","1357",72,80,92));
		list.add(new StdScore("유재석","jaesuck","2468",67,72,88));
		list.add(new StdScore("정형돈","abcd","9876",82,90,75));
		StdScore tmp = null;
		tmp = new StdScore();
		while(select != 0) {
			System.out.println("성적 조회 프로그램");
			System.out.println("1.학생 로그인\n2.관리자 로그인\n3.회원 가입\n0.종료 하기");
			select = sc.nextInt();
			switch(select) {
			case 1: stdLogin(tmp);break;
			case 2: adminLogin();break;
			case 3: signUp(tmp);break;
			}//end select
		}//end while
	}
	//회원가입 - 1
	void signUp(StdScore std) {
		while(true) {
			try {
				System.out.print("아이디(영어) : "); 
				std.setId(sc.next());
				System.out.print("비밀번호 : "); 
				std.setPw(sc.next());
			} catch (Exception e) {
				System.out.println("정보를 다시 입력해주세요.");
				continue;
			}
			if(join(std)){
				System.out.println("회원 가입 성공");
				return;
			}else {
				System.out.println(std.getId()+"는 중복 아이디 입니다.");
			}
		}
	}
	//회원 가입 - 2
	boolean join(StdScore std) {
		if(checkId(std.getId()) == null) {	
			encrypt(std.getPw());
			list.add(std);	
			return true;	
		}else {								
			return false;	
		} 
	}
	//중복 검사
	StdScore checkId(String id) {
		StdScore std = null;
		for (StdScore tmp : list) {
			if(tmp.getId().equals(id)) {
				std = tmp;					
			}//end if
		}//end for
		return std;	
	}
	//암호화
	public String encrypt(String pw) {
		String enc_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			enc_pw += (char)(pw.charAt(i)*3) ;
		}
		return enc_pw;
	}
	//복호화
	public String decrypt(String enc_pw) {		
		String dec_pw="";
		for(int i = 0;i<enc_pw.length();i++) {
			dec_pw += (char)(enc_pw.charAt(i)/3);
		}
		return dec_pw;
	}
	//학생 로그인
	void stdLogin(StdScore tmp) {
		while(true) {
			try {
				System.out.print("아이디(영어) : "); 
				tmp.setId(sc.next());
				System.out.print("비밀번호 : "); 
				tmp.setPw(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("정보를 다시 입력해주세요.");
				continue;	
			}
		}
		StdScore log_Id = checkId(tmp.getId());
		if(log_Id != null) {
			if(list.get(list.indexOf(log_Id)).getPw().equals(tmp.getPw())) {
				System.out.println("로그인 성공");
				stdMenu(tmp);
			}
		}else {
			System.out.println("아이디 또는 비밀번호를 다시 확인해 주세요");
			System.out.println(list.get(list.indexOf(log_Id)).getPw().equals(tmp.getPw()));
		}
	}
	//학생 페이지
	void stdMenu(StdScore std) {
		int select = -1;
		while(select != 0) {
		System.out.println("메뉴\n1.내 정보 확인\n2.내 성적 확인\n3.전교 등수 확인\n4.개인 정보 변경\n5.관리자에게 성적 수정 요청\n6.탈퇴 하기\n0.뒤로 가기");
			select = sc.nextInt();
			switch(select) {
			case 1: System.out.println(std);break;				//1. 정보 확인
			case 2: showMyScore();break;			//2. 성적 확인
			case 3: showMyRank();break;				//3. 등수 확인
			case 4: editMyInfo();break;				//4. 정보 변경
			case 5: askAdminEditMyInfo();break;		//5. 성적 수정 요청
			case 6: signOut();break;				//6. 탈퇴 하기
			}
		}
	}
	//1. 정보 확인
	void showMyInfo() {
		
	}
	//2. 성적 확인
	void showMyScore() {
		
	}
	//3. 등수 확인
	void showMyRank() {
		
	}
	//4. 정보 변경
	void editMyInfo() {
		
	}
	//5. 성적 수정 요청
	void askAdminEditMyInfo() {
		
	}
	//6. 탈퇴 하기
	void signOut() {
		
	}
	void adminLogin(){
	}
	//관리자 페이지
	void adminMenu() {

	}
	//추가
	//수정
	//삽입
	//삭제
	//관리자 페이지
	//1. 학생 추가
	//2. 학생 삽입
	//3. 학생 삭제
	//4. 성적 수정
	//5. 요청 확인
	//0. 뒤로가기
}
