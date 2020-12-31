package extendsEx;
/*
	���
	�������� ���� ����(���ε�)
	
	����� ������
	�θ� - �ڽ� Ŭ������ ���踦 �����ϱ�
	
	��� - �����
		 - ����
		 - ������
	���...
	
	��� : �θ� Ŭ����
	�����, ����, ������ ��� : �ڽ� Ŭ����
	
	��� : �ν��Ͻ� ���� 3�� �̻�
	�ڽ�Ŭ���� : �ν��Ͻ� ���� 2�� �̻�
	
	//�ʼ� �޼��� : ���� ���
	//���� �޼��� : ����(����), ������ ���� ��� ��
	
	1. �������̵� ������ ����
	2. �����ε� ������ ����
	
	���� : /homework/java_day10/ExtendsTest04_1_����ȣ
 */
import java.util.Scanner;
/**
 * ������ �����ε� - �ʱⰪ���� �� �־��� �����̱� ������ �����ڴ� ���� �����ε� ���� �ʾҽ��ϴ�.
 * �������̵� - printInfo()�޼ҵ带 �������̵� ������, printPlayerInfo()�� ó���� �������̵� �Ϸ��� �Ͽ����� Ư�� ��¹��� ����ϱ� ���ؼ� �̸��� �ٸ����Ͽ����ϴ�.
 *
 */
