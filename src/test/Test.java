package test;

public class Test {
	public static void main(String [] args) throws Exception {
		int n=10;
		System.out.println("instructions1");
		if(n==10) throw new Exception();
		System.out.println("instructions2");
		System.out.println("instructions3");
		System.out.println("instructions4");
	}
}
