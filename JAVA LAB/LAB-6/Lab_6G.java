import java.util.Scanner;
class VovelCount{
	String Sentence;
}
public class Lab_6G{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			while(true){
			System.out.println("Enter The Sentence:-");
			String Sentence=sc.nextLine();
			if (Sentence.equals("quit")) {
				break;
			}
			int A=0;
			int E=0;
			int I=0;
			int O=0;
			int U=0;

			
			for (int i=0;i<Sentence.length() ;i++ ) {
				if (Sentence.charAt(i)=='a' || Sentence.charAt(i)=='A') {
					A++;
				}if (Sentence.charAt(i)=='e' || Sentence.charAt(i)=='E') {
					E++;
				}if (Sentence.charAt(i)=='i' || Sentence.charAt(i)=='I') {
					I++;
				}if (Sentence.charAt(i)=='o' || Sentence.charAt(i)=='O') {
					O++;
				}if (Sentence.charAt(i)=='u' || Sentence.charAt(i)=='U') {
					U++;
				}
				
			}
			System.out.println("Total Vowels A Are:-"+A);
			System.out.println("Total Vowels E Are:-"+E);
			System.out.println("Total Vowels I Are:-"+I);
			System.out.println("Total Vowels O Are:-"+O);
			System.out.println("Total Vowels U Are:-"+U);
		}
    }

}