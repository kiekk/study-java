package homeWork;
/*
 	단어 맞추기 1, 2번 문제에서 관리자 모드 추가
 	문제    정답
 	영어 -> 한글
 	한글 -> 영어
 ex)apple -> 사과
   rabbit -> 토끼
    당근 -> carrot
   컴퓨터 -> computer

   메인 메뉴

   1.관리자 
   2.도전자
   0.종료하기

   관리자 메뉴
   1.문제 추가
   2.점수 관리
   도전자 메뉴
    id 입력
 */

public class QuizMain {
	public static void main(String[] args) {
		new HashMapQuiz_03().mainMenu();
	}//end main
}
