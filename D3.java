
import java.util.Arrays;
import java.util.Scanner;
import java.time.Instant;


public class D3
 {
    public static void main(String[] args) {
	
	
        Scanner input = new Scanner(System.in);


	int[] d =new int[250000];
	int[] d2 = new int [250000];

	for(int i=0 ; i<250000 ; i++)
	{
		d[i]=(int)(Math.random()*100);
		d2[i]=d[i];
	}

	//System.out.println(Arrays.toString(d));

	
	System.out.println("################");
	System.out.println("Selection Sort");

	System.out.println(Instant.now().toString());


	for(int i=0 ; i<d.length ; i++) 
	{
		for(int j=0 ;j<d.length ; j++)
		{
			if(d[i]<d[j])
			{
				int temp = d[j];
				d[j] = d[i];
				d[i] = temp ;
			}

		}

	}
	
	System.out.println(Instant.now().toString());
	

	System.out.println("################");
	System.out.println("Bubble Sort");

	System.out.println(Instant.now().toString());


	for(int i=0 ; i<d2.length-1 ; i++) 
	{
		for(int j=i+1 ;j<d2.length ; j++)
		{
			if(d2[i]<d2[j])
			{
				int temp = d2[j];
				d2[j] = d2[i];
				d2[i] = temp ;
			}

		}

	}
	
	System.out.println(Instant.now().toString());

}
}