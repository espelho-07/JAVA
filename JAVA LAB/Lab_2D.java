import java.util.Scanner;
public class Lab_2D{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Celcius=");
		float C=sc.nextFloat();

		System.out.println("Temperature In Farehniet::"+(C*(9/5)+32));
	}
}

/*import java.util.Scanner;
public class Lab_2D{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Farehniet=");
		float F=sc.nextFloat();

		System.out.println("Temperature In Celcius::"+((F-32)*(5/9)));
	}
}*/