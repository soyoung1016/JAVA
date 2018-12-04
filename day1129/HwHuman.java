package day1129;

public class HwHuman {
	private String name;
	private String add;
	private int age;
	private String gender;
	
	public HwHuman(String name, String add, int age, String gender) {
		this.name=name;
		this.add=add;
		this.age=age;
		this.gender=gender;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAdd(String add) {
		this.add=add;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdd() {
		return add;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	
}
