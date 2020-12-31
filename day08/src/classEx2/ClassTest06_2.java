package classEx2;

import java.util.Scanner;

class Person{
	String name;
	private int age;
	private double height;
	private double weight;
	private String hobby;
	//getter / setter
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}
	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight = weight;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;}
	//생성자
	public Person() {}
	public Person(String name,int age,double height,double weight,String hobby) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public Person(String name, String hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person(String name, int age, double height, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.hobby = hobby;
	}
	//출력 메소드
	void printData() {
		System.out.println(name+"\t"+age+"\t"+height+"\t"+weight+"\t"+hobby);
	}//end printData
}//end person
public class ClassTest06_2 {
	static Scanner sc = new Scanner(System.in);
	static void initialPersonData(Person []person) {					//객체 초기화
		for(int i = 0;i<person.length;i++) {
			person[i] = new Person();
		}//end for
	}//end initialPersonData
	static void printPersonData(Person []person) {						//객체 출력
		System.out.println("번호\t이름\t나이\t키\t몸무게\t취미");
		for(int i = 0;i<person.length;i++) {
			if(person[i].name == null) break;
			System.out.print((i+1)+"번\t");
			person[i].printData();
		}//end for
	}//end printPersonData
	static int showMenu(int select) {									//메뉴 보기
		System.out.println("┏━━━━━━━메뉴    보기  ━━━━━━━┓");
		System.out.println("┃   1. 사람 정보 추가하기                  ┃");
		System.out.println("┃   2. 사람 정보 출력하기                  ┃");
		System.out.println("┃   3. 사람 정보 수정하기                  ┃");
		System.out.println("┃   0. 종료 하기                           ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("   입력 : "); select = sc.nextInt();
		return select;
	}//end showMenu
	static void inputPersonData(Person[] person) {						//정보 추가
		int search = 0,inputNum = 0,age = 0;
		double height = 0.0,weight = 0.0;
		String name = "",hobby = "";
		while(person[search].name != null) {
			search++;
		}//end while
		System.out.print("몇명을 추가하시겠습니까? : ");inputNum = sc.nextInt();
		System.out.println(inputNum +"명을 추가합니다.");
		for(int i = search; i < search+inputNum; i++) {
			System.out.print("이름을 입력하세요 : "); name = sc.next();
			person[i].name = name;
			while(true) {
				System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
				if(age >= 0 && age <= 100) {
					person[i].setAge(age);
					break;
				}else {
					System.out.println("나이는 0~100세 사이로 입력하세요.");
				}//end if
			}//end while
			while(true) {
				System.out.print("키를 입력하세요 : "); height = sc.nextDouble();
				if(height >= 0 && height <= 200) {
					person[i].setHeight(height);
					break;
				}else {
					System.out.println("키는 0~200cm사이로 입력하세요.");
				}//end if
			}//end while
			while(true) {
				System.out.print("몸무게를 입력하세요 : "); weight = sc.nextDouble();
				if(weight >= 0 && weight <= 200) {
					person[i].setWeight(weight);
					break;
				}else {
					System.out.println("몸무게는 0~200cm사이로 입력하세요.");
				}//end if
			}//end while
			System.out.print("취미를 입력하세요 : "); hobby = sc.next();
			person[i].setHobby(hobby);
		}//end for(i)
	}//end inputPersonData
	static void changePersonData(Person []person) {
		int search = 0,age = 0;
		double height = 0.0,weight = 0.0;
		String name = "",hobby = "";
		System.out.print("몇 번째 정보를 수정하시겠습니까? : "); search = sc.nextInt();
		System.out.println(search +"번 정보를 수정합니다.");
		while(true) {
			System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
			if(age >= 0 && age <= 100) {
				person[search-1].setAge(age);
				break;
			}else {
				System.out.println("나이는 0~100세 사이로 입력하세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("키를 입력하세요 : "); height = sc.nextDouble();
			if(height >= 0 && height <= 200) {
				person[search-1].setHeight(height);
				break;
			}else {
				System.out.println("키는 0~200cm사이로 입력하세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("몸무게를 입력하세요 : "); weight = sc.nextDouble();
			if(weight >= 0 && weight <= 200) {
				person[search-1].setWeight(weight);
				break;
			}else {
				System.out.println("몸무게는 0~200cm사이로 입력하세요.");
			}//end if
		}//end while
		System.out.print("취미를 입력하세요 : "); hobby = sc.next();
		person[search-1].setHobby(hobby);
	}
	public static void main(String[] args) {
		Person []person = new Person[100];
		initialPersonData(person);	//객체초기화
		int select = -1;
		person[0] = new Person("홍길동",15,178.5,56.7,"게임");
		person[1] = new Person("이순신",20,158.6,47.3,"음악듣기");
		person[2] = new Person("박문수",25,138.2,75.2,"독서");
		printPersonData(person);	//초기값 출력
		while(select != 0) {
			select = showMenu(select);
			switch(select) {
			case 1: inputPersonData(person);break;
			case 2: printPersonData(person);break;
			case 3: changePersonData(person);break;
			}//end select
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}//end main
}//end class
