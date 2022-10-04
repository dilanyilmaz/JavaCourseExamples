 import java.util.Scanner; 
 public class Q3 {
 public static void main(String[] args) {
	 
	  	 Scanner input = new Scanner(System.in);
		 String[] d1 = new String[80];
		 d1= input.nexln;
		 int d2Index=0;
		 String temp;
		 for(int i=0;i<6;i++){
			 
			 boolean found = false;
			 for(int j=0;j<i;j++){
					 temp=d1[i];
					 d1[i]=d1[j];
					 d1[j]=temp;
			 }
		 }
			 for(int i=0;i<d1.length;i++){
			 System.out.print(d1[i]);  
		 }
	 
		 int[] d1 = new int[6];
		 int d2Index=0;
		 int temp;
		 for(int i=0;i<6;i++){
			 d1[i] = input.nextInt();
			 boolean found = false;
			 for(int j=0;j<i;j++){
				 if(d1[i]<=d1[j]){
					 found=true;
					 temp=d[i];
					 d[i]=d[j];
					 d[j]=temp;
				 }
			 }
		}
	 
		 System.out.print("dizinin boyutu nedir");
		 int diziBoyut = input.nextInt();
		 
		 int [] degerler= new int[diziBoyut];
		 int [] yeniDegerler= new int[diziBoyut];
		 for(int i=0;i<degerler.length;i++){
			 System.out.print("diziye eklemek istediginiz deger");
			  degerler[i] = input.nextInt();
		 }
		 yeniDegerler[0]=degerler[0];
		 
		 for(int i=0;i<degerler.length-1;i++){
				for(int b=0;i<yeniDegerler.length;b++){
					if(yeniDegerler[b]==degerler[i]){
						continue;
					}
					else if(yeniDegerler[b]!=degerler[i]){
						yeniDegerler[b]=degerler[i];
						break;
					}
				}
		 }
		 //Tekrar eden sayıları bulup teke düşürüyorum.
		 for(int i=0;i<=yeniDegerler.length;i++){
			 System.out.println(yeniDegerler[i]);
		 }
	}
}