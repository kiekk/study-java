package mart;

import buyerEx.Buyer;

/*
 	기획의도
 	1. 쇼핑 품목 보기
 	2. 쇼핑 하기
 	3. 현재 잔액 보기
 	4. 종료
 	4가지 메뉴로 구성, 
 	쇼핑 품목 보기를 확인하지 않고 바로 쇼핑하기를 누를경우,
 	쇼핑 품목을 먼저 보고오라는 메세지 출력후 return,
 	쇼핑 하기의 경우 2가지 TV, Phone으로 미리 초기화한 품목으로 구매 가능,
 	잔액이 부족할 경우 잔액 부족이라는 메세지 출력후 return하며
 	두 품목 모두 잔액 부족일 경우 더 이상 쇼핑 가능한 상태가 아니기 때문에
 	쇼핑이 불가능하다는 메세지 출력과 함께 프로그램 종료.
 */

public class ProductMain {

	public static void main(String[] args) {
		
		Buyer hgd = new Buyer(5000000);	//소지금
		hgd.menu();

	}
}