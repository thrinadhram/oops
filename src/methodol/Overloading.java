package methodol;

public class Overloading {
	public void pooja(int yummy,int tasty) {
		int sweet = yummy*tasty;
		System.out.println("my sweet is:"+sweet);
		
	}
	
	public void pooja(String agra,String food ) {
		String fav=agra+food;
		System.out.println("my fav sweet is:"+fav);
		
		
	}
public static void main(String[] args) {
	Overloading load = new Overloading();
	load.pooja(1, 2);
	load.pooja("bak","lava" );
	
}
}
