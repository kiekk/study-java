package practice;
import java.util.Scanner;
public class ExtendsTest04_2_윤순호 {
	public static void main(String[] args) {
		new PlayGames().showMainMenu();
	}//end main
}//end class

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
	int num;					//등번호		<--등번호는 굳이 private안해도 될것 같아서..
	private int att;			//공격력
	private int def;			//수비력
	private int speed;			//스피드
	private int vision;			//시야력
	private int mental;			//정신력
	private int price;			//연봉
	private String team;	//소속팀
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
	//생성자
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
//팀별 초기화 클래스
class BasketballTeam {
	//FA선수 초기화
	void initialFAMarket(BasketballPlayer[] FAmarket) {
		//초기값
		FAmarket[0] = new BasketballPlayer("신명호",38,184,82,17,70,77,54,88,92,200000,"없음");
		FAmarket[1] = new BasketballPlayer("김창모",27,180,70,31,64,86,77,70,85,150000,"없음");
		FAmarket[2] = new BasketballPlayer("김경원",25,198,101,14,72,72,66,89,79,180000,"없음");
		FAmarket[3] = new BasketballPlayer("박건호",25,199,105,31,75,69,59,82,80,220000,"없음");
		FAmarket[4] = new BasketballPlayer("문성곤",26,196,85,10,68,87,74,55,82,140000,"없음");
		FAmarket[5] = new BasketballPlayer("함준후",33,195,91,7,72,77,70,81,72,230000,"없음");
		FAmarket[6] = new BasketballPlayer("정강호",27,191,90,29,82,92,83,82,75,240000,"없음");
		FAmarket[7] = new BasketballPlayer("변준형",24,188,90,5,69,90,77,72,95,170000,"없음");
		//초기화
		for(int i = 8;i<FAmarket.length;i++) {
			FAmarket[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialFAMarket
	//원주팀 초기화
	void initialTeamWonju(BasketballPlayer[] wonju) {
		//초기값
		wonju[0] = new BasketballPlayer("김태술",37,180,80,1,70,77,54,88,92,200000,"원주");
		wonju[1] = new BasketballPlayer("맹상훈",27,181,77,5,64,86,77,70,85,150000,"원주");
		wonju[2] = new BasketballPlayer("허웅",28,186,78,3,72,72,66,89,79,180000,"원주");
		wonju[3] = new BasketballPlayer("김현호",33,184,78,7,75,69,59,82,80,220000,"원주");
		wonju[4] = new BasketballPlayer("이윤수",25,203,107,14,77,60,54,62,65,140000,"원주");
		//초기화
		for(int i = 5;i<wonju.length;i++) {
			wonju[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamWonju
	//서울팀 초기화
	void initialTeamSeoul(BasketballPlayer[] seoul) {
		//초기값
		seoul[0] = new BasketballPlayer("김준성",29,177,74,1,70,77,54,88,92,200000,"서울");
		seoul[1] = new BasketballPlayer("김선형",33,187,80,5,64,86,77,70,85,150000,"서울");
		seoul[2] = new BasketballPlayer("변기훈",32,187,86,7,72,72,66,89,79,180000,"서울");
		seoul[3] = new BasketballPlayer("최성원",26,184,78,19,75,69,59,82,80,220000,"서울");
		seoul[4] = new BasketballPlayer("배병준",31,191,87,24,77,60,54,62,65,140000,"서울");
		//초기화
		for(int i = 5;i<seoul.length;i++) {
			seoul[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamSeoul
	//안양팀 초기화
	void initialTeamAnyang(BasketballPlayer[] anyang) {
		//초기값
		anyang[0] = new BasketballPlayer("전태영",26,182,85,2,70,77,54,88,92,200000,"안양");
		anyang[1] = new BasketballPlayer("우동현",25,176,78,3,64,86,77,70,85,150000,"안양");
		anyang[2] = new BasketballPlayer("박형철",35,192,85,4,72,72,66,89,79,180000,"안양");
		anyang[3] = new BasketballPlayer("이재도",30,180,73,5,75,69,59,82,80,220000,"안양");
		anyang[4] = new BasketballPlayer("변준형",26,188,90,6,77,60,54,62,65,140000,"안양");
		anyang[5] = new BasketballPlayer("송교창",26,200,95,7,90,70,87,74,82,140000,"안양");
		anyang[6] = new BasketballPlayer("이정현",34,191,89,20,70,66,59,63,70,140000,"안양");
		//초기화
		for(int i = 7;i<anyang.length;i++) {
			anyang[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamAnyang
	//전주팀 초기화
	void initialTeamJeonju(BasketballPlayer[] jeonju) {
		//초기값
		jeonju[0] = new BasketballPlayer("김지완",31,187,82,2,70,77,54,88,92,200000,"전주");
		jeonju[1] = new BasketballPlayer("김창모",30,190,94,3,64,86,77,70,85,150000,"전주");
		jeonju[2] = new BasketballPlayer("유병훈",31,188,85,4,72,72,66,89,79,180000,"전주");
		jeonju[3] = new BasketballPlayer("유성호",33,200,100,5,75,69,59,82,80,220000,"전주");
		jeonju[4] = new BasketballPlayer("권시현",26,184,79,6,77,60,54,62,65,140000,"전주");
		jeonju[5] = new BasketballPlayer("송창용",34,192,89,10,80,79,64,60,66,170000,"전주");
		jeonju[6] = new BasketballPlayer("곽동기",26,193,102,14,88,72,61,50,90,200000,"전주");
		jeonju[7] = new BasketballPlayer("권혁준",24,180,75,22,70,80,77,62,82,190000,"전주");
		//초기화
		for(int i = 8;i<jeonju.length;i++) {
			jeonju[i] = new BasketballPlayer();
		}//end for(i)
	}//end initialTeamAnyang
}//end class BasketballTeam
//FA 시장
class FAMarket{
	static Scanner sc = new Scanner(System.in);
	//FA선수 정보 출력
	void showFAMarket(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t\tFA선수\t\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t  ┃");
		for(int i = 0;i<FAmarket.length;i++) {
			if(FAmarket[0].num == 0) {
				System.out.println("    ┃\t\t\t\t      FA로 등록된 선수가 없습니다.\t\t            ┃");
				break;
			}else if(FAmarket[i].num == 0) break;
			else {
				System.out.print("    ┃\t"+(i+1)+"\t");
				System.out.print(FAmarket[i].num+"번\t"+FAmarket[i].getName()+"\t"+FAmarket[i].getAtt()+"\t"+FAmarket[i].getDef()+"\t"+FAmarket[i].getSpeed()+"\t"+FAmarket[i].getVision()+"\t"+FAmarket[i].getMental()+"\t"+FAmarket[i].getPrice()+"\t\t\t  ┃\n");
			}//end if
		}//end for(i)
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		//FA메뉴호출
		FAMarketMenu(wonju,FAmarket);
	}//end showFAMarket
	//FA메뉴
	void FAMarketMenu(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		int inputNum = 0;
		System.out.println("┏━━━━━━━━━━━━━━━┓");
		System.out.println("┃  1. FA선수 영입\t\t┃");
		System.out.println("┃  2. FA선수 생성\t\t┃");
		System.out.println("┃  3. FA선수 삭제\t\t┃");
		System.out.println("┃  0. 뒤로 가기  \t\t┃");
		System.out.println("┗━━━━━━━━━━━━━━━┛");
		System.out.print("  입력 : "); inputNum = sc.nextInt();
		switch(inputNum) {
		case 1: buyFAPlayer(wonju,FAmarket); break;
		case 2: createFAPlayer(FAmarket); break;
		case 3: deleteFAPlayer(FAmarket); break;
		case 0: return;
		}//end switch
	}//end FAMarketMenu
	//FA선수 영입
	void buyFAPlayer(BasketballPlayer [] wonju,BasketballPlayer[] FAmarket) {
		int buyNum = 0,count = 0;
		System.out.print("몇 번째 선수를 영입하시겠습니까? : "); buyNum = sc.nextInt();
		System.out.println(FAmarket[buyNum-1].getName()+"선수를 영입합니다.");
		for(int i = 0;i<wonju.length;i++) {
			if(wonju[i].num == 0) {
				count = i;
				break;
			}else if(wonju[wonju.length-1].num != 0) {
				System.out.println("선수 슬롯이 가득찼습니다.");
				System.out.println("더 이상 영입할 수 없습니다.");
				return;
			}
		}//end for(i)
		wonju[count] = FAmarket[buyNum-1];
		for(int i = buyNum;i<FAmarket.length;i++) {
			FAmarket[i-1] = FAmarket[i];
		}//end for(i)
	}//end buyFAPlayer
	//FA선수 생성
	void createFAPlayer(BasketballPlayer [] FAmarket) {
		String name;
		int age,height,weight,num,att,def,speed,vision,mental,price,count = 0;
		//비어있는 배열 찾기
		for(int i = 0;i<FAmarket.length;i++) {
			if(FAmarket[i].num == 0) {
				count = i;
				break;
			}//end if
		}//end for(i)
		System.out.print("이름을 입력해주세요 : "); name = sc.next(); FAmarket[count].setName(name);
		while(true) {
			System.out.print("나이를 입력해주세요  : "); age = sc.nextInt();
			if(age >= 20 && age <= 40) {
				FAmarket[count].setAge(age);
				break;
			}else {
				System.out.println("현역은 20~40세까지 입니다.");
			}//end if
		}//end while
		while(true) {
			System.out.print("키를 입력해주세요  : "); height = sc.nextInt();
			if(height>=150 && height <=200) {
				FAmarket[count].setHeight(height);
				break;
			}else {
				System.out.println("키는 150~200cm 사이로 설정해 주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("몸무게를 입력해주세요  : "); weight = sc.nextInt();
			if(weight >= 50 && weight <= 100) {
				FAmarket[count].setWeight(weight);
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
				FAmarket[count].num = num;
				break;
			}//end if
		}//end while
		while(true) {
			System.out.print("공격력를 입력해주세요  : "); att = sc.nextInt();
			if(att>=0 && att<=100) {
				FAmarket[count].setAtt(att);
				break;
			}else {
				System.out.println("공격력은 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("수비력를 입력해주세요  : "); def = sc.nextInt();
			if(def >=0 && def <= 100) {
				FAmarket[count].setDef(def);
				break;
			}else {
				System.out.println("수비력은 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("스피드를 입력해주세요  : "); speed = sc.nextInt();
			if(speed >=0 && speed <= 100) {
				FAmarket[count].setSpeed(speed);
				break;
			}else {
				System.out.println("스피드는 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("시야력를 입력해주세요  : "); vision = sc.nextInt();
			if(vision >= 0 && vision <= 100) {
				FAmarket[count].setVision(vision);
				break;
			}else {
				System.out.println("시야력은 0~100사이로 설정해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("정신력를 입력해주세요  : "); mental = sc.nextInt();
			if(mental >= 0 && mental <= 100) {
				FAmarket[count].setMental(mental);
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
				FAmarket[count].setPrice(price);;
				break;
			}//end if
		}//end while
	}//end createFAPlayer
	//FA선수 삭제
	void deleteFAPlayer(BasketballPlayer [] FAmarket) {
		int delNum = 0;
		System.out.print("몇 번째 선수를 삭제하시겠습니까? : "); delNum = sc.nextInt();
		System.out.println(FAmarket[delNum-1].getName()+"선수의 데이터를 삭제합니다.");
		for(int i = delNum;i<FAmarket.length;i++) {
			FAmarket[delNum-1] = FAmarket[delNum];
			if(delNum == (FAmarket.length-1)) FAmarket[delNum] = new BasketballPlayer();
		}//end for(i)
	}//end deleteFAPlayer
}//end class FAMarket
//게임 시작하기
class PlayGames{
	static Scanner sc = new Scanner(System.in);
	BasketballTeam bt = new BasketballTeam();

	//메인 메뉴
	void showMainMenu() {
		//각 팀별 배열 생성
		BasketballPlayer[] FAmarket = new BasketballPlayer[20];
		BasketballPlayer[] wonju = new BasketballPlayer[10];
		BasketballPlayer[] seoul = new BasketballPlayer[10];
		BasketballPlayer[] anyang = new BasketballPlayer[10];
		BasketballPlayer[] jeonju = new BasketballPlayer[10];
		//각 팀별 배열 초기화
		bt.initialFAMarket(FAmarket);
		bt.initialTeamWonju(wonju);
		bt.initialTeamSeoul(seoul);
		bt.initialTeamAnyang(anyang);
		bt.initialTeamJeonju(jeonju);
		int inputNum = -1;
		while(inputNum != 0) {
			System.out.println("메뉴\n1.우리 팀 보기\n2.상대 팀 보기\n3.FA 선수 확인\n0.종료하기"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: callMyTeamMenu(wonju,FAmarket); break;
			case 2: showOtherTeam(seoul,anyang,jeonju); break;
			case 3: new FAMarket().showFAMarket(wonju,FAmarket); break;
			}//end switch
		}//end while
	}//end showMainMenu
	//나의 팀 특정 선수 보기
	private void myTeamPlayerInfo(BasketballPlayer [] wonju) {
		int inputNum = 0;
		System.out.print("몇번 선수의 정보를 보시겠습니까? : "); inputNum = sc.nextInt();
		wonju[inputNum].printInfo();
	}//end wonjuPlayerInfo
	//우리팀 메뉴 보기
	private void callMyTeamMenu(BasketballPlayer [] wonju,BasketballPlayer [] FAmarket) {
		int input = -1;
		while(input != 0) {
			System.out.println("메뉴 선택\n1.선수 명단 보기\n2.선수 상세 정보\n3.선수 바꾸기\n4.선수 방출하기\n0.뒤로가기"); input = sc.nextInt();
			switch(input){
			case 1: printPlayerList(wonju); break;
			case 2: myTeamPlayerInfo(wonju); break;
			case 3: changePlayerList(wonju); break;
			case 4: releasePlayer(wonju,FAmarket); break;
			}//end switch
		}//end while
	}//end callMyTeamMenu
	//선수 방출하기
	private void releasePlayer(BasketballPlayer []wonju,BasketballPlayer []FAmarket) {
		int releaseNum = -1,count = 0;
		if(wonju[5].num == 0) {
			System.out.println("방출할 후보선수가 없습니다.");
			System.out.println("선수를 먼저 영입해주세요.");
		}else {
			System.out.println("몇번째 후보선수를 방출하시겠습니까?");
			System.out.println("후보선수만 방출 가능합니다.");
			System.out.println("주전선수를 방출하려면 후보선수와 선수바꾸기를 해주세요.(0.뒤로가기)");
			releaseNum = sc.nextInt();
			if(releaseNum == 0) return;
			for(int i = 5;i<5+releaseNum;i++) {
				if(wonju[i].num == 0) {
					System.out.println("해당 위치의 선수가 존재하지 않습니다.");
					System.out.println("후보 선수의 마지막 선수인 "+wonju[i-1].getName()+"선수를 방출합니다.");
					releaseNum = i-1;
					break;
				}//end if
			}//end for(i)
			System.out.println(wonju[releaseNum].getName()+"선수를 방출합니다.");
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
	//선수 교체하기
	private void changePlayerList(BasketballPlayer [] wonju) {
		if(wonju[5].num == 0) {
			System.out.println("바꿀 후보선수가 없습니다.");
			System.out.println("선수를 먼저 영입해주세요.");
		}else {
			int changeNum1 = 0,changeNum2 = 0;
			System.out.print("주전선수의 몇번째 선수를 빼시겠습니까? : "); changeNum1 = sc.nextInt();
			System.out.print("후보선수의 몇번째 선수를 넣으시겠습니까? : "); changeNum2 = sc.nextInt();
			for(int i = 5;i<5+changeNum2;i++) {
				if(wonju[i].num == 0) {
					System.out.println("해당 위치의 선수가 존재하지 않습니다.");
					System.out.println("후보 선수의 마지막 선수인 "+wonju[i-1].getName()+"선수와 교체합니다.");
					changeNum2 = i-1;
					break;
				}//end if
			}//end for(i)
			System.out.println(wonju[changeNum1-1].getName()+"선수와 "+wonju[changeNum2].getName()+"선수를 교체합니다.");
			BasketballPlayer temp;
			temp = wonju[changeNum1-1];
			wonju[changeNum1-1] = wonju[changeNum2];
			wonju[changeNum2] = temp;
		}//end if
	}//end wonju
	//다른 팀 정보 보기
	private void showOtherTeam(BasketballPlayer [] seoul,BasketballPlayer [] Anyang,BasketballPlayer [] Jeonju) {
		int inputNum = -1;
		while(inputNum != 0) {
			System.out.println("어느 팀을 보시겠습니까?\n1.서울\n2.안양\n3.전주\n0.뒤로가기"); inputNum = sc.nextInt();
			switch(inputNum) {
			case 1: printPlayerList(seoul);;break;
			case 2: printPlayerList(Anyang);break;
			case 3: printPlayerList(Jeonju);break;
			}//end switch
		}//end while
	}//end showOtherTeam
	//선수 명단 출력
	private void printPlayerList(BasketballPlayer [] array) {
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t\t"+array[0].getTeam()+"팀 주전선수\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t  ┃");
		for(int i = 0;i<5;i++) {
			if(array[0].num == 0) {
				System.out.println("    ┃\t\t\t\t      주전으로 등록된 선수가 없습니다.\t\t\t                ┃");
				break;
			}//end if
			System.out.print("    ┃\t"+(i+1)+"\t ");
			System.out.print(array[i].num+"번\t"+array[i].getName()+"\t"+array[i].getAtt()+"\t"+array[i].getDef()+"\t"+array[i].getSpeed()+"\t"+array[i].getVision()+"\t"+array[i].getMental()+"\t"+array[i].getPrice()+"\t\t\t  ┃\n");
		}//end for(i)
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("    ┃\t후보선수\t\t\t\t\t\t\t\t\t\t  ┃");
		System.out.println("    ┃\t순서\t번호\t이름\t공격력\t수비력\t스피드\t시야\t정신력\t연봉\t  ┃");
		for(int i = 5;i<array.length;i++) {
			if(array[5].num == 0) {
				System.out.println("    ┃\t\t\t\t       후보로 등록된 선수가 없습니다.\t\t          ┃");
				break;
			}else if(array[i].num == 0) break;
			System.out.print("    ┃\t"+(i-4)+"\t");
			System.out.print(array[i].num+"번\t"+array[i].getName()+"\t"+array[i].getAtt()+"\t"+array[i].getDef()+"\t"+array[i].getSpeed()+"\t"+array[i].getVision()+"\t"+array[i].getMental()+"\t"+array[i].getPrice()+"\t\t\t  ┃\n");
		}//end for(i)
		System.out.println("    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}//end printPlayerList
}//end class PlayGames
