package day1127;

/**
 * ���ڿ� ������� �ּҸ� �����ϰ�, ���ڿ��� �ٷ�� ����� �����ϴ� String class�� ���<br>
 * java���� �����ϴ� Ŭ������ �̸��� ���� ���� Ŭ������ �̸��� ���ٸ� ���� ���� Ŭ������ ���� ����ϰ� �ȴ�.<br>
 * �׷��� java���� �����ϴ� Ŭ������ ����� ������ <br>
 * "full path : ��Ű������ ��� ����Ͽ� Ŭ������ ����ϴ� ��" �� ����ؾ� �Ѵ�.
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) {
		System.out.println("�ȳ�");
		//�⺻�� ���� ���
		//java.lang.String s="���ڿ�"; //���� doc�ּ� ����
		String str="AbcdEfg";
		//������ ���� ���
		//java.lang.String s1=new java.lang.String("���ڿ�"); //���� doc�ּ� ����
		String mail=new String("aaa@bbb.com");
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"�� ���� "+str.length());
		System.out.println(mail+"�� ���� "+mail.length());
		
		System.out.println(str+"�� ��� �빮�� "+str.toUpperCase());
		System.out.println(str+"�� ��� �ҹ��� "+str.toLowerCase());
		//"AbcdEfg"
		// 0123456	//index
		//indexOf�� ���ʿ��� ���������� �����ϸ� ���� ó�� ã������ ���ڿ��� �ε����� ��´�.
		System.out.println(str+"���� 'd'�� �ε��� : "+str.indexOf("d"));
		System.out.println(str+"���� 'd'�� �ε��� : "+str.indexOf("dEf"));//���� ó�� ���ڿ���~!
		System.out.println(str+"���� 'z'�� �ε��� : "+str.indexOf("z"));	//������ -1�� ���´�.
		
		System.out.println(mail+"���� \"@\"�� �ε��� : "+mail.indexOf("@"));
		
		str="AbcdEfAg";
		//lastindexOf�� �����ʿ��� �������� �����ϸ鼭 ���� ó�� ã������ ���ڿ��� �ε����� ��´�. ���ڿ� ��ü�� ���ʿ������� ���µ�..
		System.out.println(str+"���ڿ����� �ڷκ��� 'A'�� �ε��� : "+str.lastIndexOf("A"));//���� ó�� ���ڿ���~!
		
		//Ư�� �ε����� ���ھ��
		char temp=str.charAt(2); //c
		System.out.println(str+"���� 2��° �ε����� �ش��ϴ� ���� "+temp);
		
		//�ڽĹ��ڿ� �ڸ���
		//str="AbcdEfAg";
		//	   01234567
		System.out.println(str+"���� �ε����� 2~5��° �ش��ϴ� ���ڿ� "+str.substring(2,6));
		
		//aaa@bbb.com
		//012345678910 String index
		System.out.println(str+"���� ���� �ּҸ� ��� "+mail.substring(0,mail.indexOf("@")));
		System.out.println(str+"���� ������ �ּҸ� ��� "+mail.substring((mail.indexOf("@")+1),mail.length()));
		System.out.println(mail+"���� ������ �ּҸ� ��� "+mail.substring(mail.indexOf("@")+1));//substring�� ���� �ε����� ������ ������ �߶󳽴�.
		
		System.out.println(str+"���� ���� �ּҸ� ��� "+mail.substring(0,3)+mail.substring(4,11));//��� ����� �̸����� �� ���� ������ �ƴϴ�.
		
		
		//�յ� ���� �ڸ���
		str="   A BC  ";
		System.out.println("["+str+"]���� �յڰ��� ���� ["+str.trim()+"]");//���� ������ ���� X
		
		//���ڿ� ���̱�
		str="Abcd";
		String str1=str.concat("Efg");
		String str2=str+"Efg";
		System.out.println(str1);
		System.out.println(str2);
		
		//���ڿ��� �Ϻ��ϰ� ������ ��
		str="�ڼҿ�";
		System.out.println(str+"��(��) "+(str.equals("������")?"����":"���"));
		
		//���ڿ��� �� ���ڿ��� �����ϴ���
		str="�����";
		if(str.startsWith("����")) {
			System.out.println("���� ����ϽǼ� �����ϴ�.");
		} else {
			System.out.println(str);
		}
		
		str="����� ������";
		str1="������ �ȴޱ�";
		System.out.println(str+"��(��) "+(str.startsWith("����")?"������Դϴ�.":"������ �ƴմϴ�."));
		System.out.println(str1+"��(��) "+(str1.startsWith("����")?"������Դϴ�.":"������ �ƴմϴ�."));
		
		
		//���ڿ��� Ư�����ڿ��� ��������
		str="����� ������ ���ﵿ";
		str1="��⵵ ������ ������";
		System.out.println(str+"��(��)"+(str.endsWith("��")?"����":"�ð�"));
		System.out.println(str1+"��(��)"+(str1.endsWith("��")?"����":"�ð�"));
		
		//ġȯ : ���ڿ� ���� ��� ���ڿ� ã�Ƽ� ġȯ
		str="�� ���� �Ǿ����ε� �� ���� �� �����!";	
		System.out.println(str.replaceAll("����", "**")); //���� ���̿� ���� ���� �ɷ����� ����
		System.out.println(str.replaceAll("��", "*").replaceAll("��", "*")); //�׷��� �̷���
		//�̰��� method�� �����ؼ� ȣ�� �ϴ� �� : method chain
		
		str="  A BC  ";
		System.out.println(str.replaceAll(" ", "")); //���� ���̱⵵ ����
		
		int i = 27;
		//str=i; //int�� String���� �Ҵ� �� �� ����.
		
		//�⺻�� ���������� ���ڿ��� ��ȯ
		str=String.valueOf(i);
		System.out.println(str);
		double d=11.27;
		str=d+"";
		System.out.println(str);
		
		
		str="";
		System.out.println(str.isEmpty());
		
		//��ü ������ ���� �ʾ��� �� �� Ŭ������ �����ϴ� method�� ����� �� ����. ERROR
		//��ü�� Ŭ�����κ��� �������� Ŭ������ ��ü�� ���� ���� �ƴϴ�.
		//Ŭ������ ���赵, ��ü�� ������ ����ü
		
//		str=null;
//		System.out.println(str.isEmpty());
		//�ȵ�. null�ε� true�� false���� ���ڰ� �� �� ����.
		
		/////////////////////////2018-11-28 split ��� �ڵ� �߰�///////////////////////////
		String data = "������, ������, ���ü�~������~�����.������, ������, ������.������";
		String[] arr = data.split("[.]"); //.�� ���е��� �ʴ´�. �׳� ���� ���е��� �ʰ� ���ȣ�� [] ��� ���� �ȴ�.
		//split�� �ѹ��� �ϳ��� ���ڷ� �����Ͽ� �ڸ���.
		
		System.out.println("���е� �迭 ���� ���� : "+ arr.length);

		for(String name : arr) {
			System.out.println(name);
		}

	}//main

}//class
