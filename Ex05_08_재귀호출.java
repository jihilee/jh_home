
public class Ex05_08_���ȣ�� 	// ��� ȣ�� : show method �ȿ��� show method�� ȣ���ϴ� �� ���� ���� ȣ���ϴ� ��
{
	public static void main(String[] args) 
	{
		show(3);
	}

	static void show(int cnt)				//static ���� method���� ȣ���ϴ°Ÿ� void �տ� static �ٿ�����
	{
		System.out.println("Hi~^^" + cnt);
		
		if(cnt==1)
			return;	
		show(--cnt);
	}
}