class Person{
	//person �ν��Ͻ� ���� ����
	private String name;		//�̸�
	private int age;			//����
	private int height;			//Ű
	private int weight;			//������
	//getter, setter
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setHeight(int height) {this.height = height;}
	public void setWeight(int weight) {this.weight = weight;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	//������
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public void printInfo() {
		System.out.println("������������������"+name+"������������������");
		System.out.println("��     ����  : "+age+"��");
		System.out.println("��      Ű   : "+height+"cm");
		System.out.println("��    ������  : "+weight+"kg");
		System.out.println("������������������������������������������");
	}
}//end class Person
class BasketballPlayer extends Person{
	protected int num;					//���ȣ		<--���ȣ�� ���� private���ص� �ɰ� ���Ƽ�..
	private int att;			//���ݷ�
	private int def;			//�����
	private int speed;			//���ǵ�
	private int vision;			//�þ߷�
	private int mental;			//���ŷ�
	private int price;			//����
	private static String team;	//�Ҽ���
	//getter, setter
	public void setAtt(int att) {this.att = att;}
	public void setDef(int def) {this.def = def;}
	public void setSpeed(int speed) {this.speed = speed;}
	public void setVision(int vision) {this.vision = vision;}
	public void setMental(int mental) {this.mental = mental;}
	public void setPrice(int price) {this.price = price;}
	public static void setTeam(String team) {BasketballPlayer.team = team;}
	public int getAtt() {return att;}
	public int getDef() {return def;}
	public int getSpeed() {return speed;}
	public int getVision() {return vision;}
	public int getMental() {return mental;}
	public int getPrice() {return price;}
	public static String getTeam() {return team;}
	//������
	public BasketballPlayer(String name, int age, int height, int weight, int num, int att, int def, int speed,
			int vision, int mental, int price,String team) {
		super(name,age,height,weight);
		this.num = num;
		this.att = att;
		this.def = def;
		this.speed = speed;
		this.vision = vision;
		this.mental = mental;
		this.price = price;
		this.team = team;
	}
	public BasketballPlayer(String name, int age, int height, int weight, int num, int att, int def, int speed,
			int vision, int mental, int price) {
		super(name,age,height,weight);
		this.num = num;
		this.att = att;
		this.def = def;
		this.speed = speed;
		this.vision = vision;
		this.mental = mental;
		this.price = price;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("�������������������ɷ�ġ������������������");
		System.out.println("��   ���ȣ : "+num+"��");
		System.out.println("��   ���ݷ�  : "+att);
		System.out.println("��   �����  : "+def);
		System.out.println("��   ���ǵ�  : "+speed);
		System.out.println("��   �þ߷�  : "+vision);
		System.out.println("��   ���ŷ�  : "+mental);
		System.out.println("��    ����  : "+price+"��");
		System.out.println("������������������������������������������");
	}
}//end class BasketballPlayer
class BasketballTeam extends BasketballPlayer{
	static Scanner sc = new Scanner(System.in);
	//���� �ϰ� ���� ������ ���� ���� ������..
	int money;				//�� �ڱ�
	String teamInfo;		//�� �Ұ�
	int teamAbility;		//�� �ɷ�ġ
	//getter, setter
	void setTeamAbility( int att, int def, int speed, int vision, int mental) {
		this.teamAbility = (att+def+speed+vision+mental)/50;
	}
	int getTeamAbility() {return teamAbility;}
	int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}
	//������
	public BasketballTeam() {
		super("null",0,0,0,0,0,0,0,0,0,0,"");
	};
	public BasketballTeam(String name, int age, int height, int weight, int num, int att, int def, int speed, int vision, int mental,
			int price,String team) {
		super(name,age,height,weight,num,att,def,speed,vision,mental,price,team);
	}
	//���� ���� ���
	public void printPlayerInfo() {
		setTeamAbility(getAtt(),getDef(),getSpeed(),getVision(),getMental());
		System.out.print(num+"��\t"+getName()+"\t"+getAtt()+"\t"+getDef()+"\t"+getSpeed()+"\t"+getVision()+"\t"+getMental()+"\t"+getPrice()+"\t"+getTeamAbility()+"\t\t  ��\n");
	}//end printInfo
	static void printPlayerList(BasketballTeam [] array) {
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t\t"+getTeam()+"�� ��������\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t���⿩��\t  ��");
		for(int i = 0;i<5;i++) {
			if(array[0].num == 0) {
				System.out.println("    ��\t\t\t\t      �������� ��ϵ� ������ �����ϴ�.\t\t\t\t                ��");
				break;
			}//end if
			System.out.print("    ��\t"+(i+1)+"\t ");
			array[i].printPlayerInfo();
		}//end for(i)
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t�ĺ�����\t\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t���⿩��\t  ��");
		for(int i = 5;i<array.length;i++) {
			if(array[5].num == 0) {
				System.out.println("    ��\t\t\t\t       �ĺ��� ��ϵ� ������ �����ϴ�.\t\t\t          ��");
				break;
			}else if(array[i].num == 0) break;
			System.out.print("    ��\t"+(i-4)+"\t");
			array[i].printPlayerInfo();
		}//end for(i)
		System.out.println("    ������������������������������������������������������������������������������������������������");
	}//end printPlayerList
	//Ư�� ���� ���� ���
	static void getPlayerInfo(BasketballTeam [] array,int inputNum) {
		for(int i = 0;i<array.length;i++){
			if(i == (inputNum-1)) array[i].printInfo();
//				array[i].printPlayerInfo();
		}//end for(i)
	}//end getPlayerInfo
	//FA���� ���� ���
	static void showFAMarket(BasketballTeam [] wonju,BasketballTeam [] array) {
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t\tFA����\t\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t���⿩��\t  ��");
		for(int i = 0;i<array.length;i++) {
			if(array[0].num == 0) {
				System.out.println("    ��\t\t\t\t      FA�� ��ϵ� ������ �����ϴ�.\t\t\t            ��");
				break;
			}else if(array[i].num == 0) break;
			else {
				System.out.print("    ��\t"+(i+1)+"\t");
				array[i].printPlayerInfo();
			}
		}
		System.out.println("    ������������������������������������������������������������������������������������������������");
		//FA�޴�
		FAMarket.FAMarketMenu(wonju,array);
	}//end showFAMarket
	//FA���� ����
	static void createFAPlayer(BasketballTeam [] array) {
		String name;
		int age,height,weight,num,att,def,speed,vision,mental,price,count = 0;
		//����ִ� �迭 ã��
		for(int i = 0;i<array.length;i++) {
			if(array[i].num == 0) {
				count = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("�̸��� �Է����ּ��� : "); name = sc.next(); array[count].setName(name);
		while(true) {
			System.out.print("���̸� �Է����ּ���  : "); age = sc.nextInt();
			if(age >= 20 && age <= 40) {
				array[count].setAge(age);
				break;
			}else {
				System.out.println("������ 20~40������ �Դϴ�.");
			}//end if
		}//end while
		while(true) {
			System.out.print("Ű�� �Է����ּ���  : "); height = sc.nextInt();
			if(height>=150 && height <=200) {
				array[count].setHeight(height);
				break;
			}else {
				System.out.println("Ű�� 150~200cm ���̷� ������ �ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("�����Ը� �Է����ּ���  : "); weight = sc.nextInt();
			if(weight >= 50 && weight <= 100) {
				array[count].setWeight(weight);
				break;
			}else {
				System.out.println("�����Դ� 50~100kg ���̷� ������ �ּ���.");
			}//end if
		}//end while
		while(true) {
		System.out.print("���ȣ�� �Է����ּ���  : "); num = sc.nextInt();
		if(num <= 0) {
			System.out.println("���ȣ�� 1�̻��� ��ȣ�� �Է����ּ���.");
		}else {
			array[count].num = num;
			break;
		}//end if
		}//end while
		while(true) {
			System.out.print("���ݷ¸� �Է����ּ���  : "); att = sc.nextInt();
			if(att>=0 && att<=100) {
				array[count].setAtt(att);
				break;
			}else {
				System.out.println("���ݷ��� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("����¸� �Է����ּ���  : "); def = sc.nextInt();
			if(def >=0 && def <= 100) {
				array[count].setDef(def);
				break;
			}else {
				System.out.println("������� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("���ǵ带 �Է����ּ���  : "); speed = sc.nextInt();
			if(speed >=0 && speed <= 100) {
				array[count].setSpeed(speed);
				break;
			}else {
				System.out.println("���ǵ�� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
		System.out.print("�þ߷¸� �Է����ּ���  : "); vision = sc.nextInt();
		if(vision >= 0 && vision <= 100) {
			array[count].setVision(vision);
			break;
		}else {
			System.out.println("�þ߷��� 0~100���̷� �������ּ���.");
		}//end if
		}//end while
		while(true) {
		System.out.print("���ŷ¸� �Է����ּ���  : "); mental = sc.nextInt();
		if(mental >= 0 && mental <= 100) {
			array[count].setMental(mental);
			break;
		}else {
			System.out.println("���ŷ��� 0~100���̷� �������ּ���.");
		}//end if
		}//end while
		while(true) {
			System.out.print("������ �Է����ּ���  : "); price = sc.nextInt();
			if(price < 0 ) {
				System.out.println("������ 0���� ū ���� �Է����ּ���.");
			}else {
				array[count].setPrice(price);;
				break;
			}//end if
		}//end while
	}//end createFAPlayer
	//FA���� ����
	static void deleteFAPlayer(BasketballTeam [] array) {
		int delNum = 0;
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�? : "); delNum = sc.nextInt();
		System.out.println(array[delNum-1].getName()+"������ �����͸� �����մϴ�.");
		for(int i = delNum;i<array.length;i++) {
			array[delNum-1] = array[delNum];
			if(delNum == (array.length-1)) array[delNum] = new BasketballTeam();
		}//end for(i)
	}//end deleteFAPlayer
}//end BasketballTeam
//���� �� ���� ���� (���� ��)
class Wonju extends BasketballTeam{
	static Scanner sc = new Scanner(System.in);
	static void initialTeamWonjo(BasketballTeam [] wonju) {
		//�ʱ�ȭ
		for(int i = 0;i<wonju.length;i++) {
			wonju[i] = new BasketballTeam();
		}//end for(i)
		//�ʱⰪ
		wonju[0] = new BasketballTeam("���¼�",37,180,80,1,70,77,54,88,92,200000,"����");
		wonju[1] = new BasketballTeam("�ͻ���",27,181,77,5,64,86,77,70,85,150000,"����");
		wonju[2] = new BasketballTeam("���",28,186,78,3,72,72,66,89,79,180000,"����");
		wonju[3] = new BasketballTeam("����ȣ",33,184,78,7,75,69,59,82,80,220000,"����");
		wonju[4] = new BasketballTeam("������",25,203,107,14,77,60,54,62,65,140000,"����");
	}//end initialTeamWonjo
	//Ư�� ���� ����
	static void wonjuPlayerInfo(BasketballTeam [] array) {
		int inputNum = 0;
		System.out.print("��� ������ ������ ���ðڽ��ϱ�? : "); inputNum = sc.nextInt();
		getPlayerInfo(array, inputNum);
	}//end wonjuPlayerInfo
	//�츮�� �޴� ����
	static void callMyTeamMenu(BasketballTeam [] wonju) {
		int input = -1;
		while(input != 0) {
			System.out.println("�޴� ����\n1.���� ��� ����\n2.���� �� ����\n3.���� �ٲٱ�\n0.�ڷΰ���"); input = sc.nextInt();
			switch(input){
			case 1: printPlayerList(wonju); break;
			case 2: wonjuPlayerInfo(wonju); break;
			case 3: changePlayerList(wonju);break;
			}//end switch
		}//end while
	}//end callMyTeamMenu
	static void buyFAPlayer(BasketballTeam [] wonju,BasketballTeam[] FAmarket) {
		int buyNum = 0,count = 0;
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�? : "); buyNum = sc.nextInt();
		System.out.println(FAmarket[buyNum-1].getName()+"������ �����մϴ�.");
		for(int i = 0;i<wonju.length;i++) {
			if(wonju[i].num == 0) {
				count = i;
				break;
			}//end if
		}//end for(i)
		wonju[count] = FAmarket[buyNum-1];
		for(int i = buyNum;i<FAmarket.length;i++) {
			FAmarket[i-1] = FAmarket[i];
		}
	}//end buyFAPlayer
	static void changePlayerList(BasketballTeam [] wonju) {
		if(wonju[5].num == 0) {
			System.out.println("�ٲ� �ĺ������� �����ϴ�.");
			System.out.println("������ ���� �������ּ���.");
		}else {
			int changeNum1 = 0,changeNum2 = 0;
			System.out.print("���������� ���° ������ ���ðڽ��ϱ�? : "); changeNum1 = sc.nextInt();
			System.out.print("�ĺ������� ���° ������ �����ðڽ��ϱ�? : "); changeNum2 = sc.nextInt();
			for(int i = 0;i<wonju.length;i++) {
				if(wonju[changeNum2+4].num == 0) break;
			}
			System.out.println(wonju[changeNum1-1].getName()+"������ "+wonju[changeNum2+4].getName()+"������ ��ü�մϴ�.");
			BasketballTeam temp;
			temp = wonju[changeNum1-1];
			wonju[changeNum1-1] = wonju[changeNum2+4];
			wonju[changeNum2+4] = temp;
		}//end if
	}//end wonju
}//end class Wonju
//���� �� ����
class Seoul extends BasketballTeam{
	static void initialTeamSeoul(BasketballTeam [] seoul) {
		//�ʱ�ȭ
		for(int i = 0;i<seoul.length;i++) {
			seoul[i] = new BasketballTeam();
		}//end for(i)
		//�ʱⰪ
		seoul[0] = new BasketballTeam("���ؼ�",29,177,74,1,70,77,54,88,92,200000,"����");
		seoul[1] = new BasketballTeam("�輱��",33,187,80,5,64,86,77,70,85,150000,"����");
		seoul[2] = new BasketballTeam("������",32,187,86,7,72,72,66,89,79,180000,"����");
		seoul[3] = new BasketballTeam("�ּ���",26,184,78,19,75,69,59,82,80,220000,"����");
		seoul[4] = new BasketballTeam("�躴��",31,191,87,24,77,60,54,62,65,140000,"����");
		//���
		Seoul.printPlayerList(seoul);
	}//end initialTeamSeoul
}//end class Seoul
//�Ⱦ� �� ����
class Anyang extends BasketballTeam{
	static void initialTeamAnyang(BasketballTeam [] anyang) {
		//�ʱ�ȭ
		for(int i = 0;i<anyang.length;i++) {
			anyang[i] = new BasketballTeam();
		}//end for(i)
		//�ʱⰪ
		anyang[0] = new BasketballTeam("���¿�",26,182,85,2,70,77,54,88,92,200000,"�Ⱦ�");
		anyang[1] = new BasketballTeam("�쵿��",25,176,78,3,64,86,77,70,85,150000,"�Ⱦ�");
		anyang[2] = new BasketballTeam("����ö",35,192,85,4,72,72,66,89,79,180000,"�Ⱦ�");
		anyang[3] = new BasketballTeam("���絵",30,180,73,5,75,69,59,82,80,220000,"�Ⱦ�");
		anyang[4] = new BasketballTeam("������",26,188,90,6,77,60,54,62,65,140000,"�Ⱦ�");
		anyang[5] = new BasketballTeam("�۱�â",26,200,95,7,90,70,87,74,82,140000,"�Ⱦ�");
		anyang[6] = new BasketballTeam("������",34,191,89,20,70,66,59,63,70,140000,"�Ⱦ�");
		//���
		Anyang.printPlayerList(anyang);
	}//end initialTeamAnyang
}//end class Anyang
//���� �� ����
class Jeonju extends BasketballTeam{
	static void initialTeamAnyang(BasketballTeam [] jeonju) {
		//�ʱ�ȭ
		for(int i = 0;i<jeonju.length;i++) {
			jeonju[i] = new BasketballTeam();
		}//end for(i)
		//�ʱⰪ
		jeonju[0] = new BasketballTeam("������",31,187,82,2,70,77,54,88,92,200000,"����");
		jeonju[1] = new BasketballTeam("��â��",30,190,94,3,64,86,77,70,85,150000,"����");
		jeonju[2] = new BasketballTeam("������",31,188,85,4,72,72,66,89,79,180000,"����");
		jeonju[3] = new BasketballTeam("����ȣ",33,200,100,5,75,69,59,82,80,220000,"����");
		jeonju[4] = new BasketballTeam("�ǽ���",26,184,79,6,77,60,54,62,65,140000,"����");
		jeonju[5] = new BasketballTeam("��â��",34,192,89,10,80,79,64,60,66,170000,"����");
		jeonju[6] = new BasketballTeam("������",26,193,102,14,88,72,61,50,90,200000,"����");
		jeonju[7] = new BasketballTeam("������",24,180,75,22,70,80,77,62,82,190000,"����");
		//���
		Jeonju.printPlayerList(jeonju);
	}//end initialTeamAnyang
}//end class Jeonju
//FA ���� ����
class FAMarket extends BasketballTeam {
	//������
	FAMarket(String name, int age, int height, int weight, int num, int att, int def, int speed, int vision, int mental,
			int price,String team){
		super(name,age,height,weight,num,att,def,speed,vision,mental,price,"");
	}
	public FAMarket() {
		super("null",0,0,0,0,0,0,0,0,0,0,"");
	};
	//FA���� ��� �ʱⰪ ����
	static void initialFAMarket(BasketballTeam []FAmarket) {
		//�ʱ�ȭ
		for(int i = 0;i<FAmarket.length;i++) {
			FAmarket[i] = new BasketballTeam();
		}//end for(i)
		//�ʱⰪ
		FAmarket[0] = new BasketballTeam("�Ÿ�ȣ",38,184,82,17,70,77,54,88,92,200000,"����");
		FAmarket[1] = new BasketballTeam("��â��",27,180,70,31,64,86,77,70,85,150000,"����");
		FAmarket[2] = new BasketballTeam("����",25,198,101,14,72,72,66,89,79,180000,"����");
		FAmarket[3] = new BasketballTeam("�ڰ�ȣ",25,199,105,31,75,69,59,82,80,220000,"����");
		FAmarket[4] = new BasketballTeam("������",26,196,85,10,68,87,74,55,82,140000,"����");
		FAmarket[5] = new BasketballTeam("������",33,195,91,7,72,77,70,81,72,230000,"����");
		FAmarket[6] = new BasketballTeam("����ȣ",27,191,90,29,82,92,83,82,75,240000,"����");
		FAmarket[7] = new BasketballTeam("������",24,188,90,5,69,90,77,72,95,170000,"����");
	}//end initialFAMarket
	static void FAMarketMenu(BasketballTeam [] wonju,BasketballTeam [] FAmarket) {
		int inputNum = 0;
		System.out.println("����������������������������������");
		System.out.println("��  1. FA���� ����\t\t��");
		System.out.println("��  2. FA���� ����\t\t��");
		System.out.println("��  3. FA���� ����\t\t��");
		System.out.println("��  0. �ڷ� ����  \t\t��");
		System.out.println("����������������������������������");
		System.out.print("  �Է� : "); inputNum = sc.nextInt();
		switch(inputNum) {
		case 1: Wonju.buyFAPlayer(wonju,FAmarket); break;
		case 2: createFAPlayer(FAmarket); break;
		case 3: deleteFAPlayer(FAmarket); break;
		case 0: return;
		}//end switch
	}//end FAMarketMenu
}//end class FAMarket
public class ExtendsTest04_1_����ȣ {
	//�ٸ� �� ���� ����
	static void otherTeamMenu() {
		int inputNum = -1;
		BasketballTeam[] seoul = new BasketballTeam[11];
		BasketballTeam[] anyang = new BasketballTeam[11];
		BasketballTeam[] jeonju = new BasketballTeam[11];
		while(inputNum != 0) {
			System.out.println("��� ���� ���ðڽ��ϱ�?\n1.����\n2.�Ⱦ�\n3.����\n0.�ڷΰ���"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: Seoul.initialTeamSeoul(seoul);break;
			case 2: Anyang.initialTeamAnyang(anyang);break;
			case 3: Jeonju.initialTeamAnyang(jeonju);break;
			}//end switch
		}//end while
	}//end otherTeamMenu
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int inputNum = -1;
		BasketballTeam []FAmarket = new BasketballTeam[20];
		//FA�迭 �ʱ�ȭ
		FAMarket.initialFAMarket(FAmarket);
		BasketballTeam[] wonju = new BasketballTeam[11];
		Wonju.initialTeamWonjo(wonju);
		while(inputNum != 0) {
			System.out.println("�޴�\n1.�츮 �� ����\n2.��� �� ����\n3.FA ���� Ȯ��\n0.�����ϱ�"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: Wonju.callMyTeamMenu(wonju); break;
			case 2: otherTeamMenu(); break;
			case 3: FAMarket.showFAMarket(wonju,FAmarket); break;
			}//end switch
		}//end while
		System.out.println("���α׷��� �����մϴ�.");
	}//end main
}//end class