package p2;

class AccessDemo2 extends p1.AccessDemo{
	AccessDemo2()
	{
		System.out.println("pkg p2 accessd constructor");
		//System.out.println("x = "+x);
		System.out.println("x_pub = "+x_pub);
		System.out.println("x_prot = "+x_prot);
		//System.out.println("x_pri = "+x_pri);
	}

}