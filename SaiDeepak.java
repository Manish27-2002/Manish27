class A{
	int i=10;
	A(){
	}
      }
class B{
	B(){
	}
       }
class C extends A {
		int j=12;
		C(){
		}
	void m1(){
	          System.out.println(i);
		  System.out.println(j);
		 }
		   
	public static void main(String args[]){
						A a1 = new A();
						System.out.println(a1.i);
						//System.out.println(a1.j);
					       
	
						B b1 = new B();
						//System.out.println(b1.i);
						//System.out.println(b1.j);
					       
	
						C c1 = new C();
						System.out.println(c1.i);
						System.out.println(c1.j);
					       }
}