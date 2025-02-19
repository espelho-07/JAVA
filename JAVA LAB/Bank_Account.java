import java.util.Scanner;
class BankAccount{
	int AccountNo;
	double AccountBalance;
	String AccountHolderName;
	double MobileNo;
	public BankAccount(int AccountNo,double AccountBalance,String AccountHolderName,double MobileNo){
		this.AccountNo=AccountNo;
		this.AccountBalance=AccountBalance;
		this.AccountHolderName=AccountHolderName;
		this.MobileNo=MobileNo;
	}
	public double Credit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Credit=");
		int c = sc.nextInt();
		this.AccountBalance=this.AccountBalance+c;
		return this.AccountBalance;
	}
	public double Debit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Debit=");
		int d = sc.nextInt();
		if (d<this.AccountBalance){
			System.out.println("Insufficient Balance");
			
		}
		this.AccountBalance=this.AccountBalance-d;
		if (this.AccountBalance<1000) {
			System.out.println("You Cannot Withdraw The Ammount");
		}
		return this.AccountBalance;
	}
}
public class Bank_Account{
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1,2345,"jenil",987683323);
		b1.Credit();
		b1.Debit();
	}
}