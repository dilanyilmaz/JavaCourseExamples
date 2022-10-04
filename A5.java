import java.util.Scanner;

//tam olarak bitmedi düzenleme yapmam lazım
 public class A5 {
	public static void main(String[] args) {
	int[] value = {20,8,4,12,18};

	System.out.println(gcd(value));
	/*
		for(int i=0 ; i<name.length-1 ; i++) 
			{
				System.out.println("ogrenci adi : ");
				String name1 = input.next();
				name[i]=name1;
				
				System.out.println("ogrenci sinav puani : ");
				int skore = input.nextInt();
				puan[i]=skore;
				
			}
			
		for(int i=0 ; i<number-1 ; i++) 
			{
				for(int j=i+1 ;j<number-1 ; j++)
				{
					if(puan[i]<puan[j])
					{
						int temp = puan[j];
						String tempN = name[j];
						
						puan[j] = puan[i];
						name[j] = name[i];
						
						puan[i] = temp ;
						name[i] = tempN;
					}

				}
			}
			System.out.println("Ad\tSkore");
		for (int i = 0; i<name.length-1; i++) 
		 { 	
			System.out.println(" ----------");
			System.out.println("|"+name[i]+"\t"+puan[i]+"|");
			System.out.println(" ----------");
		 }
	*/}
		public static int gcd(int[] numbers){
			int temp=1;

				int a = numbers[0];
				int b = numbers[1];
				int c = numbers[2];
				int d = numbers[3];
				int e = numbers[4];
				while(a%2!=0){
					if(a%2==0&&b%2==0&&c%2==0&&d%2==0&&e%2==0){
					temp*=2;
					a/=2;
					b/=2;
					c/=2;
					d/=2;
					e/=2;
					}
				}
				while(a%3!=0){
				if(a%3==0&&b%3==0&&c%3==0&&d%3==0&&e%3==0){
				temp*=3;
				a/=3;
				b/=3;
				c/=3;
				d/=3;
				e/=3;				
						
				}
				}
				while(a%5!=0){
				if(a%5==0&&b%5==0&&c%5==0&&d%5==0&&e%5==0){
				temp*=5;
				a/=5;
				b/=5;
				c/=5;
				d/=5;
				e/=5;
				}
				}
			return temp;
		}
}