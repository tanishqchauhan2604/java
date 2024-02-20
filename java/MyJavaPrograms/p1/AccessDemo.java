package p1;

public class AccessDemo {
	int x = 1;
	public int x_pub = 2;
	protected int x_prot = 3;
	private int x_pri = 4;

	public AccessDemo(){
		System.out.println("base constructor");
		System.out.println("x = "+x);
		System.out.println("x_pub = "+x_pub);
		System.out.println("x_prot = "+x_prot);
		System.out.println("x_pri = "+x_pri);
	}

}

