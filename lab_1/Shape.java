class Shape
{

 	void  area (double a)
		{
			System.out.println("radius of the circle = "+ a);
			System.out.println("area of circle is"+ 3.14*a*a);
		}

	

	void area (double a,double b)
	{	
	System.out.println("length of the rectangle  = "+ a);
	System.out.println("breadth of the rectangle = "+ b);
	System.out.println("area of rectangle  is" + a*b);
	}

	void area (int  a)
	{

	System.out.println("side of the squre = "+ a);
	System.out.println("area of squre  is" + a*a);
}
	
	public static void main(String args[])
	{
	Shape s1 = new Shape();
	s1.area(3.6);
	s1.area(3,2);
s1.area(3);

	}
}
