package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void llenarMultiplos (int vNums[],int tam,int multi) {
		for(int i=0;i<tam;i++) {
			vNums[i]=multi*2;
			multi=multi*2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vNums[],tam,multi;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el tamano del array");
		tam=leer.nextInt();
		System.out.println("Dime los multiplos");
		multi=leer.nextInt();
		vNums=new int[tam];
	llenarMultiplos(vNums, tam, multi);
		for (int i=0;i<tam;i++) {
			System.out.println(vNums[i]);
		}
	}

}
