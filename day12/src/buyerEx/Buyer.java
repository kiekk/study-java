package buyerEx;

import java.util.Scanner;

import productEx.Product;
import productEx.Phone;
import productEx.TV;

public class Buyer {
	static Scanner sc = new Scanner(System.in);
	int choice = -1;			//while문 때문에 초기값 -1로 설정
	int shoppingCnt = 0, checkCnt1 = 0, checkCnt2 = 0;		//플래그 변수
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
	//메인 메뉴
	public void menu() {
		while(choice != 0) {
			if(checkCnt1 == 1 && checkCnt2 == 1) {	//체크 카운트 1,2가 모두 1이되면 쇼핑 불가
				System.out.println("더이상 쇼핑할 수 있는 돈이 없습니다.");
				System.out.println("1.대출 받기\t2.집에 가기");
				choice = sc.nextInt();
				switch(choice) {
				case 1: 
					System.out.println("500만원을 대출합니다.");
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
			System.out.println("1. 쇼핑 품목 보기");
			System.out.println("2. 품목 구매 하기");
			System.out.println("3. 현재 잔액 보기");
			System.out.println("0. 종료 하기");
			choice = sc.nextInt();
			if(choice == 0) {
				checkDaechulMoney();
			}
			switch(choice) {
			case 1: showList(); break;
			case 2: 
				if(shoppingCnt != 0) {	//쇼핑 카운트가 1이되어야 쇼핑하기 가능
					startShopping();
					break;
				}else {
					System.out.println("쇼핑 품목을 먼저 확인해 주세요.");
					break;
				}//end if
			case 3: showMoney();break;
			}//end switch
		}//end while
	}//end menu
	//대출금액확인
	void checkDaechulMoney() {
		if(daechulMoney > 0 ) {
			System.out.println("잠깐.");
			System.out.println("빚은 갚고 가셔야죠");
			System.out.println(".....ㅜㅜ");
			System.out.println("대출은 함부로 하지 맙시다..");
		}else {
			System.out.println("안녕히 가세요.");
		}//end if
	}//end checkDaechulMoney
	//쇼핑 품목 보기
	void showList() {
		tv = new TV("100-1","벽걸이TV",3600000,"삼성");
		phone = new Phone("111-1","폴더폰",1200000,"lg");
		tv.printInfo();
		phone.printInfo();
		shoppingCnt = 1;			//쇼핑 카운트 1
	}//end showList
	//현재 잔액 보기
	void showMoney() {
		System.out.println("현재 잔액은 " +this.money+"원 입니다.");
	}//end showMoney
	//쇼핑 하기 - 1
	void startShopping() {
		System.out.println("어느 제품을 구매하시겠습니까?\n1.TV\t2.Phone");
		choice = sc.nextInt();
		switch(choice) {
			case 1: buy(tv);break;
			case 2: buy(phone);break;
		}//end switch
	}//end startShopping
	//쇼핑 하기 - 2
	void buy(Product some) {
		if(money >= some.getProd_price()) {
			System.out.println(some.getProd_name()+"을 구매합니다.");
			money -= some.getProd_price();
		}else {
			System.out.println("잔액이 부족합니다.");
			//instanceof를 사용해서 어떤 타입인지 확인 후 checkCnt1,2로 나누어 값 대입
			if(some instanceof TV)
				checkCnt1 = 1;
			else if(some instanceof Phone)
				checkCnt2 = 1;
		}//end if        
	}//end buy
}//end class Buyer
