import java.util.Scanner;
class Circle{
	double radius;

	public Circle(double radius){
		this.radius=radius;
	}
	public void area(){
		double area=Math.PI*radius*radius;
		System.out.println("The Area Of Circle Is:-"+area);
	}
}

public class Lab_6A{
	public static void main(String[] args){
		Circle c1=new Circle(5);
		c1.area();         
	}
}