package buyerEx;

import java.util.Scanner;

import productEx.Product;
import productEx.Phone;
import productEx.TV;

public class Buyer {
	static Scanner sc = new Scanner(System.in);
	int choice = -1;			//while�� ������ �ʱⰪ -1�� ����
	int shoppingCnt = 0, checkCnt1 = 0, checkCnt2 = 0;		//�÷��� ����
	private int money;
	int daechulMoney;
	TV tv;
	Phone phone;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Buyer(int money){
		this.money = money;
	}
	//���� �޴�
	public void menu() {
		while(choice != 0) {
			if(checkCnt1 == 1 && checkCnt2 == 1) {	//üũ ī��Ʈ 1,2�� ��� 1�̵Ǹ� ���� �Ұ�
				System.out.println("���̻� ������ �� �ִ� ���� �����ϴ�.");
				System.out.println("1.���� �ޱ�\t2.���� ����");
				choice = sc.nextInt();
				switch(choice) {
				case 1: 
					System.out.println("500������ �����մϴ�.");
					money += 5000000;
					daechulMoney += 5000000;
					checkCnt1 = 0;
					checkCnt2 = 0;
					break;
				case 2:
					checkDaechulMoney();
					return;
				}
			}//end if
			System.out.println("1. ���� ǰ�� ����");
			System.out.println("2. ǰ�� ���� �ϱ�");
			System.out.println("3. ���� �ܾ� ����");
			System.out.println("0. ���� �ϱ�");
			choice = sc.nextInt();
			if(choice == 0) {
				checkDaechulMoney();
			}
			switch(choice) {
			case 1: showList(); break;
			case 2: 
				if(shoppingCnt != 0) {	//���� ī��Ʈ�� 1�̵Ǿ�� �����ϱ� ����
					startShopping();
					break;
				}else {
					System.out.println("���� ǰ���� ���� Ȯ���� �ּ���.");
					break;
				}//end if
			case 3: showMoney();break;
			}//end switch
		}//end while
	}//end menu
	//����ݾ�Ȯ��
	void checkDaechulMoney() {
		if(daechulMoney > 0 ) {
			System.out.println("���.");
			System.out.println("���� ���� ���ž���");
			System.out.println(".....�̤�");
			System.out.println("������ �Ժη� ���� ���ô�..");
		}else {
			System.out.println("�ȳ��� ������.");
		}//end if
	}//end checkDaechulMoney
	//���� ǰ�� ����
	void showList() {
		tv = new TV("100-1","������TV",3600000,"�Ｚ");
		phone = new Phone("111-1","������",1200000,"lg");
		tv.printInfo();
		phone.printInfo();
		shoppingCnt = 1;			//���� ī��Ʈ 1
	}//end showList
	//���� �ܾ� ����
	void showMoney() {
		System.out.println("���� �ܾ��� " +this.money+"�� �Դϴ�.");
	}//end showMoney
	//���� �ϱ� - 1
	void startShopping() {
		System.out.println("��� ��ǰ�� �����Ͻðڽ��ϱ�?\n1.TV\t2.Phone");
		choice = sc.nextInt();
		switch(choice) {
			case 1: buy(tv);break;
			case 2: buy(phone);break;
		}//end switch
	}//end startShopping
	//���� �ϱ� - 2
	void buy(Product some) {
		if(money >= some.getProd_price()) {
			System.out.println(some.getProd_name()+"�� �����մϴ�.");
			money -= some.getProd_price();
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
			//instanceof�� ����ؼ� � Ÿ������ Ȯ�� �� checkCnt1,2�� ������ �� ����
			if(some instanceof TV)
				checkCnt1 = 1;
			else if(some instanceof Phone)
				checkCnt2 = 1;
		}//end if        
	}//end buy
}//end class Buyer
