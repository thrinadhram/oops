package abstractdemo;

abstract class parent {
	
	
	abstract void manual();
	
	abstract void testing();
	
	
	 void selenium() {
		
		System.out.println("this is the one of free source automation tool");
	}
}


public class Child extends parent {
	@Override
	void testing() {
		System.out.println("automation");
	}
	

	@Override
	void manual() {
		// TODO Auto-generated method stub
		System.out.println("this is the manual testing concept");
		
		
		
		
	}
	public static void main(String[] args) {
		
		Child cc = new Child();
		cc.manual();
		cc.selenium();
		cc.testing();
		
	}
	
	}



