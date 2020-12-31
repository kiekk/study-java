package homeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	단어 맞추기 1
 	문제    정답
 	영어 -> 한글
 	한글 -> 영어
 ex)apple -> 사과
   rabbit -> 토끼
    당근 -> carrot
   컴퓨터 -> computer
 */
/*
 	문제, 답을 QuizGame이라는 클래스 안의 인스턴스변수로 생성
 	Map의 value를 QuizGame클래스로 지정
 	Map의 key는 for문을 이용해서 자동으로 할당
 	난수를 생성하는데, 반복문을 이용해  str의 사이즈만큼 생성
 	난수로 출력되는 문제들이 중복되면 안되기에 Set컬렉션에 난수를 저장하여 중복안되게 함
 */
class QuizGame {
	private String mun;
	private String dap;
	public QuizGame(String mun, String dap) {
		this.mun = mun;
		this.dap = dap;
	}
	public QuizGame() {}
	//퀴즈 문제
	void playQuiz() {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int totalScore = 0,plusScore = 10, cnt = 0;
		String[] mun = {"apple","rabbit","computer","당근","컴퓨터","고양이","강아지","dog","cat"};
		String[] dap = {"사과","토끼","컴퓨터","carrot","computer","cat","dog","강아지","고양이"};
		Map<Integer,QuizGame> str = new HashMap<>();	//키,문제,답 저장
		Set<Integer> set = new HashSet<>();				//난수 저장
		//반복문 이용, 키,문제,답 저장
		for(int i = 0;i<mun.length;i++) {
			QuizGame quiz = new QuizGame(mun[i],dap[i]);
			str.put(i, quiz);
		}
		for(int i = 0;i<str.size();i++) {
			int rand = (int)(Math.random()*str.size());
			if(set.add(rand)) {
				System.out.println((i+1)+"번 문제  : "+str.get(rand).mun);	
				System.out.print("답을 입력해 주세요(한글->영어,영어->한글) : "); ans = sc.next();
				if(str.get(rand).dap.equals(ans)) {
					System.out.println("정답입니다."+plusScore+"점 획득하셨습니다.");
					totalScore += plusScore;
					cnt++;
				}else {
					System.out.println("틀렸습니다. 정답은 : "+str.get(rand).dap+"입니다.");
				}
			}else {
				i--;
			}
		}
		System.out.println("결과 : 총 "+str.size()+"문제 중 "+cnt+"문제를 맞추셨습니다.");
		System.out.println("총 점수 : "+totalScore+"점 입니다.");
	}
}
public class HashMapQuiz_02 {
	public static void main(String[] args) {
		new QuizGame().playQuiz();
	}

}
