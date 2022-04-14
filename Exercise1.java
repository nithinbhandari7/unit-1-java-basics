import java.util.*;
import java.util.Scanner;


public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double triangleBase;
		double triangleHeight;
		double rectHeight;
		double rectWidth;
		double circleRadius;
		double triangleArea;
		double rectArea;
		double circleArea;
		final double PI = 355/113.0;
		
		System.out.print("Please enter a base for your triangle: ");
		triangleBase = sc.nextDouble();
		System.out.print("Please enter a height for your triangle: ");
		triangleHeight = sc.nextDouble();
		System.out.print("Please enter a height for your rectangle: ");
		rectHeight = sc.nextDouble();
		System.out.print("Please enter a width for your rectangle: ");
		rectWidth = sc.nextDouble();
		System.out.print("Please enter a radius for your circle: ");
		
		circleRadius = sc.nextDouble();
		rectArea = rectHeight * rectWidth;
		triangleArea = (triangleHeight * triangleBase) / 2;
		circleArea = PI * (circleRadius * circleRadius);
		
		rectArea = ((int)((rectArea * 100) + 0.5)) / 100.0;
		triangleArea = ((int)((triangleArea * 100) + 0.5)) / 100.0;
		circleArea = ((int)((circleArea * 100) + 0.5)) / 100.0;
		
		System.out.println("Shape           Area");
		System.out.println("Triangle        " + triangleArea);
		System.out.println("Rectangle       " + rectArea);
		System.out.println("Circle          " + circleArea);
	}
}
