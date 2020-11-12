package Ejercicios2;

import java.util.Scanner;

public class Ejercicio10 {
	public static int contador(String frase, String letra) {
		int contador = 0;
		for (int i =0;i<frase.length();i++) {
			if(frase.substring(i,i+1).equalsIgnoreCase(letra)) {
				contador++;
			}
			
		}
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contador("hola oscar","q"));
	
		}

}
