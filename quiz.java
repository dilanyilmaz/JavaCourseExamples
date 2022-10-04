 import java.util.Scanner;
 public class quiz {
 public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("5 basamaklı bir sayı giriniz: "); 
	int x = input.nextInt(); 
	if(x<10000||x>=1000){
		System.out.print((x/10000)+" ");
		 if (x%1000!=0)
			System.out.print((x/1000)+" ");
		   if(x%100!=0)
				System.out.print(x/100+" ");
			  if(x%10!=0)	
					System.out.print(x/10+" ");
	}
	else if(x%1000!=0){
			if(x%100!=0)
				if(x%10!=0)	
					System.out.print(x%10 +" ");
	}
	else if(x%100!=0){
				if(x%10!=0)	
					System.out.print(x%10 + " ");
	}
	else if(x%10!=0)	{
					System.out.print(x%10 + " ");
	}
 }
}