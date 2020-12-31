package pratice_02;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Test_05 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(1, "����")
				 				, new Person(2, "�̸޷�")
				 				, new Person(3, "���ϳ�")
				 				, new Person(4, "������"));	
		System.out.println("--���ٽ�");
		list.forEach(x -> x.toObjString());
		System.out.println("--�޼ҵ� ����");
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
