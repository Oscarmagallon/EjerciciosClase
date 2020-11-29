package Ejercicios4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre=leer.next();
		for (int i=0;i<nombre.length();i++ ) {
			if(i%2==0) {
				System.out.println(nombre.substring(i).toUpperCase());
				break;
			}else {
				System.out.println(nombre.substring(i).toLowerCase());
				break;
			}
		}

	}

}
