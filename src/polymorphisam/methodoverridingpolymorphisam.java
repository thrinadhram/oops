package polymorphisam;

class parent{
	
	public void family() {
		System.out.println("this is my overridemethod");
	}
	
}
	
	 class child1 extends parent{
		 
		 public void family() {
			 System.out.println("this is my child1 family");
			 super.family();
		 }
	 }
		 
		class child2 extends  parent{
			public void family() {
				
				System.out.println("this is my child2 family");
				super.family();
			}
		
		 
	 }
	
public class methodoverridingpolymorphisam {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new child1();
		p.family();
		parent p2=new child2();
		p2.family();

	}

}
