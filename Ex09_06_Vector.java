import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_06_Vector {

	public static void main(String[] args) {
	
		int i;
		
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		v.add("��");
		v.add("����");
		v.add("��");
		v.add("�ܿ�");
		System.out.println(v.size());	//�ߺ����
		System.out.println(v);			//[��, ����, ��, �ܿ�] String�� toString ��� 
		System.out.println(v.get(0));
	
		for(i=0;i<v.size();i++)
		{
			String s = v.get(i);		//**************
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : v)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("---Enumeration---");
		Enumeration<String> en = v.elements();	//Enumeration : ���ŵ� �����͸� ������ �� �ִ� �������̽� Ÿ��
												// elements�� ���͸� ������ �ִ�. 
		while(en.hasMoreElements())	//hasMoreElements : boolean : en������ �����ϴ� ���� �ֳ�
		{
			String t = en.nextElement();
			System.out.print(t + " ");
		}
		System.out.println();System.out.println("-----------------");
		System.out.println();
		
		System.out.println("-----iterator----");
		Iterator<String> it = v.iterator();	//iterator : �ݺ���, ArrayList���� iterator ��밡��
		while(it.hasNext())
		{
			String j = it.next();
			System.out.print(j + " ");
		}
		System.out.println();

		
	}
	

}
//�Ѵ� �θ�� list�������̽���
//�Ѵ� �ߺ� ����