/*
terms to know - arithmetic expression, assignment statement, arithmetic operator, ArithmeticException, precedence rules

 * Arithmetic Operators
 * 	+	addition
 * 	-	subtraction
 * 	*	multiplication
 * 	%	modular division (remainder division)
 * 				Examples:
 * 				5 % 6 = 5
 * 				6 % 6 = 0
 * 				0 % 3 = 0
 * 				12 % 5 = 2
 * 				13 % 5 = 3
 * 				# % n = [0, n-1]
 * 
 * - modular division by 0 creates arithmetic expression
 *	/ Division
 *		1. Integer Division - performed if both operands
 *			are of type integer - this could be literal or variable - 
 *			evaluates to the whole number only, meaning the remainder
 *			is truncated
 *				Examples:
 *				2 / 2 = 1
 *				3 / 2 = 1
 *				2 / 6 = 0
 *				2 / 4 = 0.0
 *		2. Floating Point Division - is performed when one or
 *			the other or both operands are of floating point
 *			type, this could be literal or variable - this functions
 *			the way that we would normally consider division to operate
 

	
	int x = 5, y = 7, z;
	double b = 1.0, c; 
	
	z = x / y;
	System.out.println(z);	// 0
	
	c = y / x;
	System.out.println(c);	// 1.0
	
	c = b / y;
	System.out.println(c);	// 0.14285
	
	c = x / 2;
	System.out.println(c);	// 2.0
	
	c = x / 2.0;
	System.out.println(c);	// 2.5
	
	z = y % x;
	System.out.println(z);	// 2
	
	z = x % y;
	System.out.println(z);	// 5

*/
public class Notes_1_3 {

}