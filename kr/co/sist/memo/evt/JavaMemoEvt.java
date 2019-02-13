package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.HelpFormat;
import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String taNoteData; //T.A의 내용을 저장할 변수
	private String openPath; //열었던 파일명을 저장
	
	public JavaMemoEvt(JavaMemo jm) { //객체가 생성될때 초기화값을 넣어주는 일을 한다.
		this.jm=jm;
		taNoteData = ""; //taNoteData 초기화
		openPath = "";
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		//T.A의 내용과 읽어들였던 내용이 다르다면 저장여부를 묻고 작업을 진행한다.
		TextArea tempTa = jm.getTaNote(); //중복코드가 많아서 변수에 담아준다.
						
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
								
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//기존의 이름에 저장
					saveMemo();
				} else {
					//다른 이름으로 저장
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				jm.dispose();
			default:
				return;
			}//end switch
		} else {
			jm.dispose();	
		}//end if
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//새글 메뉴아이템에서 이벤트가 발생 했을 때
		if(ae.getSource()==jm.getMiNew()) {
			newMemo();
		}
		
		//열기 메뉴아이템에서 이벤트가 발생 했을 때
		if(ae.getSource()==jm.getMiOpen()) {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(jm, "선택한 파일을 읽을 수 없습니다.", "파일 열기 ERROR", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog
				(jm, "선택한 파일을 읽어들이는중 문제가 발생하였습니다.", "파일 열기 ERROR", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
		
		//저장 메뉴아이템에서 이벤트가 발생했을 때
		if(ae.getSource()==jm.getMiSave()) {
			saveMemo();
		}
		
		//다른 이름으로 저장 메뉴아이템에서 이벤트가 발생했을 때
		if(ae.getSource()==jm.getMiNewSave()) {
			newSaveMemo();
		}
		
		//종료 메뉴아이템에서 이벤트가 발생했을 때
		if(ae.getSource()==jm.getMiEnd()) {
			//저장되지않은 내용이 있다면 저장하고 종료 
			closeMemo();
		}
		
		//서식 메뉴아이템에서 이벤트가 발생했을 때
		if(ae.getSource()==jm.getMiFormat()) {
			formatDialog();
		}
		
		//도움말 메뉴아이템에서 이벤트가 발생했을 때
		if(ae.getSource()==jm.getMiHelp()) {
			helpDialog();
		}
		
	}
	
	/**
	 * 새글 : TextArea를 초기화한다.
	 */
	public void newMemo() {
		
		TextArea tempTa = jm.getTaNote();
		boolean flagNew = false;
		//저장할 것인지 판단
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "다른 이름으로 저장하시겠습니까?");
			
			switch(flag) {
			case JOptionPane.OK_OPTION :
				newSaveMemo();
				
			case JOptionPane.NO_OPTION :
				flagNew = false;
				break;
			default :
				flagNew = true;
			}
		}
		
		if(!flagNew) {
			tempTa.getText(); //버그때문에 값을 받아오고 나서 초기화
			tempTa.setText("");
			//새글이 된 이후에는 읽기한 내용을 초기화
			taNoteData = tempTa.getText();
			openPath = ""; //읽어들인 파일의 경로 초기화
			jm.setTitle("메모장 - 새글 ");
		}
	}
	
	/**
	 * txt파일 열기
	 */
	public void openMemo() throws FileNotFoundException, IOException{
		
		//T.A의 내용과 읽어들였던 내용이 다르다면 저장여부를 묻고 작업을 진행한다.
		TextArea tempTa = jm.getTaNote(); //중복코드가 많아서 변수에 담아준다.
		boolean flagOpen = false;
		
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, openPath+"\n을 저장하시겠습니까?");
				
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//기존의 이름에 저장
					saveMemo();
				} else {
					//다른 이름으로 저장
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				flagOpen = false;
				break;
			default:
				flagOpen = true;
			}//end if
		}//end if
		
		if(!flagOpen) {
			FileDialog fdOpen = new FileDialog(jm, "문서열기", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String filePath = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(filePath != null) { //선택한 파일이 존재
				////////////////////////12-20-2018 코드추가///////////////////////
				//메모장 열기 기능 추가
				
				//선택한 파일로 파일 객체 생성
				File file = new File(filePath+fileName);
				
				//16bit stream 사용
				BufferedReader br = null;
				
				try {
					br = new BufferedReader(new FileReader(file));
					
					String temp = "";
					//T.A를 초기화 한 후 
					tempTa.setText("");
					
					while((temp=br.readLine()) != null) {
						//파일에서 읽어들인 내용을 설정한다.
						tempTa.append(temp+"\r\n"); //\n을 구별할수없다.
					}
					
					//변수에 읽어들인 내용을 저장
					taNoteData = tempTa.getText();
					//열었던 파일명을 저장
					openPath = file.getAbsolutePath();
					
				} finally {
					if(br!=null) {
						br.close();
					}
				}
				
				////////////////////////12-20-2018 코드추가///////////////////////
				
				//파일의 경로와 이름을 Frame의 TitleBar에 설정
				jm.setTitle("메모장 - 열기"+filePath+fileName);
			}
		}//flagOpen의 end if
	}
	
	
	/**
	 * 작성한 메모를 저장 - 기존의 파일명을 그대로 저장하는 파일명에 반영
	 */
	public void saveMemo() {
		//기존에 열었던 이름의 파일에 덮어쓰는일
		try {
			if(!openPath.equals("")) {
				createFile(openPath);
			} else {
				newSaveMemo();
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	
	}
	
	private void createFile(String pathName) throws IOException {
		BufferedWriter bw = null;
		
		try {
			//사용자가 디렉토리명을 마음대로 변경할 수 없기 때문에 File 클래스를 사용할 필요가 없다.
			bw = new BufferedWriter(new FileWriter(pathName));
			bw.write(jm.getTaNote().getText()); //T.A의 내용을 스트림에 기록
			bw.flush();//스트림에 기록된 내용을 목적지로 분출
			
			openPath = pathName;
			taNoteData = jm.getTaNote().getText();
		} finally {
			if(bw != null) {
				bw.close();
			}
		}
	}
	
	/**
	 * 파일명을 입력받아 새이름으로 저장
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "문서저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if(filePath != null) { //저장버튼이 눌렸을때 동작
			try {
				createFile(filePath+fileName);
				JOptionPane.showMessageDialog(jm, fileName+" 저장완료", "저장", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//파일의 경로와 이름을 Frame의 TitleBar에 설정
			jm.setTitle("메모장 - 저장 "+filePath+fileName);
		}//end if
	}//end newSaveMemo
	
	/**
	 * 메뉴-종료 버튼을 이용하여 종료할때 저장되지않은 내용이 있는지 확인 후 종료
	 */
	public void closeMemo() {
		//T.A의 내용과 읽어들였던 내용이 다르다면 저장여부를 묻고 작업을 진행한다.
		TextArea tempTa = jm.getTaNote(); //중복코드가 많아서 변수에 담아준다.
				
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
						
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//기존의 이름에 저장
					saveMemo();
				} else {
					//다른 이름으로 저장
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				jm.dispose();
			default:
				return;
			}//end switch
		} else {
			jm.dispose();	
		}//end if
	}
	
	/**
	 * 글꼴을 설정하는 다이얼로그를 실행하는 일 
	 */
	public void formatDialog() {
		new MemoFormat(jm);
	}
	
	/**
	 * 메모장 정보를 제공하는 다이얼로그를 실행
	 */
	public void helpDialog() {
		new HelpFormat(jm);
	}
	
	

}
