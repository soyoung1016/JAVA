package day1123;

/**
 * 라면을 추상화 하여 만든 ramen 클래스를 사용하는 클래스
 * @author owner
 */
public class UseRamen {

	public static void main(String[] args) {
		Ramen bogul = new Ramen();
		bogul.setName("오징어짬뽕");
//		bogul.setMake("소영");
//		bogul.setPrice(780);
//		bogul.setKcal(512);
		
		
		System.out.format("생성된 라면 객체 정보는 이름[%s], 제조사[%s], 가격[%d], 칼로리[%d]\n",
							bogul.getName(), bogul.getMake(), bogul.getPrice(), bogul.getKcal());
		
		System.out.println("------------------------------------------");
		
		Ramen shin = new Ramen(900,410,"농심");
		System.out.format("생성된 라면 객체 정보는 제조사[%s], 가격[%d], 칼로리[%d]\n",
				shin.getMake(), shin.getPrice(), shin.getKcal());

		System.out.println(bogul.eat());
		System.out.println(bogul.eat("파"));
		
		
	}

}
