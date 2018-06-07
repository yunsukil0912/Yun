public class MyMessage {
	String message;
	public MyMessage(String message) {
		this.message = message;
	}
	public void print() {
		System.out.println(message);
		System.out.println("modified");
	}
}