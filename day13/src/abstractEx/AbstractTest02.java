package abstractEx;
/*
 	
 */
abstract class Figure{
	int x,y;
	Figure(int x,int y){
		this.x = x;
		this.y = y;
	}
	abstract void draw();
	abstract void print();
}
class Triangle extends Figure{
	int width,height;
	Triangle(int x, int y,int width,int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	void draw() {
		System.out.println("삼각형을 그리다.");
	}
	@Override
	void print() {
		draw();
		System.out.println("좌표 (x :"+x+" y : "+y+")");
		System.out.println("가로:"+width+" 세로 : "+height);
		System.out.println("--------------------------");
	}
}
class Circle extends Figure{
	int radius;
	Circle(int x, int y,int radius) {
		super(x, y);
		this.radius = radius;
	}
	@Override
	void draw() {
		System.out.println("원을 그리다.");
	}
	@Override
	void print() {
		draw();
		System.out.println("좌표 (x :"+x+" y : "+y+")");
		System.out.println("반지름 : "+radius);
		System.out.println("--------------------------");
	}
	
}
class Rectangle extends Figure{
	int width,height;
	Rectangle(int x, int y,int width,int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	void draw() {
		System.out.println("직사각형을 그리다.");
	}
	@Override
	void print() {
		draw();
		System.out.println("좌표 (x :"+x+" y : "+y+")");
		System.out.println("가로 : "+width+" 세로 : "+height);
		System.out.println("--------------------------");
	}
	
}


public class AbstractTest02 {

	public static void main(String[] args) {
		Triangle tri = new Triangle(3,5,10,5);
		tri.print();
		Circle cir = new Circle(5,5,7);
		cir.print();
		Rectangle rec = new Rectangle(10,5,3,12);
		rec.print();
	}

}
