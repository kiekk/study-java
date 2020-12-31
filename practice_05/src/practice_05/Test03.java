package practice_05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
	public int solution(String s, int n){
		int count = 0;//최소 거친 개수
		int m = 0;	//글자의 종류
		int m_count = 0;	//글자 마다 개수
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char s_ = s.charAt(i);
			if(s_ >= 97 && s_ <= 122) {
				if(!map.containsKey(s_+"")) {
					m++;
					m_count = 0;
				}
				map.put(s_+"", ++m_count);
			}
		}
		
        return 0;
    }
	
	public static void main(String[] args) {
		Test03 test = new Test03();
		String s = "aaaaabbc";
		int n = 1;
		int result = test.solution(s, n);
		System.out.println(result);
	}
}
