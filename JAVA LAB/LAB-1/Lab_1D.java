/*Write a program to get 2 numbers from the user and print the sum of two numbers 
Using Scanner class*/

import java.util.Scanner;
public class Lab_1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number A=");
        float A=sc.nextFloat();

        System.out.println("Enter Number B=");
        float B=sc.nextFloat();

        System.out.println("A+B="+(A+B));

    }
}


/*Write a program to get 2 numbers from the user and print the sum of two numbers 
Using Command Line*/

/*public class Lab_1D{
    public static void main(String[] args){
        float A=Float.parseFloat(args[0]);
        float B=Float.parseFloat(args[1]);

        System.out.println("A+B="+(A+B));
    }
}*/