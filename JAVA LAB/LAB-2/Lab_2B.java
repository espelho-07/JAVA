/*Write a program to create basic calculator by getting 2 numbers and 1 string (operation) 
from the user and apply the operation given in a string on the given number*/

import java.util.Scanner;
public class Lab_2B{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number A");
		float A=sc.nextFloat();

		System.out.println("Enter Number B");
		float B=sc.nextFloat();

		System.out.println("Enter String");
		String s=sc.next();

		if(s.equals("+")){
			System.out.println("A+B="+(A+B));
		}
		else if(s.equals("-")){
			System.out.println("A-B="+(A-B));
		}else if(s.equals("*")){
			System.out.println("A*B="+(A*B));
		}else if(s.equals("/")){
			System.out.println("A/B="+(A/B));
		}
	}
}