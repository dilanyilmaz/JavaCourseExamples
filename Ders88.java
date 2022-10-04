 import java.util.Scanner;
 public class Ders88 {
 public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("x1 sayi gir : ");
		int x1=input.nextInt();
		System.out.println("x2 sayi gir : ");
		int x2=input.nextInt();
		int x3=input.nextInt();
		System.out.println("x2 sayi gir : ");
		int x4=input.nextInt();
		System.out.println("y1 sayi gir : ");
		int y1=input.nextInt();
		System.out.println("y2 sayi gir : ");
		int y2=input.nextInt();
		int y3=input.nextInt();
		System.out.println("y2 sayi gir : ");
		int y4=input.nextInt();
		if(((y2-y1)/(x2-x1))==((y2-y1)/(x2-x1)) ){
				if(x1/x2==x3/x4 && y1/y2==y3/y4){ 
					System.println("paraleldir")
				}
		}
		else{
			System.println("paralel değildir")
		}
		/*Scanner input = new Scanner(System.in); 
		System.out.println("x1 sayi gir : ");
		int x1=input.nextInt();
		System.out.println("x2 sayi gir : ");
		int x2=input.nextInt();
		System.out.println("y1 sayi gir : ");
		int y1=input.nextInt();
		System.out.println("y2 sayi gir : ");
		int y2=input.nextInt();
		if(x1==x2){
			System.println("paraleldir")
		}
		else if(y1==y2){
			System.println("paraleldir")
		}
		*/
		
		
	    /*Scanner input = new Scanner(System.in); 
		System.out.println("bir sayi gir : ");
		int number1=input.nextInt();
		System.out.println("bir sayi gir : ");
		int number2=input.nextInt();	
		
		else if(number1>number2){
			System.out.println("1");
		}
		else if(number2>number1){
			System.out.println("-1");
		}
		else{
			System.out.println("0");
		}*/			
		/*
		System.out.println("bir sayi gir : ");
		int number=input.nextInt();
		
		int encryotedNumber = 0;
		for(int digit = 1000; digit>=1; digit/=10)
		{
			int digitOfNumber = number / digit;
			number = number -((number / digit)* digit);
			int encryotedDigit=(digitOfNumber+7)%10;
			encryotedNumber+=encryotedDigit*digit;
		}
		System.out.println(encryotedNumber);
		int first2Digits=encryotedNumber/100;
		int last2Digits=encryotedNumber-(first2Digits*100);
		int swappedNumber=last2Digits*100+first2Digits;
		System.out.println(swappedNumber);
		*/

 }
 }