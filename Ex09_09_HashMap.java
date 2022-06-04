import java.util.HashMap;
import java.util.Set;

public class Ex09_09_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();	//	HashMap<k,v>

		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("����", 30);		//key, value
		hm.put("����", 25);
		hm.put("����", 12);
		hm.put("����", 30);		//�������� �� ������ ��µȴ�, ��������
		hm.put("���̸�", 25);
		
		System.out.println(hm.size());	//���� ������ �������� �ʴ´�
		System.out.println(hm);			//key=value, String�� toString, Integer�� toString ����
	
		//HashMap�� toString��� : key�� value�� toString�� {key=value}�������� �����Ѵ�
	
		System.out.println();
		Integer a = hm.get("����");
		System.out.println("���� : " + a);
		System.out.println("���� : " + hm.get("����"));	//get : Ű�� �ش��ϴ� ������ �����
		System.out.println(hm.get("������"));				//null : ���� Ű�� �Է��ϸ� �ΰ� ���
		System.out.println(hm.get(30));					//get(key)�� �����ϴ�. ������ null���� ���´�/
	
		
		System.out.println();
		boolean b = hm.containsKey("����");	//Ű�� ���� boolean
		System.out.println("containsKey(\"����\") : " + b);
		System.out.println(hm.containsKey("�̼���"));
		
		boolean c = hm.containsValue(12);		//hashmap���� ������� ã�µ� ����� ���ؼ� false�� ���
		System.out.println("containsValue(12) : " + c);
		
		System.out.println();
		Set<String> s = hm.keySet();	//key�� String�̴ϱ� set�� String���� ��������
		System.out.println(s);
		
		for(String x : s)				//key���� ���
		{
			System.out.println(x + " : " + hm.get(x));	//hm.get(x) : Ű�� �˸� ������ get���� ������ �� �ִ�
		}
		System.out.println();
		
		hm.remove("���̸�");
		System.out.println(hm);	//Ű�� ����� �������� ���� ��������
		
		
	}

}
//���� ������ �������� �ʴ´�(��ġ��ȣ�� ����=set)
//Ű�� �ߺ��� ������� �ʰ� ���� �ߺ��� ����Ѵ�.