/*
terms to know - casting, widening, precedence

the casting operators (int) and (double) can be used to create a temporary 
value converted to a different data type

casting a double value to an int causes the digits to the right of the 
decimal point to be truncated

some code causes int values to be automatically cast (widened) to double values

challenge: what line of code would allow you to round any positive number to the nearest integer?

double a = 2.3;
int(a + 0.5)

challenge 2: what line of code would allow you to round any negative number to the nearest integer?

ints are stored using 4 bytes of memory.  An int value must be in the 
range Integer.MIN_VALUE to Integer.MAX_VALUE

If an expression would evaluate to an int outside of the allowed range, 
an integer overflow error occurs.  This results in an incorrect value within the allowed range
*/
public class Notes_1_5 
{
	public static void main(String[] args)
	{
		int a = 2;
		double b = 1.7;
		double c = a + a; // widening
		double d = 3;
		/*
		//DO NOT RUN - predict output
		double x = 2.8, y = 1.2;
		int a = 5, b = 4;
		
		System.out.println((int) x); 2
		System.out.println(x); 2.8
		System.out.println((int) y); 1
		System.out.println((double)a); 5.0
		System.out.println((int) x + y); 3.2
		System.out.println((int)(x + y)); 4
		System.out.println((double) a / b); 1.25
		System.out.println((double)(a / b)); 1.0
		System.out.println((int)(a / y)); 4
		System.out.println((int) x / a); 0
		*/
	}
}