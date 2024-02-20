package p1;

class Derived extends AccessDemo {
	Derived(){
		System.out.println("derived constructor in p1");
		System.out.println("x = "+x);
		System.out.println("x_pub = "+x_pub);
		System.out.println("x_prot = "+x_prot);
		//System.out.println("x_pri = "+x_pri);
	}

}