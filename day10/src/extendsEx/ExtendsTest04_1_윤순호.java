package extendsEx;
/*
	상속
	다형성과 동적 결합(바인딩)
	
	사람을 주제로
	부모 - 자식 클래스의 관계를 설정하기
	
	사람 - 운동선수
		 - 군인
		 - 개발자
	등등...
	
	사람 : 부모 클래스
	운동선수, 군인, 개발자 등등 : 자식 클래스
	
	사람 : 인스턴스 변수 3개 이상
	자식클래스 : 인스턴스 변수 2개 이상
	
	//필수 메서드 : 정보 출력
	//선택 메서드 : 월급(연봉), 직종별 정보 출력 등
	
	1. 오버라이딩 적용해 보기
	2. 오버로딩 적용해 보기
	
	제출 : /homework/java_day10/ExtendsTest04_1_윤순호
 */
import java.util.Scanner;
/**
 * 생성자 오버로딩 - 초기값으로 다 넣어줄 생각이기 때문에 생성자는 많이 오버로딩 하지 않았습니다.
 * 오버라이딩 - printInfo()메소드를 오버라이딩 했으며, printPlayerInfo()는 처음에 오버라이딩 하려고 하였으나 특정 출력문을 출력하기 위해서 이름을 다르게하였습니다.
 *
 */
