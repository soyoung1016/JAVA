package day1218;

public class Data /*implements Cloneable*/{

	private String school;

	public Data() {
	}

	public Data(String school) {
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public Data getData() throws CloneNotSupportedException {
		Data data = (Data)this.clone();
		//clone()는 protected 접근지정자를 가지고 있어서 외부 클래스에서 다른 클래스의 clone()을 호출할 수 없다.
		return data;
	}
	
}
