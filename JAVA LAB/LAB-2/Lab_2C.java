// Write a program to calculate the area of Rectangle.

import java.util.Scanner;
public class Lab_2C{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Length=");
		float Length=sc.nextFloat();

		System.out.println("Enter Breadth=");
		float Breadth=sc.nextFloat();

		System.out.println("Area Of Rectangle Is::"+(Length*Breadth));
	}
}