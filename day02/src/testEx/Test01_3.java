package testEx;

import javax.swing.JOptionPane;

public class Test01_3 {

	public static void main(String[] args) {
		//문3) 삼항 연산자 문제
		//String msg = "Q.오늘은 당신의 생일입니다.\n" 
		//				+ "친구에게 선물을 받았습니다.\n"
		//				+ "그 선물 상자 안에는 무엇이 들어있을까요?"
		//				+ 1. 꽃\n
		//				+ 2. 손수건\n
		//				+ 3. 보석\n
		//				+ 4. 목걸이\n
		//				+ 5. 게임기\n
		//int choice = 0;		<--번호를 입력받는다.
		//String result = "";	<--삼항 연산자를 이용해서 result에 메시지를 담는다.
		//1. 꽃 : 거짓말을 못하는 타입입니다.
		//2. 손수건 : 굉장히 정직한 타입입니다.
		//3. 보석 : 눈하나 깜빡이지 않고 거짓말 하는 타입입니다.
		//4. 목걸이 : 다른 사람을 구속하는 타입입니다.
		//5. 게임기 : 즉흥적으로 생각하는 타입입니다.
		String msg = "Q.오늘은 당신의 생일입니다.\n친구에게 선물을 받았습니다.\n그 선물 상자 안에는 무엇이 들어있을까요?"
				+ "\n1. 꽃\n2. 손수건\n3. 보석\n4. 목걸이\n5. 게임기\n";
		String result = "";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));
//		switch(choice) {
//		case 1: result = "1. 꽃 : 거짓말을 못하는 타입입니다."; break;
//		case 2: result = "2. 손수건 : 굉장히 정직한 타입입니다."; break;
//		case 3: result = "3. 보석 : 눈하나 깜빡이지 않고 거짓말 하는 타입입니다."; break;
//		case 4: result = "4. 목걸이 : 다른 사람을 구속하는 타입입니다."; break;
//		case 5: result = "5. 게임기 : 즉흥적으로 생각하는 타입입니다."; break;
//		}
		result = (choice == 1) ? "1. 꽃 : 거짓말을 못하는 타입입니다." :
				(choice == 2) ? "2. 손수건 : 굉장히 정직한 타입입니다." :
					(choice == 3) ? "3. 보석 : 눈하나 깜빡이지 않고 거짓말 하는 타입입니다." :
						(choice == 4) ? "4. 목걸이 : 다른 사람을 구속하는 타입입니다." :
							"5. 게임기 : 즉흥적으로 생각하는 타입입니다.";
		JOptionPane.showMessageDialog(null, result);
		//JOptionPane.showMessageDialog(null, message);
		//메세지 다이얼로그 : 두번째 인자의 내용을 대화상자로 출력해주는 메소드
	}

}
