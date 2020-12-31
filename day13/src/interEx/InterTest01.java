package interEx;

interface InterA{
	void update();
}
interface InterB{
	void delete();
}
//���̻翡 able�� �پ������� interface������ �����غ��� �մϴ�.
//public interface controllable extends InterA, InterB{		<--���� , interface�� class�� ������ Ÿ���̶�� ���� ����
															//�� Ŭ���������� public class�� �� �Ѱ��� �����ؾ� �մϴ�.

//interface�� ����ϴ� ���� : ǥ���� ���� �� ����, guide�� ���� �� ����
//��� Ŭ������ �������� �޼��带 ������ �� ����,
interface Controllable extends InterA, InterB{
	
}
class Control implements Controllable{
	@Override
	public void update() {
		System.out.println("Control Ŭ������ update");
	}
	@Override
	public void delete() {
		System.out.println("Control Ŭ������ delete");
	}
}
class ControlB implements Controllable{
	@Override
	public void update() {
		System.out.println("ControlB Ŭ������ update");
	}
	@Override
	public void delete() {	
		System.out.println("ControlB Ŭ������ delete");
	}
}
//�� 3�� Ŭ����
class Some2{
	//interface�� �ᱹ Ÿ���Դϴ�.
	//������ ������ ����.
	void fct(Controllable obj) {
		obj.update();
		obj.delete();
	}
}
public class InterTest01 {

	public static void main(String[] args) {
		//�ν��Ͻ��� Ÿ�Կ� ���� ����� �޼��尡 ���� -> ��������
		new Some2().fct(new Control());
		new Some2().fct(new ControlB());

	}

}
