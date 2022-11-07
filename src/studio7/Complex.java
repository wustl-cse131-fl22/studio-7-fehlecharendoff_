package studio7;

public class Complex {
private double real;
private double imaginary;

public Complex(double r, double b)
{
	real =r;
	imaginary = b;
	
	}
public String addition(Complex c)
{
	double newr = this.real + c.real;
	double newb = this.imaginary + c.imaginary;
	String added = newr+"+"+newb+"i";
	return added;
	}
}
