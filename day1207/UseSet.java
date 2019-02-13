package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


/**
 * Set : �˻��� ����� ������(get X), �ߺ����� �������� �ʴ� ���
 * @author owner
 */
public class UseSet {

	public UseSet() {
		//JDK1.5���Ͽ����� Generic�� �������� �ʰ� ��ü�� ����
		//1. ����
		Set<String> set = new HashSet<String>(); //is a ������ instanceȭ
		
		//2. �� �Ҵ� - ���� ������� ���� �ʴ´�.
		set.add("���ü�");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("�̺���");
		set.add("������");
		System.out.println(set.size()+" / "+set); //�ߺ����� �������� �ʴ´�. size�� Ȯ���ص� �ȳ���
		set.remove("������"); //����������
		System.out.println(set.size()+" / "+set);
		
		//�迭�� ����
		String[] names=new String[set.size()];
		set.toArray(names);
		
		//set�� ��� ��(Element)�� �� ���
//		System.out.println(set.get("������")); //ERROR, set��ü�� �˻��� ����� ����.
		//Iterator�� ����Ͽ� ���� ���
		Iterator<String> ita = set.iterator();
		
		String name = "";
		while(ita.hasNext()) { //set�� Iterator�� �����ϴ� set�� ��Ұ� �����Ѵٸ� 
			name=ita.next(); //�ش����� ���� ��� ���� �����ͷ� �̵�
			System.out.println(name); //��ȸ�ɶ��� ���� �Ҵ��� ������ �ƴ϶� �迭�� �� �״�� ����.
		}
		
		System.out.println("--------------���� for------------------");
		for(String temp : set) {
			System.out.println(temp);
		}
		
		//��� ���� �� ����
		set.clear();
		System.out.println("clear �� : "+set.size()+", "+set);
		System.out.println("----------------�迭�� ������ ��-----------------");
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}

	}
	////////////////////////�������� �������ϱ�(lotto)/////////////////////
	public int[] lotto() {
		int[] tempLotto = new int[6];
		//random���� �����̱Ⱑ �� ���ϴ�.
		Random random = new Random();
		
		for(int i=0; i<tempLotto.length; i++) {
			tempLotto[i] = random.nextInt(45)+1; //���� 1~45, �ߺ� �߻�
			//���� ���� ���� ���̶� ���� ���� ���� ������ ��������Ѵ�. for��!
			for(int j=0; j<i;j++) {
				if(tempLotto[i]==tempLotto[j]) { //���� ���� ���ٸ�
					i--; //�ߺ��߻��� ��ȣ�� �ε�����°�� �ٽ� �߻���Ű�� ���� �ε��� ��ȣ�� �ϳ� ���δ�.
					break; //�ϳ� �ٿ��ְ� �ݺ����� �ǳʶڴ�.
				}
			}
		}
		
		return tempLotto;
	}
	
	/////////////////////�ζ� �ι�°����///////////////////////
	public Integer[] lotto1() {
		Integer[] tempLotto = new Integer[6];
		
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			set.add(random.nextInt(45)+1); //set�̶�! ���� ���� �߰����� �ʴ´�. �׷��� �ߺ� �߻� X
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
