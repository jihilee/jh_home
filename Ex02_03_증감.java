
public class Ex02_03_���� {

	public static void main(String[] args) 
	{
		int a = 5, aa, b =5, bb;	// ���� �ʱ�ȭ �ʼ�, 0���ζ� �ʱ�ȭ �س��ƾ� ��
		
		System.out.println("==��������==");
		System.out.println(" ");
		
		aa = ++a;			// ���� ����a�� 1 ������Ű�� �� ���� �������� �ѱ�� ������	
		bb = b++;			// ���� �������� �ѱ�� ����b�� ���߿� 1 ������Ű�� ������
		
		
		System.out.println("a = " + a);
		System.out.println("aa = " + aa);
		
		System.out.println("b = " + b);
		System.out.println("b = " + bb);
		
		System.out.println(" ");
		
		System.out.println("==���ҿ���==");
		System.out.println(" ");
		
		aa = --a;			// ���� ����a�� 1 ���ҽ�Ű�� �� ���� �������� �ѱ�� ������	
		bb = b--;			// ���� �������� �ѱ�� ����b�� ���߿� 1 ���ҽ�Ű�� ������
		
		
		System.out.println("a = " + a);
		System.out.println("aa = " + aa);
		
		System.out.println("b = " + b);
		System.out.println("bb = " + bb);
		
		
		System.out.println(" ");
		
		System.out.println("==�ܵ���������==");
		System.out.println(" ");
		
		int x = 5;
		
		System.out.println("x = " + x);
		++x;
		
		System.out.println("x = " + x);
		x++;	// x=x+1;
		
		System.out.println("x = " + x);
		// �ܵ����� ���� ������ ��� �� ���� �տ� �ִ� �ڿ� �ִ� ������� ����
		

		System.out.println(" ");
		
		System.out.println("==���ҿ���==");
		System.out.println(" ");
		
		System.out.println("x = " + x);
		--x;
		
		System.out.println("x = " + x);
		x--;	// x=x-1;
		
		System.out.println("x = " + x);
		// �ܵ����� ���� ������ ��� �� ���� �տ� �ִ� �ڿ� �ִ� ������� ����
		
		
		System.out.println(" ");
		
		
		System.out.println("==���꿬��11==");
		System.out.println(" ");
		
		int i=10;
		System.out.println(i);		// 10		-> ������ �ܼ�â�� �ִ´ٰ� �����ϰ� ����
		System.out.println(i++);	// 10		-> console = i++ Ȥ�� ++i
		System.out.println(++i);	// 12
		System.out.println(++i);	// 13
		System.out.println(i++);	// 13
		System.out.println(i);		// 14		
		
		System.out.println(" ");
		
		
		System.out.println("==���꿬��22==");
		System.out.println(" ");
		
		
		System.out.println(i);		// 14		-> ������ �ܼ�â�� �ִ´ٰ� �����ϰ� ����
		System.out.println(i--);	// 14		-> console = i-- Ȥ�� --i
		System.out.println(--i);	// 12
		System.out.println(--i);	// 11
		System.out.println(i--);	// 11
		System.out.println(i);		// 10	
		
		// ctrl+art+�Ʒ�����Ű + ���ٺ���
	
		
		
	}

}
