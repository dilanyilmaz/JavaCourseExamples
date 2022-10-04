 import java.util.Scanner; 
 public class Q2 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
	 System.out.print("5 basamaklı değeri giriniz ");
	 int number = input.nextInt();
	 int numberBas;
	 int numberOrta;
	 numberBas=number/1000;//bas değeri elde etme
	 
	 numberOrta=number/100;
	 numberOrta=number%numberOrta;//son değeri elde etme
	 
     //numberOrta%10//son değerin eldesi
	 System.out.println(numberOrta/10);
	 System.out.println(numberOrta%10);
	 
	 int value= (numberOrta%10)*10+(numberOrta/10);
	 //tekrardan sayıyı elde etme
	 if(numberBas==value){
		System.out.println("it’s a palindrome"); 
	 }
	 else
	 {
		 System.out.println("it’s not a palindrome"); 
	 }
   }
 }