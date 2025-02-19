import java.util.Scanner;
//class Bank Account
class BankAccount{
	int AccountNo;
	double AccountBalance;
	String AccountHolderName;
	double MobileNo;
//Constructor For Bank Account
	public BankAccount(int AccountNo,double AccountBalance,String AccountHolderName,double MobileNo){
		this.AccountNo=AccountNo;
		this.AccountBalance=AccountBalance;
		this.AccountHolderName=AccountHolderName;
		this.MobileNo=MobileNo;
	}
//Method For Credit
	public double Credit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Credit=");
		int c = sc.nextInt();
		this.AccountBalance=this.AccountBalance+c;
		System.out.println(this.AccountBalance);
		return this.AccountBalance;
		
	}
//Method For Debit
	public double Debit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Debit=");
		int d = sc.nextInt();
		if (d>this.AccountBalance){
			System.out.println("Insufficient Balance");
			return this.AccountBalance;
			
		}
		this.AccountBalance=this.AccountBalance-d;
		if (this.AccountBalance<1000) {
			System.out.println("You Cannot Withdraw The Ammount");
			return this.AccountBalance + d;
		}
		System.out.println(this.AccountBalance);
		return this.AccountBalance;
		
	}
}
//Main
public class Lab_6C{
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1,2345,"jenil",98768345);
		BankAccount b2=new BankAccount(2,2344,"jenil",98768323);
		BankAccount b3=new BankAccount(3,2343,"jenil",98234323);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account No.=");
		int Acc = sc.nextInt();
		//For Account 1
		if(Acc==1){
			System.out.println("Enter 1-Credit  2-Debit :-");
	 	int i = sc.nextInt();
		if(i==1 || i==2){
			if(i==1){
	 		b1.Credit();
	 	}
	 	else if(i==2){
	 		b1.Debit();
	 	}
		 sc.close();
		}
		}else{
			System.out.println("Invalid Input");
		}
	 	
		//For Account 2
		if(Acc==2){
			System.out.println("Enter 1-Credit  2-Debit :-");
	 	int i = sc.nextInt();
	 	if(i==1 || i==2){
			if(i==1){
	 		b2.Credit();
	 	}
	 	else if(i==2){
	 		b2.Debit();
	 	}
		 sc.close();
		}
		}else{
			System.out.println("Invalid Input");
		}
		//For Account 3
		if(Acc==3){
			System.out.println("Enter 1-Credit  2-Debit :-");
	 	int i = sc.nextInt();
	 	if(i==1 || i==2){
			if(i==1){
	 		b3.Credit();
	 	}
	 	else if(i==2){
	 		b3.Debit();
	 	}
		 sc.close();
		}
		}else{
			System.out.println("Invalid Input");
		}
		
	}
}
