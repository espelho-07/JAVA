//Write a program to check whether a number is even or odd.

import java.util.Scanner;
public class Lab_3B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Number=");
        int Number=sc.nextInt();

        if(Number%2==0){
            System.out.println("Your Entered Number Is "+Number+" That Is EVEN");
        }else{
            System.out.println("Your Entered Number Is "+Number+" That Is ODD");
        }
    }
}