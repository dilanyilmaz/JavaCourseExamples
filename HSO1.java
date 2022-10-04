 import java.util.Scanner; // 1.2.33 Great circle

 public class HSO1 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
	 System.out.print("x1 değerini giriniz: ");
	 int x1 = input.nextInt();
	 System.out.print("y1 değerini giriniz: ");
	 int y1 = input.nextInt();
	 System.out.print("x2 değerini giriniz: ");
	 int x2 = input.nextInt();
	 System.out.print("y2 değerini giriniz: ");
	 int y2 = input.nextInt();
	 x1=Math.toRadians(x1);
	 y1=Math.toRadians(y1);
	 x2=Math.toRadians(x2);
	 y2=Math.toRadians(y2);
	 double d = 60*(Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
	 System.out.println(Math.toDegrees(d));

	 }
 }