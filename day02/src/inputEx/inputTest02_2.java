package inputEx;

import javax.swing.JOptionPane;
/*
 	대화상자를 이용해 값 입력받기
 	문1)자동차 변수 3개 만들고 출력해 봅니다.
 	문2)사람 정보를 입력받아 봅니다.
 	
 	
 */

public class inputTest02_2 {

	public static void main(String[] args) {
		
		//문1) 자동차 정보 입력 받기
		String car_Brand = JOptionPane.showInputDialog("자동차 브랜드 입력");
		int car_Price = Integer.parseInt(JOptionPane.showInputDialog("자동차 가격(단위 : 만원)"));
		String car_Color = JOptionPane.showInputDialog("자동차 색상 입력");
		System.out.println("브랜드 : " + car_Brand);
		System.out.println("가격(단위 : 만원) : " + car_Price + "만원");
		System.out.println("색상 : " + car_Color);
		
//		//문2) 사람 정보 입력 받기
//		String name = JOptionPane.showInputDialog("이름 입력");
//		char gender =  JOptionPane.showInputDialog("성별 입력(남자/여자)").charAt(0);
//		//문자열을 입력받으려고 하지만 저장하려는 변수는 문자형입니다.
//		//charAt(index)를 용해 입력받은 문자열의 첫글자만 저장합니다.
//		int age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
//		String address = JOptionPane.showInputDialog("주소 입력");
//		String say = JOptionPane.showInputDialog("하고 싶은 말");
//		System.out.println("이름 : "+ name);
//		System.out.println("성별 : "+ gender);
//		System.out.println("나이 : "+ age);
//		System.out.println("주소 : "+ address);
//		System.out.println("하고 싶은 말 : "+ say);
	}
}
