package day1212;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Keyboard Event 처리
 * @author owner
 */
//1. 윈도우 컴포넌트 상속, 이벤트 처리 리스너를 구현
@SuppressWarnings("serial")
public class UseKeyListener extends Frame implements KeyListener{
	
	public static final int ENTER = 10;

	//2. 이벤트와 관련있는 컴포넌트 선언
	private TextField tf;
	private Label lbl;
	
	public UseKeyListener() {
		super("키보드 이벤트 연습");
		//3.컴포넌트 생성
		tf = new TextField();
		lbl = new Label("출력창",Label.CENTER); //가운데 정렬
		
		//4. 배치
		add("North", tf);
		add("Center", lbl);
		
		//5. 컴포넌트를 이벤트에 등록
		tf.addKeyListener(this);
		
		//6. 윈도우 크기 설정
		setBounds(100,100,400,150);
		
		//7. 가시화
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}
	
	@Override
	public void keyTyped(KeyEvent ke) {
		//2. 키가 눌려 정보가 전달되는 순간. 눌린 키의 정보를 알 수 있다.
//		System.out.println("KeyTyped");
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		//1. 키보드의 키가 눌리는 순간이어서 키의 정보를 알 수 없다.
//		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		//3. 눌린 키가 정보를 전달하고 다시 올라오는 순간 눌린키의 정보를 알 수 있다.
//		System.out.println("keyReleased");
		//눌린 키의 문자와 코드값을 얻어서
		char inputKey = ke.getKeyChar();
		int inputCode = ke.getKeyCode(); //keycode는 키보드 키의 고유값(유니코드와 다른 존재) : 모든 코드가 unicode와 다르게 같은 값이 나온다.
//		System.out.println(inputKey+" "+inputCode);
		//출력 Label에 뿌린다.
		StringBuilder output = new StringBuilder();
		output.append("눌린키 문자 : ").append(inputKey).append(", 눌린키의 키코드 : ").append(inputCode);
		
		lbl.setText(output.toString());
		
		switch(inputCode) {
		//JDK1.7에서 발생한 버그 :
		//TextField, TextArea는 setText("");를 바로 사용하면 초기화되지 않는다.
		//값을 한번 얻어내고 초기화하면 된다.
		case ENTER :
			tf.getText(); 
			tf.setText(""); 
		break;
		
		case 27 : //esc를 입력하면 종료되도록 한다. esc의 키코드는 27
		//case KeyEvent.VK_ESCAPE 가 더 올바르긴 하다.
			dispose();
		}
	}
	
	public static void main(String[] args) {
		new UseKeyListener();
	}

}
