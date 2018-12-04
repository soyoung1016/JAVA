package day1123;

/**
 * 너구리, 오징어짬뽕, 신라면을 추상화하여 만든 클래스<br>
 * 명사적특징 : 제조사, 가격, 칼로리, 이름<br>
 * 동사적특징 : 먹는다.<br>
 * <br>
 * 181126 homework 기본생성자, 인자있는 생성자 사용하여 수정해보기<br>
 * 
 * 객체화) Ramen 객체명 = new Ramen();
 * 		생성된 객체로 먹는일을  할 수 있다.
 * @author owner
 */
public class Ramen {
	private String make, name; //제조사, 이름
	private int price, kcal; //가격, 칼로리
	
	/**
	 * 181126 homework 생성자 관련 코드 추가<br>
	 * 기본 생성자
	 */
	public Ramen() {
		price = 590;
		kcal = 457;
		make = "농심";
	}
	
	/**
	 * 181126 homework 생성자 관련 코드 추가<br>
	 * 인자있는 생성자
	 * @param price 라면의 가격
	 * @param kcal 라면의 칼로리
	 * @param make 라면의 제조사
	 */
	public Ramen(int price, int kcal, String make) {
		this.price = price;
		this.kcal = kcal;
		this.make = make;
	}
	
	/**
	 * 생성된 라면 객체에 제조사를 설정한다.<br>
	 * 설정할 라면의 제조사는 농심이다.<br>
	 * 농심이 아닌 다른것이 입력되면 농심으로 설정된다.
	 * @param make 제조사
	 */
	public void setMake(String make) {
		if(!(make.equals("농심"))) {
			make="농심";
		}
		this.make=make;
	}
	
	/**
	 * 생성된 라면 객체에 이름을 설정한다.<br>
	 * 설정할 라면의 이름은 너구리, 오징어짬뽕, 신라면이다.<br>
	 * 세가지가 아닌 다른 것이 입력되면 신라면으로 설정된다.
	 * @param name 라면의 이름
	 */
	public void setName(String name) {
		if(!(name.equals("너구리")||name.equals("오징어짬뽕")||name.equals("신라면"))) {
			name="신라면";
		}//end if
		this.name=name;
	}
	
	/**
	 * 생성된 라면 객체에 가격을 설정한다.
	 * @param price 라면의 가격
	 */
	public void setPrice(int price) {
		this.price=price;
	}
	
	/**
	 * 생성된 라면 객체에 칼로리를 설정한다.
	 * @param Kcal 라면의 칼로리
	 */
	public void setKcal(int kcal) {
		this.kcal=kcal;
	}
	
	/**
	 * 생성된 라면 객체에 제조사를 반환하는 일
	 * @return 제조사
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * 생성된 라면 객체에 라면 가격을 반환하는 일
	 * @return 가격
	 */
	
	/**
	 * 생성된 라면 객체에 라면 이름을 반환하는 일
	 * @return 이름
	 */
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	/**
	 * 생성된 라면 객체에 칼로리르 반환하는 일
	 * @return 칼로리
	 */
	public int getKcal() {
		return kcal;
	}
	
	public String eat() {
		return name+"를(을) 끓여 먹는다.";
	}
	
	public String eat(String plus) {
		return name+"에 추가로 "+plus+"를(을) 넣어 끓여 먹는다.";
	}
	
	
}
