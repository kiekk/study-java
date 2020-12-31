package classEx2;

import java.util.Scanner;
class BankAccount{
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
	public BankAccount(String name,String account,String passWord,int balance){
		this.name = name;
		this.account = account;
		this.passWord = passWord;
		this.balance = balance;
	}
	public BankAccount(String name, String account, String passWord) {
		this.name = name;
		this.account = account;
		this.passWord = passWord;
	}
	//출력하기
	public void printBankAccount() {
		System.out.println(name+"\t"+account+"\t"+passWord+"\t"+balance+"원");
	}
	//입금하기
	public void putAccount() {
		int putNum = 0;
		System.out.println("얼마를 입금하시겠습니까? "); putNum = sc.nextInt();
		this.setBalance(balance+putNum);
	}//end drawAccount
	//출금하기
	public void drawAccount() {
		int drawNum = 0;
		while(true) {
			if(this.balance == 0) {
				System.out.println("현재 "+this.name+"님의 계좌에 잔액이 없습니다.");
				System.out.println("입금을 먼저 해주시기 바랍니다.");
				break;
			}
			System.out.println("얼마를 출금하시겠습니까? "); drawNum = sc.nextInt();
			if(this.balance > drawNum) {
				this.setBalance(balance-drawNum);
				break;
			}else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("다시 입력해주세요.");
			}//end if
		}//end while
	}//end drawAccount
	//이체시킬 계좌에 이체금액 더하기
	public void transferDepositPrice(int transferNum) {
		this.setBalance(this.balance + transferNum);
	}//end transferDepositPrice
	//이체할 계좌에서 이체금액 빼기
	public void transferDrawPrice(int select,BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int transferNum = 0;
		while(true) {
		System.out.println("얼마를 이체하시겠습니까?"); transferNum = sc.nextInt();
		if(this.balance < transferNum) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("다시 입력해주세요.");
			continue;
		}else {
			this.setBalance(balance-transferNum);
			//이체 시킬 계좌 선택
			int choice = 0;
			System.out.println("누구의 계좌로 보내시겠습니까?\n1.홍길동\n2.이순신\n3.박문수\n4.유재석"); choice = sc.nextInt();
			if(select == choice) {
				System.out.println("자기자신에게 보낼 수는 없습니다.");
				continue;
			}//end if
			switch(choice) {
			case 1:  hgd.transferDepositPrice(transferNum);break;
			case 2:  iss.transferDepositPrice(transferNum);break;
			case 3:  pms.transferDepositPrice(transferNum);break;
			case 4:  yjs.transferDepositPrice(transferNum);break;
			}//end switch
			break;
		}//end if
		}//end while
	}//end transferDrawPrice
	/**
	 * 계좌번호, 비밀번호 확인을 각 기능마다 작성하기 번거롭고 비효율적이기 때문에
	 * 따로 계좌번호, 비밀번호를 확인하는 메소드를 만들고, 메소드를 호출한뒤 각 기능에 해당하는 메소드를 호출하는 식으로 구현했습니다.
	 */
	//계좌번호, 비밀번호 확인
	public void Account() {
		String account = "",passWord = "";
		while(true) {
			System.out.println(this.name+"님의 계좌번호를 입력해주세요 : "); account = sc.next();
			if(this.account.equals(account) == true) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}//end while
		while(true) {
			System.out.println("비밀번호를 입력해주세요 : "); passWord = sc.next();
			if(this.passWord.equals(passWord) == true) break;
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("다시 입력해주세요.");
		}//end while
	}//end Account
}//end BankAccount


public class ClassTest06_3 {
	static Scanner sc = new Scanner(System.in);
	//현재 계좌의 정보 조회
	static void showBankAccount(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		System.out.println("이름\t계좌번호\t비밀번호\t잔액");
		hgd.printBankAccount();
		iss.printBankAccount();
		pms.printBankAccount();
		yjs.printBankAccount();
	}//end showBankAccount
	//메뉴 고르기
	static int selectMenu(int select) {
		while(true) {
			System.out.println("---은행 업무---\n1.등록된 계좌 전체 조회\n2.출금하기\n3.입금하기\n4.계좌이체하기\n0.종료하기");
			select = sc.nextInt();
			if(select == 1 || select ==2 || select == 3 || select == 4 || select ==0) return select;
		}//end while
	}//end selectMenu
	//계좌 이체 메서드
	static void transfer(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("누구의 계좌에서 이체하시겠습니까?\n1.홍길동\n2.이순신\n3.박문수\n4.유재석"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 2: iss.Account(); iss.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 3: pms.Account(); pms.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 4: yjs.Account(); yjs.transferDrawPrice(select,hgd,iss,pms,yjs);break;
		}//end switch
	}//end transfer
	//출금 메서드
	static void withDraw(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("누구의 계좌에서 출금하시겠습니까?\n1.홍길동\n2.이순신\n3.박문수\n4.유재석"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.drawAccount();break;
			case 2: iss.Account(); iss.drawAccount();break;
			case 3: pms.Account(); pms.drawAccount();break;
			case 4: yjs.Account(); yjs.drawAccount();break;
		}//end switch
	}//end withDraw
	//입금 메서드
	static void deposit(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("누구의 계좌에 입금하시겠습니까?\n1.홍길동\n2.이순신\n3.박문수\n4.유재석"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.putAccount();break;
			case 2: iss.Account(); iss.putAccount();break;
			case 3: pms.Account(); pms.putAccount();break;
			case 4: yjs.Account(); yjs.putAccount();break;
		}//end switch
	}//end deposit
	public static void main(String[] args) {
		int select = 0;
		BankAccount hgd = new BankAccount("홍길동","111","1234",100000);
		BankAccount iss = new BankAccount("이순신","222","5678",150000);
		BankAccount pms = new BankAccount("박문수","333","1357",200000);
		BankAccount yjs = new BankAccount("유재석","444","2468");
		showBankAccount(hgd,iss,pms,yjs);	//계좌 초기값 출력
		while(true) {
			select = selectMenu(select);
			if(select == 0) break;
			switch(select) {
			case 1: showBankAccount(hgd,iss,pms,yjs); break;
			case 2: withDraw(hgd,iss,pms,yjs); break;
			case 3: deposit(hgd,iss,pms,yjs); break;
			case 4: transfer(hgd,iss,pms,yjs); break;
			}//end switch
		}//end while
		System.out.println("종료합니다.");
	}//end main
}//end class
