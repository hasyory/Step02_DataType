package testMain;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다.");
		//참조 데이터 type을 담을 수 있는 빈 변수 만들기
		String myName=null;//null을 대입하면 된다.
		//선언만하면 변수가 만들어지지 않는다. String myName;만 하면 변수 생성되지않는다 !값을 넣어주는게 실행되어야 변수가 만들어진다.
		//null이라도 넣어줘야 변수자체가 생성은된다. null이들어가있으면 값이 들어갈지 안들어갈지만 정해짐.null도 없이 선언만하면 변수 생성이 안되서 통과가 안됨.
		boolean isRun=false;
		
		if(isRun) {
			myName="김구라";
		}
		//변수에 담긴 값이 null인지 아닌지에 따라 선택적인 동작을 해야하는 경우가있다.
		if(myName==null) {
			System.out.println("myName이 null이네?");
		}
		System.out.println("메인메소드가 종료됩니다.");
	}
}
