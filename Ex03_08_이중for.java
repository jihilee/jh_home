
public class Ex03_08_����for 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==����for���� �̿��� i�� j ����ϱ�==");
		System.out.println("==����� ��� ����==");
		System.out.println();
		
		int i, j;
		
		for(i=1;i<=3;i++)		//ù��° for�� ���� ��ȣ ��Ŭ�� -> �䱼 �극��ũ����Ʈ Ŭ�� -> �Ķ����׶�� ����
		{						//�ڵ��� ������ ��Ŭ�� -> ����׿��� -> �ڹپ��ø����̼� ->f5Ű�� ������i������ 1�Էµ� ���� �����ʿ��� Ȯ���� �� �ִ�.
			for(j=6;j<=7;j++)
			{
				System.out.println( i + "," + j);		// System ~ print ������ f6Ű�� �Է�**
				System.out.println("~~~~~~~");
			}// ����for��
			
			System.out.println("********");
			
		}	// �ٱ�for��
		
		System.out.println();
		System.out.println("===========");
		System.out.println();						// f5�� f6�� �Է��Ͽ� �ܰ躰�� �����ų �� �ִ�. = ������ϴ� = �ܰ躰�� �����ϴ� 
	}												// ����� �����Ϸ��� ������ ��� ������� ������ close, ���� �Ķ����׶�� �䱼 �극��ũ����Ʈ ��Ŭ�� �� ����
}
/* for(���ǽ�1)
 * {
 *		for(���ǽ�2)
 *			{
 *			
 *			}
 * {					*/
