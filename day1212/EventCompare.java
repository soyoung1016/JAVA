package day1212;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 같은 종류의 이벤트가 여러개 발생하면, 그 이벤트를 비교하여 처리하는 방법<br>
 * 이벤트를 발생시킨 주소를 비교, 모든 이벤트에서 사용가능 : getSource()<br>
 * 이벤트를 발생시킨 객체의 Label을 비교 - ActionEvent에서만 사용 가능 : getActionCommand()
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class EventCompare extends Frame implements ActionListener{
	
	//2. 이벤트와 관련있는 컴포넌트 선언
	private Button btnOpen;
	private Button btnSave;
	private Label lblOutput;

	public EventCompare() {
		super("파일 다이얼로그 사용");
		
		//3. 생성
		btnOpen = new Button("열기모드");
		btnSave = new Button("저장모드");
		lblOutput = new Label("출력창 : ");
		
		//4. 배치
		Panel panel = new Panel(); //컨테이너 컴포넌트
		panel.add(btnOpen);
		panel.add(btnSave);
		
		add("Center", panel);
		add("South", lblOutput);
		
		//5. 이벤트 등록
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
		
		//6. 윈도우 크기 설정
		setBounds(100,100,500,100);
		
		//7. 가시화
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
	}
	
//	@Override
//	public void actionPerformed(ActionEvent ae) {
////		System.out.println("이벤트 발생 "+ae);
//		//////////////////////////////주소비교/////////////////////////////////////
//		if(ae.getSource()==btnOpen) {
//			System.out.println("열기");
//		}
//		
//		if(ae.getSource()==btnSave) {
//			System.out.println("저장");
//		}
//	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println("이벤트 발생 객체의 Lable : "+ae.getActionCommand());
		//////////////////////////////라벨비교/////////////////////////////////////
		String label = ae.getActionCommand();
		
		if(label.equals("열기모드")) {
//			System.out.println("열기!!!");
			//윈도우 컴포넌트 이므로 생성했다고 사용자에게 보여지지 않는다. 가시화 해야함
			//단, 실제 열기 기능은 없다.
			FileDialog fdOpen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
			//가시화
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			
			if(name != null) { //취소 눌렀을때 null이 뜨지 않게 하기
				lblOutput.setText("열기 파일 : "+path+name);
				//타이틀바의 내용 변경
				setTitle("파일 다이얼로그 사용 - 열기 : "+name);
			}
		}
		
		if(label.equals("저장모드")) {
//			System.out.println("저장!!!");
			//윈도우 컴포넌트 이므로 생성했다고 사용자에게 보여지지 않는다. 가시화 해야함
			//단, 실제 저장 기능은 없다
			FileDialog fdSave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
			//가시화
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			
			if(name != null) { //취소 눌렀을때 null이 뜨지 않게 하기
				lblOutput.setText("저장 파일 : "+path+name);
				//타이틀바의 내용 변경
				setTitle("파일 다이얼로그 사용 - 저장 : "+name);
				
			}
		
		}
	}
	
	
	
	public static void main(String[] args) {
		new EventCompare();
	}


}
