package oopsmethods;

public class Staticmethod {
	public static int result;
	
	public static void addone() {
		int a=10;
		int b=20;
		result=a+b;
		System.out.println(result);
	}
	
	public static void multy() {
		int x=20;
		int y=30;
		result=x*y;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		addone();
//		multy();
		
		Staticmethod sm=new Staticmethod();
		sm.addone();
		sm.multy();

	}

}
