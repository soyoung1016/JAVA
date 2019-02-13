package day1206;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List : <br>
 * 중복값을 허용하며 검색의 기능이 있고, 순서대로 값을 입력하는 가변길이형
 * @author owner
 */
public class UseList {
	
	public UseList() {
		//JDK1.4에서는 Generic이 제공되지 않고 객체만 제공된다.
//		//컴파일러 바꿔서 실행했다.
//		List list = new ArrayList();
//		//값 추가 : JDK 1.5이하에서는 객체로만 값을 넣을 수 있다.
//		list.add(new Integer(10));
//		list.add(new Short((short)10));
//		list.add("공선의");
//		
//		System.out.println(list.size());
//		System.out.println( ((Integer)list.get(0)).intValue()+10);
		
		//JDK1.5+ 에서 사용 : Generic, autoboxing, unboxing
		//Generic을 권장한다.
		List<Integer> list = new ArrayList<Integer>(); //JCF의 데이터형을 하나로 일치시킨다.
		//autoboxing => list.add(new Integer(10));
		list.add(10);
		list.add(20);
		list.add(new Integer(30));
//		list.add("김건하"); //Generic으로 설정된 형이 아닌 데이터형을 추가할 수 없다.
		
		System.out.println("크기 "+list.size());
		System.out.println(list.get(0)+10);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+1);
		}
	}
	
	/**
	 * ArrayList 사용 : Multi Thread 환경에서 동시 접근 가능(동기화 X)
	 */
	public void useArrayList() {
		//1. 생성
		ArrayList<String> al = new ArrayList<String>(); //String만 가능, //방이 0개
		List<String> al1 = new ArrayList<String>(100); //방이 100개
		
		System.out.println(al+" / "+al1);//객체를 찍었는데 주소가 안나오는 이유? Overriding했기 때문. toString을!
		
		//값 추가 : 순서대로 추가된다.
		al.add("이재현");
		al.add("정택성");
		al.add("김정윤");
		al.add("김건하");
		al.add("김정윤"); //중복값을 저장할 수 있다.
		al.add("노진경");
		al.add("김정윤"); //중복값을 저장할 수 있다.
		al.add("공선의");
		System.out.println(al+" / "+al1);
		//size() : 데이터의 크기, capa와 관계가 없다. 위에 방이 몇개몇개..
		System.out.println("al 크기 : "+al.size()+" / al1의 크기 : "+al1.size());
		
		//배열에 복사, toString
		String[] names = new String[al.size()];
		al.toArray(names);
		
		//방의 값 삭제 : 인덱스로 삭제
		//특정 인덱스방의 값이 삭제
		al.remove(4);
		System.out.println(al.size()+" / "+ al);
		
		//방의 내용으로 삭제
		al.remove("김정윤");
		//1. 가장 첫방이 삭제, 2. 가장 끝방의 값이 삭제, 3. 모두 삭제
		//정답은 1번!!
		System.out.println(al.size()+" / "+ al);
		
		//개선된 for
		for(String name : al) {
			System.out.println(name);
		}
		
		//모든 방의 값 삭제 :
		al.clear();
		System.out.println("전체 삭제 후 : "+al.size()+" / "+al);
		
		//배열의 값
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		System.out.println();
		
		
		
	}
	
	public void useVector() {//위에 ArrayList랑 똑같다.
		//1. 생성
				Vector<String> vec = new Vector<String>(); //String만 가능, //방이 0개
				List<String> vec1 = new Vector<String>(100); //방이 100개
				
				System.out.println(vec+" / "+vec1);//객체를 찍었는데 주소가 안나오는 이유? Overriding했기 때문. toString을!
				
				//값 추가 : 순서대로 추가된다.
				vec.add("이재현");
				vec.add("정택성");
				vec.add("김정윤");
				vec.add("김건하");
				vec.add("김정윤"); //중복값을 저장할 수 있다.
				vec.add("노진경");
				vec.add("김정윤"); //중복값을 저장할 수 있다.
				vec.add("공선의");
				System.out.println(vec+" / "+vec1);
				//size() : 데이터의 크기, capa와 관계가 없다. 위에 방이 몇개몇개..
				System.out.println("vec 크기 : "+vec.size()+" / vec1의 크기 : "+vec1.size());
				
				//배열에 복사, toString
				String[] names = new String[vec.size()];
				vec.toArray(names);
				
				//방의 값 삭제 : 인덱스로 삭제
				//특정 인덱스방의 값이 삭제
				vec.remove(4);
				System.out.println(vec.size()+" / "+ vec);
				
				//방의 내용으로 삭제
				vec.remove("김정윤");
				//1. 가장 첫방이 삭제, 2. 가장 끝방의 값이 삭제, 3. 모두 삭제
				//정답은 1번!!
				System.out.println(vec.size()+" / "+ vec);
				
				//개선된 for
				for(String name : vec) {
					System.out.println(name);
				}
				
				//모든 방의 값 삭제 :
				vec.clear();
				System.out.println("전체 삭제 후 : "+vec.size()+" / "+vec);
				
				//배열의 값
				for(int i=0; i<names.length; i++) {
					System.out.printf("%s\t",names[i]);
				}
				System.out.println();
		
	}
	
	public void useLinkedList() {
		//1. 생성
		LinkedList<String> ll = new LinkedList<String>(); //String만 가능, //방이 0개
		List<String> ll1 = new LinkedList<String>();
		
		System.out.println(ll+" / "+ll1);//객체를 찍었는데 주소가 안나오는 이유? Overriding했기 때문. toString을!
		
		//값 추가 : 순서대로 추가된다.
		ll.add("이재현");
		ll.add("정택성");
		ll.add("김정윤");
		ll.add("김건하");
		ll.add("김정윤"); //중복값을 저장할 수 있다.
		ll.add("노진경");
		ll.add("김정윤"); //중복값을 저장할 수 있다.
		ll.add("공선의");
		System.out.println(ll+" / "+ll1);
		//size() : 데이터의 크기
		System.out.println("ll 크기 : "+ll.size()+" / ll1의 크기 : "+ll1.size());
		
		//배열에 복사, toString
		String[] names = new String[ll.size()];
		ll.toArray(names);
		
		//방의 값 삭제 : 인덱스로 삭제
		//특정 인덱스방의 값이 삭제
		ll.remove(4);
		System.out.println(ll.size()+" / "+ ll);
		
		//방의 내용으로 삭제
		ll.remove("김정윤");
		//1. 가장 첫방이 삭제, 2. 가장 끝방의 값이 삭제, 3. 모두 삭제
		//정답은 1번!!
		System.out.println(ll.size()+" / "+ ll);
		
		//개선된 for
		for(String name : ll) {
			System.out.println(name);
		}
		
		//모든 방의 값 삭제 :
		ll.clear();
		System.out.println("전체 삭제 후 : "+ll.size()+" / "+ll);
		
		//배열의 값
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s\t",names[i]);
		}
		System.out.println();
		
		
		
	}
	
	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("----------------ArrayList");
		ul.useArrayList();
		System.out.println("----------------Vector");
		ul.useVector();
		System.out.println("----------------LinkedList");
		ul.useLinkedList();
		
	}

}
