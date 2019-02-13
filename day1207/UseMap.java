package day1207;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : KVP�� �Ǿ��ִ� �ڷᱸ��, Ű�� ����Ͽ� ���� ��� ��
 * @author owner
 */
public class UseMap {

	public UseMap() {
		//JDK�� 1.5������ ��� Generic�� ����� �� ����, ��ü�� ���尡��.
		
		//1. ����
		Map<String, String> map = new HashMap<String, String>();
		
		//2. �� �Ҵ� - Ű�� ����, ���� �ߺ� ����, �ԷµǴ� ������� ���� �߰����� �ʴ´�.
		map.put("Oracle","��뷮 �����ͺ��̽�");
		map.put("Java","���α׷��� ���");
		map.put("Python","���α׷��� ���"); //���� �ߺ� ����
		map.put("Java", "�Ϻ��� ��ü���� ���"); //Ű�� ������(�����Ѵٸ�) ���߿� �Է��� ���� ������ ���� �����������. upsert!
		map.put("HTML", "Markup Language");
		System.out.println(map);
		
		//3. �� ��� - Ű�� ����Ͽ� ���� ��´�.
		//Ű�� �ش��ϴ� ���� ���ٸ� null�� ��ȯ
		String val = map.get("html");
		System.out.println(val);
		
		//4. Ű�� �����ϴ���?
		String key = "Java";
		boolean flag = map.containsKey(key);
		System.out.println(key+"�� ���� ? "+flag);
		
		//5. �� ����
		map.remove("Java");
		System.out.println("���� �� : "+map);
		
		//6. ��� Ű ���
		Set<String> allKeys = map.keySet();
		System.out.println("map�� ���� ��� Ű : "+allKeys);
		
		//7. ��� �� ���
		Iterator<String> ita = allKeys.iterator();
		String value = "";
		
		while(ita.hasNext()) { //Ű�� �����Ѵٸ�
			value = map.get(ita.next()); //�� Ű�� ������ Map�� ���� ��´�.
			System.out.println(value);
		}
		
		//8. ����
		map.clear();
		System.out.println("��� ���� : "+map.size()+" / "+map);
	}
	
	/**
	 * �⺻�����ڸ� ����ϸ� 11���� ���� �ڵ� �����ȴ�.
	 * MultiThread���� �������� �Ұ���.
	 * �����Ͱ� ��ü �� ������ �� 75% ä������ �� ���� ���� �˻��� �Ѵ�.
	 */
	public void useHashtable(String key) {
		//1. ����
		Map<String, String> bloodmap = new Hashtable<String,String>(100);
		
		//2. �� �Ҵ�
		bloodmap.put("A","�����ϴ�");
		bloodmap.put("B","�����巴��");
		bloodmap.put("AB","������");
		bloodmap.put("O","�����δ��ϴ�");
		bloodmap.put("A","�ҽ��ϴ�");
		
		String value = bloodmap.get(key.toUpperCase());
		
//		if(value==null) { //�̷��� �ص� �ǰ� �ؿ�ó�� �ص��ǰ�~!
		if(!bloodmap.containsKey(key.toUpperCase())) {
			System.out.println(key+"��� �������� ����� ���� �ƴմϴ�.");
		} else {
			System.out.println(key+"���� Ư¡ : "+value);
		}
		
	}
	
	/**
	 * MultiThread���� �������� �����ϴ�. ������
	 * �����Ͱ� �������� ������ �� 75% ä���������� ���� ���� �˻��� �����Ѵ�.
	 */
	public void useHashMap(String key) {
		//1. ����
		Map<String,String> map = new HashMap<String,String>();
		//2. �� �Ҵ�
		map.put("���ʺ���", "Ǯ�� ���� ������ ���´�");
		map.put("��������", "���濡 ���忡�� �����Ѵ�");
		map.put("���乫��", "�ƹ��͵� ���� ������ �� �ݷ��ϰ� �ƹ��͵� ���� �ʰڴ�");
		map.put("���γ���", "�����ϸ� �θǽ� �����ϸ� �ҷ�");
		map.put("�̺θ�õ", "������ ��ȥ�ϸ� ��õ���� ���ϸ� ��õ����");
		map.put("��������", "���� ���� ������ ������");
		map.put("����ġ��", "�Լ��� ������ ¡�׷�����");
		map.put("���ü���", "���α��� �ڶ�");
		
		//�� ���
		if(map.containsKey(key)) { //�ʿ� Ű�� �����Ѵٸ�
			String value = map.get(key); //�� ���
			System.out.println(key+"�� ���� "+value);
		} else {
			System.out.println(key+" ���ڼ���� �غ���� �ʾҽ��ϴ�");
		}
	}
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("----------------Hashtable���------------------");
		um.useHashtable("d");
		System.out.println("----------------HashMap���------------------");
		um.useHashMap("�Ź�");
	}

}
