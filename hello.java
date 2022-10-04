 import java.util.Scanner; // program uses Scanner
 public class hello {
 public static void main(String[] args) {
	int accountNumber=0;
	int beginningBalance=0;
	int charges;
	int credits=0;
	Scanner input = new Scanner(System.in); 
	while(accountNumber!=-1){
		System.out.println("accountNumber is : " );
		accountNumber= input.nextInt();	
		System.out.println("beginningBalance is : " );
		beginningBalance= input.nextInt();	
		System.out.println("charges is : ");
		charges= input.nextInt();	
		System.out.println("credits is : ");
		credits= input.nextInt();	
		//System.out.println((beginningBalance+charges-credits)>credits ? ,
		//"Credit limit exceeded","Credit not limit exceeded")
		if((beginningBalance+charges-credits)>credits)
		{
			System.out.println("Credit limit exceeded");
			break;
		}
	}
 }
}