class Sum{
	 public static int Sum(int x,int y){
             return(x+y);
	}

	 public static int Sum1(int x,int y,int z){
	  return(x+y+z);
	 }

	 public static double Sum2(double x,double y){
	  return(x+y);
	 }

	 public static void main(String args[]){

	 
	  System.out.println(Sum(10,20));
	  System.out.println(Sum1(10,20,30));
	  System.out.println(Sum2(10.5,20.5));
       	 }
	 }