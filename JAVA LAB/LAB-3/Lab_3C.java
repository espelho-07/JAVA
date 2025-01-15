//Write a program to find maximum no from given 3 no.(without if-else).

import java.util.Scanner;
public class Lab_1C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number=");
        int Number_1=sc.nextInt();

        System.out.println("Enter Second Number=");
        int Number_2=sc.nextInt();

        System.out.println("Enter Third Number=");
        int Number_3=sc.nextInt();

        int max=(Number_1 > Number_2 && Number_1 > Number_3) ? Number_1 : (Number_2 > Number_3 ? Number_2: Number_3);
        System.out.println("The maximum number is " + max);

    }
}