public class PartnerPractice
{
	public static void main(String[] args)
	{
		//PART 1
		//predict the output in the comment next to the lines below
		char a = 'b';
		char b = 'c';
		
		System.out.println(a); // b
		System.out.println('a'); // a
		System.out.println(b); // c
		System.out.println('b'); // b
		System.out.println("a"); // a
		
		a = b;
		System.out.println(a); // c
		
		String greeting = "hi";
		int num = 10;
		
		System.out.println(num + 1); // 11
		System.out.println(greeting + 1); // "hi1"
		System.out.println(num + greeting); // "10hi"
		System.out.println("The value is " + num); // "The value is 10"
		System.out.println("the value is " + greeting); // "The value is hi"
		
		/*
		PART 2
		for each of the identifiers below, either describe why it is illegal, 
			or state that it is legal
		
		double _number; legal 
		int $a; - legal
		class Notes1.3 - illegal - can't use decimals/periods
		class Notes 1_3 illegal - can't have space
		final int NUM_STUDENTS - legal
		boolean 2legit; illegal - can't start with number
		 */
		
		//PART 3
		//predict the exact output of the lines below 
			//(respect if you know what the quote is from ;))
		System.out.print("\"Are you an angel?\n");
		System.out.println("I've heard the deep space pilots talk about them.");
		System.out.print("\tThey live on the moons of lego, I think.\"");
		/*
		
		"Are you an angel?
		I've heard the deep space pilots talk about them.
			They live on the moons of lego, I think."
		
		
		/*
		PART 4
		Write a variable declaration (with appropriate type and name), for each
		of the following data descriptions.  Also give an example value for each
		piece of data.
		
		1. A student ID number
		2. Ounces of water drank in a day
		3. The current year
		4. A student's passing status in a class
		5. A book title
		6. A person's number of siblings
		7. A person's max back squat
		8. A student's SAT score
		
		int studentId = 225514;
		double ouncesOfWater = 1.9;
		int currentYear = 2021;
		boolean passingStatus = True;
		String bookTitle = "Harry Potter";
		int numberOfSiblings = 1;
		double maxBackSquat = 40.1;
		int SatScore = 1600;
		 */

	}
}