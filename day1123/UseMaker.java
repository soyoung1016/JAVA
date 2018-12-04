package day1123;

/**
 * 마카펜을 구현한 클래스를 사용하는 클래스.<br>
 * 4. 객체생성<br>
 * 5. 생성된 객체 사용
 * @author owner
 */
public class UseMaker {

	public static void main(String[] args) {
		//검은색 마커펜 1개 생성
		Marker black = new Marker();
//		black.setColor("검은색");
//		black.setCap(1);
//		black.setBody(1);
//		2018-11-26 코드 추가 - 생성자 수업하며 코드를 추가. setter 없이도 기본생성자를 생성하여 검은색 마카 호출 가능!
				
		System.out.printf("생성된 마카펜 색 [%s], 뚜껑[%d], 몸체[%d]\n", black.getColor(), black.getCap(), black.getBody());
		//생성된 객체의 사용
		System.out.println(black.write("안녕하세요?"));
		System.out.println("-----------------------------------");
		
		Marker red = new Marker("빨간색", 5, 5);
//		2018-11-26 코드 추가 - 기본생성자 수업하며 코드를 추가. setter 없이도 인자있는 생성자를 생성하여 빨간색 마카 호출 가능!(다형성)
//		객체화하며 안에 바로 인자값을 넣어준다!
//		red.setColor=("흰색");//접근지정자가 public이라면 외부에서 값을 직접 설정할수 있으므로 잘못된 값이 입력될 수 있다.
//		red.setColor("빨간색");
//		red.setCap(5);
//		red.setBody(5);
		
		
		System.out.printf("생성된 마카펜 색 [%s], 뚜껑[%d], 몸체[%d]", red.getColor(), red.getCap(), red.getBody());
		//생성된 객체의 사용
		System.out.println(black.write("빨간맛"));

	}//main

}//class
