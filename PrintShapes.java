package Areaforgeometricdimensions;
import java.util.ArrayList;
public class PrintShapes {
		public static void main(String[] args) {
			ArrayList<Shape> sh = new ArrayList<>();
			try {
			sh.add(new Rectangle(5,10));
			sh.add(new Square(5));
			sh.add(new Triangle(5,12));
			for(Shape shape: sh)
			{
				shape.displayArea();
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				System.out.println("Program Executed Successfully");
}
  }
		
	}

