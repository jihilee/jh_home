import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09_10_HashMap {
	public static void main(String[] args) {

		Map<String, String> dic = new HashMap<String, String>();	//�θ�Ÿ��map���� �ڽ�Ÿ���� ������ �� �ִ�
		
		dic.put("pencil", "����");
		dic.put("sky", "�ϴ�");
		dic.put("desk", "å��");
		dic.put("face", "��");
	
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �ܾ��? (q�Է� �� ����)");
		System.out.print("> ");
		String word = sc.next();
		
		if(word.equals("q"))
		{
			break;
		}
		
		if(dic.get(word)==null)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else
		{
			System.out.println("�� : " + dic.get(word));		//****���� for�� ������ �ʾƵ� �ȴ�*****
		}
	
//		Set<String> k = dic.keySet();
//		for(String x : k)
//		{
//			if(x.equals(word))
//			{
//				System.out.println("�� : " + dic.get(x));
//			}
//		}
//		System.out.println();
		
		}while(true);

		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
//hashmap = Ű�� ������ ã�� �� �ִ�, �˻��� ��(����, ���԰���) �ַ� ���ȴ�

//list : �������ְ� �ߺ����
//set : ������ ���� �ߺ�����
//map : Ű�� ������ ������ �����Ѵ�. Ű�� �ߺ�����, ������ �ߺ�����