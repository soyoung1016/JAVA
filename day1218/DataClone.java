package day1218;

import java.util.Stack;

public class DataClone {

	private Stack<Data> historyStack;
	
	public DataClone() {
		historyStack = new Stack<Data>();
	}
	
	public void useData() throws CloneNotSupportedException {
		Data d = new Data("쌍용 유치원");
		
		if(d instanceof Cloneable) {
			
		d.setSchool("쌍용초등학교");
		Data d1=d.getData();
		historyStack.push(d1);
		
		d.setSchool("쌍용중학교");
		Data d2=d.getData();
		historyStack.push(d2);
		
		d.setSchool("쌍용고등학교");
		Data d3=d.getData();
		historyStack.push(d3);
		
		d.setSchool("쌍용대학교");
		historyStack.push(d.getData());
		
		} else {
			System.out.println("Cloneable만 처리합니다.");
		}
		
		getHistoryData();
	}
	
	public void getHistoryData() {
		Data temp = null;
		while(!historyStack.isEmpty()) {
			temp = historyStack.pop();
			System.out.println(temp); //다 다른 객체, 객체주소가 같게나오면 복제되지않은것
			System.out.println(temp.getSchool());
		}
	}
	
	public static void main(String[] args) {
		try {
			new DataClone().useData();
		} catch (CloneNotSupportedException e) {
			System.out.println("복제되지 않습니다.");
			e.printStackTrace();
		}
	}

}
