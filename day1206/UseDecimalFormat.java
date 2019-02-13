package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat
 * 숫자를 지정한 문자열로 변경
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp = 20181206;
		System.out.println(temp);
		//가독성을 위해 콤마를 넣고싶다!
		DecimalFormat df = new DecimalFormat("0,000");
		DecimalFormat df1 = new DecimalFormat("#,###");
		//패턴보다 변수의 자릿수가 더 클 경우 java가 알아서 같은 패턴으로 숫자를 맞춰 출력해준다.
		
		System.out.println("0사용 : " + df.format(temp));
		System.out.println("#사용 : " + df1.format(temp));
		
		System.out.println("-------------------------------");
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		//실수자릿수를 사용하면 마지막 뒷자리의 값이 반올림 대상이라면 반올림한 결과를 보여준다.
		System.out.println("소수자리수 표현 : " + df2.format(201812.066));
		System.out.println("소수자리수 표현 : " + df2.format(201812.064));
		
		
	}
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}

}
