class A{
	int i=10;
	A(){
	  }
	}
class B extends A{
	int j=40;
	B(){
	}
	void m1(){
	          System.out.println(i);
		  System.out.println(j);
	         }
	public static void main(String args[]){
						B b1=new B();
						System.out.println(b1.i);
						System.out.println(b1.j);
					       
						A a1=new A();
						System.out.println(a1.i);
						System.out.println(b1.j);
						
					       }
}