class Person{
	//person 인스턴스 변수 선언
	private String name;		//이름
	private int age;			//나이
	private int height;			//키
	private int weight;			//몸무게
	//getter, setter
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setHeight(int height) {this.height = height;}
	public void setWeight(int weight) {this.weight = weight;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	//생성자
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public void printInfo() {
		System.out.println("┏━━━━━━━━"+name+"━━━━━━━━┓");
		System.out.println("┃     나이  : "+age+"세");
		System.out.println("┃      키   : "+height+"cm");
		System.out.println("┃    몸무게  : "+weight+"kg");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━┛");
	}
}//end class Person
class BasketballPlayer extends Person{
	protected int num;					//등번호		<--등번호는 굳이 private안해도 될것 같아서..
	private int att;			//공격력
	private int def;			//수비력
	private int speed;			//스피드
	private int vision;			//시야력
	private int mental;			//정신력
	private int price;			//연봉
	private static String team;	//소속팀
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
	//생성자
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
		System.out.println("┏━━━━━━━━능력치━━━━━━━━┓");
		System.out.println("┃   등번호 : "+num+"번");
		System.out.println("┃   공격력  : "+att);
		System.out.println("┃   수비력  : "+def);
		System.out.println("┃   스피드  : "+speed);
		System.out.println("┃   시야력  : "+vision);
		System.out.println("┃   정신력  : "+mental);
		System.out.println("┃    연봉  : "+price+"원");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━┛");
	}
}//end class BasketballPlayer
class BasketballTeam extends BasketballPlayer{
	static Scanner sc = new Scanner(System.in);
	//구상만 하고 아직 구현은 하지 못한 변수들..
	int money;				//팀 자금
	String teamInfo;		//팀 소개
	int teamAbility;		//팀 능력치
	//getter, setter
	void setTeamAbility( int att, int def, int speed, int vision, int mental) {
		this.teamAbility = (att+def+speed+vision+mental)/50;
	}
	int getTeamAbility() {return teamAbility;}
	int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}
	//생성자
	public BasketballTeam() {
		super("null",0,0,0,0,0,0,0,0,0,0,"");
	};
	public BasketballTeam(String name, int age, int height, int weight, int num, int att, int def, int speed, int vision, int mental,
			int price,String team) {
		super(name,age,height,weight,num,att,def,speed,vision,mental,price,team);
	}
	//선수 정보 출력
	public void printPlayerInfo() {
		setTeamAbility(getAtt(),getDef(),getSpeed(),getVision(),getMental());
		System.out.print(num+"번\t"+getName()+"\t"+getAtt()+"\t"+getDef()+"\t"+getSpeed()+"\t"+getVision()+"\t"+getMental()+"\t"+getPrice()+"\t"+getTeamAbility()+"\t\t  ┃\n");
	}//end printInfo
	static void printPlayerList(BasketballTeam [] array) {
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t\t"+getTeam()+"팀 주전선수\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t팀기여도\t  ┃");
		for(int i = 0;i<5;i++) {
			if(array[0].num == 0) {
				System.out.println("    ┃\t\t\t\t      주전으로 등록된 선수가 없습니다.\t\t\t\t                ┃");
				break;
			}//end if
			System.out.print("    ┃\t"+(i+1)+"\t ");
			array[i].printPlayerInfo();
		}//end for(i)
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t후보선수\t\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t팀기여도\t  ┃");
		for(int i = 5;i<array.length;i++) {
			if(array[5].num == 0) {
				System.out.println("    ┃\t\t\t\t       후보로 등록된 선수가 없습니다.\t\t\t          ┃");
				break;
			}else if(array[i].num == 0) break;
			System.out.print("    ┃\t"+(i-4)+"\t");
			array[i].printPlayerInfo();
		}//end for(i)
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}//end printPlayerList
	//특정 선수 정보 출력
	static void getPlayerInfo(BasketballTeam [] array,int inputNum) {
		for(int i = 0;i<array.length;i++){
			if(i == (inputNum-1)) array[i].printInfo();
//				array[i].printPlayerInfo();
		}//end for(i)
	}//end getPlayerInfo
	//FA선수 정보 출력
	static void showFAMarket(BasketballTeam [] wonju,BasketballTeam [] array) {
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t\tFA선수\t\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t팀기여도\t  ┃");
		for(int i = 0;i<array.length;i++) {
			if(array[0].num == 0) {
				System.out.println("    ┃\t\t\t\t      FA로 등록된 선수가 없습니다.\t\t\t            ┃");
				break;
			}else if(array[i].num == 0) break;
			else {
				System.out.print("    ┃\t"+(i+1)+"\t");
				array[i].printPlayerInfo();
			}
		}
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		//FA메뉴
		FAMarket.FAMarketMenu(wonju,array);
	}//end showFAMarket
	//FA선수 생성
	static void createFAPlayer(BasketballTeam [] array) {
		String name;
		int age,height,weight,num,att,def,speed,vision,mental,price,count = 0;
		//비어있는 배열 찾기
		for(int i = 0;i<array.length;i++) {
			if(array[i].num == 0) {
				count = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("이름을 입력해주세요 : "); name = sc.next(); array[count].setName(name);
		while(true) {
			System.out.print("나이를 입력해주세요  : "); age = sc.nextInt();
			if(age >= 20 && age <= 40) {
				array[count].setAge(age);
				break;
			}else {
				System.out.println("현역은 20~40세까지 입니다.");
			}//end if
		}//end while
		while(true) {
			System.out.print("키를 입력해주세요  : "); height = sc.nextInt();
			if(height>=150 && height <=200) {
				array[count].setHeight(height);
				break;
			}else {
				System.out.println("키는 150~200cm 사이로 설정해 주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("몸무게를 입력해주세요  : "); weight = sc.nextInt();
			if(weight >= 50 && weight <= 100) {
				array[count].setWeight(weight);
				break;
			}else {
				System.out.println("몸무게는 50~100kg 사이로 설정해 주세요.");
			}//end if
		}//end while
		while(true) {
		System.out.print("등번호를 입력해주세요  : "); num = sc.nextInt();
		if(num <= 0) {
			System.out.println("등번호는 1이상의 번호를 입력해주세요.");
		}else {
			array[count].num = num;
			break;
		}//end if
		}//end while
		while(true) {
			System.out.print("공격력를 입력해주세요  : "); att = sc.nextInt();
			if(att>=0 && att<=100) {
				array[count].setAtt(att);
				break;
			}else {
				System.out.println("공격력은 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("수비력를 입력해주세요  : "); def = sc.nextInt();
			if(def >=0 && def <= 100) {
				array[count].setDef(def);
				break;
			}else {
				System.out.println("수비력은 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("스피드를 입력해주세요  : "); speed = sc.nextInt();
			if(speed >=0 && speed <= 100) {
				array[count].setSpeed(speed);
				break;
			}else {
				System.out.println("스피드는 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
		System.out.print("시야력를 입력해주세요  : "); vision = sc.nextInt();
		if(vision >= 0 && vision <= 100) {
			array[count].setVision(vision);
			break;
		}else {
			System.out.println("시야력은 0~100사이로 설정해주세요.");
		}//end if
		}//end while
		while(true) {
		System.out.print("정신력를 입력해주세요  : "); mental = sc.nextInt();
		if(mental >= 0 && mental <= 100) {
			array[count].setMental(mental);
			break;
		}else {
			System.out.println("정신력은 0~100사이로 설정해주세요.");
		}//end if
		}//end while
		while(true) {
			System.out.print("연봉을 입력해주세요  : "); price = sc.nextInt();
			if(price < 0 ) {
				System.out.println("연봉은 0보다 큰 수로 입력해주세요.");
			}else {
				array[count].setPrice(price);;
				break;
			}//end if
		}//end while
	}//end createFAPlayer
	//FA선수 삭제
	static void deleteFAPlayer(BasketballTeam [] array) {
		int delNum = 0;
		System.out.print("몇 번째 선수를 삭제하시겠습니까? : "); delNum = sc.nextInt();
		System.out.println(array[delNum-1].getName()+"선수의 데이터를 삭제합니다.");
		for(int i = delNum;i<array.length;i++) {
			array[delNum-1] = array[delNum];
			if(delNum == (array.length-1)) array[delNum] = new BasketballTeam();
		}//end for(i)
	}//end deleteFAPlayer
}//end BasketballTeam
//원주 팀 선수 정보 (나의 팀)
class Wonju extends BasketballTeam{
	static Scanner sc = new Scanner(System.in);
	static void initialTeamWonjo(BasketballTeam [] wonju) {
		//초기화
		for(int i = 0;i<wonju.length;i++) {
			wonju[i] = new BasketballTeam();
		}//end for(i)
		//초기값
		wonju[0] = new BasketballTeam("김태술",37,180,80,1,70,77,54,88,92,200000,"원주");
		wonju[1] = new BasketballTeam("맹상훈",27,181,77,5,64,86,77,70,85,150000,"원주");
		wonju[2] = new BasketballTeam("허웅",28,186,78,3,72,72,66,89,79,180000,"원주");
		wonju[3] = new BasketballTeam("김현호",33,184,78,7,75,69,59,82,80,220000,"원주");
		wonju[4] = new BasketballTeam("이윤수",25,203,107,14,77,60,54,62,65,140000,"원주");
	}//end initialTeamWonjo
	//특정 선수 보기
	static void wonjuPlayerInfo(BasketballTeam [] array) {
		int inputNum = 0;
		System.out.print("몇번 선수의 정보를 보시겠습니까? : "); inputNum = sc.nextInt();
		getPlayerInfo(array, inputNum);
	}//end wonjuPlayerInfo
	//우리팀 메뉴 보기
	static void callMyTeamMenu(BasketballTeam [] wonju) {
		int input = -1;
		while(input != 0) {
			System.out.println("메뉴 선택\n1.선수 명단 보기\n2.선수 상세 정보\n3.선수 바꾸기\n0.뒤로가기"); input = sc.nextInt();
			switch(input){
			case 1: printPlayerList(wonju); break;
			case 2: wonjuPlayerInfo(wonju); break;
			case 3: changePlayerList(wonju);break;
			}//end switch
		}//end while
	}//end callMyTeamMenu
	static void buyFAPlayer(BasketballTeam [] wonju,BasketballTeam[] FAmarket) {
		int buyNum = 0,count = 0;
		System.out.print("몇 번째 선수를 영입하시겠습니까? : "); buyNum = sc.nextInt();
		System.out.println(FAmarket[buyNum-1].getName()+"선수를 영입합니다.");
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
			System.out.println("바꿀 후보선수가 없습니다.");
			System.out.println("선수를 먼저 영입해주세요.");
		}else {
			int changeNum1 = 0,changeNum2 = 0;
			System.out.print("주전선수의 몇번째 선수를 빼시겠습니까? : "); changeNum1 = sc.nextInt();
			System.out.print("후보선수의 몇번째 선수를 넣으시겠습니까? : "); changeNum2 = sc.nextInt();
			for(int i = 0;i<wonju.length;i++) {
				if(wonju[changeNum2+4].num == 0) break;
			}
			System.out.println(wonju[changeNum1-1].getName()+"선수와 "+wonju[changeNum2+4].getName()+"선수를 교체합니다.");
			BasketballTeam temp;
			temp = wonju[changeNum1-1];
			wonju[changeNum1-1] = wonju[changeNum2+4];
			wonju[changeNum2+4] = temp;
		}//end if
	}//end wonju
}//end class Wonju
//서울 팀 정보
class Seoul extends BasketballTeam{
	static void initialTeamSeoul(BasketballTeam [] seoul) {
		//초기화
		for(int i = 0;i<seoul.length;i++) {
			seoul[i] = new BasketballTeam();
		}//end for(i)
		//초기값
		seoul[0] = new BasketballTeam("김준성",29,177,74,1,70,77,54,88,92,200000,"서울");
		seoul[1] = new BasketballTeam("김선형",33,187,80,5,64,86,77,70,85,150000,"서울");
		seoul[2] = new BasketballTeam("변기훈",32,187,86,7,72,72,66,89,79,180000,"서울");
		seoul[3] = new BasketballTeam("최성원",26,184,78,19,75,69,59,82,80,220000,"서울");
		seoul[4] = new BasketballTeam("배병준",31,191,87,24,77,60,54,62,65,140000,"서울");
		//출력
		Seoul.printPlayerList(seoul);
	}//end initialTeamSeoul
}//end class Seoul
//안양 팀 정보
class Anyang extends BasketballTeam{
	static void initialTeamAnyang(BasketballTeam [] anyang) {
		//초기화
		for(int i = 0;i<anyang.length;i++) {
			anyang[i] = new BasketballTeam();
		}//end for(i)
		//초기값
		anyang[0] = new BasketballTeam("전태영",26,182,85,2,70,77,54,88,92,200000,"안양");
		anyang[1] = new BasketballTeam("우동현",25,176,78,3,64,86,77,70,85,150000,"안양");
		anyang[2] = new BasketballTeam("박형철",35,192,85,4,72,72,66,89,79,180000,"안양");
		anyang[3] = new BasketballTeam("이재도",30,180,73,5,75,69,59,82,80,220000,"안양");
		anyang[4] = new BasketballTeam("변준형",26,188,90,6,77,60,54,62,65,140000,"안양");
		anyang[5] = new BasketballTeam("송교창",26,200,95,7,90,70,87,74,82,140000,"안양");
		anyang[6] = new BasketballTeam("이정현",34,191,89,20,70,66,59,63,70,140000,"안양");
		//출력
		Anyang.printPlayerList(anyang);
	}//end initialTeamAnyang
}//end class Anyang
//전주 팀 정보
class Jeonju extends BasketballTeam{
	static void initialTeamAnyang(BasketballTeam [] jeonju) {
		//초기화
		for(int i = 0;i<jeonju.length;i++) {
			jeonju[i] = new BasketballTeam();
		}//end for(i)
		//초기값
		jeonju[0] = new BasketballTeam("김지완",31,187,82,2,70,77,54,88,92,200000,"전주");
		jeonju[1] = new BasketballTeam("김창모",30,190,94,3,64,86,77,70,85,150000,"전주");
		jeonju[2] = new BasketballTeam("유병훈",31,188,85,4,72,72,66,89,79,180000,"전주");
		jeonju[3] = new BasketballTeam("유성호",33,200,100,5,75,69,59,82,80,220000,"전주");
		jeonju[4] = new BasketballTeam("권시현",26,184,79,6,77,60,54,62,65,140000,"전주");
		jeonju[5] = new BasketballTeam("송창용",34,192,89,10,80,79,64,60,66,170000,"전주");
		jeonju[6] = new BasketballTeam("곽동기",26,193,102,14,88,72,61,50,90,200000,"전주");
		jeonju[7] = new BasketballTeam("권혁준",24,180,75,22,70,80,77,62,82,190000,"전주");
		//출력
		Jeonju.printPlayerList(jeonju);
	}//end initialTeamAnyang
}//end class Jeonju
//FA 선수 정보
class FAMarket extends BasketballTeam {
	//생성자
	FAMarket(String name, int age, int height, int weight, int num, int att, int def, int speed, int vision, int mental,
			int price,String team){
		super(name,age,height,weight,num,att,def,speed,vision,mental,price,"");
	}
	public FAMarket() {
		super("null",0,0,0,0,0,0,0,0,0,0,"");
	};
	//FA선수 명단 초기값 설정
	static void initialFAMarket(BasketballTeam []FAmarket) {
		//초기화
		for(int i = 0;i<FAmarket.length;i++) {
			FAmarket[i] = new BasketballTeam();
		}//end for(i)
		//초기값
		FAmarket[0] = new BasketballTeam("신명호",38,184,82,17,70,77,54,88,92,200000,"없음");
		FAmarket[1] = new BasketballTeam("김창모",27,180,70,31,64,86,77,70,85,150000,"없음");
		FAmarket[2] = new BasketballTeam("김경원",25,198,101,14,72,72,66,89,79,180000,"없음");
		FAmarket[3] = new BasketballTeam("박건호",25,199,105,31,75,69,59,82,80,220000,"없음");
		FAmarket[4] = new BasketballTeam("문성곤",26,196,85,10,68,87,74,55,82,140000,"없음");
		FAmarket[5] = new BasketballTeam("함준후",33,195,91,7,72,77,70,81,72,230000,"없음");
		FAmarket[6] = new BasketballTeam("정강호",27,191,90,29,82,92,83,82,75,240000,"없음");
		FAmarket[7] = new BasketballTeam("변준형",24,188,90,5,69,90,77,72,95,170000,"없음");
	}//end initialFAMarket
	static void FAMarketMenu(BasketballTeam [] wonju,BasketballTeam [] FAmarket) {
		int inputNum = 0;
		System.out.println("┏━━━━━━━━━━━━━━━┓");
		System.out.println("┃  1. FA선수 영입\t\t┃");
		System.out.println("┃  2. FA선수 생성\t\t┃");
		System.out.println("┃  3. FA선수 삭제\t\t┃");
		System.out.println("┃  0. 뒤로 가기  \t\t┃");
		System.out.println("┗━━━━━━━━━━━━━━━┛");
		System.out.print("  입력 : "); inputNum = sc.nextInt();
		switch(inputNum) {
		case 1: Wonju.buyFAPlayer(wonju,FAmarket); break;
		case 2: createFAPlayer(FAmarket); break;
		case 3: deleteFAPlayer(FAmarket); break;
		case 0: return;
		}//end switch
	}//end FAMarketMenu
}//end class FAMarket
public class ExtendsTest04_1_윤순호 {
	//다른 팀 정보 보기
	static void otherTeamMenu() {
		int inputNum = -1;
		BasketballTeam[] seoul = new BasketballTeam[11];
		BasketballTeam[] anyang = new BasketballTeam[11];
		BasketballTeam[] jeonju = new BasketballTeam[11];
		while(inputNum != 0) {
			System.out.println("어느 팀을 보시겠습니까?\n1.서울\n2.안양\n3.전주\n0.뒤로가기"); inputNum = sc.nextInt();
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
		//FA배열 초기화
		FAMarket.initialFAMarket(FAmarket);
		BasketballTeam[] wonju = new BasketballTeam[11];
		Wonju.initialTeamWonjo(wonju);
		while(inputNum != 0) {
			System.out.println("메뉴\n1.우리 팀 보기\n2.상대 팀 보기\n3.FA 선수 확인\n0.종료하기"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: Wonju.callMyTeamMenu(wonju); break;
			case 2: otherTeamMenu(); break;
			case 3: FAMarket.showFAMarket(wonju,FAmarket); break;
			}//end switch
		}//end while
		System.out.println("프로그램을 종료합니다.");
	}//end main
}//end class