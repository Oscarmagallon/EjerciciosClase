package Ejercicio3;

public class Ejercicio2 {
	public static int media (int vNums[],int tam) {
		int media = 0;
		for(int i =0;i<=4;i++) {
			media = media + vNums[i];
		}
		media = media /5;
	
		return media;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vNums[], tam=5;
		vNums=new int[tam];
		vNums[0]=6;
		vNums[1]=4;
		vNums[2]=12;
		vNums[3]=55;
		vNums[4]=65;
		System.out.println("la media es " +media(vNums, tam));
		
		
	}

}
