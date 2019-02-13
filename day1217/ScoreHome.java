package day1217;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ScoreHome extends JFrame{
	private List<InfoVO> allList;
	private JTextArea jta;
	private String InputData;
	private String menu;
	private int tempNum;
	
	public ScoreHome() {
		allList = new ArrayList<InfoVO>();
		jta = new JTextArea(10,50);
		jta.setEditable(false);
	}
	
	public String FirstMenu() {
		menu = JOptionPane.showInputDialog("메뉴선택\n1.입력 2.출력 3.종료");
		switch(menu) {
		case "1" :
			DataInput();
			break;
		case "2" :
			ScoreList();
			break;
		case "3" :
			dispose();
			break;
		default :
			JOptionPane.showMessageDialog(null, "올바른 메뉴를 선택해주세요.");
		}
		return menu;
	}
	
	public void DataInput() {
		InputData = JOptionPane.showInputDialog("데이터입력\n예)이름,자바점수,오라클점수");
		InfoVO ifv = new InfoVO();
		
		String[] temp = InputData.split(",");
		
		tempNum = 0;
		if(temp.length!=3) {
			JOptionPane.showMessageDialog(null, "잘못된 입력입니다.", "오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		tempNum = allList.size()+1;
		ifv.setNum(tempNum);
		ifv.setName(temp[0]);
		ifv.setJavaScore(Integer.parseInt(temp[1]));
		ifv.setOracleScore(Integer.parseInt(temp[2]));
		allList.add(ifv);
		
		FirstMenu();
	}
	
	public void ScoreList() {
		
		if(allList.size()!=0) {
			InfoVO ifv = new InfoVO();
			jta.append("번호\t");
			jta.append("이름\t");
			jta.append("자바점수\t");
			jta.append("오라클점수\t");
			jta.append("총점\t");
			jta.append("평균\n");
			
				for(int i=0; i<allList.size(); i++) {
					jta.append(String.valueOf(tempNum));
					jta.append("\t");
					jta.append(String.valueOf(allList.get(i).getName()));
					jta.append("\t");
					jta.append(String.valueOf(allList.get(i).getJavaScore()));
					jta.append("\t");
					jta.append(String.valueOf(allList.get(i).getOracleScore()));
					jta.append("\t");
					jta.append("총점");
					jta.append("\t");
					jta.append("평균");
					jta.append("\n");
				}
			
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
			
		} else {
			JOptionPane.showMessageDialog(null,"데이터가 없습니다");
		}
		
	}
	

	public static void main(String[] args) {
		ScoreHome sh = new ScoreHome();
		sh.FirstMenu();
	}


}
