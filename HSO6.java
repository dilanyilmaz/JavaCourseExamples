import java.util.Scanner; 

//1.2.29 Day of the week.
/*
Write a program that takes a date as input and prints the 
day of the week that date falls on. Your program should accept three int commandline arguments: m (month), d (day), and y (year). For m, use 1 for January, 2 for 
February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday, 
and so forth. Use the following formulas, for the Gregorian calendar: 
*/
 public class HSO6 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
	 System.out.println("gün (1-7 arası) giriniz: ");	
	 int m = input.nextInt();
	 System.out.println("ay (1-12 arası) giriniz: ");
	 int d = input.nextInt();
	 System.out.println("yıl giriniz");
	 int y = input.nextInt();
	 int y0 = y-(14-m)/12;
	 int x = y0+y0/4-y0/100+y0/400;
	 int m0 = m+12*((14-m)/12)-2;
	 int d0 = (d+x+(31*m0)/12)%7;
	 switch(d0) {
		case 0:
			System.out.println("pazar");
			break;
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
        default:
			System.out.println("böyle bir sonuc yok");
			break;
	  }
	 }
	} 