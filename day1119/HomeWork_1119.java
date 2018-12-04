package day1119;

/**
 *
 *1. 출퇴근 시간을 입력받아 아래의 조건으로 출력하세요.
 *출력 :  출퇴근 시간은 최대 2시간의 제한이 있으며 60분을 넘는 다면 "장거리"
 	 60분 이하라면 "단거리"를 출력하세요.

2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요.
   교통수단은 "버스,지하철,택시,도보"로 제한한다.
   버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다.
   요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다.

 출력   :  xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다.
            편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준
            교통비는 총: xxxx원 입니다.  
 * @author owner
 */
public class HomeWork_1119 {
	
	public static final int BUS_PRICE=1200;
	public static final int SUB_PRICE=1250;
	public static final int TAXI_PRICE=3800;
	
	
	public static void main(String[] args) {
		
		//1번 시작
		int commute = Integer.parseInt(args[0]);
		
		if (0<commute&commute<=60) {
			System.out.println("단거리 입니다.");
		} else if (60<commute&commute<=120) {
			System.out.println("장거리 입니다.");
		} else {
			System.out.println("최대 시간을 초과하였습니다.");
		}//end else
		//1번 끝
		
		
		//2번 시작
		/*
		 * 2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요.
		 
		   교통수단은 "버스,지하철,택시,도보"로 제한한다.
		   버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다.
		   요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다.

		 출력   :  xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다.
		            편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준
		            교통비는 총: xxxx원 입니다.
		 */
				
		int distance = Integer.parseInt(args[3]);
		int price = (int)(distance-10)/5;
		
		System.out.print(args[1]+"님 출퇴근 교통 수단은 ");
		
		if (args[2].equals("버스")) {
			if(distance<=10) {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+BUS_PRICE+"원 이고, 왕복 이용요금 "+BUS_PRICE*2+"원이며, 한달 20일 기준 교통비는 총 : "+BUS_PRICE*2*20+"원 입니다.");
			} else {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+(BUS_PRICE+(price*100))+"원 이고, 왕복 이용요금 "+((BUS_PRICE+(price*100))*2)+
									"원이며, 한달 20일 기준 교통비는 총 : "+((BUS_PRICE+(price*100))*2*20)+"원 입니다.");
			}
		}
		
		else if (args[2].equals("지하철")) {
			if(distance<=10) {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+SUB_PRICE+"원 이고, 왕복 이용요금 "+SUB_PRICE*2+"원이며, 한달 20일 기준 교통비는 총 : "+SUB_PRICE*2*20+"원 입니다.");
			} else {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+(SUB_PRICE+(price*100))+"원 이고, 왕복 이용요금 "+((SUB_PRICE+(price*100))*2)+
									"원이며, 한달 20일 기준 교통비는 총 : "+((SUB_PRICE+(price*100))*2*20)+"원 입니다.");
			}
		}
		
		else if (args[2].equals("택시")) {
			if(distance<=10) {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+TAXI_PRICE+"원 이고, 왕복 이용요금 "+TAXI_PRICE*2+"원이며, 한달 20일 기준 교통비는 총 : "+TAXI_PRICE*2*20+"원 입니다.");
			} else {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
				System.out.println("편도 이용 요금은 "+(TAXI_PRICE+(price*100))+"원 이고, 왕복 이용요금 "+((TAXI_PRICE+(price*100))*2)+
									"원이며, 한달 20일 기준 교통비는 총 : "+((TAXI_PRICE+(price*100))*2*20)+"원 입니다.");
			}
		}
		
		else if (args[2].equals("도보")) {
				System.out.println(args[2]+"이며 거리는 "+args[3]+"키로 입니다.");
		}
		
		else {
			System.out.println("잘못된 교통수단 입니다.");
		}
		            
	}//main

}//class
