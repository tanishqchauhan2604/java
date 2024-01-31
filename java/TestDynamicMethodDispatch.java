import java.util.*;
// Demo of Dynamic Method dispatch
class Fruit {
	void display(){
	   System.out.println("Inside Fruit class ");
	}
}
class Apple extends Fruit{
	void display(){
	System.out.println("Inside Apple class ");
	}
}
class Banana extends Fruit {
	void display() {
	System.out.println("Inside banana class ");
	}
}
class TestDynamicMethodDispatch {
	public static void main(String[] args){
		Fruit f = new Fruit();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i==1){
		// Apple
			f = new Apple();
			f.display();
		}else if(i==2) {
			f = new Banana();
			f.display();
		}else
			f.display();
	}

}