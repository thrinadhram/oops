package oopsmethods;

public class Nonstatic {
	public  int output;
	public void subtraction() {
		int a=100;
		int b=200;
		output=b-a;
		System.out.println("my subtraction value is:"+output);
	}
	
	public void division() {
		int x=500;
		int z=250;
		output=x/z;
		System.out.println("my division value is:"+output);
	}

	public static void main(String[] args) {
		Nonstatic ns=new Nonstatic();
		ns.subtraction();
		ns.division();

	}

}
