package pratice_02;

import java.util.function.Supplier;

import lombok.Getter;

public class Test_06 {
	public static void main(String[] args) {
		Supplier<Name> supplier1 = () -> new Name();
		Name name1 = supplier1.get();
		System.out.println("���ٽ� - " + name1.getName());
		
		Supplier<Name> supplier2 = Name::new;
		Name name2 = supplier2.get();
		System.out.println("������ ���� - " + name2.getName());
	}
}
class Name{
	private String name;
	
	public Name() {
		this.name = "���ϳ�";
	}
	public String getName() {
		return name;
	}
}
