package day1126;

/**
 * method의 매개변수가 기본형 데이터형으로 정의된다면 매개변수에 할당 되는 값(arguments)은 복사되어 전달된다.<br>
 * 매개변수에 값을 변경하더라도 원래의 값이 변경되지 않는다.<br>
 * call by value
 * @author owner
 */
public class CallByValue {
	public void swap(int i, int j) {	//instance method(가변 일)
		int temp = 0;
		//입력되는 변수의 값을 서로 변경
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap method 내에서 i = "+i+", j = "+j);
	}
	
	public static void main(String[] args) {	//static method, main method
		int i = 11, j = 26;
		System.out.println("swap전의 i = "+i+", j = "+j);
		//결과 i=11, j=26;
		
		CallByValue cbv = new CallByValue();
		cbv.swap(i,j);
		System.out.println("swap후의 i = "+i+", j = "+j);

	}

}
