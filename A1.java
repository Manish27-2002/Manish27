abstract class A{
	int age = 10;
	String name = "tharun";
	String color = "white";
	
	abstract void Active();
	int legs = 2;
	void m2(){
		int legs = 3;
		System.out.println(legs);//3
		System.out.println(this.legs);//2
	}
}
abstract class B extends A{
	int age = 22;
	void m3(){
		int age = 456;
		System.out.println(age);//456
		System.out.println(this.age); //456
		System.out.println(super.age);//22
	}
}

class D extends B{
	String food = "birayani";
void Active(){
	System.out.println("he is supper active");
}
public static void main(String args[]){
	D d1 = new D();
	d1.m2();
	d1.m3();
	
System.out.println(d1.age);//0
System.out.println(d1.name);//null
System.out.println(d1.color);//null
System.out.println(d1.legs);//0
	}
}