class A{
	public void display(){
		System.out.println("hello");
	}
}
class B extends A{
		public void area(){
			System.out.println("area");
		}
}
class C extends B{
		public void volume(){
			System.out.println("volume");
		}
}
public class Shape{
	public static void main(String[] args){
		C c = new C();
		c.display();
		c.area();
		c.volume();
	}
}