//WAP to use inheritance
class A {
	int i;
	A(){
		System.out.println("A's constructor");
	}
	A(int i){
		this.i = i;
	}
	void showI(){
		System.out.println("i is "+i);
	}
}
class B extends A{
	int j;
	B()
	{
		System.out.println("B's constructor");
	}
	B(int j,int a)
	{
		super(a);
		this.j = j;
		System.out.println("B's constructor");
	}
	void showJ(){
		System.out.println("j is "+j);
	}
}
class TestInheritance {
	public static void main(String[] args) {
		A a = new A();
		a.showI();
		B b = new B();
		b.showI();
		b.showJ();
	}

}