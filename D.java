 import java.util.Scanner; 


 public class D {
 public static void main(String[] args) {
	 boolean[] numberArray = new boolean[100];
	 numberArray[0]=true;
	 numberArray[1]=true;
	 numberArray[2]=false;
	 numberArray[3]=false;
	 for(int i=3;i<100;i++){
		 for(int j=3;j<100;j++){
			 if(i%j==0){
				 if(numberArray[i]==true){
				 numberArray[i]=false;
				 break;}
				 else{
				 numberArray[i]=true;
				 break;}
			 }
		 }
	 }
	 for(int k=0;k<100;k++){
		 if(numberArray[k]==true)
			System.out.println("---------OPEN"+k+"----------");
		 else
			 System.out.println("---------close----------");
	 }
 }
 }