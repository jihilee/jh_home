import java.util.StringTokenizer;
public class Ex08_07_SpringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer stn = new StringTokenizer("2022/05/30,10:43",",/");	//�Ű����� ���� �����ڰ� ���ǵ��� �ʾҴ�.
																			// ,�� �������� �и��Ѵ�
		int count = stn.countTokens();	// token�� ������ �Էµ�, 4
		System.out.println("�Ľ��� ���� : " + count);	//�����ڷ� ���ڸ� �ɰ��� ���� : �Ľ�, �Ľ̵� ���� �ϳ��ϳ� : ��ū
		
		while(stn.hasMoreTokens())		//stn.hasMoreTokens() -> boolean ���·� t/f����
		{
			String s = stn.nextToken();
			System.out.println("s : " + s);
		}
		System.out.println();
		
		String stn2 = "2022/05/31,10;43";
		String[] sp = stn2.split("/");
		System.out.println(sp.length);
		
		int i;
		for(i=0;i<sp.length;i++)
		{
		System.out.println(sp[i] + " ");
		}System.out.println();
	}

}//�ڹ� ��ƿ��Ű���� 
//Ư�� ���ڸ� Ư���� �����ڷ� �����ϰ� ���� �� SpringTokenizer���
//SpringTokenizer���� ������ �⺻ ������, ���� �����ڸ� ������ ������ �ڵ����� �������� �Ľ̵ȴ�
//.split�� ������ 1���ۿ� ���� �������� �ϰ� ������ SpringTokenizer����Ѵ�.