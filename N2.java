import java.util.Scanner; 

 public class N2 {
	public static void main(String[] args) {
		String[] wordsArr = {"write","word","play","another","ask","Declare"};
		//wordArr random almam lazım
		Scanner input = new Scanner(System.in);
		
			char[] wordCharArr= new char[(wordsArr[0].toCharArray()).length];
			for(int i=0;i<wordCharArr.length;i++){
				wordCharArr[i]='*';
			}
			
			//yıldız basma
			for(int i=0;i<wordCharArr.length;i++){
				System.out.print(wordCharArr[i]);
			}
			System.out.print("\n");

			char[] temp = wordsArr[0].toCharArray(); 
			int falseCount=0;
			int finScore=0;
				int i=0;
				System.out.print("bir karakter giriniz\n");
				char x=input.next().charAt(0);
				while(i>=0){
					if(x==temp[i]){
						finScore++;
						if(finScore==temp.length){
							System.out.print("kazandın kocum <3");
							break;
						}
						System.out.println("bir karakter bulundu");
						wordCharArr[i]=x;
						for(int j=0;j<wordCharArr.length;j++){
						System.out.print(wordCharArr[j]);
						}
						i=0;
						System.out.print("bir karakter giriniz\n");
						x=input.next().charAt(0);
					}
					else{
						falseCount++;
						i++;
					}
				}
			}
			
		
		//char x=input.next().charAt(0);
	    //System.out.print("birinci sayi");		
		//double y=input.nextDouble();
	}
	