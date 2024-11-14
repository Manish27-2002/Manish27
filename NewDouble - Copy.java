class Sum{
	int Sum(int x,int y)
	{
	 return x+y;
	}
	 int Sum(int x,int y,int z)
	{
	 return x+y+z;
	}
	 double Sum(double x,double y)
	{

	 return x+y;
	}
	public static void main(String args[])
	{
	 Sum S = new Sum();
	 System.out.println(S.Sum(10,20));
	 System.out.println(S.Sum(10,20,30));
	 System.out.println(S.Sum(10.0,12.0));
	}
	}