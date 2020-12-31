package homeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
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
public class HashMapQuiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mun = {"apple","rabbit","computer","당근","컴퓨터","고양이","강아지","dog","cat"};
		String[] dap = {"사과","토끼","컴퓨터","carrot","computer","cat","dog","강아지","고양이"};
		HashMap<String,String> quiz = new HashMap<>();
		int i = 1,totalScore = 0,plusScore = 10, cnt = 0;
		String ans = "";
		for(int j = 0;j<mun.length;j++) {
			quiz.put(mun[j], dap[j]);
		}
		Set<Entry<String,String>> set = quiz.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> tmp = itr.next();
			System.out.println(i+"번 문제  : "+tmp.getKey());
			System.out.print("정답을 입력해 주세요 : ");ans = sc.next();
			if(tmp.getValue().equals(ans)) {
				System.out.println("정답입니다."+plusScore+"점 획득하셨습니다.");
				totalScore += plusScore;
				cnt++;
			}else {
				System.out.println("틀렸습니다. 정답은 : "+tmp.getValue()+"입니다.");
			}
			i++;
		}
		System.out.println("결과 : 총 "+quiz.size()+"문제 중 "+cnt+"문제를 맞추셨습니다.");
		System.out.println("총 점수 : "+totalScore+"점 입니다.");
	}
}
