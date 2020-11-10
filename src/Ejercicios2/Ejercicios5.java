package Ejercicios2;

import java.util.Scanner;

public class Ejercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letra="";
		int clave=1;
		Scanner leer=new Scanner(System.in);
		
		while(clave==1) {
			System.out.println("Dime una letra");
			letra=leer.next();
			if(letra.equalsIgnoreCase("n")|| letra.equalsIgnoreCase("s")) {
				clave=0;				
			}
			
		}
		
	}

}
