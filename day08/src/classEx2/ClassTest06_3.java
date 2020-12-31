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
	//������
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
	//����ϱ�
	public void printBankAccount() {
		System.out.println(name+"\t"+account+"\t"+passWord+"\t"+balance+"��");
	}
	//�Ա��ϱ�
	public void putAccount() {
		int putNum = 0;
		System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�? "); putNum = sc.nextInt();
		this.setBalance(balance+putNum);
	}//end drawAccount
	//����ϱ�
	public void drawAccount() {
		int drawNum = 0;
		while(true) {
			if(this.balance == 0) {
				System.out.println("���� "+this.name+"���� ���¿� �ܾ��� �����ϴ�.");
				System.out.println("�Ա��� ���� ���ֽñ� �ٶ��ϴ�.");
				break;
			}
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�? "); drawNum = sc.nextInt();
			if(this.balance > drawNum) {
				this.setBalance(balance-drawNum);
				break;
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}//end if
		}//end while
	}//end drawAccount
	//��ü��ų ���¿� ��ü�ݾ� ���ϱ�
	public void transferDepositPrice(int transferNum) {
		this.setBalance(this.balance + transferNum);
	}//end transferDepositPrice
	//��ü�� ���¿��� ��ü�ݾ� ����
	public void transferDrawPrice(int select,BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int transferNum = 0;
		while(true) {
		System.out.println("�󸶸� ��ü�Ͻðڽ��ϱ�?"); transferNum = sc.nextInt();
		if(this.balance < transferNum) {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			continue;
		}else {
			this.setBalance(balance-transferNum);
			//��ü ��ų ���� ����
			int choice = 0;
			System.out.println("������ ���·� �����ðڽ��ϱ�?\n1.ȫ�浿\n2.�̼���\n3.�ڹ���\n4.���缮"); choice = sc.nextInt();
			if(select == choice) {
				System.out.println("�ڱ��ڽſ��� ���� ���� �����ϴ�.");
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
	 * ���¹�ȣ, ��й�ȣ Ȯ���� �� ��ɸ��� �ۼ��ϱ� ���ŷӰ� ��ȿ�����̱� ������
	 * ���� ���¹�ȣ, ��й�ȣ�� Ȯ���ϴ� �޼ҵ带 �����, �޼ҵ带 ȣ���ѵ� �� ��ɿ� �ش��ϴ� �޼ҵ带 ȣ���ϴ� ������ �����߽��ϴ�.
	 */
	//���¹�ȣ, ��й�ȣ Ȯ��
	public void Account() {
		String account = "",passWord = "";
		while(true) {
			System.out.println(this.name+"���� ���¹�ȣ�� �Է����ּ��� : "); account = sc.next();
			if(this.account.equals(account) == true) {
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}//end while
		while(true) {
			System.out.println("��й�ȣ�� �Է����ּ��� : "); passWord = sc.next();
			if(this.passWord.equals(passWord) == true) break;
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
		}//end while
	}//end Account
}//end BankAccount


public class ClassTest06_3 {
	static Scanner sc = new Scanner(System.in);
	//���� ������ ���� ��ȸ
	static void showBankAccount(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		System.out.println("�̸�\t���¹�ȣ\t��й�ȣ\t�ܾ�");
		hgd.printBankAccount();
		iss.printBankAccount();
		pms.printBankAccount();
		yjs.printBankAccount();
	}//end showBankAccount
	//�޴� ����
	static int selectMenu(int select) {
		while(true) {
			System.out.println("---���� ����---\n1.��ϵ� ���� ��ü ��ȸ\n2.����ϱ�\n3.�Ա��ϱ�\n4.������ü�ϱ�\n0.�����ϱ�");
			select = sc.nextInt();
			if(select == 1 || select ==2 || select == 3 || select == 4 || select ==0) return select;
		}//end while
	}//end selectMenu
	//���� ��ü �޼���
	static void transfer(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("������ ���¿��� ��ü�Ͻðڽ��ϱ�?\n1.ȫ�浿\n2.�̼���\n3.�ڹ���\n4.���缮"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 2: iss.Account(); iss.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 3: pms.Account(); pms.transferDrawPrice(select,hgd,iss,pms,yjs);break;
			case 4: yjs.Account(); yjs.transferDrawPrice(select,hgd,iss,pms,yjs);break;
		}//end switch
	}//end transfer
	//��� �޼���
	static void withDraw(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("������ ���¿��� ����Ͻðڽ��ϱ�?\n1.ȫ�浿\n2.�̼���\n3.�ڹ���\n4.���缮"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.drawAccount();break;
			case 2: iss.Account(); iss.drawAccount();break;
			case 3: pms.Account(); pms.drawAccount();break;
			case 4: yjs.Account(); yjs.drawAccount();break;
		}//end switch
	}//end withDraw
	//�Ա� �޼���
	static void deposit(BankAccount hgd,BankAccount iss,BankAccount pms,BankAccount yjs) {
		int select = 0;
		System.out.println("������ ���¿� �Ա��Ͻðڽ��ϱ�?\n1.ȫ�浿\n2.�̼���\n3.�ڹ���\n4.���缮"); select = sc.nextInt();
		switch(select) {
			case 1: hgd.Account(); hgd.putAccount();break;
			case 2: iss.Account(); iss.putAccount();break;
			case 3: pms.Account(); pms.putAccount();break;
			case 4: yjs.Account(); yjs.putAccount();break;
		}//end switch
	}//end deposit
	public static void main(String[] args) {
		int select = 0;
		BankAccount hgd = new BankAccount("ȫ�浿","111","1234",100000);
		BankAccount iss = new BankAccount("�̼���","222","5678",150000);
		BankAccount pms = new BankAccount("�ڹ���","333","1357",200000);
		BankAccount yjs = new BankAccount("���缮","444","2468");
		showBankAccount(hgd,iss,pms,yjs);	//���� �ʱⰪ ���
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
		System.out.println("�����մϴ�.");
	}//end main
}//end class
