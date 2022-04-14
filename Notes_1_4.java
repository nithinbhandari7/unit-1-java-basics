/*
Terms to know - compound assignment operator, increment operator, decrement operator
 * Compound Assignment Operators
 * 
 * 	+=		x = x + 2;		x += 2;
 * 	-=		x = x - 9;		x -= 9;
 * 	*=		x = x * 4;		x *= 4;
 * 	/=		x = x / y;		x /= y;
 * 	%=		x = x % z;		x %= z; 
 * 
	int x = 3 ;
	x *= 6 + x
	//value of x after this statement? 27
	//what does that tell us?
	//precedence rules
	
	EXAMPLE SET 1	
	int a = 7;
	int b = 2;
	int c = 6;
	a += 5;
	b *= a;
	b /= c;
	System.out.print(a);	// 12
	System.out.print(b);	// 4
	System.out.print(c);	// 6
	
	int x = 4;
	x += 7 * 3;
	x -= 5 / 4;
	
	System.out.println(x)	// 24
	
	


 * 	++ increment operator
 * 	--	decrement
 * 
 * post increment: x++; - the increment occurs after the current operation
 * pre increment: ++x;	- the increment occurs before the current operation

	EXAMPLE SET 2
	int x = 8, y;
	
	System.out.println(x); 		// 8
	System.out.println(++x); 	// 9
	System.out.println(x); 		// 9
		
	x = 8;
	
	System.out.println(x); 		// 8
	System.out.println(x++); 	// 8
	System.out.println(x); 		// 9
	
	x = 42;
	y = x++;
	
	
	System.out.println(x); 		// 43
	System.out.println(y); 		// 42
	
	x = 42;
	y = ++x;
	
	System.out.println(x); 		// 43
	System.out.println(y); 		// 43



*/
public class Notes_1_4 {
	public static void main(String[] args) {

	}
}