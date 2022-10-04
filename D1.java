 import java.util.Scanner; 
 // Random sınıfının kütüphanesi
import java.util.Random;
 
 public class D1 {
 public static void main(String[] args) {
		 String[] desteler = {"maca","kupa","karo","sinek"};
	 	 int[] maca = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		 int[] kupa = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		 int[] karo = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		 int[] sinek= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		 
        Random rastgele = new Random();
		int count=1;
		String[] bulunanDesteler=new String[4];
        int desteCount=0;
		int tryCount=0;
		while(desteCount<=4){
		int desteSec = rastgele.nextInt(desteler.length);
		//int desteSec1 = rastgele.nextInt(maca.length);
		//int desteSec2 = rastgele.nextInt(kupa.length);
		//int desteSec3 = rastgele.nextInt(karo.length);
		//int desteSec4 = rastgele.nextInt(sinek.length);
			if(desteSec==0){
				count++;
				for(int k=0;k<bulunanDesteler.length;k++){
					if(bulunanDesteler[k]=="maca"){
						tryCount++;
					}
					else{
						desteCount++;
						break;
					}
				}
				System.out.println("maca");
			}
			else if(desteSec==1){
				count++;
				for(int k=0;k<bulunanDesteler.length;k++){
					if(bulunanDesteler[k]=="kupa"){
						tryCount++;
					}
					else{
						desteCount++;
						break;
					}
				}
				System.out.println("kupa");
			}
			else if(desteSec==2){
				count++;
				for(int k=0;k<bulunanDesteler.length;k++){
					if(bulunanDesteler[k]=="karo"){
						tryCount++;
					}
					else{
						desteCount++;
						break;
					}
				}
				System.out.println("karo");
			}
			else if(desteSec==3){
				count++;
				for(int k=0;k<bulunanDesteler.length;k++){
					if(bulunanDesteler[k]=="sinek"){
						tryCount++;
					}
					else{
						desteCount++;
						break;
					}
				}

				System.out.println("sinek");
			}
		}
  }
 }