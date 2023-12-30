package Areaforgeometricdimensions;

public class Rectangle extends Shape{
	int length;
	int width;
	public Rectangle(int length, int width )
	{
		this.length = length;
		this.width = width;
	}
	public double calculateArea()
	{
		return length*width;
	}
	
	public void displayArea()
	{
		System.out.println( "the area of rectangle is:" + calculateArea());
	}
}

	


