 import java.util.Scanner; // 1.2.34 Three-sort.

 public class HSO {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
	 System.out.print("bir sayı değeri giriniz: ");
	 int a = input.nextInt();
	 System.out.print("ikinci değeri giriniz: ");
	 int b = input.nextInt();
	 System.out.print("ücüncü değeri giriniz: ");
	 int c = input.nextInt();
		if(Math.max(a,b)==a){
			System.out.println("Sayının maximum değeri: "+Math.max(a,c));
			System.out.println("Sayının minimum değeri: "+Math.min(b,c));
		}
		else if(Math.max(a,b)==b){
			System.out.println("Sayının maximum değeri: "+Math.max(b,c));
			System.out.println("Sayının maximum değeri: "+Math.min(a,c));
		}
		
	 }
 }