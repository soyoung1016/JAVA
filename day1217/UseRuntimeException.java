package day1217;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * JVM이 자동으로 처리해주는 RuntimeException
 * @author owner
 */
public class UseRuntimeException {

	public static void main(String[] args) {
		
		//1. JTextArea생성 (컬럼수, 행수)
		JTextArea jta = new JTextArea(10,40);
		jta.setEditable(false);
		jta.append("어머어머어머ㅓ");
		//2.
		JScrollPane jsp = new JScrollPane(jta);
		//3. MessageDialog의 두번째 매개변수에 컴포넌트를 할당
		JOptionPane.showMessageDialog(null, jsp);
		
		
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = 0;
			
			result = num1 / num2;
			
			System.out.println(num1+" / "+num2+" = "+result);
		
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("배열에 인덱스가 잘못되었습니다."); //out을 err로 바꾸면 빨간색! 빨간색 메세지!
			//일반 사용자에게는 에러의 이유를 자세하게 보여주면 안된다(보안상의 문제)
			System.err.println("예외의 이유 : "+aioobe.getMessage());
			System.err.println("예외처리 클래스명과 이유 : "+aioobe);
			aioobe.printStackTrace(); //자세한 예외
		} catch (NumberFormatException nfe) {
			System.err.println("입력값이 숫자 형태가 아닙니다.");
			System.err.println("예외의 이유 : "+nfe.getMessage());
			System.err.println("예외처리 클래스명과 이유 : "+nfe);
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.err.println("0으로 나눌 수 없습니다.");
			ae.printStackTrace();
		} catch (Exception e) {
			System.err.println("개발자가 인지하지 못한 예외입니다.");
			e.printStackTrace();
			//Exception 하나만 쓰면 다 처리해주는데 왜 각각 써서 처리할까? 그것이 왜 더 올바른 문법인가?
			//A. 예외는 구분지어서 처리해주어야 하기 때문이다. 예외에 따른 코드가 다 있기 때문(지금은 syse써서 그럼..)
		} finally {
			System.out.println("반드시 실행되어야 할 코드");
		}
	}

}
