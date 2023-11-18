package constructor;

public class Constructoroverloading {
	
	public int result;
	public String result1;
	public Constructoroverloading(int a, int b, int c) {
		
		
		
		result=a+b-c;
		System.out.println(result);
	}
	
	public Constructoroverloading(String x, String y) {
		result1=x+y;
		System.out.println(result1);
		}
	
	public static void main(String[] args) {
		
		Constructoroverloading col=new Constructoroverloading(10,20,20);
		Constructoroverloading col2=new Constructoroverloading("hyderbad","telangana");
	}

}
