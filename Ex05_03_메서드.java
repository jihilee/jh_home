
public class Ex05_03_�޼��� 
{
	public static void main(String[] args) 		// main�̶� �̸��� ���� method
	{
		show(); 	// show method ȣ��
		System.out.println("\t~~~������~~~");
		show();		// show method ������ ȣ�� ����
		System.out.println("\t~~~�󸶹�~~~");
		show();
		System.out.println("\t================");
		
		add(3,4);		// ȣ���� �� �Ѿ�� �� 3,4�� ����(��������) Ȥ�� argument��� Ī�Ѵ�
		add(100,200);	// ȣ���� �� 3�� 4�� ������ add() method�� �´�
		System.out.println("\t================");
			
		double a = sub(100,11,22);		//method ȣ��, == double a = 67;
		System.out.println("  a = " + a);		//a ������ sub method ������� ���� �� ���
		
		int b = multiply(5,20);		// ��������(Ȥ�� �Ķ����) 5�� 20�� mul- method�� �Ѱܼ� ���Ϲ��� �� ���
		System.out.println("  b = " + b);
		
	}
	
 static void show() { //show method ����
	 				 System.out.println();	
					 System.out.println("*****show method ���� �κ�*****");
					 System.out.println("\t��ſ� �ڹ� ����");
					 System.out.println();
 					}	
 
 //�Ű����� Ȥ�� parpameter : ȣ���� �� �Ѿ���� ���� �޾��ִ� ����
 static void add(int x, int y) { //add method ����
	 							System.out.println("\t�� ���� �� : " + (x+y));	// ù��°+ : �����ǹ�, �ι�°+ : �����ǹ�
	 							return;		// ȣ���� ������ ���ư���
 								}
 
 static double sub(int x, int y, int z) {	// sub method ����
	 	// ������ ���ư� ���� �ִٸ� void ��� �ش� ���� ���� �ڷ����� �����Ѵ�.	
	 									System.out.println();
	 									double result = x - y - z;		// 67
	 									return result;				// main���� result���� ������ ���ư���
										}	// �� method���� ����ϴ� ������ �̸��� �ٸ� method�� ������ �ߺ��Ǿ ��� ����. ����� ������ �� method �ȿ����� ���Ǳ� ������

static int multiply(int x, int y) {	
								System.out.println();
								int result = x* y;
								return result;
							}	// ���� 2���� �Է¹޾� ���� �� �����ϴ� mul- method


}
// method : � Ư���� �۾��� �����ϵ��� ���������� �ۼ��� ���α׷��̴�.
//			method ���� �κ��� �ʿ��� ������ ȣ���Ͽ� ������ �� �ִ�.
//			method ���� �κ� ó���� ������ ������ ȣ���� ������ ���ư���.
// 			** �׻� main method ���� �����Ѵ�.
// ����Ÿ�� : static "void" method�̸� - ������ ���ư� ���� ���� �� 
//			static "int" method�̸� - ������ ���ư� ���� ������ �� 

// ���� : �������, �Ű�����(parameter), instance����, static����(=class����)