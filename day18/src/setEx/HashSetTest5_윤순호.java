package setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest5_윤순호 {
			//로또 만들기
			//1~45까지, 6개의 데이터를 출력합니다.
			//이 때, 동일한 난수가 몇개 있었는지 출력해 봅니다.
			//몇번만에 6개 채워졌는지 출력해 봅니다.
			//2. 최초 6개 출력
			//2-1. 이후 오름차순 정렬
	public static void main(String[] args) {

		int cnt = 0;	//횟수 
		Set <Integer> lotto = new HashSet<Integer>();	//로또 번호 저장
		ArrayList<Integer> list = new ArrayList<Integer>();	//겹치는 난수 저장
		
		//로또 번호가 6이므로, 6번 반복진행,
		//lotto번호가 겹칠시 i--하며 list에 겹치는 난수 저장
		for(int i = 0;i < 6; i++) {
			int rand =(int)(Math.random()*45)+1;
			if(lotto.add(rand)) {
				cnt++;
			}else {
				i--;
				cnt++;
				list.add(rand);
			}//end if
		}//end for(i)
		System.out.println("lotto 번호 : "+lotto);
		System.out.println("총 횟수 : "+cnt+"번");
		if(cnt == 6) {
			System.out.println("겹치는 난수가 없습니다.");
		}else {
			System.out.println("중복 난수");
			for(int i = 0;i<45;i++) {
				int count = 0;													//반복진행시 count초기화
				for(int j = 0;j<list.size();j++) {
					if(i == list.get(j))  count++;								//같은값이면 count 1증가
				}//end for(j)
				if(count >= 1) System.out.println(i+" : "+ count + "개");		//count가 1이상일 때만 출력
			}//end for(i);
		}//end if
		System.out.print("오름차순 정렬 : ");
		ArrayList tmp = new ArrayList(lotto);
		Collections.sort(tmp);
		System.out.println(tmp);
	}
}
