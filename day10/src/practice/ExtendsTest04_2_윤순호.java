package practice;
import java.util.Scanner;
public class ExtendsTest04_2_����ȣ {
	public static void main(String[] args) {
		new PlayGames().showMainMenu();
	}//end main
}//end class

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
	int num;					//���ȣ		<--���ȣ�� ���� private���ص� �ɰ� ���Ƽ�..
	private int att;			//���ݷ�
	private int def;			//�����
	private int speed;			//���ǵ�
	private int vision;			//�þ߷�
	private int mental;			//���ŷ�
	private int price;			//����
	private String team;	//�Ҽ���
	//getter, setter
	public void setAtt(int att) {this.att = att;}
	public void setDef(int def) {this.def = def;}
	public void setSpeed(int speed) {this.speed = speed;}
	public void setVision(int vision) {this.vision = vision;}
	public void setMental(int mental) {this.mental = mental;}
	public void setPrice(int price) {this.price = price;}
	public void setTeam(String team) {this.team = team;}
	public int getAtt() {return att;}
	public int getDef() {return def;}
	public int getSpeed() {return speed;}
	public int getVision() {return vision;}
	public int getMental() {return mental;}
	public int getPrice() {return price;}
	public String getTeam() {return team;}
	//������
	public BasketballPlayer() {
		this("null",0,0,0,0,0,0,0,0,0,0,"");
	}
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
//���� �ʱ�ȭ Ŭ����
class BasketballTeam {
	//FA���� �ʱ�ȭ
	void initialFAMarket(BasketballPlayer[] FAmarket) {
		//�ʱⰪ
		FAmarket[0] = new BasketballPlayer("�Ÿ�ȣ",38,184,82,17,70,77,54,88,92,200000,"����");
		FAmarket[1] = new BasketballPlayer("��â��",27,180,70,31,64,86,77,70,85,150000,"����");
		FAmarket[2] = new BasketballPlayer("����",25,198,101,14,72,72,66,89,79,180000,"����");
		FAmarket[3] = new BasketballPlayer("�ڰ�ȣ",25,199,105,31,75,69,59,82,80,220000,"����");
		FAmarket[4] = new BasketballPlayer("������",26,196,85,10,68,87,74,55,82,140000,"����");
		FAmarket[5] = new BasketballPlayer("������",33,195,91,7,72,77,70,81,72,230000,"����");
		FAmarket[6] = new BasketballPlayer("����ȣ",27,191,90,29,82,92,83,82,75,240000,"����");
		FAmarket[7] = new BasketballPlayer("������",24,188,90,5,69,90,77,72,95,170000,"����");
		//�ʱ�ȭ
		for(int i = 8;i<FAmarket.length;i++) {
			FAmarket[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialFAMarket
	//������ �ʱ�ȭ
	void initialTeamWonju(BasketballPlayer[] wonju) {
		//�ʱⰪ
		wonju[0] = new BasketballPlayer("���¼�",37,180,80,1,70,77,54,88,92,200000,"����");
		wonju[1] = new BasketballPlayer("�ͻ���",27,181,77,5,64,86,77,70,85,150000,"����");
		wonju[2] = new BasketballPlayer("���",28,186,78,3,72,72,66,89,79,180000,"����");
		wonju[3] = new BasketballPlayer("����ȣ",33,184,78,7,75,69,59,82,80,220000,"����");
		wonju[4] = new BasketballPlayer("������",25,203,107,14,77,60,54,62,65,140000,"����");
		//�ʱ�ȭ
		for(int i = 5;i<wonju.length;i++) {
			wonju[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamWonju
	//������ �ʱ�ȭ
	void initialTeamSeoul(BasketballPlayer[] seoul) {
		//�ʱⰪ
		seoul[0] = new BasketballPlayer("���ؼ�",29,177,74,1,70,77,54,88,92,200000,"����");
		seoul[1] = new BasketballPlayer("�輱��",33,187,80,5,64,86,77,70,85,150000,"����");
		seoul[2] = new BasketballPlayer("������",32,187,86,7,72,72,66,89,79,180000,"����");
		seoul[3] = new BasketballPlayer("�ּ���",26,184,78,19,75,69,59,82,80,220000,"����");
		seoul[4] = new BasketballPlayer("�躴��",31,191,87,24,77,60,54,62,65,140000,"����");
		//�ʱ�ȭ
		for(int i = 5;i<seoul.length;i++) {
			seoul[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamSeoul
	//�Ⱦ��� �ʱ�ȭ
	void initialTeamAnyang(BasketballPlayer[] anyang) {
		//�ʱⰪ
		anyang[0] = new BasketballPlayer("���¿�",26,182,85,2,70,77,54,88,92,200000,"�Ⱦ�");
		anyang[1] = new BasketballPlayer("�쵿��",25,176,78,3,64,86,77,70,85,150000,"�Ⱦ�");
		anyang[2] = new BasketballPlayer("����ö",35,192,85,4,72,72,66,89,79,180000,"�Ⱦ�");
		anyang[3] = new BasketballPlayer("���絵",30,180,73,5,75,69,59,82,80,220000,"�Ⱦ�");
		anyang[4] = new BasketballPlayer("������",26,188,90,6,77,60,54,62,65,140000,"�Ⱦ�");
		anyang[5] = new BasketballPlayer("�۱�â",26,200,95,7,90,70,87,74,82,140000,"�Ⱦ�");
		anyang[6] = new BasketballPlayer("������",34,191,89,20,70,66,59,63,70,140000,"�Ⱦ�");
		//�ʱ�ȭ
		for(int i = 7;i<anyang.length;i++) {
			anyang[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamAnyang
	//������ �ʱ�ȭ
	void initialTeamJeonju(BasketballPlayer[] jeonju) {
		//�ʱⰪ
		jeonju[0] = new BasketballPlayer("������",31,187,82,2,70,77,54,88,92,200000,"����");
		jeonju[1] = new BasketballPlayer("��â��",30,190,94,3,64,86,77,70,85,150000,"����");
		jeonju[2] = new BasketballPlayer("������",31,188,85,4,72,72,66,89,79,180000,"����");
		jeonju[3] = new BasketballPlayer("����ȣ",33,200,100,5,75,69,59,82,80,220000,"����");
		jeonju[4] = new BasketballPlayer("�ǽ���",26,184,79,6,77,60,54,62,65,140000,"����");
		jeonju[5] = new BasketballPlayer("��â��",34,192,89,10,80,79,64,60,66,170000,"����");
		jeonju[6] = new BasketballPlayer("������",26,193,102,14,88,72,61,50,90,200000,"����");
		jeonju[7] = new BasketballPlayer("������",24,180,75,22,70,80,77,62,82,190000,"����");
		//�ʱ�ȭ
		for(int i = 8;i<jeonju.length;i++) {
			jeonju[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamAnyang
}//end class BasketballTeam
//FA ����
class FAMarket{
	static Scanner sc = new Scanner(System.in);
	//FA���� ���� ���
	void showFAMarket(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t\tFA����\t\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t  ��");
		for(int i = 0;i<FAmarket.length;i++) {
			if(FAmarket[0].num == 0) {
				System.out.println("    ��\t\t\t\t      FA�� ��ϵ� ������ �����ϴ�.\t\t            ��");
				break;
			}else if(FAmarket[i].num == 0) break;
			else {
				System.out.print("    ��\t"+(i+1)+"\t");
				System.out.print(FAmarket[i].num+"��\t"+FAmarket[i].getName()+"\t"+FAmarket[i].getAtt()+"\t"+FAmarket[i].getDef()+"\t"+FAmarket[i].getSpeed()+"\t"+FAmarket[i].getVision()+"\t"+FAmarket[i].getMental()+"\t"+FAmarket[i].getPrice()+"\t\t\t  ��\n");
			}//end if
		}//end for(i)
		System.out.println("    ������������������������������������������������������������������������������������������������");
		//FA�޴�ȣ��
		FAMarketMenu(wonju,FAmarket);
	}//end showFAMarket
	//FA�޴�
	void FAMarketMenu(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		int inputNum = 0;
		System.out.println("����������������������������������");
		System.out.println("��  1. FA���� ����\t\t��");
		System.out.println("��  2. FA���� ����\t\t��");
		System.out.println("��  3. FA���� ����\t\t��");
		System.out.println("��  0. �ڷ� ����  \t\t��");
		System.out.println("����������������������������������");
		System.out.print("  �Է� : "); inputNum = sc.nextInt();
		switch(inputNum) {
		case 1: buyFAPlayer(wonju,FAmarket); break;
		case 2: createFAPlayer(FAmarket); break;
		case 3: deleteFAPlayer(FAmarket); break;
		case 0: return;
		}//end switch
	}//end FAMarketMenu
	//FA���� ����
	void buyFAPlayer(BasketballPlayer [] wonju,BasketballPlayer[] FAmarket) {
		int buyNum = 0,count = 0;
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�? : "); buyNum = sc.nextInt();
		System.out.println(FAmarket[buyNum-1].getName()+"������ �����մϴ�.");
		for(int i = 0;i<wonju.length;i++) {
			if(wonju[i].num == 0) {
				count = i;
				break;
			}else if(wonju[wonju.length-1].num != 0) {
				System.out.println("���� ������ ����á���ϴ�.");
				System.out.println("�� �̻� ������ �� �����ϴ�.");
				return;
			}
		}//end for(i)
		wonju[count] = FAmarket[buyNum-1];
		for(int i = buyNum;i<FAmarket.length;i++) {
			FAmarket[i-1] = FAmarket[i];
		}//end for(i)
	}//end buyFAPlayer
	//FA���� ����
	void createFAPlayer(BasketballPlayer [] FAmarket) {
		String name;
		int age,height,weight,num,att,def,speed,vision,mental,price,count = 0;
		//����ִ� �迭 ã��
		for(int i = 0;i<FAmarket.length;i++) {
			if(FAmarket[i].num == 0) {
				count = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("�̸��� �Է����ּ��� : "); name = sc.next(); FAmarket[count].setName(name);
		while(true) {
			System.out.print("���̸� �Է����ּ���  : "); age = sc.nextInt();
			if(age >= 20 && age <= 40) {
				FAmarket[count].setAge(age);
				break;
			}else {
				System.out.println("������ 20~40������ �Դϴ�.");
			}//end if
		}//end while
		while(true) {
			System.out.print("Ű�� �Է����ּ���  : "); height = sc.nextInt();
			if(height>=150 && height <=200) {
				FAmarket[count].setHeight(height);
				break;
			}else {
				System.out.println("Ű�� 150~200cm ���̷� ������ �ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("�����Ը� �Է����ּ���  : "); weight = sc.nextInt();
			if(weight >= 50 && weight <= 100) {
				FAmarket[count].setWeight(weight);
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
				FAmarket[count].num = num;
				break;
			}//end if
		}//end while
		while(true) {
			System.out.print("���ݷ¸� �Է����ּ���  : "); att = sc.nextInt();
			if(att>=0 && att<=100) {
				FAmarket[count].setAtt(att);
				break;
			}else {
				System.out.println("���ݷ��� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("����¸� �Է����ּ���  : "); def = sc.nextInt();
			if(def >=0 && def <= 100) {
				FAmarket[count].setDef(def);
				break;
			}else {
				System.out.println("������� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("���ǵ带 �Է����ּ���  : "); speed = sc.nextInt();
			if(speed >=0 && speed <= 100) {
				FAmarket[count].setSpeed(speed);
				break;
			}else {
				System.out.println("���ǵ�� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("�þ߷¸� �Է����ּ���  : "); vision = sc.nextInt();
			if(vision >= 0 && vision <= 100) {
				FAmarket[count].setVision(vision);
				break;
			}else {
				System.out.println("�þ߷��� 0~100���̷� �������ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("���ŷ¸� �Է����ּ���  : "); mental = sc.nextInt();
			if(mental >= 0 && mental <= 100) {
				FAmarket[count].setMental(mental);
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
				FAmarket[count].setPrice(price);;
				break;
			}//end if
		}//end while
	}//end createFAPlayer
	//FA���� ����
	void deleteFAPlayer(BasketballPlayer [] FAmarket) {
		int delNum = 0;
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�? : "); delNum = sc.nextInt();
		System.out.println(FAmarket[delNum-1].getName()+"������ �����͸� �����մϴ�.");
		for(int i = delNum;i<FAmarket.length;i++) {
			FAmarket[delNum-1] = FAmarket[delNum];
			if(delNum == (FAmarket.length-1)) FAmarket[delNum] = new BasketballPlayer();
		}//end for(i)
	}//end deleteFAPlayer
}//end class FAMarket
//���� �����ϱ�
class PlayGames{
	static Scanner sc = new Scanner(System.in);
	BasketballTeam bt = new BasketballTeam();

	//���� �޴�
	void showMainMenu() {
		//�� ���� �迭 ����
		BasketballPlayer[] FAmarket = new BasketballPlayer[20];
		BasketballPlayer[] wonju = new BasketballPlayer[10];
		BasketballPlayer[] seoul = new BasketballPlayer[10];
		BasketballPlayer[] anyang = new BasketballPlayer[10];
		BasketballPlayer[] jeonju = new BasketballPlayer[10];
		//�� ���� �迭 �ʱ�ȭ
		bt.initialFAMarket(FAmarket);
		bt.initialTeamWonju(wonju);
		bt.initialTeamSeoul(seoul);
		bt.initialTeamAnyang(anyang);
		bt.initialTeamJeonju(jeonju);
		int inputNum = -1;
		while(inputNum != 0) {
			System.out.println("�޴�\n1.�츮 �� ����\n2.��� �� ����\n3.FA ���� Ȯ��\n0.�����ϱ�"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: callMyTeamMenu(wonju,FAmarket); break;
			case 2: showOtherTeam(seoul,anyang,jeonju); break;
			case 3: new FAMarket().showFAMarket(wonju,FAmarket); break;
			}//end switch
		}//end while
	}//end showMainMenu
	//���� �� Ư�� ���� ����
	private void myTeamPlayerInfo(BasketballPlayer [] wonju) {
		int inputNum = 0;
		System.out.print("��� ������ ������ ���ðڽ��ϱ�? : "); inputNum = sc.nextInt();
		wonju[inputNum].printInfo();
	}//end wonjuPlayerInfo
	//�츮�� �޴� ����
	private void callMyTeamMenu(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		int input = -1;
		while(input != 0) {
			System.out.println("�޴� ����\n1.���� ��� ����\n2.���� �� ����\n3.���� �ٲٱ�\n4.���� �����ϱ�\n0.�ڷΰ���"); input = sc.nextInt();
			switch(input){
			case 1: printPlayerList(wonju); break;
			case 2: myTeamPlayerInfo(wonju); break;
			case 3: changePlayerList(wonju); break;
			case 4: releasePlayer(wonju,FAmarket); break;
			}//end switch
		}//end while
	}//end callMyTeamMenu
	//���� �����ϱ�
	private void releasePlayer(BasketballPlayer []wonju,BasketballPlayer []FAmarket) {
		int releaseNum = -1,count = 0;
		if(wonju[5].num == 0) {
			System.out.println("������ �ĺ������� �����ϴ�.");
			System.out.println("������ ���� �������ּ���.");
		}else {
			System.out.println("���° �ĺ������� �����Ͻðڽ��ϱ�?");
			System.out.println("�ĺ������� ���� �����մϴ�.");
			System.out.println("���������� �����Ϸ��� �ĺ������� �����ٲٱ⸦ ���ּ���.(0.�ڷΰ���)");
			releaseNum = sc.nextInt();
			if(releaseNum == 0) return;
			for(int i = 5;i<5+releaseNum;i++) {
				if(wonju[i].num == 0) {
					System.out.println("�ش� ��ġ�� ������ �������� �ʽ��ϴ�.");
					System.out.println("�ĺ� ������ ������ ������ "+wonju[i-1].getName()+"������ �����մϴ�.");
					releaseNum = i-1;
					break;
				}//end if
			}//end for(i)
			System.out.println(wonju[releaseNum].getName()+"������ �����մϴ�.");
			for(int i = 0;i<FAmarket.length;i++) {
				if(FAmarket[i].num == 0) {
					count = i;
					break;
				}//end if
			}//end for(i)
			FAmarket[count] = wonju[releaseNum];
			for(int i = releaseNum+1;i<wonju.length;i++) {
				wonju[i-1] = wonju[i];
			}//end for(i)
		}//end if
	}//end releasePlayer
	//���� ��ü�ϱ�
	private void changePlayerList(BasketballPlayer [] wonju) {
		if(wonju[5].num == 0) {
			System.out.println("�ٲ� �ĺ������� �����ϴ�.");
			System.out.println("������ ���� �������ּ���.");
		}else {
			int changeNum1 = 0,changeNum2 = 0;
			System.out.print("���������� ���° ������ ���ðڽ��ϱ�? : "); changeNum1 = sc.nextInt();
			System.out.print("�ĺ������� ���° ������ �����ðڽ��ϱ�? : "); changeNum2 = sc.nextInt();
			for(int i = 5;i<5+changeNum2;i++) {
				if(wonju[i].num == 0) {
					System.out.println("�ش� ��ġ�� ������ �������� �ʽ��ϴ�.");
					System.out.println("�ĺ� ������ ������ ������ "+wonju[i-1].getName()+"������ ��ü�մϴ�.");
					changeNum2 = i-1;
					break;
				}//end if
			}//end for(i)
			System.out.println(wonju[changeNum1-1].getName()+"������ "+wonju[changeNum2].getName()+"������ ��ü�մϴ�.");
			BasketballPlayer temp;
			temp = wonju[changeNum1-1];
			wonju[changeNum1-1] = wonju[changeNum2];
			wonju[changeNum2] = temp;
		}//end if
	}//end wonju
	//�ٸ� �� ���� ����
	private void showOtherTeam(BasketballPlayer [] seoul,BasketballPlayer [] Anyang,BasketballPlayer [] Jeonju) {
		int inputNum = -1;
		while(inputNum != 0) {
			System.out.println("��� ���� ���ðڽ��ϱ�?\n1.����\n2.�Ⱦ�\n3.����\n0.�ڷΰ���"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: printPlayerList(seoul);;break;
			case 2: printPlayerList(Anyang);break;
			case 3: printPlayerList(Jeonju);break;
			}//end switch
		}//end while
	}//end showOtherTeam
	//���� ��� ���
	private void printPlayerList(BasketballPlayer [] array) {
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t\t"+array[0].getTeam()+"�� ��������\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t  ��");
		for(int i = 0;i<5;i++) {
			if(array[0].num == 0) {
				System.out.println("    ��\t\t\t\t      �������� ��ϵ� ������ �����ϴ�.\t\t\t                ��");
				break;
			}//end if
			System.out.print("    ��\t"+(i+1)+"\t ");
			System.out.print(array[i].num+"��\t"+array[i].getName()+"\t"+array[i].getAtt()+"\t"+array[i].getDef()+"\t"+array[i].getSpeed()+"\t"+array[i].getVision()+"\t"+array[i].getMental()+"\t"+array[i].getPrice()+"\t\t\t  ��\n");
		}//end for(i)
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ������������������������������������������������������������������������������������������������");
		System.out.println("    ��\t�ĺ�����\t\t\t\t\t\t\t\t\t\t  ��");
		System.out.println("    ��\t����\t��ȣ\t�̸�\t���ݷ�\t�����\t���ǵ�\t�þ�\t���ŷ�\t����\t  ��");
		for(int i = 5;i<array.length;i++) {
			if(array[5].num == 0) {
				System.out.println("    ��\t\t\t\t       �ĺ��� ��ϵ� ������ �����ϴ�.\t\t          ��");
				break;
			}else if(array[i].num == 0) break;
			System.out.print("    ��\t"+(i-4)+"\t");
			System.out.print(array[i].num+"��\t"+array[i].getName()+"\t"+array[i].getAtt()+"\t"+array[i].getDef()+"\t"+array[i].getSpeed()+"\t"+array[i].getVision()+"\t"+array[i].getMental()+"\t"+array[i].getPrice()+"\t\t\t  ��\n");
		}//end for(i)
		System.out.println("    ������������������������������������������������������������������������������������������������");
	}//end printPlayerList
}//end class PlayGames
