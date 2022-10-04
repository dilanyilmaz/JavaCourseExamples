import java.util.Scanner; 

 public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    		
		double x=Math.toDegrees(90);
		System.out.print(sinPoz(1)+sinNeg(3)+" ");
		System.out.print(cosPoz(1)+cosNeg(3));
	}
	//cos
	public static double cosPoz(int k){
		double x=Math.toRadians(90);
		double temp=0;
		if(k<=10){
			temp+= Math.pow(x,k)/faktoriyel(k) + cosPoz(k+4);
		}
			return temp;
	}
	public static double cosNeg(int k){
		double x=Math.toRadians(90);
		 double temp1=0;
		 if(k<=10){
		    temp1 += -Math.pow(x,k)/faktoriyel(k)+ cosNeg(k+2);
			return temp1;
		}
			return temp1;
	}
   
  //sin
	public static double sinPoz(int k){
		double x=Math.toRadians(30);
		double temp=0;
		if(k<=10){
			temp+= Math.pow(x,k)/faktoriyel(k) + sinPoz(k+4);
		}
			return temp;
	}
	public static double sinNeg(int k){
		double x=Math.toRadians(30);
		 double temp1=0;
		 if(k<=10){
		    temp1 += -Math.pow(x,k)/faktoriyel(k)+ sinNeg(k+4);
			return temp1;
		}
			return temp1;
	}
	public static double faktoriyel (double x){
		if(x==1)
			return 1;
		return x * faktoriyel(x-1);
	}
}