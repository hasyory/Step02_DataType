package testMain;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("���θ޼ҵ尡 ���۵Ǿ����ϴ�.");
		//���� ������ type�� ���� �� �ִ� �� ���� �����
		String myName=null;//null�� �����ϸ� �ȴ�.
		//�����ϸ� ������ ��������� �ʴ´�. String myName;�� �ϸ� ���� ���������ʴ´� !���� �־��ִ°� ����Ǿ�� ������ ���������.
		//null�̶� �־���� ������ü�� �������ȴ�. null�̵������� ���� ���� �ȵ����� ������.null�� ���� �����ϸ� ���� ������ �ȵǼ� ����� �ȵ�.
		boolean isRun=false;
		
		if(isRun) {
			myName="�豸��";
		}
		//������ ��� ���� null���� �ƴ����� ���� �������� ������ �ؾ��ϴ� ��찡�ִ�.
		if(myName==null) {
			System.out.println("myName�� null�̳�?");
		}
		System.out.println("���θ޼ҵ尡 ����˴ϴ�.");
	}
}
