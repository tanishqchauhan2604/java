package p1;

class SamePackage {
	SamePackage(){
		AccessDemo a = new AccessDemo();
		System.out.println("same pkg constructor");
		System.out.println("x = "+a.x);
		System.out.println("x_pub = "+a.x_pub);
		System.out.println("x_prot = "+a.x_prot);
		//System.out.println("x_pri = "+a.x_pri);
	}
	public static void main(String[] args){
		new SamePackage();
	}

}