import java.util.Scanner; 
 
 public class T{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("sayi 1-100 arasında mi");
		String oyunStart = input.next();
		String oyunCevap;
		if(oyunStart .equals("y")){
			boolean oyun=false;
				int x=50;
				int y=100;
				int tahmin=0;
				System.out.println("sayi "+(y/2)+" den kucuk mu buyuk mu? (k-b)");
				String oyunContinue = input.next();
			
			while(!oyun){	
				if(oyunStart .equals("yes"))
				{
					System.out.println("tahmin ettigin sayi"+x);
					System.out.println("oyun sona erdi...");
					break;
				}
				else{
					if(oyunContinue .equals("k")){
						 tahmin = (int)(Math.random()*(y/2));
						 System.out.println("sayi "+tahmin+" mi? (y-n)");
						 oyunCevap = input.next();
						 if(oyunCevap .equals("y"))
							 break;
						 else
							 continue;
					}
					else if(oyunContinue .equals("b")){
						 tahmin = (int)(Math.random()*(x-y))+y;
						 System.out.println("sayi "+tahmin+" mi? (y-n)");
						 oyunCevap = input.next();
						 if(oyunCevap .equals("y"))
							 break;
						 else
							 continue;
					}
					else{
						System.out.println("gecerli bir deger giriniz");
					}
				}
			}
		}
		else{
			System.out.println("geceri bir cevap giriniz");
		}
	}
 }