Class Sum{
	 public int sum(intx,inty){return(x+y);}
	 public int sum(intx,inty,intz)
	 {
	  return(x+y+z);
	 }
	 public double sum(doublex,doubley)
	 {
	  return(x+y);
	 }
	 public static void main(String args[])
	 {
	  Sum S=new Sum();
	  System.out.println(S.Sum(10,20));
	  System.out.println(S.Sum(10,20,30));
	  System.out.println(S.Sum(10.5,20.5));
       	 }
	 }