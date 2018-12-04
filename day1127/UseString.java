package day1127;

/**
 * 문자열 저장소의 주소를 저장하고, 문자열을 다루는 기능을 제공하는 String class의 사용<br>
 * java에서 제공하는 클래스의 이름과 내가 만든 클래스의 이름이 같다면 내가 만든 클래스를 먼저 사용하게 된다.<br>
 * 그래서 java에서 제공하는 클래스를 사용할 때마다 <br>
 * "full path : 패키지명을 모두 기술하여 클래스를 사용하는 것" 로 사용해야 한다.
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) {
		System.out.println("안녕");
		//기본형 형식 사용
		//java.lang.String s="문자열"; //위의 doc주석 참고
		String str="AbcdEfg";
		//참조형 형식 사용
		//java.lang.String s1=new java.lang.String("문자열"); //위의 doc주석 참고
		String mail=new String("aaa@bbb.com");
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"의 길이 "+str.length());
		System.out.println(mail+"의 길이 "+mail.length());
		
		System.out.println(str+"을 모두 대문자 "+str.toUpperCase());
		System.out.println(str+"을 모두 소문자 "+str.toLowerCase());
		//"AbcdEfg"
		// 0123456	//index
		//indexOf는 왼쪽에서 오른쪽으로 진행하면 가장 처음 찾아지는 문자열의 인덱스를 얻는다.
		System.out.println(str+"에서 'd'의 인덱스 : "+str.indexOf("d"));
		System.out.println(str+"에서 'd'의 인덱스 : "+str.indexOf("dEf"));//가장 처음 문자열로~!
		System.out.println(str+"에서 'z'의 인덱스 : "+str.indexOf("z"));	//없으면 -1이 나온다.
		
		System.out.println(mail+"에서 \"@\"의 인덱스 : "+mail.indexOf("@"));
		
		str="AbcdEfAg";
		//lastindexOf는 오른쪽에서 왼쪽으로 진행하면서 가장 처음 찾아지는 문자열의 인덱스를 얻는다. 문자열 자체는 왼쪽에서부터 보는듯..
		System.out.println(str+"문자열에서 뒤로부터 'A'의 인덱스 : "+str.lastIndexOf("A"));//가장 처음 문자열로~!
		
		//특정 인덱스의 문자얻기
		char temp=str.charAt(2); //c
		System.out.println(str+"에서 2번째 인덱스에 해당하는 문자 "+temp);
		
		//자식문자열 자르기
		//str="AbcdEfAg";
		//	   01234567
		System.out.println(str+"에서 인덱스가 2~5번째 해당하는 문자열 "+str.substring(2,6));
		
		//aaa@bbb.com
		//012345678910 String index
		System.out.println(str+"에서 메일 주소만 얻기 "+mail.substring(0,mail.indexOf("@")));
		System.out.println(str+"에서 도메인 주소만 얻기 "+mail.substring((mail.indexOf("@")+1),mail.length()));
		System.out.println(mail+"에서 도메인 주소만 얻기 "+mail.substring(mail.indexOf("@")+1));//substring은 시작 인덱스만 넣으면 끝까지 잘라낸다.
		
		System.out.println(str+"에서 메일 주소만 얻기 "+mail.substring(0,3)+mail.substring(4,11));//모든 사람의 이메일은 다 같은 형식이 아니다.
		
		
		//앞뒤 공백 자르기
		str="   A BC  ";
		System.out.println("["+str+"]에서 앞뒤공백 제거 ["+str.trim()+"]");//사이 공백은 제거 X
		
		//문자열 붙이기
		str="Abcd";
		String str1=str.concat("Efg");
		String str2=str+"Efg";
		System.out.println(str1);
		System.out.println(str2);
		
		//문자열이 완벽하게 같은지 비교
		str="박소영";
		System.out.println(str+"은(는) "+(str.equals("이재찬")?"반장":"평민"));
		
		//문자열이 이 문자열로 시작하는지
		str="씨방새";
		if(str.startsWith("씨방")) {
			System.out.println("욕은 사용하실수 없습니다.");
		} else {
			System.out.println(str);
		}
		
		str="서울시 강남구";
		str1="수원시 팔달구";
		System.out.println(str+"은(는) "+(str.startsWith("서울")?"서울시입니다.":"서울이 아닙니다."));
		System.out.println(str1+"은(는) "+(str1.startsWith("서울")?"서울시입니다.":"서울이 아닙니다."));
		
		
		//문자열이 특정문자열로 끝났는지
		str="서울시 강남구 역삼동";
		str1="경기도 김포시 김포리";
		System.out.println(str+"은(는)"+(str.endsWith("동")?"도시":"시골"));
		System.out.println(str1+"은(는)"+(str1.endsWith("동")?"도시":"시골"));
		
		//치환 : 문자열 내의 모든 문자열 찾아서 치환
		str="나 지금 피씨방인데 넌 어디니 씨 방새야!";	
		System.out.println(str.replaceAll("씨방", "**")); //씨방 사이에 띄어쓰기 쓰면 걸러내지 못함
		System.out.println(str.replaceAll("씨", "*").replaceAll("방", "*")); //그럴땐 이렇게
		//이것을 method를 연결해서 호출 하는 것 : method chain
		
		str="  A BC  ";
		System.out.println(str.replaceAll(" ", "")); //띄어쓰기 줄이기도 가능
		
		int i = 27;
		//str=i; //int는 String으로 할당 될 수 없다.
		
		//기본형 데이터형을 문자열로 변환
		str=String.valueOf(i);
		System.out.println(str);
		double d=11.27;
		str=d+"";
		System.out.println(str);
		
		
		str="";
		System.out.println(str.isEmpty());
		
		//객체 생성을 하지 않았을 때 그 클래스가 제공하는 method를 사용할 수 없다. ERROR
		//객체는 클래스로부터 나오지만 클래스와 객체는 같은 것이 아니다.
		//클래스는 설계도, 객체는 구현된 구현체
		
//		str=null;
//		System.out.println(str.isEmpty());
		//안됨. null인데 true나 false같은 글자가 들어갈 수 없다.
		
		/////////////////////////2018-11-28 split 사용 코드 추가///////////////////////////
		String data = "이재찬, 이재현, 정택성~공선의~김건하.최지우, 노진경, 김정운.김정윤";
		String[] arr = data.split("[.]"); //.은 구분되지 않는다. 그냥 쓰면 구분되지 않고 대괄호로 [] 묶어서 쓰면 된다.
		//split은 한번에 하나의 문자로 구분하여 자른다.
		
		System.out.println("구분된 배열 방의 갯수 : "+ arr.length);

		for(String name : arr) {
			System.out.println(name);
		}

	}//main

}//class
