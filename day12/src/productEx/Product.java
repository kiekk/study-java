package productEx;
/*
 	모델 클래스
 */
public class Product {
	private String prod_num;
	private String prod_name;
	private int prod_price;
	public Product(String prod_num, String prod_name, int prod_price) {
		this.prod_num = prod_num;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	public Product(String prod_num,String prod_name) {
		this(prod_num,prod_name,-1);
	}
	public String getProd_num() {
		return prod_num;
	}
	public void setProd_num(String prod_num) {
		this.prod_num = prod_num;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public void printInfo() {
	 	System.out.println("품목 : "+this.getProd_name());
		System.out.println("품번 : "+this.getProd_num());
		System.out.println("제품가격 : "+this.getProd_price());
	}
	
}
