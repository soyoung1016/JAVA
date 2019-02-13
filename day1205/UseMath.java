package day1205;

/**
 * Math : 객체를 생성하지 않고 사용하는 클래스
 * @author owner
 */
public class UseMath {
	
	public UseMath() {
//		Math m = new Math(); //ERROR. 객체만드는 클래스가 아니어서 에러
		int i = -12;
		System.out.println(i+"의 절대값 : "+Math.abs(i));
		System.out.println(Math.ceil(10.1)); //올림, 10.0은 그대로 10.0
		System.out.println(Math.round(10.1));//반올림
		System.out.println(Math.round(10.5)); //반올림, 소수점 이하 첫자리에서
		System.out.println(Math.floor(10.5)); //내림, 소수점 이하 첫자리에서
		
		double d = Math.random();
		System.out.println("발생한 난수 : "+d);
		System.out.println("범위를 설정한 난수 : "+d*5);
		System.out.println("범위를 설정한 난수에서 정수 : "+(int)d*5); //결과는 0, why? 캐스팅이 계산순서가 더 빨라서!
		System.out.println("범위를 설정한 난수에서 정수 : "+(int)(d*5));
		
		
		
		
		// A(65)-Z(90)중 하나의 문자를 반환하는 일
		//난수를 26개 발생시켜야 한다.???????
		System.out.println((char)((int)(d*26)+65));
		System.out.println("==============================");
		
	}
	
	public char[] createPassword() {
		char[] tempPass = new char[8];
		double w = Math.random();
		//영문자대문자, 소문자, 숫자로 이루어진 임의의 비밀번호 8자리를 생성하여 반환하는 일
		//대문자는 65-90, 소문자는 97-122, 숫자는 48-57
		
//		String flag = "ABCDEFGHIJKLMNOPQRSTUVWXYGabcdefghijklmnopqrstuvwxyg0123456789";
//				
//		for(int i = 0; i < tempPass.length; i++) {
//			tempPass[i] = flag.charAt((int)(Math.random()*flag.length()));
//			System.out.print(tempPass[i]);
//		}
		for (int i = 0; i < tempPass.length; i++) {
			tempPass[i] = (char)((int)(w*26)+65);
			System.out.print(tempPass[i]);
		}
		
		return tempPass;

	}
	

	public static void main(String[] args) {
		new UseMath().createPassword();
		
	}

}
