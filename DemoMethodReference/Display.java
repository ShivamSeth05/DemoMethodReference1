package DemoMethodReference;

public class Display {
	public Display(int x) {
	System.out.println("c body");  
	System.out.println("x is "+x);  
	}
	public void m1(int y) {
		System.out.println("Instant method body");
		System.err.println("y is"+y);
	}
	public static void m2(int z) {
		System.out.println("===Static method body===&");
		System.out.println("The value z:"+z);
		}

}
