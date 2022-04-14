/* this is a block comment
Topics to cover:

basic program layout
comments - are skipped by a computer
class header
main method header
print vs. println
escape characters
identifying errors - types of errors
	1. compilation error - syntax and semantic
	2. run time error - exception - program runs to a certain point, then an exception is thrown
	3. logic error - program runs fully, but doesn't behave in the intended way (hardest error to fix)
predict the output
fix me
 */
/*
public class Notes_1_1 { // this is a class header
	//public - access modifier - accessible from any class
	public static void main(String[] args) {
		// void - return type - this function doesn't return anything
		// anything inside the parentheses is the parameter list - what the function 
			// needs in order to do its job
		System.out.println("Welcome to APCS");
		System.out.print("Its great to ");
		System.out.println("have you here");
		/*
		  escape characters:
		  \n - new line
		  \t - tab
		  \b - backspace
		  \\ - prints \
		  \' - prints '
		  \" - prints "
		
		System.out.println("This\tis a \"crazy\"\nline/nof text\\!");
		/*
		  
		  This	is a "crazy"
		  line/nof text\!
		 

	} // these braces define the body of the main method (function)
} // these braces define the class body
*/

/*
predict the output:
System.out.println("This\tis a \"crazy\"\nline/nof text\\!");
fix me:
*/
public class Notes_1_1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.print("Welcome to APCS :)");
	}
}

 