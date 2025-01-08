import java.util.Scanner;
public class Lab_2C{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Length");
		int Length=sc.nextInt();

		System.out.println("Enter Breadth");
		int Breadth=sc.nextInt();

		System.out.println("Area Of Rectangle Is::"+(Length*Breadth));
	}
}