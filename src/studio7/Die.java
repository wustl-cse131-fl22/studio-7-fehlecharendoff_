package studio7;

public class Die {

	private int n; // number of sides
	
	public Die(int sides) // constructor must be --> public classname()
	{
		n = sides; // take instance variable and set it equal to user input 
	}
	public int thrown() // now create the method to actually do stuff
	{
		int result = (int)(Math.random()*n+1);
		return result;
		
	}
}