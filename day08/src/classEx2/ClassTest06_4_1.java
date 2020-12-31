package classEx2;

import java.util.Scanner;

//메인 클래스
public class ClassTest06_4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select1 = -1,count = 0;
		UseBankAccount using = new UseBankAccount();
		BankAccount3 []person = new BankAccount3[100];
		using.initialPerson(person);
		person[0] = new BankAccount3("홍길동","111","1234",100000);
		person[1] = new BankAccount3("이순신","222","5678",150000);
		person[2] = new BankAccount3("박문수","333","1357",200000);
		person[3] = new BankAccount3("유재석","444","2468");
//		printPersonData(person);
		while(select1 != 0) {
		System.out.println("1.사용자 로그인\n2.관리자 로그인\n3.계좌 생성");
		System.out.print("  입력  : "); select1 = sc.nextInt();
			switch(select1) {
			case 1: using.startUserMenu(person); break;
			case 2: using.loginStaff(person); break;//비밀번호 9999
			case 3: using.createNewAccount(person); break;
			}//end switch
		}//end while
	}//end main
}//end class

//BankAccount3 class 
class BankAccount3{
	static Scanner sc = new Scanner(System.in);
	private String name;
	private String account;
	private String passWord;
	private int balance;
	//getter setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAccount() {return account;}
	public void setAccount(String account) {this.account = account;}
	public String getPassWord() {return passWord;}
	public void setPassWord(String passWord) {this.passWord = passWord;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	//생성자
	public BankAccount3() {};
	public BankAccount3(String name,String account) {
		this(name,account,"0000",0);
	}
	//생성자
	public BankAccount3(String name,String account,String passWord,int balance){
		this.name = name;
		this.account = account;
		this.passWord = passWord;
		this.balance = balance;
	}
	public BankAccount3(String name, String account, String passWord) {
		this.name = name;
		this.account = account;
		this.passWord = passWord;
	}
	public void printData() {
		System.out.println(name +"\t"+account+"\t"+passWord+"\t"+balance);
	}//end printData
}//end BankAccount2

//BankAccount3 클래스를 이용해 데이터를 처리하기 위해 만든 클래스
//main클래스에서 작성할 경우 코드가 길어져서 따로 분리하는 것에 목적을 뒀습니다.
class UseBankAccount{
	static Scanner sc = new Scanner(System.in);
	//사용자 계좌 확인
	void showMyAccount(BankAccount3[] person,int count) {
		System.out.println("┏━━━━━━내 계좌━━━━━━┓");
		System.out.println("      이름 : " +person[count].getName());
		System.out.println("      계좌번호 : "+person[count].getAccount());
		System.out.println("      비밀번호 : "+person[count].getPassWord());
		System.out.println("      잔액  : "+person[count].getBalance()+"원");
		System.out.println("┗━━━━━━━━━━━━━━━━━┛");
	}
	//입금하기
	void depositAccount(BankAccount3[] person,int count) {
		int putNum = 0;
		System.out.println("얼마를 입금하시겠습니까? "); putNum = sc.nextInt();
		person[count].setBalance(person[count].getBalance()+putNum);
	}//end drawAccount
	//비밀번호변경하기
	void changePassWord(BankAccount3[] person,int count) {
		String changePW = "", currentPW = "";
		System.out.print("현재 비밀번호를 입력해주세요 : "); currentPW = sc.next();
		while(true) {
			if( person[count].getPassWord().equals(currentPW) == true) {
				System.out.print("변경할 비밀번호를 입력해주세요 : "); changePW = sc.next();
				if(person[count].getPassWord().equals(changePW) == true){
					System.out.println("같은 비밀번호로 설정할 수는 없습니다.");
					continue;
				}//end if
				if(changePW.length() == 4){
					person[count].setPassWord(changePW);
					break;
				}else {
					System.out.println("비밀번호는 4자리로 입력해주세요.");
				}//end if
			}//end if
		}//end while
	}
	//출금하기
	void drawMyAccount(BankAccount3[] person,int count) {
		int drawNum = 0;
		while(true) {
			if(person[count].getBalance() == 0) {
				System.out.println("현재 "+person[count].getName()+"님의 계좌에 잔액이 없습니다.");
				System.out.println("입금을 먼저 해주시기 바랍니다.");
				break;
			}
			System.out.println("얼마를 출금하시겠습니까? "); drawNum = sc.nextInt();
			if(person[count].getBalance() > drawNum) {
				person[count].setBalance(person[count].getBalance()-drawNum);
				break;
			}else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("다시 입력해주세요.");
			}//end if
		}//end while
	}//end drawAccount
	//계좌,비밀번호 확인
	int checkMyAccount(BankAccount3[] person) {
		int i = 0, cnt = 0,count = 0,choice = 0;
		String checkAccount = "", checkPassWord = "";
		System.out.println("-----내 계좌 로그인-----");
		while(true) {
			System.out.print("계좌번호를 입력하세요 : "); checkAccount = sc.next();
			System.out.print("비밀번호를 입력하세요 : "); checkPassWord = sc.next();
			for(i = 0;i<person.length;i++) {
				if(person[i].getName() == null) break;
				if((person[i].getAccount().equals(checkAccount) == true)
						&&(person[i].getPassWord().equals(checkPassWord) == true)) {
					count = i;
					System.out.println(person[i].getName()+"님 환영합니다.");
					return count;
				}//end if
			}//end for(i)
			System.out.println("일치하는 정보가 없습니다.");
		}//end while
	}//end checkMyAccount
	//계좌 생성
	void createNewAccount(BankAccount3[] person) {
		int index = 0,balance = 0, cnt = 0;
		String name = "",passWord = "",account = "";
		for(int i = 0;i<person.length;i++) {
			if(person[i].getName() == null) {
				index = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("이름을 입력하세요  : "); name = sc.next();
		person[index].setName(name);
		while(true) {
			cnt = 0;
			System.out.print("계좌번호를 입력하세요  : "); account = sc.next();
			for(int i = 0;i<index;i++) {
				if(person[i].getAccount().equals(account) ==true) {
					System.out.println("이미 중복된 계좌번호가 존재합니다.");
					cnt++; 
					break;
				}
			}//end for(i)
			if(cnt == 0) {
				person[index].setAccount(account); break;
			}//end if
		}//end while
		while(true) {
			System.out.print("비밀번호를 입력하세요  : "); passWord = sc.next();
			if(passWord.length() == 4){
				person[index].setPassWord(passWord);
				break;
			}else {
				System.out.println("비밀번호는 4자리로 입력해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("잔액을 넣어주세요 : "); balance = sc.nextInt();
			if(balance < 0) {
				System.out.println("0원 이상 넣어주세요.");
			}else {
				person[index].setBalance(balance); break;
			}//end if
		}//end while
		System.out.println(person[index].getName()+"님 명의로 계좌 생성 완료");
	}//end createNewAccount
	//객체 배열 초기화
	void initialPerson(BankAccount3[] person) {
		for(int i = 0;i<person.length;i++) {
			person[i] = new BankAccount3();
		}//end for(i)
	}//end initialPerson
	//데이터 출력
	void printPersonData(BankAccount3[] person) {
		System.out.print("번호\t이름\t계좌번호\t비밀번호\t잔액\n");
		for(int i = 0;i<person.length;i++) {
			if(person[i].getName() == null) break;
			System.out.print((i+1)+"번\t");
			person[i].printData();
		}//end for
	}//end printPersonData
	//사용자 메뉴
	int userMenu(int select) {
		System.out.println("KOREA BANK MENU\n1.내 계좌 확인\n2.계좌 출금하기\n3.계좌 입금하기\n4.계좌 이체하기\n5.비밀번호 변경\n6.다른 ID로 로그인\n0.종료하기");	
		System.out.print(" 입력 : "); select = sc.nextInt();
		return select;
	}//end userMenu
	//계좌 이체
	void transferAccount(BankAccount3[] person,int count) {
		int transferNum = 0;
		int choice = 0;
		while(true) {
			System.out.println("얼마를 이체하시겠습니까?"); transferNum = sc.nextInt();
			if(person[count].getBalance() < transferNum) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("다시 입력해주세요.");
				continue;
			}else {
				person[count].setBalance(person[count].getBalance()-transferNum);
				//이체 시킬 계좌 찾기
				String transferAccount = "";
				int count2 = 0;
				String checkAccount = "", checkPassWord = "";
				while(true) {
					System.out.print("이체할 계좌번호를 입력하세요 : "); transferAccount = sc.next();
					if(person[count].getAccount().equals(transferAccount) == true) {
						System.out.println("자기 자신에게 보낼 수는 없습니다.");
					}else {
						for(int i = 0;i<person.length;i++) {
							if(person[i].getName() == null) break;
							if((person[i].getAccount().equals(transferAccount) == true)) {
								count2 = i;
								System.out.println(person[i].getName()+"님 계좌로 이체하시겠습니까?\n1.예\t2.아니오 ");
								choice = sc.nextInt();
								if(choice == 1) {
									person[i].setBalance(person[i].getBalance()+transferNum);
									return;
								}else {
									System.out.println("다시 입력해주세요.");
									continue;
								}//end if
							}//end if
						}//end for(i)
					}//end if
				}//end while
			}//end if
		}//end while
	}//end transferAccount
	//관리자 페이지 로그인
	void loginStaff(BankAccount3[] person) {
		int pw = 0;
		System.out.print("비밀번호를 입력하세요 : "); pw = sc.nextInt();
		if(pw != 9999) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("이전화면으로 돌아갑니다.");
		}else {
			System.out.println("관리자 권한으로 로그인 하셨습니다.");
			startStaffMenu(person);
		}//end if
	}//end loginStaff
	//계좌 삭제
	void deleteAccount(BankAccount3[] person) {
		int delNum = 0;
		System.out.print("몇번 계좌를 삭제하시겠습니까? : "); delNum = sc.nextInt();
		person[delNum-1] = new BankAccount3();
		for(int i = delNum-1;i<person.length;i++) {
			if(person[i+1].getName() == null) {
				break;
			}else {
				person[i] = person[i+1];
				person[i+1] = new BankAccount3();
			}//end if
		}//end for(i)
	}//end deleteAccount
	//관리자 페이지 메뉴
	void startStaffMenu(BankAccount3[] person) {
		int select = 0;
		while(true) {
			System.out.println("관리자  페이지\n1.모든 계좌 확인\n2.계좌 생성\n3.계좌 삭제\n0.종료하기");	
			select = sc.nextInt();
			if(select == 0) break;
			switch(select) {
			case 1: printPersonData(person); break;
			case 2: createNewAccount(person); break;
			case 3: deleteAccount(person);break;
			}//end switch
		}//end while
	}
	//사용자 페이지 메뉴
	void startUserMenu(BankAccount3[] person) {
		int select2 = -1,count = 0;
		count = checkMyAccount(person);
		while(select2 != 0) {
			select2 = userMenu(select2);
			if(select2 == 0)break;
			switch(select2) {
			case 1: showMyAccount(person,count); break;
			case 2: drawMyAccount(person,count); break;
			case 3: depositAccount(person,count);break;
			case 4: transferAccount(person,count);break;
			case 5: changePassWord(person,count);break;
			case 6: count = checkMyAccount(person);
			}//end select
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}//end startUserMenu
}//end class useBankAccount

