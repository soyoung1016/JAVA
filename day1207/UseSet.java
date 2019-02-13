package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


/**
 * Set : 검색의 기능이 없으며(get X), 중복값을 저장하지 않는 기능
 * @author owner
 */
public class UseSet {

	public UseSet() {
		//JDK1.5이하에서는 Generic이 지원되지 않고 객체만 저장
		//1. 생성
		Set<String> set = new HashSet<String>(); //is a 관계의 instance화
		
		//2. 값 할당 - 값이 순서대로 들어가지 않는다.
		set.add("정택성");
		set.add("이재현");
		set.add("공선의");
		set.add("김정윤");
		set.add("노진경");
		set.add("최지우");
		set.add("이봉현");
		set.add("김정윤");
		System.out.println(set.size()+" / "+set); //중복값을 지정하지 않는다. size로 확인해도 안나옴
		set.remove("김정윤"); //가변길이형
		System.out.println(set.size()+" / "+set);
		
		//배열로 복사
		String[] names=new String[set.size()];
		set.toArray(names);
		
		//set의 모든 방(Element)의 값 출력
//		System.out.println(set.get("김정운")); //ERROR, set자체는 검색의 기능이 없다.
		//Iterator를 사용하여 값을 얻기
		Iterator<String> ita = set.iterator();
		
		String name = "";
		while(ita.hasNext()) { //set의 Iterator가 참조하는 set의 요소가 존재한다면 
			name=ita.next(); //해당요소의 값을 얻고 다음 포인터로 이동
			System.out.println(name); //조회될때는 값을 할당한 순서가 아니라 배열에 들어간 그대로 나옴.
		}
		
		System.out.println("--------------향상된 for------------------");
		for(String temp : set) {
			System.out.println(temp);
		}
		
		//모든 방의 값 삭제
		set.clear();
		System.out.println("clear 후 : "+set.size()+", "+set);
		System.out.println("----------------배열에 복사한 값-----------------");
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}

	}
	////////////////////////숙제관련 난수구하기(lotto)/////////////////////
	public int[] lotto() {
		int[] tempLotto = new int[6];
		//random쪽이 정수뽑기가 더 편하다.
		Random random = new Random();
		
		for(int i=0; i<tempLotto.length; i++) {
			tempLotto[i] = random.nextInt(45)+1; //범위 1~45, 중복 발생
			//전에 뽑은 방의 값이랑 지금 방의 값이 같은지 물어봐야한다. for문!
			for(int j=0; j<i;j++) {
				if(tempLotto[i]==tempLotto[j]) { //방의 값이 같다면
					i--; //중복발생된 번호의 인덱스번째를 다시 발생시키기 위해 인덱스 번호를 하나 줄인다.
					break; //하나 줄여주고 반복문을 건너뛴다.
				}
			}
		}
		
		return tempLotto;
	}
	
	/////////////////////로또 두번째버전///////////////////////
	public Integer[] lotto1() {
		Integer[] tempLotto = new Integer[6];
		
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			set.add(random.nextInt(45)+1); //set이라서! 같은 수가 추가되지 않는다. 그래서 중복 발생 X
			if(set.size()==6) {
				break;
			}
		}
		
		set.toArray(tempLotto);
		
		return tempLotto;
	}
	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		int[] temp = us.lotto();
		Integer[] temp1 = us.lotto1();
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println("\n----------------------------------");

		for(int i=0; i<temp1.length; i++) {
			System.out.print(temp1[i]+" ");
		}
	}

}
