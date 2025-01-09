//3-Write a java program to take user input ::  i. through Command Line Argument.
//Here Dont Click Enter After compiling as Program Is Compiled Write::java Lab_1C 10 20 This We Enter Value Of Arguments

public class Lab_1C{
    public static void main (String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        System.out.println("First Argument="+a);
        System.out.println("Second Argument="+b);

    }
}



//3-Write a java program to take user input :: ii. through Scanner class.

import java.util.Scanner;
public class Lab_1C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number A");
		int A=sc.nextInt();

        System.out.println("The Number You Enter Is="+A);

    }
}