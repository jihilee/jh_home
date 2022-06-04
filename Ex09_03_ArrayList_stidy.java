import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex09_03_ArrayList_stidy {

	public static void main(String[] args) {

	ArrayList<String> kor = new ArrayList<String>();
	
	System.out.println("\"ArrayList ���θ� �����մϴ�\"");
	System.out.println("�����߰� : add | ���뺯�� : set");
	System.out.println();
	
	kor.add("��");	// element
	kor.add("��");
	kor.add("��");
	kor.add("��");
	kor.add(0,"��");	//0�� �ڸ��� "��" �߰�	
	
	System.out.println("kor.size() : " + kor.size());			// 5
	System.out.println("kor.toString()/kor : " + kor.toString());	//[��, ��, ��, ��, ��] - AbstractCollection<E>�� toString�� �������̵�
	
	kor.set(2, "��");	// �� -> ��
	System.out.println("set(2,��) -> kor : " + kor.toString());
	System.out.println();
	
	System.out.println("<Iterator����Ͽ� kor���>");
	Iterator<String> it = kor.iterator();	//�ݺ���:kor���, new���� �ʴ´�.
	while(it.hasNext())
	{
		String jaum = it.next();
		System.out.print(jaum + " ");
	}
	System.out.println();
	
	System.out.println();
	System.out.println("���ڿ� �������� Ȯ�� : (int)indexOf / (boolean)contains");
	
	int index = kor.indexOf("��");	//��ġ��ȣ ���, ������ -1
	System.out.println("indexOf(��) : " + index);
	
	boolean con = kor.contains("��");
	System.out.println("contains(��) : " + con);
		
	System.out.println();
	System.out.println("-----------------------------");
	System.out.println();
	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("<Scanner�� ���� �Է¹޾� add�� ������ ���� indexOf�� Ȯ���ϱ�>");
	do {
		System.out.println("������ �Է��ϼ���.");
		System.out.print(">");
		String j = sc.next();
		System.out.println();
		if(kor.indexOf(j)>-1){		//indexOf
			System.out.println(j + "�� add�� ������ �����Դϴ�.");}
		else{
			System.out.println(j + "�� add�� �������� ���� �����Դϴ�.");}
		System.out.println();
		
		if(kor.contains(j)==true) {	//contain
			System.out.println(j + "�� add�� ������ �����Դϴ�.");}
		else {
			System.out.println(j + "�� add�� �������� ���� �����Դϴ�.");}
		System.out.println();
		
		for(int i=0;i<kor.size();i++)
		{
			
		}
		System.out.print("���? > ");
		String n = sc.next();
		if(n.equals("n")){
			break;}
		
	}while(true);
	System.out.println("���α׷��� �����մϴ�");
	System.out.println();
	
		
		
	
	
		
		
		
	}

}
