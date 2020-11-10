package Ejercicios0;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		int sol=0,num=1,teoria=0,practica=0,problemas=0;
		Scanner leer= new Scanner(System.in);
		while (num!=0) {
			System.out.println("Dime tu nombre");
			nombre=leer.next();
			if (nombre.equalsIgnoreCase("")){
				num=0;
			}
			System.out.println("Dime la nota teorica");
			teoria=leer.nextInt();
			System.out.println("Dime la nota practica");
			practica=leer.nextInt();
			System.out.println("Dime la nota de los problemas");
			problemas=leer.nextInt();
			sol=(int) (practica*0.10+teoria*0.40+problemas*0.50);
			System.out.println("La nota es "+sol);
		}
		
	}

}
