package day1114;
/*
Constant(������ ���ó�� ����ϴ� �� : ���)�� ���
���� : class field������ �Ѵ�.
*/

class Constant {
	//Constant ����
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		
		//public static final int MIN_SCORE = 0; //����� �ʵ忡���� ����~! �ȱ׷��� error

		//����� ��� : �����
		System.out.println(MAX_SCORE+" / "+MIN_SCORE);		
		System.out.println(Constant.MAX_SCORE+" / "+Constant.MIN_SCORE);

		int my_score = 95;
		my_score = 93;
		//MAX_SCORE=90; //����� ���Ҵ��� ���� �ʴ´�.
		my_score = 83;
		System.out.println("������ �ְ����� " + Constant.MAX_SCORE+"���̰�, �������� "+MIN_SCORE+
							"�Դϴ�. ȹ�������� "+my_score+"�̰�, �ְ����� ȹ�������� ���̴� "+(MAX_SCORE - my_score));


		System.out.println("long �ִ밪 : "+ Long.MAX_VALUE+" / �ּҰ� : "+Long.MIN_VALUE);
		//�̷��� �ϸ� �˾Ƽ� �˻����ش�.
	}
}
