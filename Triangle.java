package Areaforgeometricdimensions;
public class Triangle extends Shape{
		int length;
		int width;
		public Triangle(int length, int width )
		{
			this.length = length;
			this.width = width;
		}
		public double calculateArea()
		{
			return (length*width)/2;
		}
		
		public void displayArea()
		{
			System.out.println( "the area of triangle is: " + calculateArea());
		}
	}

		




