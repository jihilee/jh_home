
public class Ex01_��¹� 
{
	public static void main(String[] args) 
	{
		System.out.println(false);	//<-�ּ��� Ȥ�� ����, System ù���� �빮��, println<-���+����
		System.out.println("�����ٶ�");	// �� ��ɾ�� connsoleâ�� ����ϴ� ��ɾ��̴�.
		
		System.out.print("a");		//���� �������� ;�����ݷ�, 
		System.out.println('b');	//"���ڿ�", '����' 
		
		System.out.println("�ȳ�\t�ϼ���\n\n�����̸���'ȫ�浿'�Դϴ�"); //�ֵ���ǥ�ȿ� Ȭ����ǥ�� �״�� ���
		System.out.println("�ȳ�\t�ϼ���\n\n�����̸���\"ȫ�浿\"�Դϴ�"); //�ֵ���ǥ�ȿ� �ֵ���ǥ�� \"�� �Է��ϸ� ��°���
	
		System.out.println("1+2");	// �״�� ���
		System.out.println(1+2);	// ����Ǿ� ���
		System.out.println(10);	
		System.out.println("��ſ�"+"�ڹ�"+"����");	//���ڿ� ���� + ���
		System.out.println("1"+"2");	// ���� ���޾� ���
		
		
		System.out.println(" ");
		
		
		int a = 123;					// a��� 4����Ʈ ������ ����� 123�̶� ������ ����
		char b = 'A';					// b��� 2����Ʈ ������ ����� A�̶� ���ڸ� ����
		double c = 98.765;				// c��� 8����Ʈ ������ ����� 98.~�̶� �Ǽ��� ����
		String d = "������";				// d��� ?����Ʈ ������ ����� ���ڿ� ����
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println(" ");
		
		System.out.printf("a=%d\n", a);
		System.out.printf("b=%c\n", b);
		
		System.out.printf("c=%f\n", c);			// �Ҽ��� 6�ڸ����� ���
		System.out.printf("c=%.3f\n", c);		// �Ҽ��� 3�ڸ����� ���
		System.out.printf("c=%.1f\n", c);		// �Ҽ��� 1�ڸ����� ���
		System.out.printf("c=%7.1f\n", c);		
		System.out.printf("c=%4.1f\n", c);		// ��ü�ڸ�.�Ҽ��Ʒ��ڸ�.  ������ �������� ���
		
		System.out.printf("d=%s\n", d);
		System.out.printf("d=%5s\n", d);		// �ڸ��� ����, ������ ���� ���
		System.out.printf("���� �̸��� %3s �Դϴ�\n", d);
		
		
	}
}

/*	; �����ݷ�
 	: Ŭ��
	��� ���� main �ȿ� �ۼ��ؾ��ϸ�, �ּ����� �ۿ� �ۼ��ص� ������
	\t : ��Ű
	\n : ����
	�ּ�ó�� ��� : /* abc */ //abc  */
//	 " " : ���ڿ�
//	 ' ' : ���� ��� 

/*	���Ĺ��� 
 * 	���� : %d, �Ǽ� : %f, ���� : %c, ���ڿ� : %s */


// �ּ�ó�� ����Ű : ���� ��� ctrl + / 

//�����̸� ����� ��� �Ұ�, �����̸� ù ���� ���� �Ұ�

/*bin ������ class������ ����� ������ �� �ִ� ���� 
* ��谡 ������ �� �ִ� ���(����)�� ��ȯ�� ������ ������ = "�������Ѵ�" 
* src �ҽ��ڵ� �ڹ����� -> ����� ���
* bin class���� -> ���� */

