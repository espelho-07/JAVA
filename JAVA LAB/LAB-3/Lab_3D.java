//Write a program to check that the given number is prime or not.

import java.util.Scanner;
public class Lab_3D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number You Want To Check Is=");
        int Number=sc.nextInt();

        int count=0;

        for(int i=2;i<Number;i++){
            if(Number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("The Number You Entered "+Number+" Is Prime");
        }if(count!=0){
            System.out.println("The Number You Entered "+Number+" Is Not Prime");
        }
    }
}