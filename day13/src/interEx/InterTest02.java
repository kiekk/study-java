package interEx;

interface Listener{
	void event();
	void draw();
	void move();
	void remove();
	void click();
	void release();
}
interface Event{
	void popup();
	void menu();
}
interface Window{
	void dialog();
	void drag();
}
//interface의 추상메서드중에서 원하는 메서드만 골라서 재정의하여 사용하고자 할때, adapter라는 클래스(연결,중간자역할)를 이용합니다.
abstract class Adapter implements Listener, Event, Window{		//상징적 의미로 abstract키워드를 붙입니다.
	@Override
	public void dialog() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drag() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void event() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void popup() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}
	
}
class MyListener extends Adapter{
	@Override
	public void click() {
		// TODO Auto-generated method stub
		super.click();
	}
	
}
public class InterTest02 {

	public static void main(String[] args) {

	}

}
