package Ejercicio3;

import java.util.Scanner;

public class Ejercicios4 {
	//llenar vectores
	public static void llenarVectores (int tam, int vEdades[],String vNombres[],Scanner leer) {
		for (int i = 0 ; i<tam ;i++) {
			System.out.println("Dime el nombre de las personas");
			vNombres[i]=leer.next();
			System.out.println("Dime la edad");
			vEdades[i]=leer.nextInt();
			
		}
	}
	public static void mostrarVectores (int tam,int vEdades[],String vNombres[]) {
		for(int i =0;i<tam;i++) {
			System.out.println("El nombre es "+vNombres[i]+ " y su edad es "+ vEdades[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0;
		int vEdades[];
		String vNombres[];
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el tamaño de los vectores");
		tam=leer.nextInt();
		vNombres=new String [tam];
		vEdades=new int [tam];
		llenarVectores(tam, vEdades, vNombres, leer);
		mostrarVectores(tam, vEdades, vNombres);
	}

}
