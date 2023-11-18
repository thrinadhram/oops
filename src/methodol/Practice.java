package methodol;

public class Practice {
	
	public int result;
	public String result1;
	
	public void overloading( int b,int c) {
		
		int a = b+c;
		System.out.println("my int value is:"+a);
		
	}
	public void overloading(String  x,String y) {
		String z= x+y;
		System.out.println("my int value is:"+z);
		
		
		
	}
	
	public void overloading(int n,String r) {
		result = n;
		result1= r;
		System.out.println("my age is:"+result+"my name is:"+result1);
		
		
	}
	
	
	public static void main(String[] args) {
		Practice p =new Practice();
		p.overloading(5, 5);
		p.overloading("naveen","revathi");
		p.overloading(35, "pooja");
		
	}
	

}
