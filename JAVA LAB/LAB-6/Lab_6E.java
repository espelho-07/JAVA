class Count{
	static int i=0;
	public Count(){
		i++;
	}

}
public class Lab_6E{
public static void main(String[] args) {
	Count Ob1=new Count();
	Count Ob2=new Count();
	Count Ob3=new Count();
	System.out.println("No Of Object Are"+Count.i);
  }
}