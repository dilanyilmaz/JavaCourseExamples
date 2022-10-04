 import java.util.Scanner; // program uses Scanner
 public class bnm {
 public static void main(String[] args) {
	
		//logaritma 10 tabanında sayının kaçıncı old bulmamaız lazım eğer count değerş kullanmak istemiyorsak	
        Scanner input = new Scanner(System.in); 
		int digit=1000000000;
		System.out.println("iki basamaklı sayı : ");
        int sayi10=input.nextInt();  
		int count=10;
		int sayi2=0;
		
		while(digit>=1){
			if(sayi10/digit<=1)
			{
				sayi2+=(sayi10/digit==1?Math.pow(2,count-1):0);
				sayi10=sayi10-(sayi10/digit)*digit;

			}
			else
			{
				System.out.println("Hane Hatası");
				break;
			}
			
			digit/=10;
			count--;
		}
		System.out.println(sayi2);
 }
 }