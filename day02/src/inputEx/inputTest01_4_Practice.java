package inputEx;

import java.util.Scanner;

/*
 	입력받기 예제
 	1) 도서목록 : 변수 4개 이상 만들고 출력하기
 	2) TV : 변수 3개 이상 만들고 출력하기
 	3) 사람 정보 : 변수 3개 이상 만들고 출력하기
 */
public class inputTest01_4_Practice {

	public static void main(String[] args) {
		//스캐너 활용 -> 객체 = 인스턴스
		Scanner sc = new Scanner(System.in);
		System.out.println("3. 몽타주 그리기");
		//변수 선언
		String type_Face = "";			//얼굴형
		String type_Eye = "";			//눈동자 색깔
		String type_Nose = "";			//코
		int choice = 0;
		System.out.println("범인의 얼굴을 묘사해주세요.");
		System.out.println("경찰 : 얼굴형은 어떻게 생겼습니까?");
		System.out.println("1.둥근형   2.사각형   3.긴 얼굴형   4.짧은 얼굴형 ");
		choice = sc.nextInt();
		if(choice == 1) { type_Face = "둥근형";
		}else if(choice == 2) {	type_Face = "사각형";
		}else if(choice == 3) { type_Face = "긴 얼굴형";
		}else if(choice == 4) { type_Face = "짧은 얼굴형";}
		
		System.out.println("나 : 얼굴형은 " + type_Face +"이었어요.");
		System.out.println("경찰 : 눈은 어떻게 생겼습니까?");
		System.out.println("1.쌍꺼풀이 있는    2.쌍꺼풀이 없는");
		choice = sc.nextInt();
		if(choice == 1) { type_Eye = "쌍꺼풀이 있는";
		}else if(choice == 2) {type_Eye = "쌍꺼풀이 없는";}
		System.out.println("나 : " + type_Eye +" 눈동자 였어요.");
		
		System.out.println("경찰 : 코는 어떻게 생겼습니까?");
		System.out.println("1. 들창코  2. 코주부  3. 높은 콧대 4. 낮은 콧대");
		choice = sc.nextInt();
		if(choice == 1) { type_Nose = "들창코";
		}else if(choice == 2) {type_Nose = "코주부";
		}else if(choice == 3) {type_Nose = "높은 콧대";
		}else if(choice == 4) {type_Nose = "낮은 콧대";}
		System.out.println("나 : " + type_Eye +" 였던것 같아요.");
		
		System.out.println("-------------범인 몽타주-------------");
		System.out.println("얼굴은 " +type_Face+"이고, "+type_Eye+" 눈을 가졌으며, "+type_Nose+"를 가진 사람이 범인입니다.");


	}

}
