package classEx2;

import java.util.Scanner;

//���� Ŭ����
public class ClassTest06_4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select1 = -1,count = 0;
		UseBankAccount using = new UseBankAccount();
		BankAccount3 []person = new BankAccount3[100];
		using.initialPerson(person);
		person[0] = new BankAccount3("ȫ�浿","111","1234",100000);
		person[1] = new BankAccount3("�̼���","222","5678",150000);
		person[2] = new BankAccount3("�ڹ���","333","1357",200000);
		person[3] = new BankAccount3("���缮","444","2468");
//		printPersonData(person);
		while(select1 != 0) {
		System.out.println("1.����� �α���\n2.������ �α���\n3.���� ����");
		System.out.print("  �Է�  : "); select1 = sc.nextInt();
			switch(select1) {
			case 1: using.startUserMenu(person); break;
			case 2: using.loginStaff(person); break;//��й�ȣ 9999
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
	//������
	public BankAccount3() {};
	public BankAccount3(String name,String account) {
		this(name,account,"0000",0);
	}
	//������
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

//BankAccount3 Ŭ������ �̿��� �����͸� ó���ϱ� ���� ���� Ŭ����
//mainŬ�������� �ۼ��� ��� �ڵ尡 ������� ���� �и��ϴ� �Ϳ� ������ �׽��ϴ�.
class UseBankAccount{
	static Scanner sc = new Scanner(System.in);
	//����� ���� Ȯ��
	void showMyAccount(BankAccount3[] person,int count) {
		System.out.println("���������������� ���¦�������������");
		System.out.println("      �̸� : " +person[count].getName());
		System.out.println("      ���¹�ȣ : "+person[count].getAccount());
		System.out.println("      ��й�ȣ : "+person[count].getPassWord());
		System.out.println("      �ܾ�  : "+person[count].getBalance()+"��");
		System.out.println("��������������������������������������");
	}
	//�Ա��ϱ�
	void depositAccount(BankAccount3[] person,int count) {
		int putNum = 0;
		System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�? "); putNum = sc.nextInt();
		person[count].setBalance(person[count].getBalance()+putNum);
	}//end drawAccount
	//��й�ȣ�����ϱ�
	void changePassWord(BankAccount3[] person,int count) {
		String changePW = "", currentPW = "";
		System.out.print("���� ��й�ȣ�� �Է����ּ��� : "); currentPW = sc.next();
		while(true) {
			if( person[count].getPassWord().equals(currentPW) == true) {
				System.out.print("������ ��й�ȣ�� �Է����ּ��� : "); changePW = sc.next();
				if(person[count].getPassWord().equals(changePW) == true){
					System.out.println("���� ��й�ȣ�� ������ ���� �����ϴ�.");
					continue;
				}//end if
				if(changePW.length() == 4){
					person[count].setPassWord(changePW);
					break;
				}else {
					System.out.println("��й�ȣ�� 4�ڸ��� �Է����ּ���.");
				}//end if
			}//end if
		}//end while
	}
	//����ϱ�
	void drawMyAccount(BankAccount3[] person,int count) {
		int drawNum = 0;
		while(true) {
			if(person[count].getBalance() == 0) {
				System.out.println("���� "+person[count].getName()+"���� ���¿� �ܾ��� �����ϴ�.");
				System.out.println("�Ա��� ���� ���ֽñ� �ٶ��ϴ�.");
				break;
			}
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�? "); drawNum = sc.nextInt();
			if(person[count].getBalance() > drawNum) {
				person[count].setBalance(person[count].getBalance()-drawNum);
				break;
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}//end if
		}//end while
	}//end drawAccount
	//����,��й�ȣ Ȯ��
	int checkMyAccount(BankAccount3[] person) {
		int i = 0, cnt = 0,count = 0,choice = 0;
		String checkAccount = "", checkPassWord = "";
		System.out.println("-----�� ���� �α���-----");
		while(true) {
			System.out.print("���¹�ȣ�� �Է��ϼ��� : "); checkAccount = sc.next();
			System.out.print("��й�ȣ�� �Է��ϼ��� : "); checkPassWord = sc.next();
			for(i = 0;i<person.length;i++) {
				if(person[i].getName() == null) break;
				if((person[i].getAccount().equals(checkAccount) == true)
						&&(person[i].getPassWord().equals(checkPassWord) == true)) {
					count = i;
					System.out.println(person[i].getName()+"�� ȯ���մϴ�.");
					return count;
				}//end if
			}//end for(i)
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}//end while
	}//end checkMyAccount
	//���� ����
	void createNewAccount(BankAccount3[] person) {
		int index = 0,balance = 0, cnt = 0;
		String name = "",passWord = "",account = "";
		for(int i = 0;i<person.length;i++) {
			if(person[i].getName() == null) {
				index = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("�̸��� �Է��ϼ���  : "); name = sc.next();
		person[index].setName(name);
		while(true) {
			cnt = 0;
			System.out.print("���¹�ȣ�� �Է��ϼ���  : "); account = sc.next();
			for(int i = 0;i<index;i++) {
				if(person[i].getAccount().equals(account) ==true) {
					System.out.println("�̹� �ߺ��� ���¹�ȣ�� �����մϴ�.");
					cnt++; 
					break;
				}
			}//end for(i)
			if(cnt == 0) {
				person[index].setAccount(account); break;
			}//end if
		}//end while
		while(true) {
			System.out.print("��й�ȣ�� �Է��ϼ���  : "); passWord = sc.next();
			if(passWord.length() == 4){
				person[index].setPassWord(passWord);
				break;
			}else {
				System.out.println("��й�ȣ�� 4�ڸ��� �Է����ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("�ܾ��� �־��ּ��� : "); balance = sc.nextInt();
			if(balance < 0) {
				System.out.println("0�� �̻� �־��ּ���.");
			}else {
				person[index].setBalance(balance); break;
			}//end if
		}//end while
		System.out.println(person[index].getName()+"�� ���Ƿ� ���� ���� �Ϸ�");
	}//end createNewAccount
	//��ü �迭 �ʱ�ȭ
	void initialPerson(BankAccount3[] person) {
		for(int i = 0;i<person.length;i++) {
			person[i] = new BankAccount3();
		}//end for(i)
	}//end initialPerson
	//������ ���
	void printPersonData(BankAccount3[] person) {
		System.out.print("��ȣ\t�̸�\t���¹�ȣ\t��й�ȣ\t�ܾ�\n");
		for(int i = 0;i<person.length;i++) {
			if(person[i].getName() == null) break;
			System.out.print((i+1)+"��\t");
			person[i].printData();
		}//end for
	}//end printPersonData
	//����� �޴�
	int userMenu(int select) {
		System.out.println("KOREA BANK MENU\n1.�� ���� Ȯ��\n2.���� ����ϱ�\n3.���� �Ա��ϱ�\n4.���� ��ü�ϱ�\n5.��й�ȣ ����\n6.�ٸ� ID�� �α���\n0.�����ϱ�");	
		System.out.print(" �Է� : "); select = sc.nextInt();
		return select;
	}//end userMenu
	//���� ��ü
	void transferAccount(BankAccount3[] person,int count) {
		int transferNum = 0;
		int choice = 0;
		while(true) {
			System.out.println("�󸶸� ��ü�Ͻðڽ��ϱ�?"); transferNum = sc.nextInt();
			if(person[count].getBalance() < transferNum) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}else {
				person[count].setBalance(person[count].getBalance()-transferNum);
				//��ü ��ų ���� ã��
				String transferAccount = "";
				int count2 = 0;
				String checkAccount = "", checkPassWord = "";
				while(true) {
					System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : "); transferAccount = sc.next();
					if(person[count].getAccount().equals(transferAccount) == true) {
						System.out.println("�ڱ� �ڽſ��� ���� ���� �����ϴ�.");
					}else {
						for(int i = 0;i<person.length;i++) {
							if(person[i].getName() == null) break;
							if((person[i].getAccount().equals(transferAccount) == true)) {
								count2 = i;
								System.out.println(person[i].getName()+"�� ���·� ��ü�Ͻðڽ��ϱ�?\n1.��\t2.�ƴϿ� ");
								choice = sc.nextInt();
								if(choice == 1) {
									person[i].setBalance(person[i].getBalance()+transferNum);
									return;
								}else {
									System.out.println("�ٽ� �Է����ּ���.");
									continue;
								}//end if
							}//end if
						}//end for(i)
					}//end if
				}//end while
			}//end if
		}//end while
	}//end transferAccount
	//������ ������ �α���
	void loginStaff(BankAccount3[] person) {
		int pw = 0;
		System.out.print("��й�ȣ�� �Է��ϼ��� : "); pw = sc.nextInt();
		if(pw != 9999) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			System.out.println("����ȭ������ ���ư��ϴ�.");
		}else {
			System.out.println("������ �������� �α��� �ϼ̽��ϴ�.");
			startStaffMenu(person);
		}//end if
	}//end loginStaff
	//���� ����
	void deleteAccount(BankAccount3[] person) {
		int delNum = 0;
		System.out.print("��� ���¸� �����Ͻðڽ��ϱ�? : "); delNum = sc.nextInt();
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
	//������ ������ �޴�
	void startStaffMenu(BankAccount3[] person) {
		int select = 0;
		while(true) {
			System.out.println("������  ������\n1.��� ���� Ȯ��\n2.���� ����\n3.���� ����\n0.�����ϱ�");	
			select = sc.nextInt();
			if(select == 0) break;
			switch(select) {
			case 1: printPersonData(person); break;
			case 2: createNewAccount(person); break;
			case 3: deleteAccount(person);break;
			}//end switch
		}//end while
	}
	//����� ������ �޴�
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
		System.out.println("���α׷��� �����մϴ�.");
	}//end startUserMenu
}//end class useBankAccount

