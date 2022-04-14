import java.util.*;
import java.util.Scanner;

public class SampleFreeResponse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students;
		int groupSize;
		int numGroups;
		int remainder;
		System.out.print("Please enter the total number of students: ");
		students = sc.nextInt();
		System.out.print("Please enter the group size: ");
		groupSize = sc.nextInt();
		numGroups = students / groupSize;
		remainder = students % groupSize;
		System.out.println("The number of groups that can be made would be " + numGroups);
		System.out.println("The number of leftover students would be " + remainder);
	}
}