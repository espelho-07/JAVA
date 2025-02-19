 import java.util.Scanner;
class complex{
	double real;
	double  imaginary;
	public complex(double real,double  imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public complex(){
		this.real=0;
		this.imaginary=0;
	}
	public void add(double real,double  imaginary){
		this.real+=real;
		this.imaginary+=imaginary;
		System.out.println(this.real+"+i"+this.imaginary);
	}
}
public class Lab_6D{
	public static void main(String[] args) {
		complex num1=new complex(1,2);
       num1.add(4,3);
		
		complex num2=new complex();
	}
}
