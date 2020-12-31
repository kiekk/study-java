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
	//������
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
	//��� �޼ҵ�
	void printData() {
		System.out.println(name+"\t"+age+"\t"+height+"\t"+weight+"\t"+hobby);
	}//end printData
}//end person
public class ClassTest06_2 {
	static Scanner sc = new Scanner(System.in);
	static void initialPersonData(Person []person) {					//��ü �ʱ�ȭ
		for(int i = 0;i<person.length;i++) {
			person[i] = new Person();
		}//end for
	}//end initialPersonData
	static void printPersonData(Person []person) {						//��ü ���
		System.out.println("��ȣ\t�̸�\t����\tŰ\t������\t���");
		for(int i = 0;i<person.length;i++) {
			if(person[i].name == null) break;
			System.out.print((i+1)+"��\t");
			person[i].printData();
		}//end for
	}//end printPersonData
	static int showMenu(int select) {									//�޴� ����
		System.out.println("�����������������޴�    ����  ����������������");
		System.out.println("��   1. ��� ���� �߰��ϱ�                  ��");
		System.out.println("��   2. ��� ���� ����ϱ�                  ��");
		System.out.println("��   3. ��� ���� �����ϱ�                  ��");
		System.out.println("��   0. ���� �ϱ�                           ��");
		System.out.println("����������������������������������������������");
		System.out.print("   �Է� : "); select = sc.nextInt();
		return select;
	}//end showMenu
	static void inputPersonData(Person[] person) {						//���� �߰�
		int search = 0,inputNum = 0,age = 0;
		double height = 0.0,weight = 0.0;
		String name = "",hobby = "";
		while(person[search].name != null) {
			search++;
		}//end while
		System.out.print("����� �߰��Ͻðڽ��ϱ�? : ");inputNum = sc.nextInt();
		System.out.println(inputNum +"���� �߰��մϴ�.");
		for(int i = search; i < search+inputNum; i++) {
			System.out.print("�̸��� �Է��ϼ��� : "); name = sc.next();
			person[i].name = name;
			while(true) {
				System.out.print("���̸� �Է��ϼ��� : "); age = sc.nextInt();
				if(age >= 0 && age <= 100) {
					person[i].setAge(age);
					break;
				}else {
					System.out.println("���̴� 0~100�� ���̷� �Է��ϼ���.");
				}//end if
			}//end while
			while(true) {
				System.out.print("Ű�� �Է��ϼ��� : "); height = sc.nextDouble();
				if(height >= 0 && height <= 200) {
					person[i].setHeight(height);
					break;
				}else {
					System.out.println("Ű�� 0~200cm���̷� �Է��ϼ���.");
				}//end if
			}//end while
			while(true) {
				System.out.print("�����Ը� �Է��ϼ��� : "); weight = sc.nextDouble();
				if(weight >= 0 && weight <= 200) {
					person[i].setWeight(weight);
					break;
				}else {
					System.out.println("�����Դ� 0~200cm���̷� �Է��ϼ���.");
				}//end if
			}//end while
			System.out.print("��̸� �Է��ϼ��� : "); hobby = sc.next();
			person[i].setHobby(hobby);
		}//end for(i)
	}//end inputPersonData
	static void changePersonData(Person []person) {
		int search = 0,age = 0;
		double height = 0.0,weight = 0.0;
		String name = "",hobby = "";
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�? : "); search = sc.nextInt();
		System.out.println(search +"�� ������ �����մϴ�.");
		while(true) {
			System.out.print("���̸� �Է��ϼ��� : "); age = sc.nextInt();
			if(age >= 0 && age <= 100) {
				person[search-1].setAge(age);
				break;
			}else {
				System.out.println("���̴� 0~100�� ���̷� �Է��ϼ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("Ű�� �Է��ϼ��� : "); height = sc.nextDouble();
			if(height >= 0 && height <= 200) {
				person[search-1].setHeight(height);
				break;
			}else {
				System.out.println("Ű�� 0~200cm���̷� �Է��ϼ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("�����Ը� �Է��ϼ��� : "); weight = sc.nextDouble();
			if(weight >= 0 && weight <= 200) {
				person[search-1].setWeight(weight);
				break;
			}else {
				System.out.println("�����Դ� 0~200cm���̷� �Է��ϼ���.");
			}//end if
		}//end while
		System.out.print("��̸� �Է��ϼ��� : "); hobby = sc.next();
		person[search-1].setHobby(hobby);
	}
	public static void main(String[] args) {
		Person []person = new Person[100];
		initialPersonData(person);	//��ü�ʱ�ȭ
		int select = -1;
		person[0] = new Person("ȫ�浿",15,178.5,56.7,"����");
		person[1] = new Person("�̼���",20,158.6,47.3,"���ǵ��");
		person[2] = new Person("�ڹ���",25,138.2,75.2,"����");
		printPersonData(person);	//�ʱⰪ ���
		while(select != 0) {
			select = showMenu(select);
			switch(select) {
			case 1: inputPersonData(person);break;
			case 2: printPersonData(person);break;
			case 3: changePersonData(person);break;
			}//end select
		}//end while
		System.out.println("���α׷��� �����մϴ�.");
	}//end main
}//end class
