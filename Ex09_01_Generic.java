class Top1{
	private int data;
	
	public void setData(int data)
	{
		this.data=data;	
	}
	public int getData()
	{
		return data;	
	}
}//top1

class Top2<T>{	//<T> : �������� �ڷ���
	private T data;	
	
	public void setData(T data)
	{
		this.data=data;	
	}
	public T getData()
	{
		return data;	
	}
}//top2, ��ʸ� ���

public class Ex09_01_Generic {
	public static void main(String[] args) {
	
		Top1 t1 = new Top1();
		
		t1.setData(100);
		int result1 = t1.getData();
		System.out.println(result1);
		
		Top2<String> t2 = new Top2<String>();	//������ �ڷ��� ��ü ���� �� Ȯ��
		t2.setData("orange");
		String result2 = t2.getData();
		System.out.println(result2);
		
		Top2<Integer> t3 = new Top2<Integer>();	//������ Ŭ������ �Է��ؾ� ��
		t3.setData(new Integer(300));	//t3.setData(300)
		Integer result3 = t3.getData();
		System.out.println(result3);
	}

}
