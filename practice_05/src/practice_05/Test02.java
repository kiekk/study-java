package practice_05;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public int solution(int page, int[] broken){
		//기존의 버튼 배열
		int[] button = {1,2,3,4,5,6,7,8,9,0};
		//눌러야 하는 횟수
		int count = 0;
		//페이지가 100이라면 아무것도 누르지 않아도 됩니다.
		if(page == 100) return count;
		String str_page = page + "";
		//고장나지 않은 버튼을 담을 배열
		List<Integer> unbroken_button = new ArrayList<Integer>();
		for(int i=0;i<button.length;i++) {
			for(int j=0;j<broken.length;j++) {
				if(!(button[i] == broken[j])) unbroken_button.add(button[i]);
			}
		}
		//가야할 page 번호를 누를 수 있는 버튼이 있다면 해당 버튼을 누르고, 그렇지 않다면
		//누를수 있는 버튼 중 눌러야하는 번호와 최소값인 버튼을 찾아 입력합니다.
		//ex) 고장난 버튼 5, 고장난 버튼에서 최소값인 3,6을 찾아서 입력합니다.(abs를 이용해 절대값으로 찾습니다)
		for(int i=0;i<str_page.length();i++) {
			for(int j=0;j<broken.length;j++) {
				int number = Integer.parseInt(str_page.charAt(i)+"");
				if(number == broken[j]) {
					
				}
				count++;
			}
		}
		
        return count;
    }
	
	public static void main(String[] args) {
		Test02 test = new Test02();
		int page = 5457;
		int[] broken = {6,7,8};
		int result = test.solution(page, broken);
	}
}
