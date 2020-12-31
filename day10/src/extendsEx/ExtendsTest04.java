package extendsEx;
/*
	���
	�������� ���� ����(���ε�)
	
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
		System.out.println("��ǰ�� : "+prod_name);
		System.out.println("��ǰ���� : "+price);
		System.out.println("��ǰ��ȣ : "+prod_id);
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
			return "����";
		else
			return "����";
	}
	void channelUp() { channel++;}
	void channelDown() { channel--;}
	public void tvInfo() {
		System.out.println("���α��� : "+width);
		System.out.println("���α��� : "+height);
		System.out.println("�������� : "+getIsPower(isPower));
		System.out.println("����ä�� : "+channel);
	}
	public void productInfo() {
		System.out.println(this +" ��ǰ ����");
		super.productInfo();
		this.tvInfo();
	}
	
}
class Snack extends Product{
	
	boolean sticker;		//��ƼĿ�� ����
	int weight; 			//������ ����
	

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
			return "����";
		else
			return "����";
	}
	void snackInfo() {
		System.out.println(this+" ��ǰ ����");
		super.productInfo();
		System.out.println("��ƼĿ : "+getSticker(sticker));
		System.out.println("���� : "+ weight);
	}
	
}
class Pencil extends Product{
	Pencil(){
		super("����",0,0);
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
		pro = samsung;					//�θ� = �ڽ� ���� ������ �����ϴ� ��츦 "������ ����" -> ������ �̶�� �մϴ�.
		samsung.productInfo();
		pro = lg;
		lg.productInfo();
		
		Snack banana = new Snack("�ٳ���ű",1200,123,true,10);
		banana.snackInfo();
		
		pro = banana;
		pro.productInfo();
		
		//������ ����
//		Product pro = new Product();
//		pro = samsung;
//
//		pro = banana;

		
	}//end main
}//end class ExtendsTest01