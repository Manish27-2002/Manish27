class A{
int i=10;
A(){
 }
}
class B{
int j=15;
B(){
 }
}
class C extands A,B{

}
void m1(){
	  System.out.println(i);
	  System.out.println(j);
	 }
	public static void main(String args[]){
			C c1=new C();
			System.out.println(c1.i);
			System.out.println(c1.j);
			}