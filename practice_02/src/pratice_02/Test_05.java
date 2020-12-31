package pratice_02;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Test_05 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(1, "김사과")
				 				, new Person(2, "이메론")
				 				, new Person(3, "반하나")
				 				, new Person(4, "오렌지"));	
		System.out.println("--람다식");
		list.forEach(x -> x.toObjString());
		System.out.println("--메소드 참조");
		list.forEach(Person::toObjString);
	}
}

@Getter
@Setter
class Person{
	private Integer no;
	private String name;
	
	public Person(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void toObjString() {
		System.out.println("Person [no=" + no + ", name=" + name + "]");
	}
}
