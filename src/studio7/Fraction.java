package studio7;

public class Fraction {
private int numerator;
private int denominator;


public Fraction(int n, int d)
{
numerator = n;
denominator = d;
}
public String make()
{
String fract = numerator+"/"+denominator;
return fract;
}

public String add(Fraction f)
{
	//assume they have same denominator...
int newnum = this.numerator + f.numerator;
String sumfrac = newnum+"/"+denominator;
return sumfrac;
}

public String multiply(Fraction f)
{
	int prodnum = this.numerator*f.numerator;
	int proddenom = this.denominator*f.denominator;
	String prodfrac = prodnum+"/"+proddenom;
	return prodfrac;
}
public String recip()
{
	String recip = denominator+"/"+numerator;
return recip;	
}
public String simplify()
{
	int newn = numerator;
	int newd = denominator;
	for (int i = denominator; i<0; i--)
	{
		if(denominator%i == 0 && numerator%i == 0)
		{
			newn = numerator/i;
			newd = denominator/i;
		}
	
	}
	return newn+"/"+newd;
	
	}

}
