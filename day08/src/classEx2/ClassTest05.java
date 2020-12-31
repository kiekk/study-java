package classEx2;
/*
	생성자 (contsructor)
	1. 메서드 
	2. 객체를 만들 때 인스턴스가 필요합니다.
		이 때, 인스턴스에 넣어주는 값 == 초기값
		*setter로 넣어주는 값 == 대입값
		
		int num = 0; <--초기값
		num = 20	 <--대입값
		
		obj = new Type(); <-- obj객체 (default 값으로)초기화
		Type2 obj = new Type(10, 5.5,"안녕");	obj객체 초기화
	3. 생성자 만드는 법
		1)생성자는 기본 메서드형에서 리턴타입을 쓰지 않습니다.(생략합니다.)
			void 메서드(){}에서 void를 지워야 합니다.
				 메서드명(){} 이렇게 사용합니다.
		2)메서드명은 반드시 클래스의 이름을 그대로 써야 합니다.
			Type2(){}	생성자 완료	<-- default constructor, 기본 생성자, 디폴트 생성자
			
	4. 생성자 특징
		인스턴스를 만들 때, 무조건 불러야 합니다.
		기본 생성자는 컴파일러가 자동으로 무조건 만들어 줍니다.
		단, 다른 생성자가 없을 때만 자동으로 만들어 줍니다.
		
		메서드 이름은 똑같이 쓸 수 있습니다. 단, 매개변수의 타입과 개수가 달라야 합니다.
		이렇게 똑같은 메서드 이름으로 통일해서 사용하면, 메서드를 사용할때 편리합니다.
		
		오버로딩 - overloading
 */
class Type2{
	private int num;
	private double d;
	//Type2 클래스의 생성자를 만들어 봅니다.
	//매개변수를 다르게 하여 생성자를 여러개 만들 수 있습니다.
	//생성자의 접근지정자는 public이 기본, 상황에 따라서는 private로 만들 수도 있습니다.(싱글턴 패턴)
	public Type2(){	//생성자
		System.out.println();
	}//constructor Type2
	public Type2(int num) {
		super();
		this.num = num;
	}
	public Type2(double d) {
		super();
		this.d = d;
	}
	public Type2(int num, double d) {
//		super(); 			<--상위의,  == 나의 부모 클래스의 생성자로 가라.
		this.num = num;
		this.d = d;
	}
	public Type2(double num, double d) {
		this.num = (int)num;
		this.d = d;
	}
}//end class Type
/*
 	setter : 대입
 	생성자 : 초기화
 		기본생성자 : defa ult값으로 초기화 
 		인수있는 생성자
 		생성자는 대부분 public이지만,private 접근지정자로 생성자를 만들기도 합니다.(싱글턴 패턴 - 인스턴스를 한개만 만들어야 할 때)
 	오버로딩
 		메서드를 같은이름으로 여러개 중복시킬 수 있는데, 매개변수의 타입과 개수가 달라야 적용할 수 있습니다.
 		(사용자가 편리하게 사용하기 위해서 오버로딩 기법을 사용합니다.)
 	
 */
public class ClassTest05 {

	public static void main(String[] args) {
		Type2 obj = new Type2();
		Type2 obj1 = new Type2(10);
		Type2 obj2 = new Type2(1.2);
		Type2 obj3 = new Type2(10,1.2);
		Type2 obj4 = new Type2(10.5,1);
	}//end main
}//end class
class Animal{
	Animal(){
	
	}//constructor Animal
}//end class Animal
class Car{
	Car(){

	}//constructor Car
}//end class Car
class Train{
	Train(){
		
	}//constructor Train
}//end class Train