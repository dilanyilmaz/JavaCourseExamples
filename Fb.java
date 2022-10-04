

int r=1;
	 Scanner input = new Scanner(System.in);
     int Max=-1000000;
	 int MaxMin=-10000;
	 while(r!=0){
		System.out.println("Bir sayı giriniz: "); 
		int x = input.nextInt();
		System.out.println("çıkmak için 0 a bas		"); 
		r = input.nextInt();
			if(Max<=x){
				Max=x;
			}
			else if(MaxMin<x&&MaxMin<Max){
				MaxMin=x;
			}
			
		}
		System.out.println("MAX "+Max);
		System.out.println("Min "+MaxMin);
	 }
 }
