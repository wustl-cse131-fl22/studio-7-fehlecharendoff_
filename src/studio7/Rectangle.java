package studio7;
// rectangle is class and everything else goes within it
public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int l, int w) { // this is our constructor
		width = w; 
		//this.width = width; another way to write if psramter is named width (not w) // this is used because we have two things names width so use "this" to show first width = the parameter width 
		length = l;
	}
	// now create a method 
	public int area() 
	{
	int area = width*length; // cant be w and l bc those are within the constructor 
	return area;
	
	}
	
	public int perimeter()
	{
	int perimeter = (2*length)+(2*width);
	return perimeter;
	
	}
	
	public boolean compare(Rectangle comp) // rectangle is the data type (like int or double) then must name the rectangle we wanna compare
	{
	if (this.area() < comp.area())
		{
		return true;
		}
	else
	{
		return false;
	}
	
	}
	public boolean square()
	{
		if(length==width)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String [][] args)
	{
		Rectangle chandler = new Rectangle(5,8);
		Rectangle izzy = new Rectangle(2,2);
		chandler.compare(izzy);
		

	}
}