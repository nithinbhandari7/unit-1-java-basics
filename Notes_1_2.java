/*
Definitions to know - identifier, variable, literal, final, concatenation,
	variable declaration, assignment statement

Identifier (rules and conventions)
Identifier - function, class, interface, variable, or constant (anything you are naming)

Rules:
1. can't be a key word (a word that already has a defined meaning in java)
2. can include alphabetical characters, digits, underscores, and $
3. can begin with alphabetical characters, underscores, $

Convention:
1. use camelcase
2. class names and interface names start with a capital
3. variables and functions start with lowercase
4. constants are all caps
5. all identifier names should be meaningful

primitive data types - data that is stored directly in memory
reference type - a type that points to data (a location, reference, address is what is actually directly stored in memory)

8 primitive data types:
int - stores a integer
double - floating point type (can store a decimal)
boolean - true/false value
char - a single character (char literals are enclosed in ' ')
float 
long
short
byte

example declarations in code

literal vs. variable
	a literal is an ACTUAL value
	a variable STORES a value
	
 5 - literal int
 1.2 - literal double
 true - literal boolean
 'a' - literal char
 "hello" - literal string
 int x; - variable int
	
printing (values of) variables vs. printing literals
when we print a literal, simply the literal prints
when we print a variable, the value of the variable prints

concatenation - an operation performed with the +, a String operand, and any other type of operand
 
 int x = 4 + 6;	//x has the value of 10
 String stringX = "4" + "6";	//stringX has the value of "46"
 String result = x + "";	//result has the value of "10"
 String result2 = x + "4";	//result2 has the value of "104"


1.2 questions w/ a partner
*/
public class Notes_1_2 {
	public static void main(String[] args) {
		// variable declarations - allocates memory for a piece of data and names that piece of memory
		int x;
		double height;
		boolean isSenior;
		char letterGrade;
		String firstName;
		// assignment statement - gives a variable a value
		x = 1;
		height = 60.5;
		isSenior = true;
		letterGrade = 'J';
		firstName = "Laura";
	}
}