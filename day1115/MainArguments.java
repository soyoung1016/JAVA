package day1115;
/*
	Java ���α׷� �ܺο��� Java ���α׷� ���η� ���� ������ ��
	main method�� Arguments�� ����Ѵ�.

	env.bat���� �� path?�� ������.

	������)
		java Ŭ�������ϸ�(bytecode��) �� �� ��
*/

class MainArguments {
	public static void main(String[] args) {

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		//System.out.println(args[0]*args[1]); //���ڿ����� ������ �ȵǹǷ� ERROR

		//���ڿ��� ������ ��ȯ
		//Integer.parseInt(���ڿ�)�� �̿��Ͽ� ��ȯ�Ѵ�
		//���ڿ��� �����Ͽ� int������ ��ȯ�� �� �� ���� ��ȯ�ϴ� ��
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		System.out.println(i+j); //��ȯ �Ŀ� ���� ����
		System.out.println(args[2]+"�� �ȳ��ϼ���");


	}//main
}//class
