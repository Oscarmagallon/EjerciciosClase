package Ejercicio3;

import java.security.Signer;
import java.util.Scanner;

public class Ejercicios5 {
	public static void llenarMatriz (String mDatos[][],int tam) {
		Scanner leer =new Scanner(System.in);
		for (int i = 0;i<tam;i++) {
			System.out.println("Dime el nombre");
			mDatos[i][0]=leer.next();
			System.out.println("Dime la edad");
			mDatos[i][1]=leer.next();
			
		}
		for (int i = 0;i<tam;i++) {
			System.out.println("El nombre es "+ mDatos[i][0] + " la edad es "+mDatos[i][1]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0;
		Scanner leer =new Scanner(System.in);
		System.out.println("Dime el tamaño de la matriz");
		tam=leer.nextInt();
		String mDatos[][]=new String [tam][tam];
		llenarMatriz(mDatos, tam);
	
		
	}

}
