package mapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
	HashMap<키, 밸류>
		키, 밸류
		put(키,밸류)
		get(키)

 */
public class HashMapTest3_1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		//		   id	   pw
		map.put("이순신", "100");
		map.put("유관순", "120");
		map.put("강감찬", "130");
		map.put("박문수", "140");
		System.out.println(map);

		//로그인 처리
		//1. 키가 아이디 
		//2. 입력한 아이디가 map에 있는지 검사
		//2-1. 아이디가 없으면 다시 입력
		//2-2. 아이디가 있으면 3
		//3. 비밀번호와 map에 있는 value가 같은지 검사
		//4. 로그인 되었습니다.
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("id : "); String id = sc.nextLine().trim(); 
			System.out.print("pw : "); String pw = sc.nextLine().trim();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}
			}
			System.out.println("다시입력");
		}
	}

}
