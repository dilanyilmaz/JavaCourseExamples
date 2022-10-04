import java.util.Scanner; 
import java.util.Arrays;
 //7.26
 
 public class V1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		boolean[] ucakKoltuk=new boolean[11];
		Arrays.fill(ucakKoltuk, Boolean.FALSE);//tüm koltuklar false olur 
		int i=0;
	    while(i<15){
			System.out.println("E : for Economie or F : First Class");
			String User = input.next();
		
		if(User.equals("E")){
			int temp=Ekonomoni(ucakKoltuk);
				if(temp==0){
					System.out.println("First Class ta ucmak ister misin");
					String FCAnswer = input.next();
						if(User.equals("Y")){
							int tempA=FirstClass(ucakKoltuk);
						
								if(tempA==0){
									System.out.println("Ucakta yer yok.");
									break;
								}
								else{
									System.out.println(tempA+"numaralı koltugunuz ayrılmıstır");
									ucakKoltuk[tempA]=true;
								}
						
						}
						else if(User.equals("N")){
							System.out.println("3 saat sonra başka bir uçak için yer ayırta bilirsiniz");
							break;
						}
				}
				else if(temp>=6){
					System.out.println(temp+"numaralı koltugunuz ayrılmıstır");
					ucakKoltuk[temp]=true;
				}
		}
		else if(User.equals("F")){
			int tempF=FirstClass(ucakKoltuk);
			if(tempF==0){
				System.out.println("3 saat sonra başka bir uçak için yer ayırta bilirsiniz");
			}
			else{
				ucakKoltuk[tempF]=true;	
				System.out.println(tempF+"numaralı koltuk ayrılmıştır");
			}
		}
		else {
			System.out.println("gecerli bir deger giriniz E or F");
		}
			i++;
		}
		
	}
	
	//bir metot bir işlem yapmalıdır.
	public static int FirstClass(boolean[]ucakKoltuk){
	int koltukNo=0;
	for(int i=1 ; i<=5 ; i++){
		if(i<=5){
			if(ucakKoltuk[i]==false){
				koltukNo=i;
			}
		}
	}
	return koltukNo;
	}
	public static int Ekonomoni(boolean[]ucakKoltuk){
	int koltukNo=0;
	for(int i=6 ; i<=10 ; i++){
			if(ucakKoltuk[i]==false){
				koltukNo=i;
			}
		}
		return koltukNo;
	}
	
 }