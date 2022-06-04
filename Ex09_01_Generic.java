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

class Top2<T>{	//<T> : 미지정된 자료형
	private T data;	
	
	public void setData(T data)
	{
		this.data=data;	
	}
	public T getData()
	{
		return data;	
	}
}//top2, 재너릭 기술

public class Ex09_01_Generic {
	public static void main(String[] args) {
	
		Top1 t1 = new Top1();
		
		t1.setData(100);
		int result1 = t1.getData();
		System.out.println(result1);
		
		Top2<String> t2 = new Top2<String>();	//미지정 자료형 객체 만들 때 확정
		t2.setData("orange");
		String result2 = t2.getData();
		System.out.println(result2);
		
		Top2<Integer> t3 = new Top2<Integer>();	//정수형 클래스를 입력해야 함
		t3.setData(new Integer(300));	//t3.setData(300)
		Integer result3 = t3.getData();
		System.out.println(result3);
	}

}
