 import java.util.Scanner; 
 // 1.2.32 Color conversion.
 /*
Several different formats are used to represent color. For 
example, the primary format for LCD displays, digital cameras, and web pages, 
known as the RGB format, specifies the level of red (R), green (G), and blue (B) 
on an integer scale from 0 to 255. The primary format for publishing books and 
magazines, known as the CMYK format, specifies the level of cyan (C), magenta 
1.2 Built-in Types of Data 49
(M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0. Write a program 
RGBtoCMYK that converts RGB to CMYK. Take three integers—r, g, and b—from 
the command line and print the equivalent CMYK values. If the RGB values are all 
0, then the CMY values are all 0 and the K value is 1; otherwise, use these formulas:
 
 w=max ( r / 255, g / 255, b / 255 )
 c=(w - (r / 255)) / w 
 m = (w -( g / 255)) / w 
 y = (w - ( b / 255)) / w 
 k = 1 - w
 
 */

 public class HSO4 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
	 System.out.print("R değeri giriniz: ");
	 double r = input.nextInt();
	 System.out.print("G değeri giriniz: ");
	 double g = input.nextInt();
	 System.out.print("B değeri giriniz: ");
	 double b = input.nextInt();
	 double c,m,y,k;
	 r=r/255;
	 g=g/255;
	 b=b/255;
	 double t = Math.max(r,b);
	 double w = Math.max(t,b);
	 System.out.println(w);
	 
	 if(r<=255&&g<=255&&b<=255){
		if(r!=0&&g!=0&&b!=0){
		c = (w-(r/255))/w;
		m = (w-(g/255))/w;
		y = (w-(b/255))/w; 
		k = (1-w);
	 }
	 else{
		 c=0;
		 m=0;
		 y=0;
		 k=1;
	 }
		 System.out.println(" "+c+" "+" "+m+" "+" "+y+" "+k);
	 }
	 else{
		 System.out.println("255 ten küçük bir değer giriniz");
	 }
	 }
 }