import java.util.Scanner;
//7.17
//tam olarak bitmedi düzenleme yapmam lazım
 public class A4 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("ogrenci sayisi : ");
	int number = input.nextInt(); 
	
	String[] name = new String[number];
	int[] puan = new int[number];

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
		 
	}
}