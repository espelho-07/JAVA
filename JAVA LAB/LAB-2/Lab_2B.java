import java.util.Scanner;
public class Lab_2B{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number A");
		int A=sc.nextInt();
		System.out.println("Enter Number B");
		int B=sc.nextInt();
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