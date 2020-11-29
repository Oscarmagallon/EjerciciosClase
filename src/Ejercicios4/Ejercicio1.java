package Ejercicios4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime tu nombre alreves");
		nombre=leer.next();
		
		for(int i = nombre.length();i>=0;i--) {
			System.out.println(nombre.substring(i,i-1));
		}


	}

}
