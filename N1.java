import java.util.Scanner; 

 public class N1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("bir işlem belirleyiniz");
		char x=input.next().charAt(0);
	    System.out.print("birinci sayi");		
		double y=input.nextDouble();
	    System.out.print("ikinci sayi");	
		double z=input.nextDouble();	
		if(x=='*'){
			System.out.print(carp(y,z));
		}
		else if(x=='-'){
			System.out.print(cıkar(y,z));
		}
		else if(x=='+'){
			System.out.print(topla(y,z));
		}
		else if(x=='/'){
			System.out.print(bol(y,z));
		}
		

	}

	public static double carp(double k,double v){
		double temp=0;
		temp=k*v;
		return temp;
	}
   
	public static double bol(double k,double v){
		double temp=0;
		temp=k/v;
		return temp;
	}
	public static double topla(double k,double v){
		double temp=0;
		temp=k+v;
		return temp;
	}
	public static double cıkar (double k,double v){
		double temp=0;
		temp=k-v;
		return temp;
	}
	
}