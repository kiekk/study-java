package genericEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 	제너릭
	데이터 구조화
	김철수 10 20 30
	이순희 11 21 31
	박문수 12 22 33

	여러 타입이 복합적으로 구성되어 있을 때,
	객체단위로 add시킬 수 있게,
	클래스로 설계해놓자 : 모델 클래스(Model)이라고 합니다.
	jsp의 bean에 해당합니다.
	그리고, ArrayList의 제너릭에 해당 모델 클래스를 제너릭으로 작성하면
	ArrayList<MyClass> list = new ArrayList<Myclass>();
	list에 add() 시킬 때마다, MyClass의 인스턴스만 추가하게 됩니다.
 */
class MyException extends Exception{

	public MyException(Student e) {
		System.out.println(e);
	}
	
}
class Student{	
	private String name;
	private 
	int bunho;
	public Student(String name, int bunho) {
		this.name = name;
		this.bunho = bunho;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBunho() {
		return bunho;
	}

	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", bunho=" + bunho + "]";
	}  

}
public class GenericTest02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		//list에는 Student 타입의 객체만 add 시킬 수 있게 되었습니다.
		list.add(new Student("김철수",10));
		Student std2 = new Student("이순이",20);
		list.add(std2);

		System.out.println(list);
		//김철수 번호, 이순이 번호의 합
		int sum = 0;
		for(Student a : list) {
			sum += a.getBunho();
		}
		System.out.println("두 번호 합 : "+sum);
		sum = 0;

		//iterator을 통해 출력
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student std = itr.next();
			System.out.println(std);
		}
		itr = list.iterator();
		//김철수 라는 사람이 있는지 검색해 봅니다.
		//1번 방법
//		try {
//			for(int i = 0;i<list.size();i++) {
//				if(list.get(i).getName().equals("김철수")) {
//					throw new MyException(list.get(i));
//				}//end if
//			}//end for
//			System.out.println("정보가 없습니다.");
//		}catch(MyException e) {
//			e.getMessage();
//		}//end try
		//2번 방법
		while(itr.hasNext()) {
			Student std = itr.next();
//			if(std.getName() == "김철수") {		//문자열 비교는 ==연산자 대신 equals를 쓰도록 합니다.
			if(std.getName().equals("김철수")) {
				System.out.println(std);
			}//end if
		}//end while
		itr = list.iterator();
		//이순이 라는 사람의 이름을 이순희로 변경해 봅니다.
		//1번 방법
		while(itr.hasNext()) {
			Student std = itr.next();
//			if(std.getName() == "이순이") {
			if(std.getName().equals("이순이")) {
				std.setName("이순희");
				System.out.println(std);
			}//end if
		}//end while
		//2번 방법
//		for(int i = 0;i<list.size();i++) {
//			if(list.get(i).getName().equals("이순이")) {
//				list.get(i).setName("이순희");
//				System.out.println(list.get(i));
//			}//end if
//		}//end for
		//3번 방법
//		for(Student a : list) {
//			String msg = a.getName();
//			if(msg.equals("이순이")) {
//				msg="이순희";
//				a.setName(msg);
//				System.out.println(a);
//			}//end if
//		}//end for
	}

}
