package day1115;
/*
	���׿�����(Unary)
	~, !, +, -, ++, --
*/

class Operator1 {
	public static void main(String[] args) {
		
		//---------------- ~(tilde) : 1�� �������� ����---------------------
		//~��� : ��ȣ���� 1����
		int i = 11;
		int j = -11;
		System.out.println("~"+i+" = "+ ~i); // 11 => -12, +�� ƿ�� ���̿� ���� �� �ؾ��Ѵ�.	
		System.out.println("~"+j+" = "+ ~j); // -11 => 10
		//---------------------tilde ��---------------------


		//---------------------!(NOT) : true->false, false->true ���� ---------------------
		boolean b = true;
		boolean c = false;
		System.out.println("!"+b+" = "+ !b); //false
		System.out.println("!"+c+" = "+ !c); //true
		//System.out.println(!11>15); //ERROR
		System.out.println(!(11>15)); //�̷��� ����ؾ� �Ѵ�.
		//! ��, �׸��� !�� boolean���� ����� �����ϴ�.


		// + : ����������	����
		System.out.println("+"+i+" = "+ +i); //11
		System.out.println("+"+j+" = "+ +j); //-11
		// + ��


		// - : 2�Ǻ�������, ��ȣ�ٲ޿���	����
		System.out.println("-"+i+" = "+ -i); // -11
		System.out.println("-"+j+" = "+ -j); // 11
		// - ��


		//++ : ��������(���ü�� ���� 1�� ����)		����
		i=0;
		j=10;
		//�������� : ������ ���ü;
		++i; //0 -> 1
		--j; //10 ->9
		System.out.println("�������� �� : i ="+i+", j = "+j);
		//�������� : ����� ������;
		i++; // 1 -> 2
		j--; // 9 -> 8
		System.out.println("�������� �� : i ="+i+", j = "+j);

		//���������ڿ� ���ҿ����ڴ� ���Կ����ڿ� �Բ� ���Ǹ� ������ ������ �ٸ� ���� �����Ѵ�.
		j=0; i=5;
		//���� : ���� ����
		j = ++i;	
		System.out.println("�������� �� : i ="+i+", ���� j = "+j);
		//���� : ���� �� ����
		j=0; i=5;
		j = i++;
		System.out.println("�������� �� : i ="+i+", ���� j = "+j);



	}// main
}//class
