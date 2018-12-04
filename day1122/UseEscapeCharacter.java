package day1122;

/**
 * 특수문자 : 문자열내 \로 시작하는 기능을 가진 문자
 * @author owner
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		System.out.println("박\t소영"); //\t : tab
		System.out.println("박\t\t소영");
		System.out.println("정\n택성"); //\n : newline
		System.out.println("정\r택성"); //\r : return(커서가 앞으로이지만 줄이 바뀜)
		System.out.println("정\r택성"); //\r : return(커서가 앞으로이지만 줄이 바뀜)
		System.out.println("오늘은 \"급여일\" 입니다."); //\" : "
		System.out.println("오늘은 \'급여일\' 입니다."); //\' : '
		System.out.println("C:\\dev\\workspace\\javase_prj\\src\\day1122\\Test.java"); // \를 쓰려면 \를 써서 특수문자가 아니라고 표시
		//System.out.println("C:/dev/workspace/javase_prj/src/day1122/Test.java");// /는 그냥 써짐
		System.out.println("이재현\b");
		System.out.println("이재현\f");
		

	}//main

}//class
