package day1129;

/**
 * �̸�, ����, �̸���, ���� �̴ϼ� �� ���ڸ� �����ϴ� Ŭ����
 * @author owner
 */
public class Data {
	private String name;
	private int age;
	private String email;
	private char initial;
	
	public Data() {
		System.out.println("Data Default Constructor");
	}//data
	
	public Data(String name, int age, String email, char initial) {
		System.out.println("Data Default Constructor");
		this.name=name;
		this.age=age;
		this.email=email;
		this.initial=initial;
	}//data
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setInitial(char initial) {
		this.initial=initial;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getInitial() {
		return initial;
	}
	
	public String toString() {
		return "�̸�" + name + ", ����" + age + ", �̸��� " + email + ", �̴ϼ� : " + initial;
	}
	
	
}
