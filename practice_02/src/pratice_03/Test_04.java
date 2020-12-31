package pratice_03;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test_04 {
	public static void main(String[] args) {
		DataObj[] data = {
				new DataObj(1, "����")
				,new DataObj(2, "�̸޷�")
				,new DataObj(3, "������")
		};
		Stream<DataObj> stm = Arrays.stream(data);
		stm.forEach(System.out::println);
		
		//�� ���� ����ϱ�
		Arrays.stream(data).forEach(System.out::println);
	}
}
class DataObj {
	int no;
	String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DataObj(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "DataObj [no=" + no + ", name=" + name + "]";
	}
	
	
	
}