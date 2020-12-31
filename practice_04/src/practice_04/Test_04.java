package practice_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_04 {
	public static void main(String[] args) {
		List<FreeBoard> list = Arrays.asList(
					new FreeBoard(1,"가입인사","안녕하세요."),
					new FreeBoard(2,"가입인사","반갑습니다."),
					new FreeBoard(3,"질문","질문있습니다.")
				);
		List<FreeBoard> reversedList = list.stream()
										   .collect(Collectors.collectingAndThen(Collectors.toList(), contents -> {
											   Collections.reverse(contents);
											   return contents.stream();
										   }))
										   .collect(Collectors.toList());
		long cnt = list.stream().collect(Collectors.counting());
		reversedList.stream().forEach(System.out::println);
		System.out.println(cnt);
		//System.out.println(list.size());
	}
}

class FreeBoard{
	private int no;
	private String title;
	private String contents;
	
	public FreeBoard(int no, String title, String contents) {
		this.no = no;
		this.title = title;
		this.contents = contents;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "FreeBoard [no=" + no + ", title=" + title + ", contents=" + contents + "]";
	}
	
}
