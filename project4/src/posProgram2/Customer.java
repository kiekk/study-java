package posProgram2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class OrderMenu{
	String menuName;
	int menuPrice;
	public OrderMenu() {
		this("",0);
	}
	public OrderMenu(String menuName, int menuPrice) {
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
}
class Admin {
	private String id;
	private String pw;
	//getter setter
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public Admin(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}
public class Customer {
	String nickName;
	String pw;
	String name;
	String tel;
	int chargingMoney;
	ArrayList<OrderMenu> menuList;
	//getter setter
	public ArrayList<OrderMenu> getMenuList() {return menuList;}
	public void setMenuList(ArrayList<OrderMenu> menuList) {this.menuList = menuList;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	public String getNickName() {return nickName;}
	public void setNickName(String nickName) {this.nickName = nickName;}
	public int getChargingMoney() {return chargingMoney;}
	public void setChargingMoney(int chargingMoney) {this.chargingMoney = chargingMoney;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	//»ý¼ºÀÚ
	public Customer(String nickName, String pw, String name, String tel) {
		this.nickName = nickName;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.chargingMoney = 0;
	}
	public Customer(String name, String tel, String nickName,String pw, int chargingMoney) {
		this.name = name;
		this.tel = tel;
		this.nickName = nickName;
		this.pw = pw;
		this.chargingMoney = chargingMoney;
	}
	public Customer() {
		this("", "", "","", 0);
	}
}
