package day1218;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import static java.lang.Integer.parseInt; //�Ź� integer������ϴ� ���ŷο��� �����ش�.

public class ScoreProcess {
	
	private List<ScoreVO> listStu;
	private int totalScore;
	
	private static final int INPUT_DATA=1;
	private static final int VIEW_DATA=2;
	private static final int EXIT=3;
	
	public ScoreProcess() {
		listStu = new ArrayList<ScoreVO>();
	}
	
	/**
	 * ���ø޴��� ����
	 */
	public void InputMenu() {
		
		/* ù��° ���
		String selectMenu = "";
		
		do {
			selectMenu = JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.����");
			if(selectMenu.equals("3")) {
				break;
			}
			
		} while(true);	
		*/
		
		/*�ι�° ���
		String selectMenu = "";
		boolean exitFlag=false;
		do {
			selectMenu = JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.����");
			if(selectMenu.equals("3")) {
				exitFlag=true;
			}
		} while(!exitFlag);
		*/
		
		/*����° ���*/
		String selectMenu = "", inputResult="";
		boolean exitFlag=false;
		do {
			selectMenu = JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.����");
			try {
				switch(parseInt(selectMenu)) {
				case INPUT_DATA :
					inputResult="�������� ������ ���� �ʰų� ������ ���� �����̾�� �մϴ�.";
					if(inputData()) {
						inputResult="�߰�����";
					}
					JOptionPane.showMessageDialog(null, inputResult);
					break;
				case VIEW_DATA :
					printData();
					break;
				case EXIT :
					exitFlag=true;
					break;
				
				default :
					JOptionPane.showMessageDialog(null, "�޴��� 1,2,3�� �ϳ� �̾���մϴ�.");
				}//switch
			} catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "�޴��� �����̾�� �մϴ�.");
			}
			
			
		} while(!exitFlag);
		
		
	}
	
	/**
	 * ����ó���� �����͸� �Է¹ޱ�
	 * @return
	 */
	public boolean inputData() {
		boolean flag = false;
		
		String inputData = JOptionPane.showInputDialog("�������Է�\n��) �̸�,�ڹ�����,����Ŭ����");
		try {
			String[] data = inputData.replaceAll(" ", " ").split(","); //Ȥ�ó� ���� �Է��� ���� replace�� ������ �����ش�.
			if(data.length == 3) { //�Է� ���Ŀ� ���� ��
				//�ڹ������� ����Ŭ ������ �����̾�� �Ѵ�.
				try {
					ScoreVO sv = new ScoreVO(data[0], parseInt(data[1]),parseInt(data[2]));
					listStu.add(sv); //������ �����͸� list�� �߰�
					flag=true;//�������� ����
					//�ڹ������� ����Ŭ ������ �����̾�� �Ѵ�.
				} catch(NumberFormatException nfe) {
					flag=false;
				}//end catch
				
			}//end if
		} catch(NullPointerException npe) {
		}
		return flag;
	}
	
	/**
	 * �Է������� ����ϴ� �� 
	 */
	public void printData() {
		if(listStu.size()==0) {
			JOptionPane.showMessageDialog(null, "����� �����Ͱ� �����ϴ�.");
			return;
		}
		
		StringBuilder viewData = new StringBuilder();
		viewData.append("--------------------------------------------------------------")
		.append("---------------------------------------------------------------------\n")
		.append("��ȣ\t�̸�\t�ڹ�����\t����Ŭ����\t����\t���\n")
		.append("--------------------------------------------------------------")
		.append("---------------------------------------------------------------------\n");
		
		
		int tempTotal=0;
		ScoreVO sv = null;
		
		for(int i=0; i<listStu.size(); i++) {
			sv=listStu.get(i);
			tempTotal=sv.getJavaScore()+sv.getOracleScore();
			viewData.append(i+1)
			.append("\t").append(sv.getName())
			.append("\t").append(sv.getJavaScore())
			.append("\t").append(sv.getOracleScore())
			.append("\t").append(tempTotal)
			.append("\t").append(tempTotal/2.0).append("\n");
			
			//�� �л��� �ڹ������� ����Ŭ ������ ���� ���� ������
			totalScore+=tempTotal;
			
			//�� �л��� ���� ������ �ʱ�ȭ
			tempTotal=0;
		}
		viewData.append("--------------------------------------------------------------")
		.append("---------------------------------------------------------------------\n")
		.append("\t\t\t\t����").append(totalScore).append("\t���")
		.append(String.format("%.2f", totalScore/(double)(listStu.size()*2)));
		
		JTextArea jta = new JTextArea(15,50);
		jta.append(viewData.toString()); //ȭ���� ������ �����͸� JTA�� �ٿ��ش�.
		JScrollPane jsp = new JScrollPane(jta);
		JOptionPane.showMessageDialog(null, jsp);
	}

	public static void main(String[] args) {
		ScoreProcess sp = new ScoreProcess();
		sp.InputMenu();
	}

}
