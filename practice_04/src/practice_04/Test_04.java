package practice_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_04 {
	public static void main(String[] args) {
		List<FreeBoard> list = Arrays.asList(
					new FreeBoard(1,"�����λ�","�ȳ��ϼ���."),
					new FreeBoard(2,"�����λ�","�ݰ����ϴ�."),
					new FreeBoard(3,"����","�����ֽ��ϴ�.")
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
