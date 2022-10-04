 import java.util.Scanner; // program uses Scanner

 public class Welcome {
 public static void main(String[] args) {
	 
		 Scanner input = new Scanner(System.in); 
		 //the biggest number finder program
		 int i=0;
		 int counter =0 ; 
		 int largers =0 ;
		 int m=-999999999;
		 while(counter<10){
			System.out.println("NUMBER : ");
			i= input.nextInt();	
			if(i>m){
				counter++;
				continue;
				
			}
			else{
				i=m;
				counter++;
			}
				
		 }
		 
		 System.out.println("largest number is : " + i);
		 System.out.println("number counter is : " + counter);
	 
		 //Program to calculate net salary.
		 
		 int man=0 ;
		 double maas;
		 double kesinti;
		 Scanner input = new Scanner(System.in);   
		 System.out.println("maaşınız ne kadar");	
		 maas = input.nextInt();
			 if(maas<=30000){
				kesinti=(maas*15)/100;
				System.out.println("kesilen maas : "+ kesinti);
			 }
			 else if(maas>30000){
				 kesinti=((((maas-30000)*20)/100)+((30000*15)/100));
				 System.out.println("kesilen maas : "+ kesinti);
			 }
	 
	 
		 int sayi=1;
		 System.out.println("n\tn^2\tn^3\tn^4");
		 while(sayi<=7){
			 int carpim=1;
			 int i = 1;
			while(i<=5){
				carpim*=sayi;
				System.out.print(carpim + "\t");
				i++;
			}
			System.out.println();
			sayi++;
		 }
	   
	   //----------------------------------------
		int mil ;
		int total = 0;
				
		while (mil != -1) 
		{
			System.out.println("kaç mil ");	
			mil=input.nextInt(); 
			System.out.println("kaç galon ");	
			int galon=input.nextInt(); 
					
			int yol = mil /galon;
			mil++;
			total += yol;
			System.out.println("Yol is: "+ yol+" %d and total is %d\n" + total);
		} 

		//----------------------------------------
		int x=2;
		int total=0;
		while(x<=10){
			 int y=+2;
			 y=x++ +2;
			 total += y;
			 System.out.printf("Y is : %d and total is %d\n",y,total);
		}
	
		int sayi=1;
		int toplam=0;
		while(sayi<=10){
			toplam+=sayi++;
		}
		System.out.print(toplam);


		System.out.print(not>=60 ? "geçti":"kaldı");
		System.out.println("kaç ürün alacaksın");	
		int not=input.nextInt(); 
		for(;not!= -1;){
			 System.out.print("xxx");
			 System.out.println("kaç ürün alacaksın");	
			 not=input.nextInt();
		}
		//---------------------------------------- 
	 
		int a=5;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		// System.out.println(++a++);
		System.out.println(a++ + ++a);*/
		
		//program that calculates the cost of shopping.
		System.out.println("kaç ürün alacaksın");	
		int x = input.nextInt();
		int[] fiyat = new int[x];

		int toplam=0;
		for(int i=0;i<x;i++){
			System.out.println((i+1)+". ürün fiyatını giriniz:");
			fiyat[i]= input.nextInt();
			toplam=toplam+fiyat[i];
		}
		System.out.println("Ortalama : " + (toplam));*/
 
		//--------------------------------
		 for(int i=1;i<=9;i++){
			System.out.println("\n*\n*");
			for(int m=0;m<=i;m++){
				System.out.print("*");
			}
		}
		
	 

		//program that compares entered numbers by size.
		
		int a,b,c,d,e;
		int countp=0,countn=0,countNotr=0;
		System.out.println("Birinci Sayı: "); 
		a = input.nextInt(); 
		if(a>0){
			countp++;
		}
		else if(a<0){
			countn++;
		}
		else{
			countNotr++;
		}
		System.out.println("ikinci Sayı: "); 
		
		b = input.nextInt();
		if(b>0){
			countp++;
		}
		else if(b<0){
			countn++;
		}
		else{
			countNotr++;
		}
		System.out.println("üçüncü Sayı: ");
		
		c = input.nextInt(); 
		if(c>0){
			countp++;
		}
		else if(c<0){
			countn++;
		}
		else{
			countNotr++;
		}
		System.out.println("dördüncü Sayı: "); 
		
		d = input.nextInt(); 
		if(d>0){
			countp++;
		}
		else if(d<0){
			countn++;
		}
		else{
			countNotr++;
		}
		System.out.println("beşinci Sayı: "); 
		
		e = input.nextInt(); 
		if(e>0){
			countp++;
		}
		else if(e<0){
			countn++;
		}
		else{
			countNotr++;
		}
		System.out.print("+ "+countp+" - "+ countn +" nötr "+countNotr); */

//------------------------------------------------------------------------------------------------------------------------------
 
		System.out.print("Birinci Sayı: "); 
		int xb = input.nextInt(); 
		System.out.print("Birinci Sayı: "); 
		int xi = input.nextInt();
		System.out.print("ikinci Sayı: ");
		int yb = input.nextInt(); 
		System.out.print("ikinci Sayı: "); 
		int yi = input.nextInt(); 

		double temp=0;
		temp=Math.sqrt(((xi-xb)*(yi-yb))+((xi-xb)*(yi-yb)));
		System.out.println("temp : " + temp);
	
		for(int i=1;i<=8;i++){
			if(i%2==0)
				System.out.println("* * * * * * * *");
			else
				System.out.println(" * * * * * * * *");
		}
		
		
		for(int i=1;i<=x;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		//------------------------------------------------------------------------------------------------------------------------------
		
		
		int temp=1;
		for(int i=1;i<=4;i++){
			temp=temp*i;
			for(int j=1;j<=temp;j++){
				System.out.print("* ");
			}
		System.out.println(" ");		
			
		}
				
		//------------------------------------------------------------------------------------------------------------------------------
		for(int i=1;i<=x;i++){
			if(i%2!=0){
				for(int j=1;j<=i;j++){
				System.out.print("*");
				}
			}
			if(i%2==0){
				for(int j=1;j<i;j++){
				System.out.print("*");
				}
			}
			System.out.println(" ");
			
		}
		System.out.println(" ");
		
		//------------------------------------------------------------------------------------------------------------------------------
		for(int i=1;i<=8;i++){
			for(int j=0;j<=8;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i*j+ "\t");
			
			}
			System.out.println(" ");
		}
		//------------------------------------------------------------------------------------------------------------------------------
		 System.out.print("Bir sayı giriniz: "); 
		 int x = input.nextInt(); 
		 int karesi=x*x;
		 if(x>100)
		 {
			 if(karesi>100)
			 {
				 System.out.printf("kendisi ve karesi 100 den büyük");
			 }
			 else if( karesi<100)
			 {
				 System.out.printf("kendisi 100 den büyük karesi küçük");
			 }
		 }
		 else if(x<100)
		 {
			 if(karesi>100)
			 {
				 System.out.printf("kendisi küçük , karesi 100 den büyük");
			 }
			 else if( karesi<100)
			 {
				 System.out.printf("kendisi ve karesi küçük");
			 }
		 }

		//------------------------------------------------------------------------------------------------------------------------------
		 System.out.print("Birinci Sayı: "); // prompt for input
		 int x = input.nextInt(); // read first integer

		 System.out.print("İkinci Sayı: "); // prompt for input
		 int y = input.nextInt(); // read second integer
		 
		 
		 int Xresult = x*x; // calculate product of numbers
		 int Yresult = y*y;

		 System.out.printf("X in karesi %d \n", Xresult);
		 System.out.printf("Y in karesi %d \n", Yresult);
		 System.out.printf("Karelerinin Toplamı %d \n", Xresult+Yresult);
		 System.out.printf("Karelerinin Farkı %d \n", Xresult-Yresult);



//kaynak dosya ile sınıfın adları aynı olmak zorunda .java olarak kaydetmeliyiz
//derleme 'compile' herhangi bir dili makine diline cevirerek kodu bilgisayara anlaşılmasını sağlar
//yorumlamalı dil pythne daha yavaş çalışıyor
//derleme java ara kod oluşturur c c++ara kod oluşturmaz 
// makine dili sonucu cihaza göre değiştiği için derleme şarttır.
//iot cihaz yani saat bilg vb...
// javada aradil bytecode
//.net te IL imiş
//jdk-compile
//jre- java welcome  jre içinde jvm var o çalıştırıyor

// kendi kendini çağıran fonksiyon reqursive yapı
// iterative yapılar da bulunur 