/*Write a program that reads a number in meters, converts it to feet, and displays the 
result.*/

import java.util.Scanner;
public class Lab_1E{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Number In Meter=");
        float Meter=sc.nextFloat();

        float Feet=Meter*3.28084f;
        System.out.println("The Transformation In Feet Is="+Feet);
    }
}