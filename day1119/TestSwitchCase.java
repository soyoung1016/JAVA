package day1119;

/**
 * switch ~ case : 정수를 비교할 때(JDK1.7에서부터는 문자열도 비교 가능)<br>
 * 문법) switch(변수명) {
 * 			case 상수 : 수행문장;
 * 			case 상수 : 수행문장;
 * 			.<br>
 * 			.<br>
 * 			default : 일치하는 상수가 없을 때 수행문장;<br>
 * 		}
 * @author owner
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		int i = 0;
		
		switch (i) {//switch에 입력되는 변수의 데이터형은 byte, short, int, char, String
		//case는 입력되는 변수에 따라 다른 범위를 가진다.
		case 0 : System.out.println("새벽");
		case 1 : System.out.println("아침");
		case 2 : System.out.println("점심");
		//변수의 데이터형이 char일 경우 케이스 옆 상수도 char를 따라서 문자로 들어가야한다.
		//1과 '1'은 다르다. char i = '1'일 경우, 1의 unicode인 49가 들어간다.
		//그럴 경우 case 49가 없으므로 바로 default로 들어가 처리된다.
		//String i = "1"이 들어가면 case "1"로 비교가 된다.
		
		default : System.out.println("저녁");
		}//end switch
	}//main

}//class
