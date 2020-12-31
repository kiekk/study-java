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
	//setter �����
	public void setBunho(int bunho) {this.bunho = bunho;}//end setBunho
	public void setName(String name) {this.name = name;}//end setName
	public void setHeight(double height) {
		if(height < 0) 
			this.height = 150.5;		//������ ��� 150���� �ʱ�ȭ
		else 
			this.height = height;		//����� ��� �״�� �Է�
	}//end setHeight
	public void setWeight(double weight) {
		if(weight < 0)
			this.weight = 55.5;			//������ ��� 55.5�� �ʱ�ȭ
		else
			this.weight = weight;		//����� ��� �״�� �Է�
	}//end setWeight
	
	//�� setter�� ���� �Է����� �ʰ�, �ѹ��� �Է¹ޱ�
	public void setData(int bunho,double height, double weight,String name) {
		this.bunho = bunho;
//		this.height = height;
//		this.weight = weight;
		setHeight(height);
		setWeight(weight);
		this.name = name;
	}//end setData
	//��¿� �޼��� �����
	public void printInfo() {
		System.out.println(" ��ȣ  : "+bunho+"��\n �̸�  : "+name+"\n  Ű   : "+
	String.format("%.1f",weight)+"cm\n������ : "+String.format("%.1f",height)+"kg\n");
	}//end printInfo
}//end class Type

public class ClassTest04 {

	public static void main(String[] args) {
		//��ü ����ϱ�
		Type obj = new Type();
		obj.setBunho(1);
		obj.setName("ȫ�浿");
		obj.setHeight(122.6);
		obj.setWeight(58.4);
		obj.printInfo();
		
		Type obj2 = new Type();
		obj.setData(2, 192.8, 50.3, "�̼���");		//ȫ�浿 �����͸� �Է¹޴� �ͺ��� �ξ� �� �����ϰ� �ڵ带 �ۼ��߽��ϴ�.
		obj.printInfo();
		
	}//end main
}//end class
