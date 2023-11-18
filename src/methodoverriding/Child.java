package methodoverriding;

public class Child extends Parent{
	public void Thrinadh() {
		System.out.println("i dont know what i am ");
		super.Thrinadh();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cd=new Child();
		cd.anil();
		cd.puja();
		cd.surya();
		cd.Thrinadh();
		
		
	//	System.out.println("-----------------------");
		
//		Parent pt=new Parent();
//		pt.Thrinadh();
		
				
	}

}
