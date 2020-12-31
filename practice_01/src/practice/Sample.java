package practice;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

public class Sample {
	public static void main(String[] args) {
		
	}
}

@RequiredArgsConstructor
class Person {
	private final int no;
	private String name;
	private String phone;
	
	@Builder
	public Person(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
}