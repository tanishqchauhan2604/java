package p2;

class OtherPackage {
	OtherPackage(){
		p1.AccessDemo b = new p1.AccessDemo();
		System.out.println("other pkg constructor");
		//System.out.println("x = "+b.x);
		System.out.println("x_pub = "+b.x_pub);
		//System.out.println("x_prot = "+b.x_prot);
		//System.out.println("x_pri = "+b.x_pri);
	}

}