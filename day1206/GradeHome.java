package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
1. 아래의 데이터를 처리하는 프로그램을 작성하세요.
  백인재,이봉현,이재찬,정택성,이재현,김정운 의 데이터가 존재하고,
 점수는 0~100점 사이로 발생할수있습니다.

 프로그램이 실행되면 위의 사람중에 2명이상 성적처리 대상자 이고 
 n명의 이름과 점수를 저장하여 출력하는 일을 하는 프로그램 작성.
 중복이름은 들어갈 수 없다.

출력 예 )
 이재찬 89
 정택성 77
 김정운 90
  총점   xx점
 */
public class GradeHome {

	public void Student() {
		//생성
		List<String> name = new ArrayList<String>(6);
		
		//값 추가
		name.add("백인재");
		name.add("이봉현");
		name.add("이재찬");
		name.add("정택성");
		name.add("이재현");
		name.add("김정운");
		
		System.out.println(name);
		String[] names = new String[name.size()];
		name.toArray(names);
		
		//랜덤 생성
//		Random r = new Random();
//		
//		//이름에 숫자를 부여. 랜덤.
//		int name = r.nextInt(stu.length);
//		
//		//이름에 부여된 숫자를 인덱스로 잡고 이름을 불러옴.
//		String names = String.valueOf(name);
//		System.out.println(names.charAt(names));
//		
//		int grade = r.nextInt(101);
//		System.out.println(grade);
		
		
		return;
	}
	
	public static void main(String[] args) {
		GradeHome gh = new GradeHome();
		gh.Student();
	}

}
