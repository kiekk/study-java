package productEx;

public class TV extends Product{
	private String prod_brand;
	public TV(String prod_num, String prod_name, int prod_price,String prod_brand){
		super(prod_num,prod_name,prod_price);
		this.prod_brand = prod_brand;
	}
	public String getProd_brand() {
		return prod_brand;
	}
	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}
	public void printInfo() {
		System.out.println("----------------------------");
		System.out.println("ǰ�� : "+this.getProd_name());
		System.out.println("ǰ�� : "+this.getProd_num());
		System.out.println("��ǰ���� : "+this.getProd_price());
		System.out.println("�귣�� : "+this.getProd_brand());
		System.out.println("----------------------------");
	}
	
}
