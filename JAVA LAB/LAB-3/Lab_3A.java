/*The marks obtained by a student in 5 different subjects are input through the 
keyboard.  
The student gets a division as per the following rules: 
I. Percentage above or equals to 60-first division 
II. Percentage between 50 to 59-second division 
III. Percentage between 40 and 49-Third division 
IV. Percentage less than 40-fail 
Write a program to calculate the division obtained by the student.*/


import java.util.Scanner;
public class Lab_3A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Marks Of Maths=");
        float Maths=sc.nextFloat();

        System.out.println("Enter Marks Of DSA=");
        float DSA=sc.nextFloat();

        System.out.println("Enter Marks Of OOPJ=");
        float OOPJ=sc.nextFloat();

        System.out.println("Enter Marks Of WD=");
        float WD=sc.nextFloat();

        System.out.println("Enter Marks Of CPC=");
        float CPC=sc.nextFloat(); 

        float Percentage=(((Maths+DSA+OOPJ+WD+CPC)/500)*100);

        System.out.println("Percentage You Got Is::"+Percentage);

        if(Percentage>=60){
            System.out.println("You Got FIRST Division");
        }else if(Percentage<=59 && Percentage>=50){
            System.out.println("You Got SECOND Division");
        }else if(Percentage<=49 && Percentage>=40){
            System.out.println("You Got THIRD Division");
        }else if(Percentage<40){
            System.out.println("You Are FAIL!!! Need HARD Work");
        }
    }
}