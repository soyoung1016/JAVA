package day1127;

public class UseString1 {
	//이메일을 입력받아 이메일의 유효성을 검증하여 boolean형으로 결과를 만들어 반환하는 일을 하는
	//method를 만들어 호출하여 사용해보세요
	private boolean validEmail(String email) {
	//불린형으로 만드므로
		boolean flag=false;
		//1번
		if((email.indexOf(".")!=-1)&&(email.indexOf("@")!=-1)&&(email.length()>=5)) {
			flag=true;
		}
		return flag; 
		//2번
//		flag= email.indexOf(".")!=-1&&email.indexOf("@")!=-1&&email.length()>=5;
//		flag는 true가 됨.
//		return flag;
		//3번
//		flag= email.contains(".")&&email.contains("@")&&email.length()>=5;
//		return flag;		
	}
	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		String email="ruro@daum.net";
		if(us1.validEmail(email)) {
			System.out.println(email + " 유효");
		} else {
			System.out.println(email + " 무효");
		}
		
		
		
	}//main

}//class
