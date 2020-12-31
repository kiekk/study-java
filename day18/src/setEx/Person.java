package setEx;

public class Person{
	String name;
	int juminbunho;
	public Person(String name, int juminbunho) {
		this.name = name;
		this.juminbunho = juminbunho;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", juminbunho=" + juminbunho + "]"+"\n";
	}
	@Override
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return this.juminbunho == ((Person)obj).juminbunho;
		}
		return false;
	}

}