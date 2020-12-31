package classEx2;

class Type{
	int bunho;
	String name;
	double height;
	double weight;
	//getter
	public int getBunho() {return bunho;}//end getBunho
	public String getName() {return name;}//end getName
	public double getHeight() {return height;}//end getHeight
	public double getWeight() {return weight;}//end getWeight
	//setter 만들기
	public void setBunho(int bunho) {this.bunho = bunho;}//end setBunho
	public void setName(String name) {this.name = name;}//end setName
	public void setHeight(double height) {
		if(height < 0) 
			this.height = 150.5;		//음수일 경우 150으로 초기화
		else 
			this.height = height;		//양수일 경우 그대로 입력
	}//end setHeight
	public void setWeight(double weight) {
		if(weight < 0)
			this.weight = 55.5;			//음수일 경우 55.5로 초기화
		else
			this.weight = weight;		//양수일 경우 그대로 입력
	}//end setWeight
	
	//각 setter를 통해 입력하지 않고, 한번에 입력받기
	public void setData(int bunho,double height, double weight,String name) {
		this.bunho = bunho;
//		this.height = height;
//		this.weight = weight;
		setHeight(height);
		setWeight(weight);
		this.name = name;
	}//end setData
	//출력용 메서드 만들기
	public void printInfo() {
		System.out.println(" 번호  : "+bunho+"번\n 이름  : "+name+"\n  키   : "+
	String.format("%.1f",weight)+"cm\n몸무게 : "+String.format("%.1f",height)+"kg\n");
	}//end printInfo
}//end class Type

public class ClassTest04 {

	public static void main(String[] args) {
		//객체 출력하기
		Type obj = new Type();
		obj.setBunho(1);
		obj.setName("홍길동");
		obj.setHeight(122.6);
		obj.setWeight(58.4);
		obj.printInfo();
		
		Type obj2 = new Type();
		obj.setData(2, 192.8, 50.3, "이순신");		//홍길동 데이터를 입력받는 것보다 훨씬 더 간결하게 코드를 작성했습니다.
		obj.printInfo();
		
	}//end main
}//end class
