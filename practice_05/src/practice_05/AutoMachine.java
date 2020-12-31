package practice_05;

public class AutoMachine implements AutoCloseable {

	private static AutoMachine machine;
	
	public static AutoMachine getInstance() {
		System.out.println("AutoMachine�� �����մϴ�.");
		machine = new AutoMachine();
		return machine;
	}
	
	public void run() throws Exception {
		System.out.println("AutoMachine�� �����մϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("AutoMachine�� �����մϴ�.");
		machine = null;
	}
	
	public static void main(String[] args) {
		try(AutoMachine machine = AutoMachine.getInstance()){
			machine.run();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
