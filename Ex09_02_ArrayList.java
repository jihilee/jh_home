import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex09_02_ArrayList {
	public static void main(String[] args) {
		
		int[] a = {10,20,30};	//3
		// a[3] = 40;
		
		int [] b = new int[3];
		// b[3] = 40;			-> ������ ũ�⸦ ���´�********
	
		String s  = "hello";
		System.out.println(s.toString());	// �Էµ� ���ڿ� ���
		
		ArrayList<String> list = new ArrayList<String>();	//class ArrayList <E>	// ������� ��ü ������ ������ ȿ���� ������ ������ �ִ� �ּҰ� ����

		list.add("����");	//���=element
		list.add("ȿ��");
		list.add("���");
		list.add("����");
		list.add(1,"�¿�");	//1�� ��ġ�� �¿��̰� ���� ȿ���̺��� ���� ��ġ�� �Ű�������
		
		System.out.println("list.size : " + list.size());	//size : �������, list ->�ߺ� ���
		System.out.println("list : " + list.toString());	//[ , , ]
		//AbstractCollection<E>�� toString�� �������̵�
		//Object toString�� �ּҸ� ���� = object�� �������̵����� ����
		list.set(1,"����");
		System.out.println("list : " + list);	//���� ������ �� set��� | �߰��� �� add���
		
		System.out.println();
		System.out.println("============================");
		Iterator<String> it = list.iterator();	//iterator : �ݺ���, ArrayList���� iterator ��밡��
		while(it.hasNext())
		{
			String j = it.next();
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("======09_06_iterator->Arraylist���� ��밡��=====");
		System.out.println();
		
		int index = list.indexOf("���"); // indexOf : ��ġ��ȣ ���, ������ -1���
		System.out.println("index : " + index);
		
		boolean con = list.contains("����");	//���ԵǾ����� t/f
		System.out.println("con : " + con);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ������ �Է��ϼ���.");
		System.out.print("�̸� > ");
		String name = sc.next();
		if(list.indexOf(name) > -1)	//indexof
		{
			System.out.println(name + "��(��) ������ ȸ���Դϴ�.");	
		}
		else
		{
			System.out.println(name + "��(��) �������� ���� ȸ���Դϴ�.");
		}
		if(list.contains(name)==true)	//contains
		{
			System.out.println(name + "��(��) ������ ȸ���Դϴ�.");	
		}
		else
		{
			System.out.println(name + "��(��) �������� ���� ȸ���Դϴ�.");
		}
		System.out.println();
		
		boolean flag = true;
		for(int i=0;i<list.size();i++)
		{
			String g = list.get(i);
			if(g.equals(name))
			{
				flag = false;	//���� ���뺯ȯ = ������ ȸ���� ã�Ҵٴ� �ǹ�
				System.out.println(name + "��(��) ������ ȸ���Դϴ�.");
			}
		}
		if(flag == true)	//������ ȸ���� ��ã������ ������ flag���� true�̴�
		{
			System.out.println(name + "��(��) �������� ���� ȸ���Դϴ�.");
		}
		
		
		
		System.out.println("--------------");
		System.out.println();
		
		String g = list.get(0);		//E get(int index) : ������ ���� Ÿ������ �𸣳� ����ڰ� ������ Ÿ������ ���ϵȴ�
		System.out.println(g);
		String g1 = list.get(1);
		System.out.println(g1);
		
		System.out.println("--------------");
		System.out.println();
		
		list.remove(2);
		System.out.println(list);
		list.remove("����");				// object�� String(upcasting)�� �޾��ֱ� ������ 
		System.out.println(list);		// ���ڿ��� �Է��ص� ��°���, ù��° �����̰� ������
		
		System.out.println();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(10));	//new Integer(10)	->	�⺻Ÿ��11�� new Integer(11)�� ����ڽ�******
		list2.add(20);
		list2.add(30);		
		System.out.println(list2.size());
		System.out.println(list2.toString());
		System.out.println(list2);				//toString ��������
		System.out.println("--------------");
		System.out.println();
		
		Integer i1 = list2.get(1);
		System.out.println(i1);
		Integer i2 = list2.get(2);
		System.out.println(i2);
	}

}
//array : ���� Ÿ���� �����͸� �� �������� ��� �����ϴ� ��, ��ġ��ȣ�� 0���� �����Ѵ�, ������ ũ�⸦ ���´�.
//�÷���(=�������) : ���� �����͸� ������ ������ �� �ִ�. ������ ũ�Ⱑ �ƴϴ�(=�������� �޸𸮸� Ȯ��/����� �� �ִ�)
//		 		  ȸ�������� ���� �� �ִ� ����Ҹ� ���� �� �ʿ�, ��ü�� ������ �� �ִ�**, �����
//ArrayList : �÷����� ���� �� �ִ� Ŭ����
//ArrayList�� toString : element�� toString()�� ȣ��
//
//length : �迭�� ���� (���� ����)
//length() : ���ڿ��� ����
//size() : �÷��� �� ����� ����
//size : ���� ����
//list : ����(��ġ��ȣ)�ִ�, �ߺ����, ArrayList, Vector
//set : ��������, �ߺ�����, hashSet