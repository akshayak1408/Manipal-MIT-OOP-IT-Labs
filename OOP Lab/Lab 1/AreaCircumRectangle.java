class AreaCircumRectangle
{
	public static void main(String args[])
	
	{
		int length,breadth,area,circum;
		length=Integer.parseInt(args[0]);
		breadth=Integer.parseInt(args[1]);
		area=length*breadth;
		circum=2*length + 2*breadth;
		System.out.println("The length of rectangle is: "+length);
		System.out.println("The breadth of rectangle is: "+breadth);
		System.out.println("The area of the rectangle is: "+area);
		System.out.println("The circumference of the rectangle is: "+circum);
	}
}
	
