import java.util.Scanner; 

 public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("dizinin boyu nedir");
		int arraySize = input.nextInt();
		
		double[] myArray = new double[10];
		
		 for (int i = 0; i<myArray.length; i++) 
		 { 
			System.out.println("diziye deger giriniz");
			myArray[i] = input.nextDouble();
		 }
		 System.out.println("avarege is : "+avgMinMax(myArray));
	}
	public static double avgMinMax(double[] myArray){
	double sonuc=0;
	for(int i=0 ; i<myArray.length-1 ; i++) 
	{
		for(int j=i+1 ;j<myArray.length ; j++)
		{
			if(myArray[i]<myArray[j])
			{
				double temp = myArray[j];
				myArray[j] = myArray[i];
				myArray[i] = temp ;
			}

		}

	}
	return (myArray[0]+myArray[9])/2;
	}
}