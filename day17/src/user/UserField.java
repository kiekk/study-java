package user;

import java.util.ArrayList;
import java.util.Scanner;

public class UserField {
	private ArrayList<User> list = new ArrayList<User>();
	private static final int KEY_CODE = 3;	//암호화, 복호화 할 때 사용할 키값
	//중복 검사
	public User checkId(String id) {
		//리스트 목록 중에서 id만 가져온 후, 매개변수 id하고 비교합니다.
		//동일한 id가 있는 요소를 발견하면, 그 요소를 리턴하게 됩니다.
		//없으면 null값을 리턴합니다.
		User user = null;
		for (User tmp : list) {
			//리스트에서 하나씩 꺼내오기를 반복합니다. 빠른 for문
			//요소 하나씩 꺼내올때마다 tmp가 갖게 되고
			//tmp에서 id만 꺼내온 뒤에, 매개변수 id하고 비교합니다.
			if(tmp.getId().equals(id)) {	//동일한 id가 존재하면
				user = tmp;					//그 인스턴스(tmp)를 반환합니다.
			}//end if
		}//end for
		return user;	//동일한 id값이 없다면 null값이 반환됩니다.
	}
	//회원 가입
	public boolean join(User user) {
		//회원가입이 안되는 경우
		//1. id가 널이거나 빈 문자열
		if(checkId(user.getId()) == null) {	//checkId() 메서드는 동일한 아이디가 있다면
			//그 객체를 주고, 동일한 아이디가 없다면
			//null 객체를 반환합니다.
			//null이기 때문에 -> 가입을 시킬 수 있습니다. list.add(해당 인스턴스)
			//list.add(user)하기전에 pw를 암호화 합니다. 일정한 패턴을 적용해서 알아보기 힘든 문장으로 pw를 변경시켜야 합니다.
			user.setPw(encrypt(user.getPw()));

			list.add(user);	//최종 목적지
			return true;	//회원가입 성공	
		}else {								
			return false;	//회원가입 실패(ID가 중복)-checkId메서드를 통해서 확인-checkId는 return타입이 User타입
			//인스턴스의 유무로 회원가입 실패 여부를 확인하는 것 입니다.
		} 
	}
	//로그인
	public boolean login(String id,String pw) {
		User log_Id = checkId(id);
		if(log_Id != null) {
			//패스워드 비교
			//리스트에 있는 getPw()와 매개변수 pw를 비교해야 합니다.
			//문제는 리스트에 있는 getPw()는 enc 된 pw입니다.
			//따라서 매개변수 pw와 비교하기 전에 먼저 pw를 decrypt() 메서드를 통해 복호화 해줘야 합니다. 
			
			//1. list에서 checkId를 통해 얻어낸 객체가 몇번에 있는지 인덱스 값 추출
			//2. 그 인스턴스에서 pw를 가져옵니다.
			//3. 그 pw를 decrypt합니다.
			//4. decrypt한 데이터를 pw와 비교합니다.
			//1~4번이 한문장으로 if문에 작성됩니다.
			if(decrypt(list.get(list.indexOf(log_Id)).getPw()).equals(pw))
				return true;
		}
		return false;	//로그인 실패 1.id가 없을 때 2.id와 입력한 pw가 다를 때
	}
	//암호화
	public String encrypt(String pw) {
		String enc_pw = "";
		//pw에 들어있던 원래 pw를 특정 값을 부여해서 변환시킵니다.
		//pw에 문자열을 문자단윌로 잘라내서, 각 특정값(key값)으 연산시키면 됩니다.
		//문자단위이기 때문에 코드값이 있는데, 코드값에다 키값이 연산되어
		//문자열에 연결시키면 변경하고자 하는 암호값으로 처리됩니다.
		//이때, key값은 "복호화" 할 때도 필요하니까
		//인스턴스 상수로 빼 놓습니다.
		//pw의 문자열을 문자단위로 가져와서 KEY_CODE를 곱합니다.
		//enc_wp에 연결시킵니다.
		for (int i = 0; i < pw.length(); i++) {
			enc_pw += (char)(pw.charAt(i)*KEY_CODE) ;
		}
		System.out.println("기존 암호 : "+pw+"\tenc암호 : "+enc_pw);
		return enc_pw;
	}
	//복호화
	public String decrypt(String enc_pw) {		
		//		String dec_pw;	dec_pw에는 null값이 들어가는데, 이때 "1234"문자열을 +=연산을 할 경우 null1234로 null값이 입력됩니다.
		String dec_pw="";
		for(int i = 0;i<enc_pw.length();i++) {
			dec_pw += (char)(enc_pw.charAt(i)/KEY_CODE);
		}
		System.out.println("end암호 : "+enc_pw+"\tdec암호 : "+dec_pw);
		return dec_pw;
	}
	//시작, 메뉴
	public void init() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		//새로운 회원 정보 입력
		//회원 아이디 검색 등
		User user = null;
		while(true) {
			user = new User(); //반복문 안에서 계속 인스턴스를 생성하기 때문에 메모리 낭비가 발생합니다.
			System.out.println("1.회원가입\n2.로그인\n3.종료");
			choice = sc.nextInt();
			switch(choice) {
			case 1: //회원가입 - id,pw
				//입력시 에러가 날 수 있습니다.(NumberFor....)
				//이 때, 프로그램이 중단 될 수 있기 때문에
				//미연에 중단을 방지시킵니다. -> try catch를 적용합니다.
				try {
					System.out.print("아이디(영어) : "); 
					user.setId(sc.next());
					System.out.print("비밀번호 : "); 
					user.setPw(sc.next());
					//					System.out.println(user); 정보가 제대로 입력됐는지 확인하기 위한 출력문
				} catch (Exception e) {
					System.out.println("정보를 다시 입력해주세요.");
					continue;	//첫 메뉴로 돌아가기
				}
				//입력된 정보는 user객체에 들어있습니다.
				//그 객체를 join()에 보내서 회원 가입 성공 여부를 판단합니다.
				if(join(user)){
					System.out.println("회원 가입 성공");
				}else {
					System.out.println(user.getId()+"는 중복 아이디 입니다.");
				}
				break;
			case 2: //로그인
				//1. id pw 입력
				//2. list하고 비교(login메서드로 처리)
				//3. login메서드에 id,pw를 매개변수로 전달
				//4. list의 id,pw와 매개변수의 id,pw를 equals로 비교
				//5. checkId메서드 이용하여 id를 비교
				//6. pw는 decrypt하여 비교
				try {
					System.out.print("아이디(영어) : "); 
					user.setId(sc.next());
					System.out.print("비밀번호 : "); 
					user.setPw(sc.next());
				} catch (Exception e) {
					System.out.println("정보를 다시 입력해주세요.");
					continue;	//첫 메뉴로 돌아가기
				}
				//입력된 정보는 user객체에 들어있습니다.
				//그 객체를 join()에 보내서 회원 가입 성공 여부를 판단합니다.
				if(login(user.getId(),user.getPw())){
					System.out.println("로그인 성공");
				}else {
					System.out.println("아이디 또는 비밀번호를 다시 확인해 주세요");
				}
				break;
			}
			if(choice == 3)break;
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}
}
