package extendsEx;
/*
	상속
	다형성과 동적 결합(바인딩)
	
 */
class Product{
	private String prod_name;
	private int price;
	private	int prod_id;
	
	public Product(String prod_name, int price, int prod_id) {
		this.prod_name = prod_name;
		this.price = price;
		this.prod_id = prod_id;
	}

	public void productInfo() {
		System.out.println("제품명 : "+prod_name);
		System.out.println("제품가격 : "+price);
		System.out.println("제품번호 : "+prod_id);
	}

	
}
class TV extends Product{
	int width;
	int height;
	boolean isPower;
	int channel;
	
	public TV(String prod_name, int price, int prod_id, int width, int height,boolean isPower,int channel) {
		super(prod_name,price,prod_id);
		this.width = width;
		this.height = height;
		this.isPower = isPower;
		this.channel = channel;
	}
	public String toString() {
		return "TV";
	}
//	boolean isPower() {
//		return !isPower;
//	}
	void isPower() {
		isPower = !isPower;
	}
	String getIsPower(boolean isPower) {
		if(isPower == true)
			return "켜짐";
		else
			return "꺼짐";
	}
	void channelUp() { channel++;}
	void channelDown() { channel--;}
	public void tvInfo() {
		System.out.println("가로길이 : "+width);
		System.out.println("세로길이 : "+height);
		System.out.println("전원상태 : "+getIsPower(isPower));
		System.out.println("현재채널 : "+channel);
	}
	public void productInfo() {
		System.out.println(this +" 제품 정보");
		super.productInfo();
		this.tvInfo();
	}
	
}
class Snack extends Product{
	
	boolean sticker;		//스티커의 유무
	int weight; 			//과자의 질량
	

		Snack(String prod_name,int price,int prod_id,boolean sticker,int weight){
		super(prod_name,price,prod_id);
		this.sticker = sticker;
		this.weight = weight;
	}
	public String toString() {
		return "Snack";
	}
	boolean isSticker( ) {
		return !sticker;
	}
	String getSticker(boolean sticker) {
		if(sticker == true)
			return "있음";
		else
			return "없음";
	}
	void snackInfo() {
		System.out.println(this+" 제품 정보");
		super.productInfo();
		System.out.println("스티커 : "+getSticker(sticker));
		System.out.println("무게 : "+ weight);
	}
	
}
class Pencil extends Product{
	Pencil(){
		super("없음",0,0);
	}
}
//class Radio extends Product{
//	
//}
//class Mp3 extends Product{
//	
//}
public class ExtendsTest04 {

	public static void main(String[] args) {
		TV samsung = new TV("samsung",1300000,123,150,150,false,15);
		samsung.productInfo();
		Product lg = new TV("lg",15000,12,120,180,true,20);
		lg.productInfo();

		Product pro = null;
		pro = samsung;					//부모 = 자식 간의 대입이 성립하는 경우를 "다형적 대입" -> 다형성 이라고 합니다.
		samsung.productInfo();
		pro = lg;
		lg.productInfo();
		
		Snack banana = new Snack("바나나킥",1200,123,true,10);
		banana.snackInfo();
		
		pro = banana;
		pro.productInfo();
		
		//다형적 대입
//		Product pro = new Product();
//		pro = samsung;
//
//		pro = banana;

		
	}//end main
}//end class ExtendsTest01