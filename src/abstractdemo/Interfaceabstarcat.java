package abstractdemo;


interface  A {

	void a();
	void b();
	void c();
	void d();
	void e();
}

class B implements A{

	@Override
	public void a() {
		System.out.println("i am a alphabet");
		
	}

	@Override
	public void b() {
		System.out.println("i am b alphabet");
		
	}

	@Override
	public void c() {
		System.out.println("i am c alphabet");

		
	}

	@Override
	public void d() {
		System.out.println("i am d alphabet");

		
	}

	@Override
	public void e() {
		System.out.println("i am e alphabet");

		
	}
	
	
}



public class Interfaceabstarcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A myoriginaldata=new B();
		myoriginaldata.a();
		myoriginaldata.b();
		myoriginaldata.c();
		myoriginaldata.d();
		myoriginaldata.e();
		

	}

}
