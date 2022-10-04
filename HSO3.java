 import java.util.Scanner; 
 // 1.2.30 Uniform random numbers.
 /*
 write a program that prints five uniform random 
 numbers between 0 and 1, their average value, 
 and their minimum and maximum values. 
 Use Math.random(), Math.min(), and Math.max().
 */

 public class HSO3 {
 public static void main(String[] args) {
		double [] degerler= new double[5];
		double min=1.0;
		double max=0.0;
		for(int i=0; i<5;i++){
			degerler[i]=Math.random();
		}
		for(int j=0;j<=degerler.length-1;j++){
			System.out.println(degerler[j]);
		}
		for(int k=0;k<=degerler.length-1;k++){
			min=Math.min(min,degerler[k]);
			max=Math.max(max,degerler[k]);
		}
		System.out.println("minimum deger : " + min);
		System.out.println("maximum deger : " + max);
	 }
 }