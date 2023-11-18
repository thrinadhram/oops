package methodol;

public class Class1 {
	
	
	public void mindq(int a , int b) {
		
		int c=a*b;
		System.out.println("my multiplication result is:"+c);
		}
	
	public void mindQ(String x, String y) {
		String z=x+y;
		System.out.println("my string value is:"+z);
	}
	
	public static void main(String[] args) {
		
		Class1 c1= new Class1();
		c1.mindq(5, 5);
		c1.mindQ("mindq","systems");
		

	}

}
