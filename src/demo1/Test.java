package demo1;

public class Test {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		System.out.println("Test!");
	}
}
