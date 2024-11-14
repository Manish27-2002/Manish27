class A{
    int i=10;
    A(){

    }
}
class B extends A{
    int i=40;
    B(){

    }
    void m1(){
        System.out.println(i);
        System.out.println(j);
    }
    public.static.void.main(String args[]){
        B.b1=newB();
        System.out.println(b1.i)
        System.out.println(b1.j)
        A.a1=newA();
        System.out.println(a1.i);
        System.out.println(b1.j);
    }
}
