package day1129;
/*
 * 입력값
 * 1, 이재찬, 서울시 강남구 역삼동, 28,남자
2, 이재현, 서울시 동대문구 답십리동, 27,남자
3, 김정운, 수원시 영통구 영통동, 26,남자
4, 정택성, 서울시 구로구 구로동,27, 남자
5, 정택순, 서울시 동작구 상도동,29,여자
6, 김건하, 경기도 부천시 부천동,26,남자
7, 이재순, 서울시 광진구 광나루동,27,여자
 서울시 거주자 x명
 나이 합 x살
 최고령자 "정택순(여자)"
 
 1. 위의값을 배열에 입력하는 method를 작성할것.
2. 배열에 입력된 값을 출력하는 method 를 작성할것.
   2번 method 에서 서울시에 살고 있는 인원수를 출력 할것.
   2번 method 에서 나이의 합을 출력 할것.
   2번 method 에서 가장 나이가 많은 사람의 이름을 출력 할 것.
 */
public class Homework_1129 {
	public Homework_1129() {
		HwHuman[] humanArr = null;
		humanArr = new HwHuman[7];

		humanArr[0] = new HwHuman("이재찬", "서울시 강남구 역삼동", 28, "남자");
		humanArr[1] = new HwHuman("이재현", "서울시 동대문구 답십리동", 27, "남자");
		humanArr[2] = new HwHuman("김정운", "수원시 영통구 영통동", 26, "남자");
		humanArr[3] = new HwHuman("정택성", "서울시 구로구 구로동", 27, "남자");
		humanArr[4] = new HwHuman("정택순", "서울시 동작구 상도동", 29, "여자");
		humanArr[5] = new HwHuman("김건하", "경기도 부천시 부천동", 26, "남자");
		humanArr[6] = new HwHuman("이재순", "서울시 광진구 광나루동", 27, "여자");
		
		HwHuman temphuman = null;
		int seoulcount = 0; //서울 거주자 수
		int totalAge = 0; // 나이의 합
		int maxAge = 0; //최고령
		String topAge = "";
		String topAgeGender = "";
		for (int i = 0; i<humanArr.length; i++) {
			temphuman=humanArr[i];
			System.out.println(temphuman.getName()+" / " + temphuman.getAdd()+" / "+
					temphuman.getAge()+" / "+temphuman.getGender());
			
			totalAge += humanArr[i].getAge();
			
			if(maxAge<humanArr[i].getAge()) {
				maxAge=humanArr[i].getAge();
			}
			
			if(temphuman.getAdd().startsWith("서울")) {
				seoulcount++;
			}
			
			if(maxAge==humanArr[i].getAge()) {
				topAge=humanArr[i].getName();
				topAgeGender=humanArr[i].getGender();
			}
			
		}//end for
		

		System.out.println("서울시 거주자는 "+seoulcount+"명 입니다.");
		System.out.println("나이의 총 합은 "+totalAge+"입니다.");
		System.out.println("최고령자는 "+topAge+"("+topAgeGender+")"+"입니다.");

		
	}//end Homework_1129


	
	public static void main(String[] args) {
		new Homework_1129();
	}//main

}//class
