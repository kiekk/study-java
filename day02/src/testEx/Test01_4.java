package testEx;

import javax.swing.JOptionPane;

public class Test01_4 {

	public static void main(String[] args) {
		//문4) 1~100까지 중 3과 5의 공배수 (예, 15, 30, 45, 60...)를 출력
		//	조건: 조건식은 2개를 사용할 것, continue를 사용할 것
//		for(int i = 1;i<101;i++) {
//			if(i % 3 == 0 && i % 5 == 0) 
//				System.out.println("3과 5의 공배수 : "+ i);
//			else
//				continue;
//		}
		for(int i = 1;i<101;i++) {
			if(i % 3 == 0){
				if(i % 5 == 0) {
					System.out.println("3과 5의 공배수 : "+ i);
				}else
					continue;
			}else 
				continue;
		}//end for
	}

}
