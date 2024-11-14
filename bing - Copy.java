class U{
int i=10;
void m1(){
System.out.println("t");
}
}

abstract class Y extands U{
int j = 20;
void m2();
}
	class Z extands Y{
int k = 30;
void m2(){
System.out.println("A");
}
void m1(){
System.out.println("S");
}

public static void main(String args[]){

Z w = new Z();
w.m2();

System.out.println(w.j);

}
}