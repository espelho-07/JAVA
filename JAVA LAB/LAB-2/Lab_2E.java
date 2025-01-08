import java.util.Scanner;
public class Lab_2E{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number A");
		int A=sc.nextInt();

		System.out.println("Enter Number B");
		int B=sc.nextInt();

		System.out.println("Enter Number C");
		int C=sc.nextInt();

		if(A>B){
			if(B>C){
				System.out.println("A Is Largest");
			}
			else{
				System.out.println("C Is Largest");
			}
		}else if(B>C){
				System.out.println("B Is Largest");
			}else{
				System.out.println("C Is Largest");
			}
		}
	}

