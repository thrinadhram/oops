package polymorphisam;


class Addition{
	public int result;
	public long result1;
	
	public String Result;

	public void add(int a, int b) {
		result = a + b;
		System.out.println(" addiion of 2 numbers are:" + result);
	}

	public void add(long a, long b, long c) {

		result1 = a + b + c;
		System.out.println(" my addition of 3 numbers are:" + result1);
	}

	public void add(String x, String y) {

		Result = x + y;
		System.out.println("my adding two names are:" + Result);
	}

	public void add (int b, String y) {
		result=b;
		Result=y;
		System.out.println("my food name is :"+Result+"food cost is"+result);
		
	}
	}
	
	
	
public class Methodoverloadingpolymorphisam {

	public static void main(String[] args) {
		
		Addition ae = new Addition();
		ae.add(30, 40);
		ae.add(10000, 20000, 30000);
		ae.add("mindq","systems");
		ae.add(100,      " biriyani");
		Addition a1=new Addition();
		
	}

}
