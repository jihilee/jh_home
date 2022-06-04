import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09_07_HashSet {
	public static void main(String[] args) {
		
		//HashSet<String> hs = new HashSet<String>();
		Set<String> hs = new HashSet<String>();	//�θ� �ڽ��� ������ �� �ִ�
		System.out.println(hs.size());
		
		hs.add("banana");
		hs.add("orange");
		hs.add("banana");
		hs.add("melon");
		System.out.println(hs.size());	// �ߺ� ����, ������ �ƴ����� �˾Ƽ� ���� ����
		
		//System.out.println(hs.get(0));	HashSet���� get�޼��尡 ����.
		
		System.out.println(hs);			// ����� toString ȣ��
		System.out.println("--------------------");
		
		for(String s : hs)
		{
			System.out.print(s + " ");
		}
		System.out.println();			//�Ϲ�for������ ��ġ��ȣ�� �־���ϴµ� Set�� ������ ��� �Ұ����ϴ�
		
		//Enumeration<String> en = hs.elements();	//enumeration�� set���� ��� �Ұ���
		Iterator<String> it = hs.iterator();		//Interator - interface(�̿ϼ��޼��带����) ��ü�� ���� �� ����
		while(it.hasNext())	//it�� �����ϴ°� �ִ���
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
	
		System.out.println("--------------------");
		hs.remove("orange");		//object�� �Ǿ������� � �ڽ��̴� ���� �� �ִ�
		System.out.println(hs);		//�����Ϸ��� ��� ����� �Ѵ�. ��ġ��ȣ�� ���� ������
		System.out.println(hs.contains("banana"));	//contains - boolean�� t/f, ��¹��� �Բ� �����Ͽ� ���
		System.out.println(hs.contains("banan"));
		
		System.out.println("--------------------");
		System.out.println(hs.isEmpty());	//����ֳ�
		hs.clear();	//������ ��� ����� �޼ҵ�
		System.out.println(hs);
	}

}
//HashSet : �θ�� set, ������ ���� �ߺ� �����ϴ�
//List : ������ �ְ�, �ߺ�����Ѵ�, ArrayList, Vector

//list�� set�� �÷��� ������ ���� �� ����. �����Ǵ� �޼ҵ� �ȵǴ� �޼ҵ� Ȯ��